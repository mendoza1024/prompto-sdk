/*
 * Abella
 * Partner API application
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.prompto.sdk.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.prompto.sdk.model.Campaign;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.io.Serializable;

/**
 * CampaignRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-09T15:57:22.781-05:00")
public class CampaignRequest implements Serializable {
  private static final long serialVersionUID = 1L;

  @SerializedName("campaign")
  private Campaign campaign = null;

  @SerializedName("timestamp")
  private Long timestamp = null;

  public CampaignRequest campaign(Campaign campaign) {
    this.campaign = campaign;
    return this;
  }

   /**
   * Get campaign
   * @return campaign
  **/
  @ApiModelProperty(value = "")
  public Campaign getCampaign() {
    return campaign;
  }

  public void setCampaign(Campaign campaign) {
    this.campaign = campaign;
  }

  public CampaignRequest timestamp(Long timestamp) {
    this.timestamp = timestamp;
    return this;
  }

   /**
   * Get timestamp
   * @return timestamp
  **/
  @ApiModelProperty(value = "")
  public Long getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(Long timestamp) {
    this.timestamp = timestamp;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignRequest campaignRequest = (CampaignRequest) o;
    return Objects.equals(this.campaign, campaignRequest.campaign) &&
        Objects.equals(this.timestamp, campaignRequest.timestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(campaign, timestamp);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignRequest {\n");
    
    sb.append("    campaign: ").append(toIndentedString(campaign)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
