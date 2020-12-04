/**
 *
 * $Id$
 */
package org.wso2.developerstudio.eclipse.ds.validation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.util.FeatureMap;

import org.wso2.developerstudio.eclipse.ds.CustomValidatorProperty;

/**
 * A sample validator interface for {@link org.wso2.developerstudio.eclipse.ds.CustomValidatorPropertyList}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface CustomValidatorPropertyListValidator {
	boolean validate();

	boolean validateMixed(FeatureMap value);
	boolean validateProperty(EList<CustomValidatorProperty> value);
}
