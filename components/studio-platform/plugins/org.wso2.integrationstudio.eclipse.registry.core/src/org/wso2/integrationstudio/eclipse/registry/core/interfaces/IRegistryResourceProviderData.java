package org.wso2.integrationstudio.eclipse.registry.core.interfaces;

import org.wso2.integrationstudio.eclipse.platform.core.interfaces.IDeveloperStudioProviderData;


public interface IRegistryResourceProviderData extends IDeveloperStudioProviderData{
	
	/**
	 * get the provider
	 * @return
	 */
	public IRegistryResourceProvider getProvider();
	
}
