/**
 *
 * $Id$
 */
package org.wso2.developerstudio.eclipse.ds.validation;


/**
 * A sample validator interface for {@link org.wso2.developerstudio.eclipse.ds.AttributeMapping}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface AttributeMappingValidator {
	boolean validate();

	boolean validateColumn(String value);
	boolean validateName(String value);
	boolean validateRequiredRoles(String value);
	boolean validateXsdType(String value);
	boolean validateOptional(boolean value);
}