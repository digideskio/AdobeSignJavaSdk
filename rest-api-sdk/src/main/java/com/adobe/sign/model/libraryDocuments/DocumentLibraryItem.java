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

package com.adobe.sign.model.libraryDocuments;

import com.adobe.sign.utils.StringUtil;
import java.util.*;
import java.util.Date;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-08-29T16:03:51.876+05:30")
public class DocumentLibraryItem   {
  
  private String libraryDocumentId = null;

public enum LibraryTemplateTypesEnum {
  DOCUMENT("DOCUMENT"),
  FORM_FIELD_LAYER("FORM_FIELD_LAYER");

  private String value;

  LibraryTemplateTypesEnum(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return value;
  }
}

  private List<LibraryTemplateTypesEnum> libraryTemplateTypes = new ArrayList<LibraryTemplateTypesEnum>();
  private Date modifiedDate = null;
  private String name = null;

public enum ScopeEnum {
  PERSONAL("PERSONAL"),
  SHARED("SHARED"),
  GLOBAL("GLOBAL");

  private String value;

  ScopeEnum(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return value;
  }
}

  private ScopeEnum scope = null;

  
  /**
   * The unique identifier of the library document used when sending the document to be signed
   **/
  @ApiModelProperty(required = true, value = "The unique identifier of the library document used when sending the document to be signed")
  @JsonProperty("libraryDocumentId")
  public String getLibraryDocumentId() {
    return libraryDocumentId;
  }
  public void setLibraryDocumentId(String libraryDocumentId) {
    this.libraryDocumentId = libraryDocumentId;
  }

  
  /**
   * A list of one or more library template types
   **/
  @ApiModelProperty(required = true, value = "A list of one or more library template types")
  @JsonProperty("libraryTemplateTypes")
  public List<LibraryTemplateTypesEnum> getLibraryTemplateTypes() {
    return libraryTemplateTypes;
  }
  public void setLibraryTemplateTypes(List<LibraryTemplateTypesEnum> libraryTemplateTypes) {
    this.libraryTemplateTypes = libraryTemplateTypes;
  }

  
  /**
   * The day on which the library document was last modified
   **/
  @ApiModelProperty(required = true, value = "The day on which the library document was last modified")
  @JsonProperty("modifiedDate")
  public Date getModifiedDate() {
    return modifiedDate;
  }
  public void setModifiedDate(Date modifiedDate) {
    this.modifiedDate = modifiedDate;
  }

  
  /**
   * The name of the library document
   **/
  @ApiModelProperty(required = true, value = "The name of the library document")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * The scope of visibility of the library document
   **/
  @ApiModelProperty(required = true, value = "The scope of visibility of the library document")
  @JsonProperty("scope")
  public ScopeEnum getScope() {
    return scope;
  }
  public void setScope(ScopeEnum scope) {
    this.scope = scope;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentLibraryItem {\n");
    
    sb.append("    libraryDocumentId: ").append(StringUtil.toIndentedString(libraryDocumentId)).append("\n");
    sb.append("    libraryTemplateTypes: ").append(StringUtil.toIndentedString(libraryTemplateTypes)).append("\n");
    sb.append("    modifiedDate: ").append(StringUtil.toIndentedString(modifiedDate)).append("\n");
    sb.append("    name: ").append(StringUtil.toIndentedString(name)).append("\n");
    sb.append("    scope: ").append(StringUtil.toIndentedString(scope)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
