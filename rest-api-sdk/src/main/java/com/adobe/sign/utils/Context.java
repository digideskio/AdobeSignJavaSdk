/*
*  Copyright 2016 Adobe Systems Incorporated. All rights reserved.
*  This file is licensed to you under the Apache License, Version 2.0 (the "License");
*  you may not use this file except in compliance with the License. You may obtain a copy
*  of the License at http://www.apache.org/licenses/LICENSE-2.0
*
*  Unless required by applicable law or agreed to in writing, software distributed under
*  the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR REPRESENTATIONS
*  OF ANY KIND, either express or implied. See the License for the specific language
*  governing permissions and limitations under the License.
*
*/

package com.adobe.sign.utils;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-08-29T16:04:00.834+05:30")
public class Context {
  private static ApiClient defaultApiClient = new ApiClient();

  /**
   * Get the default API client, which would be used when creating API
   * instances without providing an API client.
   */
  public static ApiClient getDefaultApiClient() {
    return defaultApiClient;
   }

  /**
   * Set the base uri.
   */
  public static void setBaseUri(String baseUri)
  {
    defaultApiClient.setBaseUri(baseUri);
  }

  /**
   * Get the base uri.
   */
  public static String getBaseUri()
  {
    return defaultApiClient.getBaseUri();  
  }

  /**
   * Set the host environment.
   */
  public static void setEnvHostName(String hostName)
  {
    defaultApiClient.setEnvHostName(hostName);
  }

  /**
   * Get the host environment.
   */
  public static String getEnvHostName()
  {
    return defaultApiClient.getEnvHostName();
  }

}
