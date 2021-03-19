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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * DepositTransactionsResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-12-18T06:43:57.831Z")
public class DepositTransactionsResponse {
  @SerializedName("accountId")
  private String accountId = null;

  @SerializedName("dateFrom")
  private String dateFrom = null;

  @SerializedName("dateTo")
  private String dateTo = null;

  @SerializedName("baseDate")
  private String baseDate = null;

  @SerializedName("baseTime")
  private String baseTime = null;

  @SerializedName("hasNext")
  private Boolean hasNext = null;

  @SerializedName("nextItemKey")
  private String nextItemKey = null;

  @SerializedName("count")
  private String count = null;

  @SerializedName("paymentArrivals")
  private List<PaymentArrival> paymentArrivals = null;

  public DepositTransactionsResponse accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * 口座ID 半角英数字 口座を識別するID 
   * @return accountId
  **/
  @ApiModelProperty(example = "101011234567", required = true, value = "口座ID 半角英数字 口座を識別するID ")
  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public DepositTransactionsResponse dateFrom(String dateFrom) {
    this.dateFrom = dateFrom;
    return this;
  }

   /**
   * 対象期間From 半角文字 YYYY-MM-DD形式 リクエストに対象期間From、Toが設定されていない場合当日日付が設定されます 
   * @return dateFrom
  **/
  @ApiModelProperty(example = "2018-07-30", required = true, value = "対象期間From 半角文字 YYYY-MM-DD形式 リクエストに対象期間From、Toが設定されていない場合当日日付が設定されます ")
  public String getDateFrom() {
    return dateFrom;
  }

  public void setDateFrom(String dateFrom) {
    this.dateFrom = dateFrom;
  }

  public DepositTransactionsResponse dateTo(String dateTo) {
    this.dateTo = dateTo;
    return this;
  }

   /**
   * 対象期間To 半角文字 YYYY-MM-DD形式 リクエストに対象期間From、Toが設定されていない場合当日日付が設定されます 
   * @return dateTo
  **/
  @ApiModelProperty(example = "2018-08-10", required = true, value = "対象期間To 半角文字 YYYY-MM-DD形式 リクエストに対象期間From、Toが設定されていない場合当日日付が設定されます ")
  public String getDateTo() {
    return dateTo;
  }

  public void setDateTo(String dateTo) {
    this.dateTo = dateTo;
  }

  public DepositTransactionsResponse baseDate(String baseDate) {
    this.baseDate = baseDate;
    return this;
  }

   /**
   * 基準日 半角文字 YYYY-MM-DD形式 応答日付、もしくは振込入金明細の基準日を示します 
   * @return baseDate
  **/
  @ApiModelProperty(example = "2018-08-10", required = true, value = "基準日 半角文字 YYYY-MM-DD形式 応答日付、もしくは振込入金明細の基準日を示します ")
  public String getBaseDate() {
    return baseDate;
  }

  public void setBaseDate(String baseDate) {
    this.baseDate = baseDate;
  }

  public DepositTransactionsResponse baseTime(String baseTime) {
    this.baseTime = baseTime;
    return this;
  }

   /**
   * 基準時刻 HH:MM:SS+09:00形式 応答時刻、もしくは振込入金明細の基準時刻を示します 
   * @return baseTime
  **/
  @ApiModelProperty(example = "10:00:00+09:00", required = true, value = "基準時刻 HH:MM:SS+09:00形式 応答時刻、もしくは振込入金明細の基準時刻を示します ")
  public String getBaseTime() {
    return baseTime;
  }

  public void setBaseTime(String baseTime) {
    this.baseTime = baseTime;
  }

  public DepositTransactionsResponse hasNext(Boolean hasNext) {
    this.hasNext = hasNext;
    return this;
  }

   /**
   * 次明細フラグ ・true&#x3D;次明細あり ・false&#x3D;次明細なし 
   * @return hasNext
  **/
  @ApiModelProperty(example = "true", required = true, value = "次明細フラグ ・true=次明細あり ・false=次明細なし ")
  public Boolean isHasNext() {
    return hasNext;
  }

  public void setHasNext(Boolean hasNext) {
    this.hasNext = hasNext;
  }

  public DepositTransactionsResponse nextItemKey(String nextItemKey) {
    this.nextItemKey = nextItemKey;
    return this;
  }

   /**
   * 次明細キー 半角数字 次明細フラグがfalseの場合はNULL 
   * @return nextItemKey
  **/
  @ApiModelProperty(example = "20181012090520113000", value = "次明細キー 半角数字 次明細フラグがfalseの場合はNULL ")
  public String getNextItemKey() {
    return nextItemKey;
  }

  public void setNextItemKey(String nextItemKey) {
    this.nextItemKey = nextItemKey;
  }

  public DepositTransactionsResponse count(String count) {
    this.count = count;
    return this;
  }

   /**
   * 明細取得件数 半角数字 
   * @return count
  **/
  @ApiModelProperty(example = "500", required = true, value = "明細取得件数 半角数字 ")
  public String getCount() {
    return count;
  }

  public void setCount(String count) {
    this.count = count;
  }

  public DepositTransactionsResponse paymentArrivals(List<PaymentArrival> paymentArrivals) {
    this.paymentArrivals = paymentArrivals;
    return this;
  }

  public DepositTransactionsResponse addPaymentArrivalsItem(PaymentArrival paymentArrivalsItem) {
    if (this.paymentArrivals == null) {
      this.paymentArrivals = new ArrayList<>();
    }
    this.paymentArrivals.add(paymentArrivalsItem);
    return this;
  }

   /**
   * 振込入金明細情報 該当する情報が無い場合は、空のリストを返却します 
   * @return paymentArrivals
  **/
  @ApiModelProperty(value = "振込入金明細情報 該当する情報が無い場合は、空のリストを返却します ")
  public List<PaymentArrival> getPaymentArrivals() {
    return paymentArrivals;
  }

  public void setPaymentArrivals(List<PaymentArrival> paymentArrivals) {
    this.paymentArrivals = paymentArrivals;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DepositTransactionsResponse depositTransactionsResponse = (DepositTransactionsResponse) o;
    return Objects.equals(this.accountId, depositTransactionsResponse.accountId) &&
        Objects.equals(this.dateFrom, depositTransactionsResponse.dateFrom) &&
        Objects.equals(this.dateTo, depositTransactionsResponse.dateTo) &&
        Objects.equals(this.baseDate, depositTransactionsResponse.baseDate) &&
        Objects.equals(this.baseTime, depositTransactionsResponse.baseTime) &&
        Objects.equals(this.hasNext, depositTransactionsResponse.hasNext) &&
        Objects.equals(this.nextItemKey, depositTransactionsResponse.nextItemKey) &&
        Objects.equals(this.count, depositTransactionsResponse.count) &&
        Objects.equals(this.paymentArrivals, depositTransactionsResponse.paymentArrivals);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, dateFrom, dateTo, baseDate, baseTime, hasNext, nextItemKey, count, paymentArrivals);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DepositTransactionsResponse {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    dateFrom: ").append(toIndentedString(dateFrom)).append("\n");
    sb.append("    dateTo: ").append(toIndentedString(dateTo)).append("\n");
    sb.append("    baseDate: ").append(toIndentedString(baseDate)).append("\n");
    sb.append("    baseTime: ").append(toIndentedString(baseTime)).append("\n");
    sb.append("    hasNext: ").append(toIndentedString(hasNext)).append("\n");
    sb.append("    nextItemKey: ").append(toIndentedString(nextItemKey)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    paymentArrivals: ").append(toIndentedString(paymentArrivals)).append("\n");
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

