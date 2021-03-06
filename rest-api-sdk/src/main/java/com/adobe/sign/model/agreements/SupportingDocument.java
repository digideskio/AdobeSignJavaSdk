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

package com.adobe.sign.model.agreements;

import com.adobe.sign.utils.StringUtil;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-08-29T16:03:49.202+05:30")
public class SupportingDocument   {
  
  private String displayLabel = null;
  private String fieldName = null;
  private String mimeType = null;
  private Integer numPages = null;
  private String supportingDocumentId = null;

  
  /**
   * Display name of the document
   **/
  @ApiModelProperty(required = true, value = "Display name of the document")
  @JsonProperty("displayLabel")
  public String getDisplayLabel() {
    return displayLabel;
  }
  public void setDisplayLabel(String displayLabel) {
    this.displayLabel = displayLabel;
  }

  
  /**
   * The name of the supporting document field
   **/
  @ApiModelProperty(required = true, value = "The name of the supporting document field")
  @JsonProperty("fieldName")
  public String getFieldName() {
    return fieldName;
  }
  public void setFieldName(String fieldName) {
    this.fieldName = fieldName;
  }

  
  /**
   * Mime-type of the document
   **/
  @ApiModelProperty(required = true, value = "Mime-type of the document")
  @JsonProperty("mimeType")
  public String getMimeType() {
    return mimeType;
  }
  public void setMimeType(String mimeType) {
    this.mimeType = mimeType;
  }

  
  /**
   * Number of pages in the document
   **/
  @ApiModelProperty(required = true, value = "Number of pages in the document")
  @JsonProperty("numPages")
  public Integer getNumPages() {
    return numPages;
  }
  public void setNumPages(Integer numPages) {
    this.numPages = numPages;
  }

  
  /**
   * Id representing the document
   **/
  @ApiModelProperty(required = true, value = "Id representing the document")
  @JsonProperty("supportingDocumentId")
  public String getSupportingDocumentId() {
    return supportingDocumentId;
  }
  public void setSupportingDocumentId(String supportingDocumentId) {
    this.supportingDocumentId = supportingDocumentId;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class SupportingDocument {\n");
    
    sb.append("    displayLabel: ").append(StringUtil.toIndentedString(displayLabel)).append("\n");
    sb.append("    fieldName: ").append(StringUtil.toIndentedString(fieldName)).append("\n");
    sb.append("    mimeType: ").append(StringUtil.toIndentedString(mimeType)).append("\n");
    sb.append("    numPages: ").append(StringUtil.toIndentedString(numPages)).append("\n");
    sb.append("    supportingDocumentId: ").append(StringUtil.toIndentedString(supportingDocumentId)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
