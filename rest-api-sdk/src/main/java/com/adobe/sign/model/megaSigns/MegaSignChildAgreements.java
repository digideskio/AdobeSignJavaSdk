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

package com.adobe.sign.model.megaSigns;

import com.adobe.sign.utils.StringUtil;
import com.adobe.sign.model.megaSigns.MegaSignChildAgreement;
import java.util.*;



import io.swagger.annotations.*;
import com.fasterxml.jackson.annotation.JsonProperty;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-08-29T16:03:52.934+05:30")
public class MegaSignChildAgreements   {
  
  private List<MegaSignChildAgreement> megaSignChildAgreementList = new ArrayList<MegaSignChildAgreement>();

  
  /**
   * A array of MegaSign child agreements
   **/
  @ApiModelProperty(required = true, value = "A array of MegaSign child agreements")
  @JsonProperty("megaSignChildAgreementList")
  public List<MegaSignChildAgreement> getMegaSignChildAgreementList() {
    return megaSignChildAgreementList;
  }
  public void setMegaSignChildAgreementList(List<MegaSignChildAgreement> megaSignChildAgreementList) {
    this.megaSignChildAgreementList = megaSignChildAgreementList;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class MegaSignChildAgreements {\n");
    
    sb.append("    megaSignChildAgreementList: ").append(StringUtil.toIndentedString(megaSignChildAgreementList)).append("\n");
    sb.append("}");
    return sb.toString();
  }
}
