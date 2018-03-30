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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

/**
 * Invoice
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-03-30T14:10:18.057-06:00")
public class Invoice implements Serializable {
  private static final long serialVersionUID = 1L;

  @SerializedName("_id")
  private String id = null;

  @SerializedName("amount")
  private BigDecimal amount = null;

  @SerializedName("branchId")
  private String branchId = null;

  @SerializedName("company")
  private String company = null;

  /**
   * Gets or Sets concept
   */
  @JsonAdapter(ConceptEnum.Adapter.class)
  public enum ConceptEnum {
    INITIAL_PAYMENT("INITIAL_PAYMENT"),
    
    SCHEDULED_PAYMENT("SCHEDULED_PAYMENT"),
    
    ADVANCE_PAYMENT("ADVANCE_PAYMENT"),
    
    FEE_PAYMENT("FEE_PAYMENT");

    private String value;

    ConceptEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ConceptEnum fromValue(String text) {
      for (ConceptEnum b : ConceptEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ConceptEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ConceptEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ConceptEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ConceptEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("concept")
  private ConceptEnum concept = null;

  @SerializedName("createDate")
  private Long createDate = null;

  @SerializedName("currency")
  private String currency = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("discount")
  private BigDecimal discount = null;

  @SerializedName("dueDate")
  private Long dueDate = null;

  @SerializedName("expires")
  private Long expires = null;

  @SerializedName("fromDate")
  private Long fromDate = null;

  @SerializedName("grandTotal")
  private BigDecimal grandTotal = null;

  @SerializedName("interest")
  private BigDecimal interest = null;

  @SerializedName("links")
  private List<Link> links = null;

  @SerializedName("masterInvoice")
  private String masterInvoice = null;

  @SerializedName("metadata")
  private String metadata = null;

  @SerializedName("others")
  private BigDecimal others = null;

  @SerializedName("owner")
  private String owner = null;

  @SerializedName("ownerEmail")
  private String ownerEmail = null;

  @SerializedName("paidDate")
  private Long paidDate = null;

  @SerializedName("partnerId")
  private String partnerId = null;

  @SerializedName("paymentMethodId")
  private String paymentMethodId = null;

  /**
   * Gets or Sets paymentMethodType
   */
  @JsonAdapter(PaymentMethodTypeEnum.Adapter.class)
  public enum PaymentMethodTypeEnum {
    CREDIT_CARD("CREDIT_CARD"),
    
    ACH("ACH"),
    
    POS("POS"),
    
    CASH("CASH"),
    
    CHECK("CHECK");

    private String value;

    PaymentMethodTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PaymentMethodTypeEnum fromValue(String text) {
      for (PaymentMethodTypeEnum b : PaymentMethodTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<PaymentMethodTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PaymentMethodTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PaymentMethodTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return PaymentMethodTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("paymentMethodType")
  private PaymentMethodTypeEnum paymentMethodType = null;

  @SerializedName("paymentNumber")
  private Integer paymentNumber = null;

  @SerializedName("productReferenceId")
  private String productReferenceId = null;

  /**
   * Gets or Sets productType
   */
  @JsonAdapter(ProductTypeEnum.Adapter.class)
  public enum ProductTypeEnum {
    DONATION("DONATION"),
    
    SUBSCRIPTION("SUBSCRIPTION"),
    
    LOAN("LOAN"),
    
    PARTNER_BILLING("PARTNER_BILLING"),
    
    OTHER("OTHER");

    private String value;

    ProductTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ProductTypeEnum fromValue(String text) {
      for (ProductTypeEnum b : ProductTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ProductTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ProductTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ProductTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ProductTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("productType")
  private ProductTypeEnum productType = null;

  @SerializedName("purchaseOrder")
  private String purchaseOrder = null;

  @SerializedName("retries")
  private Integer retries = null;

  @SerializedName("sandbox")
  private Boolean sandbox = null;

  /**
   * Gets or Sets status
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    UNAPPROVED("UNAPPROVED"),
    
    PENDING("PENDING"),
    
    PROCESSING_PAYMENT("PROCESSING_PAYMENT"),
    
    FAILED("FAILED"),
    
    EXPIRED("EXPIRED"),
    
    CANCELED("CANCELED"),
    
    PAID("PAID"),
    
    DISPUTED("DISPUTED");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StatusEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("status")
  private StatusEnum status = null;

  @SerializedName("tax")
  private BigDecimal tax = null;

  @SerializedName("toDate")
  private Long toDate = null;

  public Invoice id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Invoice amount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  public Invoice branchId(String branchId) {
    this.branchId = branchId;
    return this;
  }

   /**
   * Get branchId
   * @return branchId
  **/
  @ApiModelProperty(value = "")
  public String getBranchId() {
    return branchId;
  }

  public void setBranchId(String branchId) {
    this.branchId = branchId;
  }

  public Invoice company(String company) {
    this.company = company;
    return this;
  }

   /**
   * Get company
   * @return company
  **/
  @ApiModelProperty(value = "")
  public String getCompany() {
    return company;
  }

  public void setCompany(String company) {
    this.company = company;
  }

  public Invoice concept(ConceptEnum concept) {
    this.concept = concept;
    return this;
  }

   /**
   * Get concept
   * @return concept
  **/
  @ApiModelProperty(value = "")
  public ConceptEnum getConcept() {
    return concept;
  }

  public void setConcept(ConceptEnum concept) {
    this.concept = concept;
  }

  public Invoice createDate(Long createDate) {
    this.createDate = createDate;
    return this;
  }

   /**
   * Get createDate
   * @return createDate
  **/
  @ApiModelProperty(value = "")
  public Long getCreateDate() {
    return createDate;
  }

  public void setCreateDate(Long createDate) {
    this.createDate = createDate;
  }

  public Invoice currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  @ApiModelProperty(value = "")
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public Invoice description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Invoice discount(BigDecimal discount) {
    this.discount = discount;
    return this;
  }

   /**
   * Get discount
   * @return discount
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getDiscount() {
    return discount;
  }

  public void setDiscount(BigDecimal discount) {
    this.discount = discount;
  }

  public Invoice dueDate(Long dueDate) {
    this.dueDate = dueDate;
    return this;
  }

   /**
   * Get dueDate
   * @return dueDate
  **/
  @ApiModelProperty(value = "")
  public Long getDueDate() {
    return dueDate;
  }

  public void setDueDate(Long dueDate) {
    this.dueDate = dueDate;
  }

  public Invoice expires(Long expires) {
    this.expires = expires;
    return this;
  }

   /**
   * Get expires
   * @return expires
  **/
  @ApiModelProperty(value = "")
  public Long getExpires() {
    return expires;
  }

  public void setExpires(Long expires) {
    this.expires = expires;
  }

  public Invoice fromDate(Long fromDate) {
    this.fromDate = fromDate;
    return this;
  }

   /**
   * Get fromDate
   * @return fromDate
  **/
  @ApiModelProperty(value = "")
  public Long getFromDate() {
    return fromDate;
  }

  public void setFromDate(Long fromDate) {
    this.fromDate = fromDate;
  }

  public Invoice grandTotal(BigDecimal grandTotal) {
    this.grandTotal = grandTotal;
    return this;
  }

   /**
   * Get grandTotal
   * @return grandTotal
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getGrandTotal() {
    return grandTotal;
  }

  public void setGrandTotal(BigDecimal grandTotal) {
    this.grandTotal = grandTotal;
  }

  public Invoice interest(BigDecimal interest) {
    this.interest = interest;
    return this;
  }

   /**
   * Get interest
   * @return interest
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getInterest() {
    return interest;
  }

  public void setInterest(BigDecimal interest) {
    this.interest = interest;
  }

  public Invoice links(List<Link> links) {
    this.links = links;
    return this;
  }

  public Invoice addLinksItem(Link linksItem) {
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

  public Invoice masterInvoice(String masterInvoice) {
    this.masterInvoice = masterInvoice;
    return this;
  }

   /**
   * Get masterInvoice
   * @return masterInvoice
  **/
  @ApiModelProperty(value = "")
  public String getMasterInvoice() {
    return masterInvoice;
  }

  public void setMasterInvoice(String masterInvoice) {
    this.masterInvoice = masterInvoice;
  }

  public Invoice metadata(String metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @ApiModelProperty(value = "")
  public String getMetadata() {
    return metadata;
  }

  public void setMetadata(String metadata) {
    this.metadata = metadata;
  }

  public Invoice others(BigDecimal others) {
    this.others = others;
    return this;
  }

   /**
   * Get others
   * @return others
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getOthers() {
    return others;
  }

  public void setOthers(BigDecimal others) {
    this.others = others;
  }

  public Invoice owner(String owner) {
    this.owner = owner;
    return this;
  }

   /**
   * Get owner
   * @return owner
  **/
  @ApiModelProperty(value = "")
  public String getOwner() {
    return owner;
  }

  public void setOwner(String owner) {
    this.owner = owner;
  }

  public Invoice ownerEmail(String ownerEmail) {
    this.ownerEmail = ownerEmail;
    return this;
  }

   /**
   * Get ownerEmail
   * @return ownerEmail
  **/
  @ApiModelProperty(value = "")
  public String getOwnerEmail() {
    return ownerEmail;
  }

  public void setOwnerEmail(String ownerEmail) {
    this.ownerEmail = ownerEmail;
  }

  public Invoice paidDate(Long paidDate) {
    this.paidDate = paidDate;
    return this;
  }

   /**
   * Get paidDate
   * @return paidDate
  **/
  @ApiModelProperty(value = "")
  public Long getPaidDate() {
    return paidDate;
  }

  public void setPaidDate(Long paidDate) {
    this.paidDate = paidDate;
  }

  public Invoice partnerId(String partnerId) {
    this.partnerId = partnerId;
    return this;
  }

   /**
   * Get partnerId
   * @return partnerId
  **/
  @ApiModelProperty(value = "")
  public String getPartnerId() {
    return partnerId;
  }

  public void setPartnerId(String partnerId) {
    this.partnerId = partnerId;
  }

  public Invoice paymentMethodId(String paymentMethodId) {
    this.paymentMethodId = paymentMethodId;
    return this;
  }

   /**
   * Get paymentMethodId
   * @return paymentMethodId
  **/
  @ApiModelProperty(value = "")
  public String getPaymentMethodId() {
    return paymentMethodId;
  }

  public void setPaymentMethodId(String paymentMethodId) {
    this.paymentMethodId = paymentMethodId;
  }

  public Invoice paymentMethodType(PaymentMethodTypeEnum paymentMethodType) {
    this.paymentMethodType = paymentMethodType;
    return this;
  }

   /**
   * Get paymentMethodType
   * @return paymentMethodType
  **/
  @ApiModelProperty(value = "")
  public PaymentMethodTypeEnum getPaymentMethodType() {
    return paymentMethodType;
  }

  public void setPaymentMethodType(PaymentMethodTypeEnum paymentMethodType) {
    this.paymentMethodType = paymentMethodType;
  }

  public Invoice paymentNumber(Integer paymentNumber) {
    this.paymentNumber = paymentNumber;
    return this;
  }

   /**
   * Get paymentNumber
   * @return paymentNumber
  **/
  @ApiModelProperty(value = "")
  public Integer getPaymentNumber() {
    return paymentNumber;
  }

  public void setPaymentNumber(Integer paymentNumber) {
    this.paymentNumber = paymentNumber;
  }

  public Invoice productReferenceId(String productReferenceId) {
    this.productReferenceId = productReferenceId;
    return this;
  }

   /**
   * Get productReferenceId
   * @return productReferenceId
  **/
  @ApiModelProperty(value = "")
  public String getProductReferenceId() {
    return productReferenceId;
  }

  public void setProductReferenceId(String productReferenceId) {
    this.productReferenceId = productReferenceId;
  }

  public Invoice productType(ProductTypeEnum productType) {
    this.productType = productType;
    return this;
  }

   /**
   * Get productType
   * @return productType
  **/
  @ApiModelProperty(value = "")
  public ProductTypeEnum getProductType() {
    return productType;
  }

  public void setProductType(ProductTypeEnum productType) {
    this.productType = productType;
  }

  public Invoice purchaseOrder(String purchaseOrder) {
    this.purchaseOrder = purchaseOrder;
    return this;
  }

   /**
   * Get purchaseOrder
   * @return purchaseOrder
  **/
  @ApiModelProperty(value = "")
  public String getPurchaseOrder() {
    return purchaseOrder;
  }

  public void setPurchaseOrder(String purchaseOrder) {
    this.purchaseOrder = purchaseOrder;
  }

  public Invoice retries(Integer retries) {
    this.retries = retries;
    return this;
  }

   /**
   * Get retries
   * @return retries
  **/
  @ApiModelProperty(value = "")
  public Integer getRetries() {
    return retries;
  }

  public void setRetries(Integer retries) {
    this.retries = retries;
  }

  public Invoice sandbox(Boolean sandbox) {
    this.sandbox = sandbox;
    return this;
  }

   /**
   * Get sandbox
   * @return sandbox
  **/
  @ApiModelProperty(value = "")
  public Boolean isSandbox() {
    return sandbox;
  }

  public void setSandbox(Boolean sandbox) {
    this.sandbox = sandbox;
  }

  public Invoice status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(value = "")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public Invoice tax(BigDecimal tax) {
    this.tax = tax;
    return this;
  }

   /**
   * Get tax
   * @return tax
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getTax() {
    return tax;
  }

  public void setTax(BigDecimal tax) {
    this.tax = tax;
  }

  public Invoice toDate(Long toDate) {
    this.toDate = toDate;
    return this;
  }

   /**
   * Get toDate
   * @return toDate
  **/
  @ApiModelProperty(value = "")
  public Long getToDate() {
    return toDate;
  }

  public void setToDate(Long toDate) {
    this.toDate = toDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Invoice invoice = (Invoice) o;
    return Objects.equals(this.id, invoice.id) &&
        Objects.equals(this.amount, invoice.amount) &&
        Objects.equals(this.branchId, invoice.branchId) &&
        Objects.equals(this.company, invoice.company) &&
        Objects.equals(this.concept, invoice.concept) &&
        Objects.equals(this.createDate, invoice.createDate) &&
        Objects.equals(this.currency, invoice.currency) &&
        Objects.equals(this.description, invoice.description) &&
        Objects.equals(this.discount, invoice.discount) &&
        Objects.equals(this.dueDate, invoice.dueDate) &&
        Objects.equals(this.expires, invoice.expires) &&
        Objects.equals(this.fromDate, invoice.fromDate) &&
        Objects.equals(this.grandTotal, invoice.grandTotal) &&
        Objects.equals(this.interest, invoice.interest) &&
        Objects.equals(this.links, invoice.links) &&
        Objects.equals(this.masterInvoice, invoice.masterInvoice) &&
        Objects.equals(this.metadata, invoice.metadata) &&
        Objects.equals(this.others, invoice.others) &&
        Objects.equals(this.owner, invoice.owner) &&
        Objects.equals(this.ownerEmail, invoice.ownerEmail) &&
        Objects.equals(this.paidDate, invoice.paidDate) &&
        Objects.equals(this.partnerId, invoice.partnerId) &&
        Objects.equals(this.paymentMethodId, invoice.paymentMethodId) &&
        Objects.equals(this.paymentMethodType, invoice.paymentMethodType) &&
        Objects.equals(this.paymentNumber, invoice.paymentNumber) &&
        Objects.equals(this.productReferenceId, invoice.productReferenceId) &&
        Objects.equals(this.productType, invoice.productType) &&
        Objects.equals(this.purchaseOrder, invoice.purchaseOrder) &&
        Objects.equals(this.retries, invoice.retries) &&
        Objects.equals(this.sandbox, invoice.sandbox) &&
        Objects.equals(this.status, invoice.status) &&
        Objects.equals(this.tax, invoice.tax) &&
        Objects.equals(this.toDate, invoice.toDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, amount, branchId, company, concept, createDate, currency, description, discount, dueDate, expires, fromDate, grandTotal, interest, links, masterInvoice, metadata, others, owner, ownerEmail, paidDate, partnerId, paymentMethodId, paymentMethodType, paymentNumber, productReferenceId, productType, purchaseOrder, retries, sandbox, status, tax, toDate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Invoice {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    branchId: ").append(toIndentedString(branchId)).append("\n");
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
    sb.append("    concept: ").append(toIndentedString(concept)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    discount: ").append(toIndentedString(discount)).append("\n");
    sb.append("    dueDate: ").append(toIndentedString(dueDate)).append("\n");
    sb.append("    expires: ").append(toIndentedString(expires)).append("\n");
    sb.append("    fromDate: ").append(toIndentedString(fromDate)).append("\n");
    sb.append("    grandTotal: ").append(toIndentedString(grandTotal)).append("\n");
    sb.append("    interest: ").append(toIndentedString(interest)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    masterInvoice: ").append(toIndentedString(masterInvoice)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    others: ").append(toIndentedString(others)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    ownerEmail: ").append(toIndentedString(ownerEmail)).append("\n");
    sb.append("    paidDate: ").append(toIndentedString(paidDate)).append("\n");
    sb.append("    partnerId: ").append(toIndentedString(partnerId)).append("\n");
    sb.append("    paymentMethodId: ").append(toIndentedString(paymentMethodId)).append("\n");
    sb.append("    paymentMethodType: ").append(toIndentedString(paymentMethodType)).append("\n");
    sb.append("    paymentNumber: ").append(toIndentedString(paymentNumber)).append("\n");
    sb.append("    productReferenceId: ").append(toIndentedString(productReferenceId)).append("\n");
    sb.append("    productType: ").append(toIndentedString(productType)).append("\n");
    sb.append("    purchaseOrder: ").append(toIndentedString(purchaseOrder)).append("\n");
    sb.append("    retries: ").append(toIndentedString(retries)).append("\n");
    sb.append("    sandbox: ").append(toIndentedString(sandbox)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    tax: ").append(toIndentedString(tax)).append("\n");
    sb.append("    toDate: ").append(toIndentedString(toDate)).append("\n");
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
