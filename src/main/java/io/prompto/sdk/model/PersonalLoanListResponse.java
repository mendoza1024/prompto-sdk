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
import io.prompto.sdk.model.PersonalLoan;
import io.prompto.sdk.model.ValidationError;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

/**
 * PersonalLoanListResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-09T15:57:22.781-05:00")
public class PersonalLoanListResponse implements Serializable {
  private static final long serialVersionUID = 1L;

  @SerializedName("errors")
  private List<ValidationError> errors = null;

  @SerializedName("httpCode")
  private Integer httpCode = null;

  @SerializedName("httpMessage")
  private String httpMessage = null;

  @SerializedName("links")
  private List<Link> links = null;

  @SerializedName("loans")
  private List<PersonalLoan> loans = null;

  @SerializedName("page")
  private Pagination page = null;

  public PersonalLoanListResponse errors(List<ValidationError> errors) {
    this.errors = errors;
    return this;
  }

  public PersonalLoanListResponse addErrorsItem(ValidationError errorsItem) {
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

  public PersonalLoanListResponse httpCode(Integer httpCode) {
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

  public PersonalLoanListResponse httpMessage(String httpMessage) {
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

  public PersonalLoanListResponse links(List<Link> links) {
    this.links = links;
    return this;
  }

  public PersonalLoanListResponse addLinksItem(Link linksItem) {
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

  public PersonalLoanListResponse loans(List<PersonalLoan> loans) {
    this.loans = loans;
    return this;
  }

  public PersonalLoanListResponse addLoansItem(PersonalLoan loansItem) {
    if (this.loans == null) {
      this.loans = new ArrayList<PersonalLoan>();
    }
    this.loans.add(loansItem);
    return this;
  }

   /**
   * Get loans
   * @return loans
  **/
  @ApiModelProperty(value = "")
  public List<PersonalLoan> getLoans() {
    return loans;
  }

  public void setLoans(List<PersonalLoan> loans) {
    this.loans = loans;
  }

  public PersonalLoanListResponse page(Pagination page) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PersonalLoanListResponse personalLoanListResponse = (PersonalLoanListResponse) o;
    return Objects.equals(this.errors, personalLoanListResponse.errors) &&
        Objects.equals(this.httpCode, personalLoanListResponse.httpCode) &&
        Objects.equals(this.httpMessage, personalLoanListResponse.httpMessage) &&
        Objects.equals(this.links, personalLoanListResponse.links) &&
        Objects.equals(this.loans, personalLoanListResponse.loans) &&
        Objects.equals(this.page, personalLoanListResponse.page);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errors, httpCode, httpMessage, links, loans, page);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersonalLoanListResponse {\n");
    
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    httpCode: ").append(toIndentedString(httpCode)).append("\n");
    sb.append("    httpMessage: ").append(toIndentedString(httpMessage)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    loans: ").append(toIndentedString(loans)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
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
