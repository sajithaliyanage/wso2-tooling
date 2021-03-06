package org.wso2.integrationstudio.eclipse.gmf.esb.diagram.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.LineBorder;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeCompartmentEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.DragDropEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.figures.ResizableCompartmentFigure;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.edit.policies.reparent.CreationEditPolicyWithCustomReparent;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.wso2.integrationstudio.eclipse.gmf.esb.diagram.custom.AbstractMediatorCompartmentEditPart;
import org.wso2.integrationstudio.eclipse.gmf.esb.diagram.custom.AbstractMediatorFlowCompartmentEditPart.Complexity;
import org.wso2.integrationstudio.eclipse.gmf.esb.diagram.custom.editpolicy.FeedbackIndicateDragDropEditPolicy;
import org.wso2.integrationstudio.eclipse.gmf.esb.diagram.edit.policies.MediatorFlowMediatorFlowCompartment22CanonicalEditPolicy;
import org.wso2.integrationstudio.eclipse.gmf.esb.diagram.edit.policies.MediatorFlowMediatorFlowCompartment22ItemSemanticEditPolicy;
import org.wso2.integrationstudio.eclipse.gmf.esb.diagram.part.EsbVisualIDRegistry;
import org.wso2.integrationstudio.eclipse.gmf.esb.diagram.part.Messages;

/**
 * @generated NOT
 */
public class MediatorFlowMediatorFlowCompartment22EditPart extends AbstractMediatorCompartmentEditPart {

    /**
     * @generated
     */
    public static final int VISUAL_ID = 7049;

    /**
     * @generated NOT
     */
    public MediatorFlowMediatorFlowCompartment22EditPart(View view) {
        super(view);
        complexity = Complexity.MULTIPLE;
    }

    /**
     * @generated NOT
     */
    public String getCompartmentName() {
        // return Messages.MediatorFlowMediatorFlowCompartment22EditPart_title;
        return null;
    }

    public IFigure createFigure() {
        ResizableCompartmentFigure result = (ResizableCompartmentFigure) super.createFigure();
        result.setTitle("OnAccept");
        result.setTitleVisibility(true);
        /*
         * Override default border.
         * Fixing TOOLS-1864.
         */
        LineBorder border = new LineBorder(new Color(null, 183, 183, 183), 1, SWT.BORDER_DASH);
        result.setBorder(border);
        result.setToolTip("OnAccept");
        ConstrainedToolbarLayout layoutManager = new ConstrainedToolbarLayout(false);
        layoutManager.setSpacing(-15);
        result.setLayoutManager(layoutManager);
        return result;
    }

    /**
     * @generated NOT
     */
    protected void createDefaultEditPolicies() {
        super.createDefaultEditPolicies();
        installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
                new MediatorFlowMediatorFlowCompartment22ItemSemanticEditPolicy());
        installEditPolicy(EditPolicyRoles.CREATION_ROLE,
                new CreationEditPolicyWithCustomReparent(EsbVisualIDRegistry.TYPED_INSTANCE));
        installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE, new DragDropEditPolicy());
        installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE, new FeedbackIndicateDragDropEditPolicy());
        installEditPolicy(EditPolicyRoles.CANONICAL_ROLE,
                new MediatorFlowMediatorFlowCompartment22CanonicalEditPolicy());
        removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);

    }

    public boolean isSelectable() {
        return false;
    }

    /**
     * @generated
     */
    protected void setRatio(Double ratio) {
        if (getFigure().getParent().getLayoutManager() instanceof ConstrainedToolbarLayout) {
            super.setRatio(ratio);
        }
    }

}
