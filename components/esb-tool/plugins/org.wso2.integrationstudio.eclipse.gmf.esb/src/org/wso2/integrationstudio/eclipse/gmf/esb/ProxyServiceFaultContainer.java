/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.wso2.integrationstudio.eclipse.gmf.esb;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Proxy Service Fault Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.wso2.integrationstudio.eclipse.gmf.esb.ProxyServiceFaultContainer#getMediatorFlow <em>Mediator Flow</em>}</li>
 * </ul>
 *
 * @see org.wso2.integrationstudio.eclipse.gmf.esb.EsbPackage#getProxyServiceFaultContainer()
 * @model
 * @generated
 */
public interface ProxyServiceFaultContainer extends EsbNode {
    /**
     * Returns the value of the '<em><b>Mediator Flow</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Mediator Flow</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Mediator Flow</em>' containment reference.
     * @see #setMediatorFlow(MediatorFlow)
     * @see org.wso2.integrationstudio.eclipse.gmf.esb.EsbPackage#getProxyServiceFaultContainer_MediatorFlow()
     * @model containment="true"
     * @generated
     */
    MediatorFlow getMediatorFlow();

    /**
     * Sets the value of the '{@link org.wso2.integrationstudio.eclipse.gmf.esb.ProxyServiceFaultContainer#getMediatorFlow <em>Mediator Flow</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Mediator Flow</em>' containment reference.
     * @see #getMediatorFlow()
     * @generated
     */
    void setMediatorFlow(MediatorFlow value);

} // ProxyServiceFaultContainer
