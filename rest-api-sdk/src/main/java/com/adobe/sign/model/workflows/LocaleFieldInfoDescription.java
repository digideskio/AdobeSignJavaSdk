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

package com.adobe.sign.model.workflows;

import com.adobe.sign.utils.StringUtil;
import java.util.*;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-08-29T16:03:57.932+05:30")
public class LocaleFieldInfoDescription   {
  
  private List<String> availableLocales = new ArrayList<String>();
  private String defaultValue = null;
  private Boolean editable = null;
  private Boolean required = null;
  private Boolean visible = null;

  
  /**
   * Which locales can be chosen for this workflow
   **/
  @ApiModelProperty(required = true, value = "Which locales can be chosen for this workflow")
  @JsonProperty("availableLocales")
  public List<String> getAvailableLocales() {
    return availableLocales;
  }
  public void setAvailableLocales(List<String> availableLocales) {
    this.availableLocales = availableLocales;
  }

  
  /**
   * default value of the field if input for this field is not provided and this field is required
   **/
  @ApiModelProperty(required = true, value = "default value of the field if input for this field is not provided and this field is required")
  @JsonProperty("defaultValue")
  public String getDefaultValue() {
    return defaultValue;
  }
  public void setDefaultValue(String defaultValue) {
    this.defaultValue = defaultValue;
  }

  
  /**
   * Whether current field can be edited. If editable attribute for this field is false then this field should not be provided in the agreement creation request and default value of this field will be used in agreement creation
   **/
  @ApiModelProperty(required = true, value = "Whether current field can be edited. If editable attribute for this field is false then this field should not be provided in the agreement creation request and default value of this field will be used in agreement creation")
  @JsonProperty("editable")
  public Boolean getEditable() {
    return editable;
  }
  public void setEditable(Boolean editable) {
    this.editable = editable;
  }

  
  /**
   * Whether this field is required or optional
   **/
  @ApiModelProperty(required = true, value = "Whether this field is required or optional")
  @JsonProperty("required")
  public Boolean getRequired() {
    return required;
  }
  public void setRequired(Boolean required) {
    this.required = required;
  }

  
  /**
   * Whether current field is visible or not. If visible attribute for this field is false then this field should not be visible in the agreement creation UI using this workflow to user
   **/
  @ApiModelProperty(required = true, value = "Whether current field is visible or not. If visible attribute for this field is false then this field should not be visible in the agreement creation UI using this workflow to user")
  @JsonProperty("visible")
  public Boolean getVisible() {
    return visible;
  }
  public void setVisible(Boolean visible) {
    this.visible = visible;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocaleFieldInfoDescription {\n");
    
    sb.append("    availableLocales: ").append(StringUtil.toIndentedString(availableLocales)).append("\n");
    sb.append("    defaultValue: ").append(StringUtil.toIndentedString(defaultValue)).append("\n");
    sb.append("    editable: ").append(StringUtil.toIndentedString(editable)).append("\n");
    sb.append("    required: ").append(StringUtil.toIndentedString(required)).append("\n");
    sb.append("    visible: ").append(StringUtil.toIndentedString(visible)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
