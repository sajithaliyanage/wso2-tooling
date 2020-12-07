package org.wso2.integrationstudio.eclipse.registry.core.interfaces;

import java.util.List;
import java.util.Map;

import org.wso2.integrationstudio.eclipse.platform.core.interfaces.IDeveloperStudioProvider;

public interface IRegistryResourceProvider extends IDeveloperStudioProvider{
	/**
	 * Retrieves the resources provided by this provider
	 * @return
	 */
	public IRegistryResource[] getResources(Map<String,List<String>> filters);
	
	public IRegistryResourceProvider[] getCategories(Map<String, List<String>> filters);

}
