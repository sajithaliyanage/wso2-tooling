/*
 * Copyright 2012 WSO2, Inc. (http://wso2.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.wso2.integrationstudio.eclipse.gmf.esb.diagram.custom.deserializer;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.apache.axiom.om.OMAbstractFactory;
import org.apache.axiom.om.OMAttribute;
import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.util.AXIOMUtil;
import org.apache.commons.collections.IteratorUtils;
import org.apache.synapse.config.Entry;
import org.apache.synapse.config.SynapseConfiguration;
import org.apache.synapse.config.SynapseConfigurationBuilder;
import org.apache.synapse.config.xml.ProxyServiceFactory;
import org.apache.synapse.config.xml.SequenceMediatorFactory;
import org.apache.synapse.config.xml.TemplateMediatorFactory;
import org.apache.synapse.config.xml.endpoints.EndpointFactory;
import org.apache.synapse.config.xml.endpoints.TemplateEndpointFactory;
import org.apache.synapse.config.xml.endpoints.TemplateFactory;
import org.apache.synapse.config.xml.endpoints.WSDLEndpointFactory;
import org.apache.synapse.core.axis2.ProxyService;
import org.apache.synapse.endpoints.Endpoint;
import org.apache.synapse.endpoints.Template;
import org.apache.synapse.inbound.InboundEndpoint;
import org.apache.synapse.mediators.base.SequenceMediator;
import org.apache.synapse.mediators.template.TemplateMediator;
import org.apache.synapse.message.processor.MessageProcessor;
import org.apache.synapse.message.store.MessageStore;
import org.apache.synapse.rest.API;
import org.apache.synapse.task.TaskDescription;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.commands.SetBoundsCommand;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.wso2.integrationstudio.eclipse.gmf.esb.ArtifactType;
import org.wso2.integrationstudio.eclipse.gmf.esb.EsbDiagram;
import org.wso2.integrationstudio.eclipse.gmf.esb.EsbElement;
import org.wso2.integrationstudio.eclipse.gmf.esb.EsbNode;
import org.wso2.integrationstudio.eclipse.gmf.esb.EsbPackage;
import org.wso2.integrationstudio.eclipse.gmf.esb.EsbServer;
import org.wso2.integrationstudio.eclipse.gmf.esb.diagram.Activator;
import org.wso2.integrationstudio.eclipse.gmf.esb.diagram.edit.parts.EsbServerEditPart;
import org.wso2.integrationstudio.eclipse.gmf.esb.diagram.part.EsbDiagramEditor;
import org.wso2.integrationstudio.eclipse.gmf.esb.diagram.validator.ProcessSourceView;
import org.wso2.integrationstudio.eclipse.logging.core.IDeveloperStudioLog;
import org.wso2.integrationstudio.eclipse.logging.core.Logger;
import org.wso2.integrationstudio.eclipse.platform.ui.utils.UnrecogizedArtifactTypeException;
import org.wso2.integrationstudio.esb.form.editors.article.rcp.ESBFormEditor;

/**
 * Synapse model de-serialize base class
 */
public class Deserializer {
    /**
     * Singleton instance.
     */
    private static Deserializer singleton;

    /**
     * DeveloperStudio logger
     */
    private static IDeveloperStudioLog log = Logger.getLog(Activator.PLUGIN_ID);

    private static final String synapseNS = "http://ws.apache.org/ns/synapse";

    private Deserializer() {

    }

    /**
     * 
     */
    private List<IGraphicalEditPart> mediatorFlowContainerList;

    /**
     * @return singleton instance.
     */
    public static Deserializer getInstance() {
        if (null == singleton) {
            singleton = new Deserializer();
        }
        return singleton;
    }

    /**
     * Update graphical model
     * 
     * @param source
     * @param graphicalEditor
     * @throws Exception
     */
    @SuppressWarnings("unchecked")
    public void updateDesign(String source, EsbDiagramEditor graphicalEditor, boolean withSyanpse) throws Exception {

        EsbDeserializerRegistry.getInstance().init(graphicalEditor);
        Map<String, Object> artifacts = getArtifacts(source, withSyanpse);

        Diagram diagram = graphicalEditor.getDiagram();
        EsbDiagram esbDiagram = (EsbDiagram) diagram.getElement();
        EsbServer esbServer = esbDiagram.getServer();
        esbServer.setLockmode(true);
        CompoundCommand resultCommand = new CompoundCommand();

        TransactionalEditingDomain domain = TransactionUtil.getEditingDomain(esbServer);
        // cleaning old diagram
        // TODO: should be replaced by better approach
        for (EsbElement child : esbServer.getChildren()) {
            RemoveCommand removeCmd = new RemoveCommand(domain, esbServer, EsbPackage.Literals.ESB_SERVER__CHILDREN,
                    child);
            resultCommand.append(removeCmd);
        }

        if (resultCommand.canExecute()) {
            domain.getCommandStack().execute(resultCommand);
        }

        int locationY = 0;

        for (Map.Entry<String, Object> artifact : artifacts.entrySet()) {
            @SuppressWarnings("rawtypes")
            IEsbNodeDeserializer deserializer = EsbDeserializerRegistry.getInstance()
                    .getDeserializer(artifact.getValue());
            AbstractEsbNodeDeserializer.refreshEditPartMap();
            EditPart editpart = AbstractEsbNodeDeserializer.getEditpart(esbServer);
            IGraphicalEditPart gEditpart = (IGraphicalEditPart) ((EsbServerEditPart) editpart).getChildren().get(0);
            if (deserializer != null) {
                EsbNode node = deserializer.createNode(gEditpart, artifact.getValue());
                if (node != null) {
                    AbstractEsbNodeDeserializer.refreshEditPartMap();
                    IGraphicalEditPart graphicalNode = (IGraphicalEditPart) AbstractEsbNodeDeserializer
                            .getEditpart(node);
                    if (graphicalNode != null) {
                        Rectangle rect = new Rectangle(new Point(), graphicalNode.getFigure().getPreferredSize())
                                .getCopy();
                        rect.x = 0;
                        rect.y = locationY;
                        SetBoundsCommand sbc = new SetBoundsCommand(graphicalNode.getEditingDomain(), "change location",
                                new EObjectAdapter((View) graphicalNode.getModel()), rect);
                        graphicalNode.getDiagramEditDomain().getDiagramCommandStack().execute(new ICommandProxy(sbc));
                        locationY += rect.height;
                        locationY += 25;
                        getMediatorFlowContainerList().add(graphicalNode);
                    }
                } else {
                    log.warn("Ignoring null output from deserializer for " + artifact.getValue().getClass());
                }
            }
        }
        if (artifacts.size() > 0) {
            AbstractEsbNodeDeserializer.connectMediatorFlows();
        }
        /*
         * Following code snippet is use to release the lock of automatic
         * connecting logic. we are commenting following code since we have
         * released the lock appropriately in our code.
         * Please make sure to release the lock appropriately in your code.
         */
        // esbServer.setLockmode(false);

    }

    @SuppressWarnings("unchecked")
    public void updateDesign(String source, ESBFormEditor formEditor, ArtifactType artifactType, boolean withSynapse)
            throws Exception {
        Map<String, Object> artifacts = getArtifacts(source, withSynapse);
        for (Map.Entry<String, Object> artifact : artifacts.entrySet()) {
            @SuppressWarnings("rawtypes")
            IEsbNodeDeserializer deserializer = EsbDeserializerRegistry.getInstance()
                    .getDeserializer(artifact.getValue());
            AbstractEsbNodeDeserializer.refreshEditPartMap();
            if (deserializer != null) {
                deserializer.createNode(formEditor, artifact.getValue());
            }
        }

    }

    /**
     * Return the relevant ArtifactType(Proxy service, Sequence, API etc.) for a given ESB configuration
     * 
     * @param source
     * @throws Exception
     */
    public ArtifactType getArtifactType(String source) throws Exception {
        ArtifactType artifactType = null;
        OMElement element = AXIOMUtil.stringToOM(source);
        String localName = element.getLocalName();
        switch (localName) {
		case "definitions":
			artifactType = ArtifactType.SYNAPSE_CONFIG;
			break;
		case "proxy":
			artifactType = ArtifactType.PROXY;
			break;
		case "sequence":
			if ("main".equals(element.getAttributeValue(new javax.xml.namespace.QName("name")))) {
                artifactType = ArtifactType.MAIN_SEQUENCE;
            } else {
                artifactType = ArtifactType.SEQUENCE;
            }
			break;
		case "localEntry":
			artifactType = ArtifactType.LOCAL_ENTRY;
			break;
		case "task":
			artifactType = ArtifactType.TASK;
			break;
		case "api":
			artifactType = ArtifactType.API;
			break;
		case "template":
			Iterator children = element.getChildElements();
            while (children.hasNext()) {
                OMElement child1 = (OMElement) children.next();
                String child1LocalName = child1.getLocalName();
                if (!"parameter".equals(child1LocalName)) {
                    if ("sequence".equals(child1LocalName)) {
                        artifactType = ArtifactType.TEMPLATE_SEQUENCE;
                    } else if ("endpoint".equals(child1LocalName)) {
                        OMElement child2 = (OMElement) child1.getChildElements().next();
                        String child2LocalName = child2.getLocalName();
                        if ("address".equals(child2LocalName)) {
                            artifactType = ArtifactType.TEMPLATE_ENDPOINT_ADDRESS;
                        } else if ("wsdl".equals(child2LocalName)) {
                            artifactType = ArtifactType.TEMPLATE_ENDPOINT_WSDL;
                        } else if ("default".equals(child2LocalName)) {
                            artifactType = ArtifactType.TEMPLATE_ENDPOINT_DEFAULT;
                        } else if ("http".equals(child2LocalName)) {
                            artifactType = ArtifactType.TEMPLATE_ENDPOINT_HTTP;
                        }
                    }
                }
            }
			break;
		case "endpoint":
			OMAttribute templateAtr = element.getAttribute(new javax.xml.namespace.QName("template"));
            if (templateAtr != null) {
                artifactType = ArtifactType.TEMPLATE_ENDPOINT;
                
            } else {
                if (element.getChildElements().hasNext()) {

                    if (element.getChildrenWithLocalName("address").hasNext()) {
                        artifactType = ArtifactType.ENDPOINT_ADDRESS;
                    } else if (element.getChildrenWithLocalName("default").hasNext()) {
                        artifactType = ArtifactType.ENDPOINT_DEFAULT;
                    } else if (element.getChildrenWithLocalName("http").hasNext()) {
                        artifactType = ArtifactType.ENDPOINT_HTTP;
                    } else if (element.getChildrenWithLocalName("wsdl").hasNext()) {
                        artifactType = ArtifactType.ENDPOINT_WSDL;
                    } else if (element.getChildrenWithLocalName("failover").hasNext()) {
                        artifactType = ArtifactType.ENDPOINT_FAILOVER;
                    } else if (element.getChildrenWithLocalName("loadbalance").hasNext()) {
                        artifactType = ArtifactType.ENDPOINT_LOADBALANCE;
                    } else if (element.getChildrenWithLocalName("recipientlist").hasNext()) {
                        artifactType = ArtifactType.ENDPOINT_RECIPIENTLIST;
                    }
                }
            }
			break;
		case "messageStore":
			artifactType = ArtifactType.MESSAGE_STORE;
			break;
		case "messageProcessor":
			artifactType = ArtifactType.MESSAGE_PROCESSOR;
			break;
		case "inboundEndpoint":
			artifactType = ArtifactType.INBOUND_ENDPOINT;
			break;
		case "mock-service":
			artifactType = ArtifactType.MOCK_SERVICE;
			break;
		case "unit-test":
			artifactType = ArtifactType.SYNAPSE_UNIT_TEST;
			break;
		default:
			throw new UnrecogizedArtifactTypeException("Unrecognized source configuration section " + localName);
		}
        return artifactType;
    }

    private Map<String, Object> getArtifacts(String source, boolean withSynapse) throws Exception {
        Map<String, Object> artifacts = new LinkedHashMap<String, Object>();

        ArtifactType artifactType = getArtifactType(source);
        OMElement element = AXIOMUtil.stringToOM(source);

        Properties properties = new Properties();
        properties.put(WSDLEndpointFactory.SKIP_WSDL_PARSING, "true");

        switch (artifactType) {
        case SYNAPSE_CONFIG:
            File tempfile = File.createTempFile("file", ".tmp");
            BufferedWriter outfile = new BufferedWriter(new FileWriter(tempfile));
            outfile.write(source);
            outfile.close();
            SynapseConfiguration synapseCofig = SynapseConfigurationBuilder.getConfiguration(tempfile.getAbsolutePath(),
                    null);
            Collection<ProxyService> proxyServices = synapseCofig.getProxyServices();
            for (ProxyService proxy : proxyServices) {
                artifacts.put(proxy.getName(), proxy);
            }
            Collection<API> apis = synapseCofig.getAPIs();
            for (API api : apis) {
                artifacts.put(api.getName(), api);
            }
            Map<String, SequenceMediator> definedSequences = synapseCofig.getDefinedSequences();
            if (definedSequences.size() > 0)
                artifacts.putAll(definedSequences);
            Map<String, Endpoint> definedEndpoints = synapseCofig.getDefinedEndpoints();
            if (definedEndpoints.size() > 0)
                artifacts.putAll(definedEndpoints);
            Map<String, Entry> definedEntries = synapseCofig.getDefinedEntries();
            if (definedEntries.size() > 0)
                artifacts.putAll(definedEntries);
            Map<String, TemplateMediator> sequenceTemplates = synapseCofig.getSequenceTemplates();
            if (sequenceTemplates.size() > 0)
                artifacts.putAll(sequenceTemplates);
            Map<String, Template> endpointTemplates = synapseCofig.getEndpointTemplates();
            if (endpointTemplates.size() > 0)
                artifacts.putAll(endpointTemplates);
            break;
        case PROXY:
            ProxyService proxy;
            if (withSynapse) {
                proxy = ProxyServiceFactory.createProxy(element, properties);
            } else {
                proxy = DummyProxyServiceFactory.createProxy(element, properties);
            }
            artifacts.put(proxy.getName(), proxy);
            break;
        case SEQUENCE:
            SequenceMediator sequence;
            if (withSynapse) {
                SequenceMediatorFactory sequenceMediatorFactory = new SequenceMediatorFactory();
                sequence = (SequenceMediator) sequenceMediatorFactory.createSpecificMediator(element, properties);
            } else {
                DummySequenceMediatorFactory sequenceMediatorFactory = new DummySequenceMediatorFactory();
                sequence = (SequenceMediator) sequenceMediatorFactory.createSpecificMediator(element, properties);
            }

            artifacts.put(sequence.getName(), sequence);
            break;
        case MAIN_SEQUENCE:
            SequenceMediatorFactory mainSequenceMediatorFactory = new SequenceMediatorFactory();
            SequenceMediator mainSequence = (SequenceMediator) mainSequenceMediatorFactory
                    .createSpecificMediator(element, properties);
            artifacts.put(mainSequence.getName(), mainSequence);
            break;
        case API:
            API api = DummyAPIFactory.createAPI(element, withSynapse);
            artifacts.put(api.getName(), api);
            break;
        case ENDPOINT:
        case COMPLEX_ENDPOINT:
        case ENDPOINT_ADDRESS:
        case ENDPOINT_DEFAULT:
        case ENDPOINT_HTTP:
        case ENDPOINT_WSDL:
        case ENDPOINT_LOADBALANCE:
        case ENDPOINT_RECIPIENTLIST:
        case ENDPOINT_FAILOVER:
        case TEMPLATE_ENDPOINT:
            Endpoint endpoint;
            if (withSynapse) {
                endpoint = EndpointFactory.getEndpointFromElement(element, false, properties);
            } else {
                endpoint = DummyEndpointFactory.getEndpointFromElement(element, false, properties);
            }
            EndpointWrapper wrapper = new EndpointWrapper(endpoint, endpoint.getName());
            artifacts.put(wrapper.getName(), wrapper);
            break;
        case LOCAL_ENTRY:
            Entry entry;
            if (withSynapse) {
                entry = EntryExtFactory.createEntry(element, properties);
            } else {
                entry = DummyEntryFactory.createEntry(element, properties);
            }
            artifacts.put(entry.getKey(), entry);
            break;
        case TASK:
            TaskDescription task;
            if (withSynapse) {
                task = DummyTaskDescriptionFactory.createTaskDescription(element,
                        OMAbstractFactory.getOMFactory().createOMNamespace(synapseNS, ""));
            } else {
                task = TaskDescriptionExtFactory.createTaskDescription(element,
                        OMAbstractFactory.getOMFactory().createOMNamespace(synapseNS, ""));
            }

            artifacts.put(task.getName(), task);
            break;
        case TEMPLATE_SEQUENCE:
            TemplateMediator templateMediator;
            if (withSynapse) {
                TemplateMediatorFactory templateMediatorFactory = new TemplateMediatorFactory();
                templateMediator = (TemplateMediator) templateMediatorFactory.createMediator(element, properties);
            } else {
                DummyTemplateMediatorFactory templateMediatorFactory = new DummyTemplateMediatorFactory();
                templateMediator = (TemplateMediator) templateMediatorFactory.createMediator(element, properties);
            }
            artifacts.put(templateMediator.getName(), templateMediator);
            break;
        case TEMPLATE_ENDPOINT_ADDRESS:
            createEndpointTemplate(element, properties, artifacts, withSynapse);
            break;
        case TEMPLATE_ENDPOINT_WSDL:
            createEndpointTemplate(element, properties, artifacts, withSynapse);
            break;
        case TEMPLATE_ENDPOINT_DEFAULT:
            createEndpointTemplate(element, properties, artifacts, withSynapse);
            break;
        case TEMPLATE_ENDPOINT_HTTP:
            createEndpointTemplate(element, properties, artifacts, withSynapse);
            break;
        case MESSAGE_STORE:
            MessageStore store;
            if (withSynapse) {
                store = DummyMessageStoreFactory.createMessageStore(element, properties);
            } else {
                store = MessageStoreExtFactory.createMessageStore(element, properties);
            }
            artifacts.put(store.getName(), store);
            break;
        case MESSAGE_PROCESSOR:
            MessageProcessor messageProcessor;
            if (withSynapse) {
                messageProcessor = DummyMessageProcessorFactory.createMessageProcessor(element, properties);
            } else {
                messageProcessor = MessageProcessorExtFactory.createMessageProcessor(element, properties);
            }
            artifacts.put(messageProcessor.getName(), messageProcessor);
            break;
        case INBOUND_ENDPOINT:
            InboundEndpoint inboundEndpoint;
            if (withSynapse) {
                inboundEndpoint = DummyInboundEndpointFactory.createInboundEndpointDev(element);
            } else {
                inboundEndpoint = InboundEndpointExtFactory.createInboundEndpointDev(element);
            }
            artifacts.put(inboundEndpoint.getName(), inboundEndpoint);
            break;
        default:
            break;
        }

        return artifacts;
    }

    private void createEndpointTemplate(OMElement element, Properties properties, Map<String, Object> artifacts,
            boolean withSynapse) {
        Template template;
        if (withSynapse) {
            TemplateFactory templateFactory = new TemplateFactory();
            template = templateFactory.createEndpointTemplate(element, properties);
            TemplateEndpointFactory.getEndpointFromElement(template.getElement(), false, new Properties());

        } else {
            DummyTemplateFactory templateFactory = new DummyTemplateFactory();
            template = templateFactory.createEndpointTemplate(element, properties);
            DummyTemplateEndpointFactory.getEndpointFromElement(template.getElement(), false, new Properties());

        }
        artifacts.put(template.getName(), template);
    }

    public List<IGraphicalEditPart> getMediatorFlowContainerList() {
        if (mediatorFlowContainerList == null) {
            mediatorFlowContainerList = new ArrayList<IGraphicalEditPart>();
        }
        return mediatorFlowContainerList;
    }

    public DeserializeStatus isValidSynapseConfig(String source, boolean withSyanpse, boolean validatePositioning) {
        try {
            getArtifacts(source, withSyanpse);
            if (validatePositioning) {
                ProcessSourceView.validateMediatorPosition(source);
            }
            return new DeserializeStatus(true, null, source);
        } catch (Exception e) {
            return new DeserializeStatus(false, e, source);
        }
    }

    public String validate(OMElement element, OMElement elementSub, boolean withSynapse) {
        try {
            Iterator<OMElement> childElements = elementSub.getChildElements();
            List<OMElement> childElementsList = IteratorUtils.toList(childElements);

            for (OMElement omElement : childElementsList) {
                omElement.detach();
            }

            try {
                getArtifacts(element.toStringWithConsume(), withSynapse);
            } catch (Exception e) {
                if (!(elementSub.getLocalName().equals("proxy") || elementSub.getLocalName().equals("target")
                        || elementSub.getLocalName().equals("template") || elementSub.getLocalName().equals("api"))) {
                    String nameSpace = "xmlns=\"http://ws.apache.org/ns/synapse\"";
                    String errorLine = elementSub.toStringWithConsume();
                    String errorLineWithoutNS = errorLine.replaceAll(nameSpace, "");
                    return "Unknown synapse configuration tag: \n\n" + "At Line " + elementSub.getLineNumber() + ", "
                            + errorLineWithoutNS + "\n";
                }
            }

            for (OMElement omElement : childElementsList) {
                if (omElement.getLocalName().equals("parameter")) {
                    continue;
                }

                elementSub.addChild(omElement);
                try {
                    getArtifacts(element.toStringWithConsume(), withSynapse);
                } catch (Exception e) {
                    List<OMElement> subChildElements = IteratorUtils.toList(omElement.getChildElements());
                    if (subChildElements.size() > 0) {
                        String returnMessage = validate(element, omElement, withSynapse);
                        if (!returnMessage.equals("ErrorNotFound")) {
                            return returnMessage;
                        }
                    } else {
                        String nameSpace = "xmlns=\"http://ws.apache.org/ns/synapse\"";
                        String errorLine = omElement.toStringWithConsume();
                        String errorLineWithoutNS = errorLine.replaceAll(nameSpace, "");
                        return "Unknown synapse configuration tag: \n\n" + "At Line " + omElement.getLineNumber() + ", "
                                + errorLineWithoutNS + "\n";
                    }
                }
            }
        } catch (Exception e) {
            log.error("Error while validating the configuration", e);
        }
        return "ErrorNotFound";
    }

    public class DeserializeStatus {
        boolean isValid;
        Exception execption;
        String source;

        public String getsource() {
            return source;
        }

        public boolean isValid() {
            return isValid;
        }

        public Exception getExecption() {
            return execption;
        }

        public DeserializeStatus(boolean isValid, Exception execption, String source) {
            this.isValid = isValid;
            this.execption = execption;
            this.source = source;
        }
    }

}
