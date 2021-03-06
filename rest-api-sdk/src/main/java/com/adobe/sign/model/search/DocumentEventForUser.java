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

package com.adobe.sign.model.search;

import com.adobe.sign.utils.StringUtil;
import com.adobe.sign.model.search.DocumentHistoryEvent;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-08-29T16:03:55.943+05:30")
public class DocumentEventForUser   {
  
  private String agreementAssetId = null;
  private String agreementAssetName = null;
  private String agreementAssetType = null;
  private DocumentHistoryEvent documentHistoryEvent = null;

  
  /**
   * The ID of the agreement asset.
   **/
  @ApiModelProperty(required = true, value = "The ID of the agreement asset.")
  @JsonProperty("agreementAssetId")
  public String getAgreementAssetId() {
    return agreementAssetId;
  }
  public void setAgreementAssetId(String agreementAssetId) {
    this.agreementAssetId = agreementAssetId;
  }

  
  /**
   * The name of the agreement asset
   **/
  @ApiModelProperty(required = true, value = "The name of the agreement asset")
  @JsonProperty("agreementAssetName")
  public String getAgreementAssetName() {
    return agreementAssetName;
  }
  public void setAgreementAssetName(String agreementAssetName) {
    this.agreementAssetName = agreementAssetName;
  }

  
  /**
   * The type of the agreement asset
   **/
  @ApiModelProperty(required = true, value = "The type of the agreement asset")
  @JsonProperty("agreementAssetType")
  public String getAgreementAssetType() {
    return agreementAssetType;
  }
  public void setAgreementAssetType(String agreementAssetType) {
    this.agreementAssetType = agreementAssetType;
  }

  
  /**
   * An ordered list of the events in the audit trail of this document
   **/
  @ApiModelProperty(required = true, value = "An ordered list of the events in the audit trail of this document")
  @JsonProperty("documentHistoryEvent")
  public DocumentHistoryEvent getDocumentHistoryEvent() {
    return documentHistoryEvent;
  }
  public void setDocumentHistoryEvent(DocumentHistoryEvent documentHistoryEvent) {
    this.documentHistoryEvent = documentHistoryEvent;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentEventForUser {\n");
    
    sb.append("    agreementAssetId: ").append(StringUtil.toIndentedString(agreementAssetId)).append("\n");
    sb.append("    agreementAssetName: ").append(StringUtil.toIndentedString(agreementAssetName)).append("\n");
    sb.append("    agreementAssetType: ").append(StringUtil.toIndentedString(agreementAssetType)).append("\n");
    sb.append("    documentHistoryEvent: ").append(StringUtil.toIndentedString(documentHistoryEvent)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
