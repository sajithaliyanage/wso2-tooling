/*
 * Copyright (c) 2019 Inc. (http://www.wso2.org) All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software He   
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
*/

package org.wso2.integrationstudio.eclipse.docker.distribution.action;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.PlatformUI;
import org.wso2.integrationstudio.eclipse.docker.distribution.ui.wizard.GenerateKubernetesArtifactsWizard;

public class GenerateKubernetesArtifactsAction implements IActionDelegate {
    IStructuredSelection selection;

    @Override
    public void run(IAction action) {
        if (selection != null) {
            GenerateKubernetesArtifactsWizard wizard = new GenerateKubernetesArtifactsWizard();
            wizard.init(PlatformUI.getWorkbench(), selection);
            ContainerProceedWizardDialog exportWizardDialog = new ContainerProceedWizardDialog(
                    PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(), wizard);
            exportWizardDialog.setPageSize(666, 299);
            exportWizardDialog.setHelpAvailable(false);
            exportWizardDialog.open();
        }
    }

    @Override
    public void selectionChanged(IAction action, ISelection selection) {
        if (selection instanceof IStructuredSelection) {
            this.selection = (IStructuredSelection) selection;
        }
    }
}
