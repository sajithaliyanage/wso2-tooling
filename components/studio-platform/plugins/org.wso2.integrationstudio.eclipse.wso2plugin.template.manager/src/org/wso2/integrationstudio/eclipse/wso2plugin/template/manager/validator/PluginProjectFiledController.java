/*
 * Copyright (c) 2015, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
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
package org.wso2.integrationstudio.eclipse.wso2plugin.template.manager.validator;

import org.wso2.integrationstudio.eclipse.platform.core.exception.FieldValidationException;
import org.wso2.integrationstudio.eclipse.platform.core.model.AbstractFieldController;
import org.wso2.integrationstudio.eclipse.platform.core.project.model.ProjectDataModel;
import org.wso2.integrationstudio.eclipse.platform.ui.validator.CommonFieldValidator;

/*
 * This is the wizard form validator for the new plugin project creation wizard
 */
public class PluginProjectFiledController extends AbstractFieldController {

	@Override
	public void validate(String modelProperty, Object value, ProjectDataModel model)
	                                                                                throws FieldValidationException {
		if (modelProperty.equals("plugin.project.name")) {
			CommonFieldValidator.validateProjectField(value);
		}
	}

}
