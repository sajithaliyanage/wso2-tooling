/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.wso2.integrationstudio.eclipse.gmf.esb.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.wso2.integrationstudio.eclipse.gmf.esb.EsbPackage;
import org.wso2.integrationstudio.eclipse.gmf.esb.FilterFailContainer;
import org.wso2.integrationstudio.eclipse.gmf.esb.MediatorFlow;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Filter Fail Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.wso2.integrationstudio.eclipse.gmf.esb.impl.FilterFailContainerImpl#getMediatorFlow <em>Mediator Flow</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FilterFailContainerImpl extends EsbNodeImpl implements FilterFailContainer {
    /**
     * The cached value of the '{@link #getMediatorFlow() <em>Mediator Flow</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMediatorFlow()
     * @generated
     * @ordered
     */
    protected MediatorFlow mediatorFlow;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected FilterFailContainerImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return EsbPackage.Literals.FILTER_FAIL_CONTAINER;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MediatorFlow getMediatorFlow() {
        return mediatorFlow;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetMediatorFlow(MediatorFlow newMediatorFlow, NotificationChain msgs) {
        MediatorFlow oldMediatorFlow = mediatorFlow;
        mediatorFlow = newMediatorFlow;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EsbPackage.FILTER_FAIL_CONTAINER__MEDIATOR_FLOW, oldMediatorFlow, newMediatorFlow);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMediatorFlow(MediatorFlow newMediatorFlow) {
        if (newMediatorFlow != mediatorFlow) {
            NotificationChain msgs = null;
            if (mediatorFlow != null)
                msgs = ((InternalEObject)mediatorFlow).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EsbPackage.FILTER_FAIL_CONTAINER__MEDIATOR_FLOW, null, msgs);
            if (newMediatorFlow != null)
                msgs = ((InternalEObject)newMediatorFlow).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EsbPackage.FILTER_FAIL_CONTAINER__MEDIATOR_FLOW, null, msgs);
            msgs = basicSetMediatorFlow(newMediatorFlow, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, EsbPackage.FILTER_FAIL_CONTAINER__MEDIATOR_FLOW, newMediatorFlow, newMediatorFlow));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case EsbPackage.FILTER_FAIL_CONTAINER__MEDIATOR_FLOW:
                return basicSetMediatorFlow(null, msgs);
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
            case EsbPackage.FILTER_FAIL_CONTAINER__MEDIATOR_FLOW:
                return getMediatorFlow();
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
            case EsbPackage.FILTER_FAIL_CONTAINER__MEDIATOR_FLOW:
                setMediatorFlow((MediatorFlow)newValue);
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
            case EsbPackage.FILTER_FAIL_CONTAINER__MEDIATOR_FLOW:
                setMediatorFlow((MediatorFlow)null);
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
            case EsbPackage.FILTER_FAIL_CONTAINER__MEDIATOR_FLOW:
                return mediatorFlow != null;
        }
        return super.eIsSet(featureID);
    }

} // FilterFailContainerImpl
