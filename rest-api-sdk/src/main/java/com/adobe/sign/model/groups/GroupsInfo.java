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

package com.adobe.sign.model.groups;

import com.adobe.sign.utils.StringUtil;
import com.adobe.sign.model.groups.GroupInfo;
import java.util.*;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-08-29T16:03:54.002+05:30")
public class GroupsInfo   {
  
  private List<GroupInfo> groupInfoList = new ArrayList<GroupInfo>();

  
  /**
   * The list of groups in the account.
   **/
  @ApiModelProperty(required = true, value = "The list of groups in the account.")
  @JsonProperty("groupInfoList")
  public List<GroupInfo> getGroupInfoList() {
    return groupInfoList;
  }
  public void setGroupInfoList(List<GroupInfo> groupInfoList) {
    this.groupInfoList = groupInfoList;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupsInfo {\n");
    
    sb.append("    groupInfoList: ").append(StringUtil.toIndentedString(groupInfoList)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
