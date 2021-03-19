/*
 * GMO Aozora Net Bank Open API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package personal.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/**
 * Transaction
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-12-18T06:43:57.831Z")
public class Transaction {
  @SerializedName("transactionDate")
  private String transactionDate = null;

  @SerializedName("valueDate")
  private String valueDate = null;

  @SerializedName("transactionType")
  private String transactionType = null;

  @SerializedName("amount")
  private String amount = null;

  @SerializedName("remarks")
  private String remarks = null;

  @SerializedName("balance")
  private String balance = null;

  @SerializedName("itemKey")
  private String itemKey = null;

  public Transaction transactionDate(String transactionDate) {
    this.transactionDate = transactionDate;
    return this;
  }

   /**
   * 取引日 半角文字 YYYY-MM-DD形式 
   * @return transactionDate
  **/
  @ApiModelProperty(example = "2018-07-30", required = true, value = "取引日 半角文字 YYYY-MM-DD形式 ")
  public String getTransactionDate() {
    return transactionDate;
  }

  public void setTransactionDate(String transactionDate) {
    this.transactionDate = transactionDate;
  }

  public Transaction valueDate(String valueDate) {
    this.valueDate = valueDate;
    return this;
  }

   /**
   * 起算日 半角文字 YYYY-MM-DD形式 
   * @return valueDate
  **/
  @ApiModelProperty(example = "2018-07-30", required = true, value = "起算日 半角文字 YYYY-MM-DD形式 ")
  public String getValueDate() {
    return valueDate;
  }

  public void setValueDate(String valueDate) {
    this.valueDate = valueDate;
  }

  public Transaction transactionType(String transactionType) {
    this.transactionType = transactionType;
    return this;
  }

   /**
   * 入払コード 半角数字 ・1&#x3D;入金 ・2&#x3D;出金 
   * @return transactionType
  **/
  @ApiModelProperty(example = "2", required = true, value = "入払コード 半角数字 ・1=入金 ・2=出金 ")
  public String getTransactionType() {
    return transactionType;
  }

  public void setTransactionType(String transactionType) {
    this.transactionType = transactionType;
  }

  public Transaction amount(String amount) {
    this.amount = amount;
    return this;
  }

   /**
   * 取引金額 半角数字　マイナス含む 
   * @return amount
  **/
  @ApiModelProperty(example = "50000", required = true, value = "取引金額 半角数字　マイナス含む ")
  public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }

  public Transaction remarks(String remarks) {
    this.remarks = remarks;
    return this;
  }

   /**
   * 摘要内容 全半角文字 該当データがない場合はNULL 
   * @return remarks
  **/
  @ApiModelProperty(example = "振込 アオゾラ タロウ", value = "摘要内容 全半角文字 該当データがない場合はNULL ")
  public String getRemarks() {
    return remarks;
  }

  public void setRemarks(String remarks) {
    this.remarks = remarks;
  }

  public Transaction balance(String balance) {
    this.balance = balance;
    return this;
  }

   /**
   * 取引後残高 半角数字　マイナス含む 
   * @return balance
  **/
  @ApiModelProperty(example = "1200000", required = true, value = "取引後残高 半角数字　マイナス含む ")
  public String getBalance() {
    return balance;
  }

  public void setBalance(String balance) {
    this.balance = balance;
  }

  public Transaction itemKey(String itemKey) {
    this.itemKey = itemKey;
    return this;
  }

   /**
   * 明細キー 半角数字 口座の科目が01&#x3D;普通預金（有利息）または02&#x3D;普通預金（決済用）の場合は口座ID毎に設定される明細キー（明細データtimestamp（μs）） つかいわけ口座の場合はNULL
   * @return itemKey
  **/
  @ApiModelProperty(example = "20181012090520112541", value = "明細キー 半角数字 口座の科目が01=普通預金（有利息）または02=普通預金（決済用）の場合は口座ID毎に設定される明細キー（明細データtimestamp（μs）） つかいわけ口座の場合はNULL")
  public String getItemKey() {
    return itemKey;
  }

  public void setItemKey(String itemKey) {
    this.itemKey = itemKey;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Transaction transaction = (Transaction) o;
    return Objects.equals(this.transactionDate, transaction.transactionDate) &&
        Objects.equals(this.valueDate, transaction.valueDate) &&
        Objects.equals(this.transactionType, transaction.transactionType) &&
        Objects.equals(this.amount, transaction.amount) &&
        Objects.equals(this.remarks, transaction.remarks) &&
        Objects.equals(this.balance, transaction.balance) &&
        Objects.equals(this.itemKey, transaction.itemKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionDate, valueDate, transactionType, amount, remarks, balance, itemKey);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Transaction {\n");
    
    sb.append("    transactionDate: ").append(toIndentedString(transactionDate)).append("\n");
    sb.append("    valueDate: ").append(toIndentedString(valueDate)).append("\n");
    sb.append("    transactionType: ").append(toIndentedString(transactionType)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    remarks: ").append(toIndentedString(remarks)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    itemKey: ").append(toIndentedString(itemKey)).append("\n");
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

