/**
 *
 * $Id$
 */
package org.wso2.developerstudio.datamapper.validation;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;

import org.wso2.developerstudio.datamapper.InNode;
import org.wso2.developerstudio.datamapper.OutNode;
import org.wso2.developerstudio.datamapper.PropertyKeyValuePair;
import org.wso2.developerstudio.datamapper.SchemaDataType;
import org.wso2.developerstudio.datamapper.TreeNode;

/**
 * A sample validator interface for {@link org.wso2.developerstudio.datamapper.Element}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ElementValidator {
	boolean validate();

	boolean validateName(String value);
	boolean validateValue(String value);
	boolean validateOutNode(OutNode value);
	boolean validateInNode(InNode value);
	boolean validateFieldParent(TreeNode value);
	boolean validateSchemaDataType(SchemaDataType value);
	boolean validateLevel(int value);
	boolean validateProperties(EList<PropertyKeyValuePair> value);

	boolean validateProperties(EMap<String, String> value);
}