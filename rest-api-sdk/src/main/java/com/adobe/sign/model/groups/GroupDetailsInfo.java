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
import java.util.*;
import com.adobe.sign.model.groups.UserInfo;
import java.util.Date;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-08-29T16:03:54.002+05:30")
public class GroupDetailsInfo   {
  
  private Date dateCreated = null;
  private List<UserInfo> groupAdmins = new ArrayList<UserInfo>();
  private String groupId = null;
  private String groupName = null;

  
  /**
   * Date of creation of the group
   **/
  @ApiModelProperty(required = true, value = "Date of creation of the group")
  @JsonProperty("dateCreated")
  public Date getDateCreated() {
    return dateCreated;
  }
  public void setDateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
  }

  
  /**
   * The list of admins of the group.
   **/
  @ApiModelProperty(value = "The list of admins of the group.")
  @JsonProperty("groupAdmins")
  public List<UserInfo> getGroupAdmins() {
    return groupAdmins;
  }
  public void setGroupAdmins(List<UserInfo> groupAdmins) {
    this.groupAdmins = groupAdmins;
  }

  
  /**
   * Unique identifier of the group
   **/
  @ApiModelProperty(required = true, value = "Unique identifier of the group")
  @JsonProperty("groupId")
  public String getGroupId() {
    return groupId;
  }
  public void setGroupId(String groupId) {
    this.groupId = groupId;
  }

  
  /**
   * Name of the group
   **/
  @ApiModelProperty(required = true, value = "Name of the group")
  @JsonProperty("groupName")
  public String getGroupName() {
    return groupName;
  }
  public void setGroupName(String groupName) {
    this.groupName = groupName;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupDetailsInfo {\n");
    
    sb.append("    dateCreated: ").append(StringUtil.toIndentedString(dateCreated)).append("\n");
    sb.append("    groupAdmins: ").append(StringUtil.toIndentedString(groupAdmins)).append("\n");
    sb.append("    groupId: ").append(StringUtil.toIndentedString(groupId)).append("\n");
    sb.append("    groupName: ").append(StringUtil.toIndentedString(groupName)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
