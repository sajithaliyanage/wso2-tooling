/**
 * Generated with Acceleo
 */
package org.wso2.integrationstudio.eclipse.gmf.esb.parts;

// Start of user code for imports
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.Enumerator;


// End of user code

/**
 * 
 * 
 */
public interface DataMapperMediatorPropertiesEditionPart {

	/**
	 * @return the description
	 * 
	 */
	public String getDescription();

	/**
	 * Defines a new description
	 * @param newValue the new description to set
	 * 
	 */
	public void setDescription(String newValue);


	/**
	 * @return the commentsList
	 * 
	 */
	public EList getCommentsList();

	/**
	 * Defines a new commentsList
	 * @param newValue the new commentsList to set
	 * 
	 */
	public void setCommentsList(EList newValue);

	/**
	 * Add a value to the commentsList multivalued attribute.
	 * @param newValue the value to add
	 */
	public void addToCommentsList(Object newValue);

	/**
	 * Remove a value to the commentsList multivalued attribute.
	 * @param newValue the value to remove
	 */
	public void removeToCommentsList(Object newValue);


	/**
	 * @return the Reverse
	 * 
	 */
	public Boolean getReverse();

	/**
	 * Defines a new Reverse
	 * @param newValue the new Reverse to set
	 * 
	 */
	public void setReverse(Boolean newValue);


	/**
	 * @return the inputType
	 * 
	 */
	public Enumerator getInputType();

	/**
	 * Init the inputType
	 * @param input the viewer input
	 * @param current the current value
	 */
	public void initInputType(Object input, Enumerator current);

	/**
	 * Defines a new inputType
	 * @param newValue the new inputType to set
	 * 
	 */
	public void setInputType(Enumerator newValue);


	/**
	 * @return the configurationLocalPath
	 * 
	 */
	public String getConfigurationLocalPath();

	/**
	 * Defines a new configurationLocalPath
	 * @param newValue the new configurationLocalPath to set
	 * 
	 */
	public void setConfigurationLocalPath(String newValue);


	/**
	 * @return the inputSchemaLocalPath
	 * 
	 */
	public String getInputSchemaLocalPath();

	/**
	 * Defines a new inputSchemaLocalPath
	 * @param newValue the new inputSchemaLocalPath to set
	 * 
	 */
	public void setInputSchemaLocalPath(String newValue);


	/**
	 * @return the outputSchemaLocalPath
	 * 
	 */
	public String getOutputSchemaLocalPath();

	/**
	 * Defines a new outputSchemaLocalPath
	 * @param newValue the new outputSchemaLocalPath to set
	 * 
	 */
	public void setOutputSchemaLocalPath(String newValue);


	/**
	 * @return the outputType
	 * 
	 */
	public Enumerator getOutputType();

	/**
	 * Init the outputType
	 * @param input the viewer input
	 * @param current the current value
	 */
	public void initOutputType(Object input, Enumerator current);

	/**
	 * Defines a new outputType
	 * @param newValue the new outputType to set
	 * 
	 */
	public void setOutputType(Enumerator newValue);





	/**
	 * Returns the internationalized title text.
	 * 
	 * @return the internationalized title text.
	 * 
	 */
	public String getTitle();

	// Start of user code for additional methods
	
	// End of user code

}
