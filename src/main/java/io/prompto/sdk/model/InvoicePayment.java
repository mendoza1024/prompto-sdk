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
import io.prompto.sdk.model.Invoice;
import io.prompto.sdk.model.InvoiceAttachment;
import io.prompto.sdk.model.Link;
import io.prompto.sdk.model.PaymentIntent;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

/**
 * InvoicePayment
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-09T15:57:22.781-05:00")
public class InvoicePayment implements Serializable {
  private static final long serialVersionUID = 1L;

  @SerializedName("attachments")
  private List<InvoiceAttachment> attachments = null;

  @SerializedName("invoice")
  private Invoice invoice = null;

  @SerializedName("links")
  private List<Link> links = null;

  @SerializedName("payments")
  private List<PaymentIntent> payments = null;

  public InvoicePayment attachments(List<InvoiceAttachment> attachments) {
    this.attachments = attachments;
    return this;
  }

  public InvoicePayment addAttachmentsItem(InvoiceAttachment attachmentsItem) {
    if (this.attachments == null) {
      this.attachments = new ArrayList<InvoiceAttachment>();
    }
    this.attachments.add(attachmentsItem);
    return this;
  }

   /**
   * Get attachments
   * @return attachments
  **/
  @ApiModelProperty(value = "")
  public List<InvoiceAttachment> getAttachments() {
    return attachments;
  }

  public void setAttachments(List<InvoiceAttachment> attachments) {
    this.attachments = attachments;
  }

  public InvoicePayment invoice(Invoice invoice) {
    this.invoice = invoice;
    return this;
  }

   /**
   * Get invoice
   * @return invoice
  **/
  @ApiModelProperty(value = "")
  public Invoice getInvoice() {
    return invoice;
  }

  public void setInvoice(Invoice invoice) {
    this.invoice = invoice;
  }

  public InvoicePayment links(List<Link> links) {
    this.links = links;
    return this;
  }

  public InvoicePayment addLinksItem(Link linksItem) {
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

  public InvoicePayment payments(List<PaymentIntent> payments) {
    this.payments = payments;
    return this;
  }

  public InvoicePayment addPaymentsItem(PaymentIntent paymentsItem) {
    if (this.payments == null) {
      this.payments = new ArrayList<PaymentIntent>();
    }
    this.payments.add(paymentsItem);
    return this;
  }

   /**
   * Get payments
   * @return payments
  **/
  @ApiModelProperty(value = "")
  public List<PaymentIntent> getPayments() {
    return payments;
  }

  public void setPayments(List<PaymentIntent> payments) {
    this.payments = payments;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvoicePayment invoicePayment = (InvoicePayment) o;
    return Objects.equals(this.attachments, invoicePayment.attachments) &&
        Objects.equals(this.invoice, invoicePayment.invoice) &&
        Objects.equals(this.links, invoicePayment.links) &&
        Objects.equals(this.payments, invoicePayment.payments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attachments, invoice, links, payments);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvoicePayment {\n");
    
    sb.append("    attachments: ").append(toIndentedString(attachments)).append("\n");
    sb.append("    invoice: ").append(toIndentedString(invoice)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    payments: ").append(toIndentedString(payments)).append("\n");
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

