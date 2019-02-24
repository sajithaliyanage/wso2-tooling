/*
 * Copyright (c) 2019, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.

 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at

 *      http://www.apache.org/licenses/LICENSE-2.0

 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.developerstudio.eclipse.esb.cloud.client;

import org.apache.http.client.CookieStore;
import org.apache.http.impl.client.BasicCookieStore;
import org.wso2.developerstudio.eclipse.esb.cloud.exceptions.CloudDeploymentException;
import org.wso2.developerstudio.eclipse.esb.cloud.model.Application;
import org.wso2.developerstudio.eclipse.esb.cloud.model.EndpointData;
import org.wso2.developerstudio.eclipse.esb.cloud.resources.CloudServiceConstants;
import org.wso2.developerstudio.eclipse.esb.cloud.util.HTTPClientUtil;
import org.wso2.developerstudio.eclipse.esb.cloud.util.JsonUtils;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class IntegrationCloudServiceClient {
    
    private static CookieStore cookieStore;
    private static IntegrationCloudServiceClient client;
    
    private IntegrationCloudServiceClient() {
        
    }
    
    public static IntegrationCloudServiceClient getInstance() {
        if (null == client) {
//            synchronized (client){
//                if (null == client){
                    cookieStore = new BasicCookieStore();
                    client = new IntegrationCloudServiceClient();
//                }
//            }
            
        } 
        return client;
    }

    public boolean login(String username, String password, String tenant) throws CloudDeploymentException {
        String loginUrl = CloudServiceConstants.ServiceEndpoints.LOGIN_URL;
        
        String user = username + "@" + tenant;

        Map<String, String> data = new HashMap<>();
        data.put("action", "login");
        data.put("userName", user);
        data.put("password", password);

        String response = HTTPClientUtil.sendPostWithFormData(loginUrl, new HashMap<String, String>(), data, cookieStore);
        
        JsonParser parser = new JsonParser();
        JsonElement jsonTree = parser.parse(response);
        
        String message = jsonTree.getAsJsonObject().get("message").getAsString();
        
        return message.equals("User successfully logged in");
    }

    public Application getApplication(String appName) throws CloudDeploymentException {
        String getAppUrl = CloudServiceConstants.ServiceEndpoints.APPLICATION_URL;

        Map<String, String> data = new HashMap<>();
        data.put("action", "getApplication");
        data.put("applicationName", appName);

        String response = HTTPClientUtil.sendPostWithFormData(getAppUrl, new HashMap<String, String>(), data, cookieStore);
        
        if (response == null) {
            return null;
        }
        
        return JsonUtils.getApplicationFromJson(response);
    }
    
    public String getApplicationEndpoints(String appType, String deploymentURL, String versionId) throws CloudDeploymentException {
        String getAppUrl = CloudServiceConstants.ServiceEndpoints.APPLICATION_URL;

        Map<String, String> data = new HashMap<>();
        data.put("action", "loadEndpoints");
        data.put("appType", appType);
        data.put("deploymentURL", deploymentURL);
        data.put("versionId", versionId);

        String response = HTTPClientUtil.sendPostWithFormData(getAppUrl, new HashMap<String, String>(), data, cookieStore);
        
        return response;
    }

    public void createApplication(String appName, String appDescription, String version, String fileName, String fileLocation, String iconLocation, List<Map<String, String>> tags) throws CloudDeploymentException {

        Map<String, String> files = new HashMap<>();
        files.put("fileupload", fileLocation);
        
        if (!iconLocation.isEmpty() && iconLocation != null) {
            files.put("appIcon", iconLocation);
        }
        
        String createAppUrl = CloudServiceConstants.ServiceEndpoints.APPLICATION_URL;

        Map<String, String> data = new HashMap<>();
        data.put("action", "createApplication");
        data.put("applicationName", appName);
        if (!appDescription.isEmpty() && appDescription != null) {
            data.put("applicationDescription", appDescription);
        }
        
        data.put("appTypeName", CloudServiceConstants.AppConfigs.ESB);
        data.put("applicationRevision", version);
        data.put("uploadedFileName", fileName);
        data.put("runtimeProperties", "[]");
        data.put("tags", JsonUtils.getJsonArrayFromList(tags));
        data.put("isFileAttached", "true");
        data.put("conSpec", "5");
        data.put("isNewVersion", "false");
        data.put("appCreationMethod", "default");
        data.put("setDefaultVersion", "true");
        data.put("runtime", CloudServiceConstants.AppConfigs.RUNTIME);        
        
        String response = HTTPClientUtil.sendPostWithMulipartFormData(createAppUrl, data, files, cookieStore);
    }

    public CookieStore getCookieStore() {
        return cookieStore;
    }

}

    
    