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
import io.prompto.sdk.model.Pagination;
import io.prompto.sdk.model.Subscription;
import io.prompto.sdk.model.ValidationError;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

/**
 * SubscriptionListResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-09T15:57:22.781-05:00")
public class SubscriptionListResponse implements Serializable {
  private static final long serialVersionUID = 1L;

  @SerializedName("errors")
  private List<ValidationError> errors = null;

  @SerializedName("httpCode")
  private Integer httpCode = null;

  @SerializedName("httpMessage")
  private String httpMessage = null;

  @SerializedName("links")
  private List<Link> links = null;

  @SerializedName("page")
  private Pagination page = null;

  @SerializedName("subscriptions")
  private List<Subscription> subscriptions = null;

  public SubscriptionListResponse errors(List<ValidationError> errors) {
    this.errors = errors;
    return this;
  }

  public SubscriptionListResponse addErrorsItem(ValidationError errorsItem) {
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

  public SubscriptionListResponse httpCode(Integer httpCode) {
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

  public SubscriptionListResponse httpMessage(String httpMessage) {
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

  public SubscriptionListResponse links(List<Link> links) {
    this.links = links;
    return this;
  }

  public SubscriptionListResponse addLinksItem(Link linksItem) {
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

  public SubscriptionListResponse page(Pagination page) {
    this.page = page;
    return this;
  }

   /**
   * Get page
   * @return page
  **/
  @ApiModelProperty(value = "")
  public Pagination getPage() {
    return page;
  }

  public void setPage(Pagination page) {
    this.page = page;
  }

  public SubscriptionListResponse subscriptions(List<Subscription> subscriptions) {
    this.subscriptions = subscriptions;
    return this;
  }

  public SubscriptionListResponse addSubscriptionsItem(Subscription subscriptionsItem) {
    if (this.subscriptions == null) {
      this.subscriptions = new ArrayList<Subscription>();
    }
    this.subscriptions.add(subscriptionsItem);
    return this;
  }

   /**
   * Get subscriptions
   * @return subscriptions
  **/
  @ApiModelProperty(value = "")
  public List<Subscription> getSubscriptions() {
    return subscriptions;
  }

  public void setSubscriptions(List<Subscription> subscriptions) {
    this.subscriptions = subscriptions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscriptionListResponse subscriptionListResponse = (SubscriptionListResponse) o;
    return Objects.equals(this.errors, subscriptionListResponse.errors) &&
        Objects.equals(this.httpCode, subscriptionListResponse.httpCode) &&
        Objects.equals(this.httpMessage, subscriptionListResponse.httpMessage) &&
        Objects.equals(this.links, subscriptionListResponse.links) &&
        Objects.equals(this.page, subscriptionListResponse.page) &&
        Objects.equals(this.subscriptions, subscriptionListResponse.subscriptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errors, httpCode, httpMessage, links, page, subscriptions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionListResponse {\n");
    
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    httpCode: ").append(toIndentedString(httpCode)).append("\n");
    sb.append("    httpMessage: ").append(toIndentedString(httpMessage)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    subscriptions: ").append(toIndentedString(subscriptions)).append("\n");
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

