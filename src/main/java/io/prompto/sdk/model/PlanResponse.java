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
import io.prompto.sdk.model.Link;
import io.prompto.sdk.model.Plan;
import io.prompto.sdk.model.ValidationError;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

/**
 * PlanResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-09T15:57:22.781-05:00")
public class PlanResponse implements Serializable {
  private static final long serialVersionUID = 1L;

  @SerializedName("errors")
  private List<ValidationError> errors = null;

  @SerializedName("httpCode")
  private Integer httpCode = null;

  @SerializedName("httpMessage")
  private String httpMessage = null;

  @SerializedName("links")
  private List<Link> links = null;

  @SerializedName("plan")
  private Plan plan = null;

  public PlanResponse errors(List<ValidationError> errors) {
    this.errors = errors;
    return this;
  }

  public PlanResponse addErrorsItem(ValidationError errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<ValidationError>();
    }
    this.errors.add(errorsItem);
    return this;
  }

   /**
   * Get errors
   * @return errors
  **/
  @ApiModelProperty(value = "")
  public List<ValidationError> getErrors() {
    return errors;
  }

  public void setErrors(List<ValidationError> errors) {
    this.errors = errors;
  }

  public PlanResponse httpCode(Integer httpCode) {
    this.httpCode = httpCode;
    return this;
  }

   /**
   * Get httpCode
   * @return httpCode
  **/
  @ApiModelProperty(value = "")
  public Integer getHttpCode() {
    return httpCode;
  }

  public void setHttpCode(Integer httpCode) {
    this.httpCode = httpCode;
  }

  public PlanResponse httpMessage(String httpMessage) {
    this.httpMessage = httpMessage;
    return this;
  }

   /**
   * Get httpMessage
   * @return httpMessage
  **/
  @ApiModelProperty(value = "")
  public String getHttpMessage() {
    return httpMessage;
  }

  public void setHttpMessage(String httpMessage) {
    this.httpMessage = httpMessage;
  }

  public PlanResponse links(List<Link> links) {
    this.links = links;
    return this;
  }

  public PlanResponse addLinksItem(Link linksItem) {
    if (this.links == null) {
      this.links = new ArrayList<Link>();
    }
    this.links.add(linksItem);
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(value = "")
  public List<Link> getLinks() {
    return links;
  }

  public void setLinks(List<Link> links) {
    this.links = links;
  }

  public PlanResponse plan(Plan plan) {
    this.plan = plan;
    return this;
  }

   /**
   * Get plan
   * @return plan
  **/
  @ApiModelProperty(value = "")
  public Plan getPlan() {
    return plan;
  }

  public void setPlan(Plan plan) {
    this.plan = plan;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlanResponse planResponse = (PlanResponse) o;
    return Objects.equals(this.errors, planResponse.errors) &&
        Objects.equals(this.httpCode, planResponse.httpCode) &&
        Objects.equals(this.httpMessage, planResponse.httpMessage) &&
        Objects.equals(this.links, planResponse.links) &&
        Objects.equals(this.plan, planResponse.plan);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errors, httpCode, httpMessage, links, plan);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlanResponse {\n");
    
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    httpCode: ").append(toIndentedString(httpCode)).append("\n");
    sb.append("    httpMessage: ").append(toIndentedString(httpMessage)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    plan: ").append(toIndentedString(plan)).append("\n");
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

