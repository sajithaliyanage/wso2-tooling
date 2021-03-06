/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.wso2.integrationstudio.eclipse.gmf.esb.impl;

import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.wso2.integrationstudio.eclipse.esb.core.utils.ESBMediaTypeConstants;
import org.wso2.integrationstudio.eclipse.gmf.esb.EsbPackage;
import org.wso2.integrationstudio.eclipse.gmf.esb.NamespacedProperty;
import org.wso2.integrationstudio.eclipse.gmf.esb.RegistryKeyProperty;
import org.wso2.integrationstudio.eclipse.gmf.esb.StoreMediator;
import org.wso2.integrationstudio.eclipse.gmf.esb.StoreMediatorInputConnector;
import org.wso2.integrationstudio.eclipse.gmf.esb.StoreMediatorOutputConnector;
import org.wso2.integrationstudio.eclipse.gmf.esb.StoreMediatorSpecifyType;
import org.wso2.integrationstudio.eclipse.platform.core.utils.CSProviderConstants;
import org.wso2.integrationstudio.eclipse.platform.core.utils.DeveloperStudioProviderUtils;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Store Mediator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.wso2.integrationstudio.eclipse.gmf.esb.impl.StoreMediatorImpl#getMessageStore <em>Message Store</em>}</li>
 *   <li>{@link org.wso2.integrationstudio.eclipse.gmf.esb.impl.StoreMediatorImpl#getOnStoreSequence <em>On Store Sequence</em>}</li>
 *   <li>{@link org.wso2.integrationstudio.eclipse.gmf.esb.impl.StoreMediatorImpl#getInputConnector <em>Input Connector</em>}</li>
 *   <li>{@link org.wso2.integrationstudio.eclipse.gmf.esb.impl.StoreMediatorImpl#getOutputConnector <em>Output Connector</em>}</li>
 *   <li>{@link org.wso2.integrationstudio.eclipse.gmf.esb.impl.StoreMediatorImpl#getAvailableMessageStores <em>Available Message Stores</em>}</li>
 *   <li>{@link org.wso2.integrationstudio.eclipse.gmf.esb.impl.StoreMediatorImpl#getSpecifyAs <em>Specify As</em>}</li>
 *   <li>{@link org.wso2.integrationstudio.eclipse.gmf.esb.impl.StoreMediatorImpl#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StoreMediatorImpl extends MediatorImpl implements StoreMediator {
    /**
     * The default value of the '{@link #getMessageStore() <em>Message Store</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMessageStore()
     * @generated
     * @ordered
     */
    protected static final String MESSAGE_STORE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMessageStore() <em>Message Store</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMessageStore()
     * @generated
     * @ordered
     */
    protected String messageStore = MESSAGE_STORE_EDEFAULT;

    /**
     * The cached value of the '{@link #getOnStoreSequence() <em>On Store Sequence</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOnStoreSequence()
     * @generated
     * @ordered
     */
    protected RegistryKeyProperty onStoreSequence;

    /**
     * The cached value of the '{@link #getInputConnector() <em>Input Connector</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInputConnector()
     * @generated
     * @ordered
     */
    protected StoreMediatorInputConnector inputConnector;

    /**
     * The cached value of the '{@link #getOutputConnector() <em>Output Connector</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOutputConnector()
     * @generated
     * @ordered
     */
    protected StoreMediatorOutputConnector outputConnector;

    /**
     * The default value of the '{@link #getAvailableMessageStores() <em>Available Message Stores</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAvailableMessageStores()
     * @generated
     * @ordered
     */
    protected static final String AVAILABLE_MESSAGE_STORES_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getAvailableMessageStores() <em>Available Message Stores</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAvailableMessageStores()
     * @generated
     * @ordered
     */
    protected String availableMessageStores = AVAILABLE_MESSAGE_STORES_EDEFAULT;

    /**
     * The default value of the '{@link #getSpecifyAs() <em>Specify As</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSpecifyAs()
     * @generated
     * @ordered
     */
    protected static final StoreMediatorSpecifyType SPECIFY_AS_EDEFAULT = StoreMediatorSpecifyType.VALUE;

    /**
     * The cached value of the '{@link #getSpecifyAs() <em>Specify As</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSpecifyAs()
     * @generated
     * @ordered
     */
    protected StoreMediatorSpecifyType specifyAs = SPECIFY_AS_EDEFAULT;

    /**
     * The cached value of the '{@link #getExpression() <em>Expression</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getExpression()
     * @generated
     * @ordered
     */
    protected NamespacedProperty expression;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * 
     * @generated NOT
     */
    @SuppressWarnings("unchecked")
    protected StoreMediatorImpl() {
        super();
        setMessageStore("");
        RegistryKeyProperty newonStoreSequence = EsbFactoryImpl.eINSTANCE.createRegistryKeyProperty();
        DeveloperStudioProviderUtils.addFilter((Map<String, List<String>>) newonStoreSequence.getFilters(),
                CSProviderConstants.FILTER_MEDIA_TYPE, ESBMediaTypeConstants.MEDIA_TYPE_SEQUENCE);
        newonStoreSequence.setPrettyName("onStore Sequence");
        newonStoreSequence.setKeyName("onStore Sequence");
        newonStoreSequence.setKeyValue("");
        setOnStoreSequence(newonStoreSequence);

        // Populate add name-spaced property.
        NamespacedProperty payloadXpath = EsbFactoryImpl.eINSTANCE.createNamespacedProperty();
        payloadXpath.setPrettyName("Payload XPath");
        payloadXpath.setPropertyName("xpath");
        payloadXpath.setPropertyValue(DEFAULT_XPATH_PROPERTY_VALUE);
        setExpression(payloadXpath);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */

    @Override
    protected EClass eStaticClass() {
        return EsbPackage.Literals.STORE_MEDIATOR;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getMessageStore() {
        return messageStore;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMessageStore(String newMessageStore) {
        String oldMessageStore = messageStore;
        messageStore = newMessageStore;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.STORE_MEDIATOR__MESSAGE_STORE, oldMessageStore, messageStore));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RegistryKeyProperty getOnStoreSequence() {
        return onStoreSequence;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetOnStoreSequence(RegistryKeyProperty newOnStoreSequence, NotificationChain msgs) {
        RegistryKeyProperty oldOnStoreSequence = onStoreSequence;
        onStoreSequence = newOnStoreSequence;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EsbPackage.STORE_MEDIATOR__ON_STORE_SEQUENCE, oldOnStoreSequence, newOnStoreSequence);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setOnStoreSequence(RegistryKeyProperty newOnStoreSequence) {
        if (newOnStoreSequence != onStoreSequence) {
            NotificationChain msgs = null;
            if (onStoreSequence != null)
                msgs = ((InternalEObject)onStoreSequence).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EsbPackage.STORE_MEDIATOR__ON_STORE_SEQUENCE, null, msgs);
            if (newOnStoreSequence != null)
                msgs = ((InternalEObject)newOnStoreSequence).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EsbPackage.STORE_MEDIATOR__ON_STORE_SEQUENCE, null, msgs);
            msgs = basicSetOnStoreSequence(newOnStoreSequence, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.STORE_MEDIATOR__ON_STORE_SEQUENCE, newOnStoreSequence, newOnStoreSequence));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public StoreMediatorInputConnector getInputConnector() {
        return inputConnector;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetInputConnector(StoreMediatorInputConnector newInputConnector,
            NotificationChain msgs) {
        StoreMediatorInputConnector oldInputConnector = inputConnector;
        inputConnector = newInputConnector;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EsbPackage.STORE_MEDIATOR__INPUT_CONNECTOR, oldInputConnector, newInputConnector);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setInputConnector(StoreMediatorInputConnector newInputConnector) {
        if (newInputConnector != inputConnector) {
            NotificationChain msgs = null;
            if (inputConnector != null)
                msgs = ((InternalEObject)inputConnector).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EsbPackage.STORE_MEDIATOR__INPUT_CONNECTOR, null, msgs);
            if (newInputConnector != null)
                msgs = ((InternalEObject)newInputConnector).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EsbPackage.STORE_MEDIATOR__INPUT_CONNECTOR, null, msgs);
            msgs = basicSetInputConnector(newInputConnector, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.STORE_MEDIATOR__INPUT_CONNECTOR, newInputConnector, newInputConnector));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public StoreMediatorOutputConnector getOutputConnector() {
        return outputConnector;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetOutputConnector(StoreMediatorOutputConnector newOutputConnector,
            NotificationChain msgs) {
        StoreMediatorOutputConnector oldOutputConnector = outputConnector;
        outputConnector = newOutputConnector;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EsbPackage.STORE_MEDIATOR__OUTPUT_CONNECTOR, oldOutputConnector, newOutputConnector);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setOutputConnector(StoreMediatorOutputConnector newOutputConnector) {
        if (newOutputConnector != outputConnector) {
            NotificationChain msgs = null;
            if (outputConnector != null)
                msgs = ((InternalEObject)outputConnector).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EsbPackage.STORE_MEDIATOR__OUTPUT_CONNECTOR, null, msgs);
            if (newOutputConnector != null)
                msgs = ((InternalEObject)newOutputConnector).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EsbPackage.STORE_MEDIATOR__OUTPUT_CONNECTOR, null, msgs);
            msgs = basicSetOutputConnector(newOutputConnector, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.STORE_MEDIATOR__OUTPUT_CONNECTOR, newOutputConnector, newOutputConnector));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getAvailableMessageStores() {
        return availableMessageStores;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAvailableMessageStores(String newAvailableMessageStores) {
        String oldAvailableMessageStores = availableMessageStores;
        availableMessageStores = newAvailableMessageStores;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.STORE_MEDIATOR__AVAILABLE_MESSAGE_STORES, oldAvailableMessageStores, availableMessageStores));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public StoreMediatorSpecifyType getSpecifyAs() {
        return specifyAs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSpecifyAs(StoreMediatorSpecifyType newSpecifyAs) {
        StoreMediatorSpecifyType oldSpecifyAs = specifyAs;
        specifyAs = newSpecifyAs == null ? SPECIFY_AS_EDEFAULT : newSpecifyAs;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.STORE_MEDIATOR__SPECIFY_AS, oldSpecifyAs, specifyAs));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NamespacedProperty getExpression() {
        return expression;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetExpression(NamespacedProperty newExpression, NotificationChain msgs) {
        NamespacedProperty oldExpression = expression;
        expression = newExpression;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EsbPackage.STORE_MEDIATOR__EXPRESSION, oldExpression, newExpression);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setExpression(NamespacedProperty newExpression) {
        if (newExpression != expression) {
            NotificationChain msgs = null;
            if (expression != null)
                msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EsbPackage.STORE_MEDIATOR__EXPRESSION, null, msgs);
            if (newExpression != null)
                msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EsbPackage.STORE_MEDIATOR__EXPRESSION, null, msgs);
            msgs = basicSetExpression(newExpression, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.STORE_MEDIATOR__EXPRESSION, newExpression, newExpression));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case EsbPackage.STORE_MEDIATOR__ON_STORE_SEQUENCE:
                return basicSetOnStoreSequence(null, msgs);
            case EsbPackage.STORE_MEDIATOR__INPUT_CONNECTOR:
                return basicSetInputConnector(null, msgs);
            case EsbPackage.STORE_MEDIATOR__OUTPUT_CONNECTOR:
                return basicSetOutputConnector(null, msgs);
            case EsbPackage.STORE_MEDIATOR__EXPRESSION:
                return basicSetExpression(null, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */

    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case EsbPackage.STORE_MEDIATOR__MESSAGE_STORE:
                return getMessageStore();
            case EsbPackage.STORE_MEDIATOR__ON_STORE_SEQUENCE:
                return getOnStoreSequence();
            case EsbPackage.STORE_MEDIATOR__INPUT_CONNECTOR:
                return getInputConnector();
            case EsbPackage.STORE_MEDIATOR__OUTPUT_CONNECTOR:
                return getOutputConnector();
            case EsbPackage.STORE_MEDIATOR__AVAILABLE_MESSAGE_STORES:
                return getAvailableMessageStores();
            case EsbPackage.STORE_MEDIATOR__SPECIFY_AS:
                return getSpecifyAs();
            case EsbPackage.STORE_MEDIATOR__EXPRESSION:
                return getExpression();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */

    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case EsbPackage.STORE_MEDIATOR__MESSAGE_STORE:
                setMessageStore((String)newValue);
                return;
            case EsbPackage.STORE_MEDIATOR__ON_STORE_SEQUENCE:
                setOnStoreSequence((RegistryKeyProperty)newValue);
                return;
            case EsbPackage.STORE_MEDIATOR__INPUT_CONNECTOR:
                setInputConnector((StoreMediatorInputConnector)newValue);
                return;
            case EsbPackage.STORE_MEDIATOR__OUTPUT_CONNECTOR:
                setOutputConnector((StoreMediatorOutputConnector)newValue);
                return;
            case EsbPackage.STORE_MEDIATOR__AVAILABLE_MESSAGE_STORES:
                setAvailableMessageStores((String)newValue);
                return;
            case EsbPackage.STORE_MEDIATOR__SPECIFY_AS:
                setSpecifyAs((StoreMediatorSpecifyType)newValue);
                return;
            case EsbPackage.STORE_MEDIATOR__EXPRESSION:
                setExpression((NamespacedProperty)newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */

    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
            case EsbPackage.STORE_MEDIATOR__MESSAGE_STORE:
                setMessageStore(MESSAGE_STORE_EDEFAULT);
                return;
            case EsbPackage.STORE_MEDIATOR__ON_STORE_SEQUENCE:
                setOnStoreSequence((RegistryKeyProperty)null);
                return;
            case EsbPackage.STORE_MEDIATOR__INPUT_CONNECTOR:
                setInputConnector((StoreMediatorInputConnector)null);
                return;
            case EsbPackage.STORE_MEDIATOR__OUTPUT_CONNECTOR:
                setOutputConnector((StoreMediatorOutputConnector)null);
                return;
            case EsbPackage.STORE_MEDIATOR__AVAILABLE_MESSAGE_STORES:
                setAvailableMessageStores(AVAILABLE_MESSAGE_STORES_EDEFAULT);
                return;
            case EsbPackage.STORE_MEDIATOR__SPECIFY_AS:
                setSpecifyAs(SPECIFY_AS_EDEFAULT);
                return;
            case EsbPackage.STORE_MEDIATOR__EXPRESSION:
                setExpression((NamespacedProperty)null);
                return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */

    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case EsbPackage.STORE_MEDIATOR__MESSAGE_STORE:
                return MESSAGE_STORE_EDEFAULT == null ? messageStore != null : !MESSAGE_STORE_EDEFAULT.equals(messageStore);
            case EsbPackage.STORE_MEDIATOR__ON_STORE_SEQUENCE:
                return onStoreSequence != null;
            case EsbPackage.STORE_MEDIATOR__INPUT_CONNECTOR:
                return inputConnector != null;
            case EsbPackage.STORE_MEDIATOR__OUTPUT_CONNECTOR:
                return outputConnector != null;
            case EsbPackage.STORE_MEDIATOR__AVAILABLE_MESSAGE_STORES:
                return AVAILABLE_MESSAGE_STORES_EDEFAULT == null ? availableMessageStores != null : !AVAILABLE_MESSAGE_STORES_EDEFAULT.equals(availableMessageStores);
            case EsbPackage.STORE_MEDIATOR__SPECIFY_AS:
                return specifyAs != SPECIFY_AS_EDEFAULT;
            case EsbPackage.STORE_MEDIATOR__EXPRESSION:
                return expression != null;
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */

    @Override
    public String toString() {
        if (eIsProxy()) return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (messageStore: ");
        result.append(messageStore);
        result.append(", availableMessageStores: ");
        result.append(availableMessageStores);
        result.append(", SpecifyAs: ");
        result.append(specifyAs);
        result.append(')');
        return result.toString();
    }

} // StoreMediatorImpl
