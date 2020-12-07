/*
 * Copyright (c) 2018, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.

 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at

 *      http://www.apache.org/licenses/LICENSE-2.0

 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.integrationstudio.eclipse.carbonserver44microei11;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.wso2.integrationstudio.eclipse.carbonserver.base.manager.IProperties;
import org.wso2.integrationstudio.eclipse.carbonserver44microei11.Activator;
import org.wso2.integrationstudio.eclipse.carbonserver44microei11.util.CarbonServer44eiUtils;
import org.wso2.integrationstudio.eclipse.logging.core.IDeveloperStudioLog;
import org.wso2.integrationstudio.eclipse.logging.core.Logger;

public class ServerProperties implements IProperties {

	private static IDeveloperStudioLog log = Logger.getLog(Activator.PLUGIN_ID);
	private static CarbonServer44eiUtils carbonServer44eiUtils = new CarbonServer44eiUtils();

	public ServerProperties() {
	}

	public Map<String, String> getServerInstanceProperties(String serverPath) {
		Map<String, String> serverInstanceProperties = null;

		try {
			serverInstanceProperties = new HashMap<String, String>();
			File file = new File(carbonServer44eiUtils.getCarbonXmlPathFromLocalWorkspaceRepo(serverPath));
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document doc = builder.parse(file);
			XPathFactory xPathfactory = XPathFactory.newInstance();
			XPath xpath = xPathfactory.newXPath();
			XPathExpression expr = xpath.compile("/Server/Ports/Offset");
			String offset = expr.evaluate(doc);

			file = new File(carbonServer44eiUtils.getAxis2XmlPathFromLocalWorkspaceRepo(serverPath));
			factory = DocumentBuilderFactory.newInstance();
			builder = factory.newDocumentBuilder();
			doc = builder.parse(file);
			xPathfactory = XPathFactory.newInstance();
			xpath = xPathfactory.newXPath();
			expr = xpath.compile("/axisconfig/transportReceiver[@name='http']/parameter[@name='port']");
			String trnhttp = expr.evaluate(doc);
			expr = xpath.compile("/axisconfig/transportReceiver[@name='https']/parameter[@name='port']");
			String trnhttps = expr.evaluate(doc);

			serverInstanceProperties.put("carbon.offset", offset);
			serverInstanceProperties.put("synapse.transport.http", trnhttp);
			serverInstanceProperties.put("synapse.transport.https", trnhttps);
			//set default location
			serverInstanceProperties.put("carbon.home", serverPath);
		} catch (Exception e) {
			log.error(e);
		}
		return serverInstanceProperties;
	}

}
