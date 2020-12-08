/*
 * Copyright 2016 WSO2, Inc. (http://wso2.com)
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
package org.wso2.integrationstudio.datamapper.diagram.custom.model.transformers;

import org.wso2.integrationstudio.datamapper.DataMapperOperatorType;
import org.wso2.integrationstudio.datamapper.diagram.custom.model.DMOperation;
import org.wso2.integrationstudio.datamapper.diagram.custom.model.IModelTransformer;
import org.wso2.integrationstudio.datamapper.impl.DivideImpl;
import org.wso2.integrationstudio.datamapper.impl.OperatorImpl;

public class DivideModelTransformer implements IModelTransformer {

	@Override
	public DMOperation transform(OperatorImpl operator, int index) {
		if (operator instanceof DivideImpl) {
			DMOperation divideOperatorModel = new DMOperation(DataMapperOperatorType.DIVIDE, operator.toString(),
					index);
			return divideOperatorModel;
		}
		throw new IllegalArgumentException("DivideImpl operator expected. Found : " + operator.toString());
	}

}
