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


package corporate.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/**
 * VAccount
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-12-18T06:43:57.831Z")
public class VAccount {
  @SerializedName("vaId")
  private String vaId = null;

  @SerializedName("vaBranchCode")
  private String vaBranchCode = null;

  @SerializedName("vaBranchName")
  private String vaBranchName = null;

  @SerializedName("vaBranchNameKana")
  private String vaBranchNameKana = null;

  @SerializedName("vaAccountNumber")
  private String vaAccountNumber = null;

  @SerializedName("vaHolderNameKana")
  private String vaHolderNameKana = null;

  @SerializedName("vaTypeCode")
  private String vaTypeCode = null;

  @SerializedName("vaTypeName")
  private String vaTypeName = null;

  @SerializedName("vaStatusCode")
  private String vaStatusCode = null;

  @SerializedName("vaStatusName")
  private String vaStatusName = null;

  @SerializedName("vaStatusChangePossibleCode")
  private String vaStatusChangePossibleCode = null;

  @SerializedName("vaIssueDateTime")
  private String vaIssueDateTime = null;

  @SerializedName("vaChangeStatusDateTime")
  private String vaChangeStatusDateTime = null;

  @SerializedName("vaCloseDateTime")
  private String vaCloseDateTime = null;

  @SerializedName("expireDateTime")
  private String expireDateTime = null;

  @SerializedName("latestDepositDate")
  private String latestDepositDate = null;

  @SerializedName("latestDepositAmount")
  private String latestDepositAmount = null;

  @SerializedName("latestDepositCount")
  private String latestDepositCount = null;

  @SerializedName("raId")
  private String raId = null;

  @SerializedName("raBranchCode")
  private String raBranchCode = null;

  @SerializedName("raBranchName")
  private String raBranchName = null;

  @SerializedName("raAccountNumber")
  private String raAccountNumber = null;

  @SerializedName("raHolderName")
  private String raHolderName = null;

  public VAccount vaId(String vaId) {
    this.vaId = vaId;
    return this;
  }

   /**
   * 振込入金口座ID 半角数字 振込入金口座を識別するID 
   * @return vaId
  **/
  @ApiModelProperty(example = "5021099622", required = true, value = "振込入金口座ID 半角数字 振込入金口座を識別するID ")
  public String getVaId() {
    return vaId;
  }

  public void setVaId(String vaId) {
    this.vaId = vaId;
  }

  public VAccount vaBranchCode(String vaBranchCode) {
    this.vaBranchCode = vaBranchCode;
    return this;
  }

   /**
   * 支店コード 半角数字 
   * @return vaBranchCode
  **/
  @ApiModelProperty(example = "502", required = true, value = "支店コード 半角数字 ")
  public String getVaBranchCode() {
    return vaBranchCode;
  }

  public void setVaBranchCode(String vaBranchCode) {
    this.vaBranchCode = vaBranchCode;
  }

  public VAccount vaBranchName(String vaBranchName) {
    this.vaBranchName = vaBranchName;
    return this;
  }

   /**
   * 支店名 全角文字 
   * @return vaBranchName
  **/
  @ApiModelProperty(example = "あじさい支店", required = true, value = "支店名 全角文字 ")
  public String getVaBranchName() {
    return vaBranchName;
  }

  public void setVaBranchName(String vaBranchName) {
    this.vaBranchName = vaBranchName;
  }

  public VAccount vaBranchNameKana(String vaBranchNameKana) {
    this.vaBranchNameKana = vaBranchNameKana;
    return this;
  }

   /**
   * 支店名カナ 半角文字 
   * @return vaBranchNameKana
  **/
  @ApiModelProperty(example = "ｱｼﾞｻｲ", required = true, value = "支店名カナ 半角文字 ")
  public String getVaBranchNameKana() {
    return vaBranchNameKana;
  }

  public void setVaBranchNameKana(String vaBranchNameKana) {
    this.vaBranchNameKana = vaBranchNameKana;
  }

  public VAccount vaAccountNumber(String vaAccountNumber) {
    this.vaAccountNumber = vaAccountNumber;
    return this;
  }

   /**
   * 口座番号 半角数字 
   * @return vaAccountNumber
  **/
  @ApiModelProperty(example = "1099622", required = true, value = "口座番号 半角数字 ")
  public String getVaAccountNumber() {
    return vaAccountNumber;
  }

  public void setVaAccountNumber(String vaAccountNumber) {
    this.vaAccountNumber = vaAccountNumber;
  }

  public VAccount vaHolderNameKana(String vaHolderNameKana) {
    this.vaHolderNameKana = vaHolderNameKana;
    return this;
  }

   /**
   * 口座名義カナ 半角カナ英数記号 
   * @return vaHolderNameKana
  **/
  @ApiModelProperty(example = "ｼﾞｰｴﾑｵｰｱｵｿﾞﾗ(ｶﾃｽﾄﾆﾕｳｷﾝｸﾞﾁ", required = true, value = "口座名義カナ 半角カナ英数記号 ")
  public String getVaHolderNameKana() {
    return vaHolderNameKana;
  }

  public void setVaHolderNameKana(String vaHolderNameKana) {
    this.vaHolderNameKana = vaHolderNameKana;
  }

  public VAccount vaTypeCode(String vaTypeCode) {
    this.vaTypeCode = vaTypeCode;
    return this;
  }

   /**
   * 振込入金口座　種類コード 半角数字 ・1&#x3D;期限型 ・2&#x3D;継続型 
   * @return vaTypeCode
  **/
  @ApiModelProperty(example = "1", required = true, value = "振込入金口座　種類コード 半角数字 ・1=期限型 ・2=継続型 ")
  public String getVaTypeCode() {
    return vaTypeCode;
  }

  public void setVaTypeCode(String vaTypeCode) {
    this.vaTypeCode = vaTypeCode;
  }

  public VAccount vaTypeName(String vaTypeName) {
    this.vaTypeName = vaTypeName;
    return this;
  }

   /**
   * 振込入金口座　種類名 全角文字 振込入金口座　種類コードの名称 
   * @return vaTypeName
  **/
  @ApiModelProperty(example = "期限型", required = true, value = "振込入金口座　種類名 全角文字 振込入金口座　種類コードの名称 ")
  public String getVaTypeName() {
    return vaTypeName;
  }

  public void setVaTypeName(String vaTypeName) {
    this.vaTypeName = vaTypeName;
  }

  public VAccount vaStatusCode(String vaStatusCode) {
    this.vaStatusCode = vaStatusCode;
    return this;
  }

   /**
   * 振込入金口座　状態コード 半角数字 ・1&#x3D;利用可能 ・2&#x3D;停止中 ・3&#x3D;削除済 
   * @return vaStatusCode
  **/
  @ApiModelProperty(example = "2", required = true, value = "振込入金口座　状態コード 半角数字 ・1=利用可能 ・2=停止中 ・3=削除済 ")
  public String getVaStatusCode() {
    return vaStatusCode;
  }

  public void setVaStatusCode(String vaStatusCode) {
    this.vaStatusCode = vaStatusCode;
  }

  public VAccount vaStatusName(String vaStatusName) {
    this.vaStatusName = vaStatusName;
    return this;
  }

   /**
   * 振込入金口座　状態名 全角文字 振込入金口座　状態コードの名称 
   * @return vaStatusName
  **/
  @ApiModelProperty(example = "停止中", required = true, value = "振込入金口座　状態名 全角文字 振込入金口座　状態コードの名称 ")
  public String getVaStatusName() {
    return vaStatusName;
  }

  public void setVaStatusName(String vaStatusName) {
    this.vaStatusName = vaStatusName;
  }

  public VAccount vaStatusChangePossibleCode(String vaStatusChangePossibleCode) {
    this.vaStatusChangePossibleCode = vaStatusChangePossibleCode;
    return this;
  }

   /**
   * 振込入金口座　状態変更可能コード 半角数字 現在の口座状態から変更可能な口座状態を表したコード値 ・1&#x3D;利用可能 ・2&#x3D;停止中 ・3&#x3D;削除済 
   * @return vaStatusChangePossibleCode
  **/
  @ApiModelProperty(example = "2", required = true, value = "振込入金口座　状態変更可能コード 半角数字 現在の口座状態から変更可能な口座状態を表したコード値 ・1=利用可能 ・2=停止中 ・3=削除済 ")
  public String getVaStatusChangePossibleCode() {
    return vaStatusChangePossibleCode;
  }

  public void setVaStatusChangePossibleCode(String vaStatusChangePossibleCode) {
    this.vaStatusChangePossibleCode = vaStatusChangePossibleCode;
  }

  public VAccount vaIssueDateTime(String vaIssueDateTime) {
    this.vaIssueDateTime = vaIssueDateTime;
    return this;
  }

   /**
   * 発行日時 半角文字 YYYY-MM-DDTHH:MM:SS+09:00形式 
   * @return vaIssueDateTime
  **/
  @ApiModelProperty(example = "2018-08-01T10:00:00+09:00", required = true, value = "発行日時 半角文字 YYYY-MM-DDTHH:MM:SS+09:00形式 ")
  public String getVaIssueDateTime() {
    return vaIssueDateTime;
  }

  public void setVaIssueDateTime(String vaIssueDateTime) {
    this.vaIssueDateTime = vaIssueDateTime;
  }

  public VAccount vaChangeStatusDateTime(String vaChangeStatusDateTime) {
    this.vaChangeStatusDateTime = vaChangeStatusDateTime;
    return this;
  }

   /**
   * 状態変更日時 半角文字 YYYY-MM-DDTHH:MM:SS+09:00形式 状態が変更されている場合のみ設定されます。　該当しない場合はNULL 
   * @return vaChangeStatusDateTime
  **/
  @ApiModelProperty(example = "2018-08-10T15:00:00+09:00", value = "状態変更日時 半角文字 YYYY-MM-DDTHH:MM:SS+09:00形式 状態が変更されている場合のみ設定されます。　該当しない場合はNULL ")
  public String getVaChangeStatusDateTime() {
    return vaChangeStatusDateTime;
  }

  public void setVaChangeStatusDateTime(String vaChangeStatusDateTime) {
    this.vaChangeStatusDateTime = vaChangeStatusDateTime;
  }

  public VAccount vaCloseDateTime(String vaCloseDateTime) {
    this.vaCloseDateTime = vaCloseDateTime;
    return this;
  }

   /**
   * 削除日時 半角文字 YYYY-MM-DDTHH:MM:SS+09:00形式 状態コードが以下の場合のみ設定されます。　該当しない場合はNULL ・3&#x3D;削除済 
   * @return vaCloseDateTime
  **/
  @ApiModelProperty(example = "2018-08-29T16:00:00+09:00", value = "削除日時 半角文字 YYYY-MM-DDTHH:MM:SS+09:00形式 状態コードが以下の場合のみ設定されます。　該当しない場合はNULL ・3=削除済 ")
  public String getVaCloseDateTime() {
    return vaCloseDateTime;
  }

  public void setVaCloseDateTime(String vaCloseDateTime) {
    this.vaCloseDateTime = vaCloseDateTime;
  }

  public VAccount expireDateTime(String expireDateTime) {
    this.expireDateTime = expireDateTime;
    return this;
  }

   /**
   * 有効期限日時 半角文字 YYYY-MM-DDTHH:MM:SS+09:00形式 種類コードが以下の場合のみ設定されます。　該当しない場合はNULL ・2&#x3D;期限型 
   * @return expireDateTime
  **/
  @ApiModelProperty(example = "2018-08-31T12:59:59+09:00", value = "有効期限日時 半角文字 YYYY-MM-DDTHH:MM:SS+09:00形式 種類コードが以下の場合のみ設定されます。　該当しない場合はNULL ・2=期限型 ")
  public String getExpireDateTime() {
    return expireDateTime;
  }

  public void setExpireDateTime(String expireDateTime) {
    this.expireDateTime = expireDateTime;
  }

  public VAccount latestDepositDate(String latestDepositDate) {
    this.latestDepositDate = latestDepositDate;
    return this;
  }

   /**
   * 最終入金日 半角文字 YYYY-MM-DD形式 入金がない場合はNULL 
   * @return latestDepositDate
  **/
  @ApiModelProperty(example = "2018-08-02", value = "最終入金日 半角文字 YYYY-MM-DD形式 入金がない場合はNULL ")
  public String getLatestDepositDate() {
    return latestDepositDate;
  }

  public void setLatestDepositDate(String latestDepositDate) {
    this.latestDepositDate = latestDepositDate;
  }

  public VAccount latestDepositAmount(String latestDepositAmount) {
    this.latestDepositAmount = latestDepositAmount;
    return this;
  }

   /**
   * 最終入金金額 半角数字 入金がない場合はNULL 
   * @return latestDepositAmount
  **/
  @ApiModelProperty(example = "50000", value = "最終入金金額 半角数字 入金がない場合はNULL ")
  public String getLatestDepositAmount() {
    return latestDepositAmount;
  }

  public void setLatestDepositAmount(String latestDepositAmount) {
    this.latestDepositAmount = latestDepositAmount;
  }

  public VAccount latestDepositCount(String latestDepositCount) {
    this.latestDepositCount = latestDepositCount;
    return this;
  }

   /**
   * 最終入金日入金回数 半角数字 入金がない場合はNULL 
   * @return latestDepositCount
  **/
  @ApiModelProperty(example = "3", value = "最終入金日入金回数 半角数字 入金がない場合はNULL ")
  public String getLatestDepositCount() {
    return latestDepositCount;
  }

  public void setLatestDepositCount(String latestDepositCount) {
    this.latestDepositCount = latestDepositCount;
  }

  public VAccount raId(String raId) {
    this.raId = raId;
    return this;
  }

   /**
   * 入金口座ID 半角数字 入金先の口座を識別するID 
   * @return raId
  **/
  @ApiModelProperty(example = "101011234567", required = true, value = "入金口座ID 半角数字 入金先の口座を識別するID ")
  public String getRaId() {
    return raId;
  }

  public void setRaId(String raId) {
    this.raId = raId;
  }

  public VAccount raBranchCode(String raBranchCode) {
    this.raBranchCode = raBranchCode;
    return this;
  }

   /**
   * 入金口座　支店コード 半角数字 
   * @return raBranchCode
  **/
  @ApiModelProperty(example = "101", required = true, value = "入金口座　支店コード 半角数字 ")
  public String getRaBranchCode() {
    return raBranchCode;
  }

  public void setRaBranchCode(String raBranchCode) {
    this.raBranchCode = raBranchCode;
  }

  public VAccount raBranchName(String raBranchName) {
    this.raBranchName = raBranchName;
    return this;
  }

   /**
   * 入金口座　支店名 全角文字 
   * @return raBranchName
  **/
  @ApiModelProperty(example = "法人営業部", required = true, value = "入金口座　支店名 全角文字 ")
  public String getRaBranchName() {
    return raBranchName;
  }

  public void setRaBranchName(String raBranchName) {
    this.raBranchName = raBranchName;
  }

  public VAccount raAccountNumber(String raAccountNumber) {
    this.raAccountNumber = raAccountNumber;
    return this;
  }

   /**
   * 入金口座　口座番号 半角数字 
   * @return raAccountNumber
  **/
  @ApiModelProperty(example = "1234567", required = true, value = "入金口座　口座番号 半角数字 ")
  public String getRaAccountNumber() {
    return raAccountNumber;
  }

  public void setRaAccountNumber(String raAccountNumber) {
    this.raAccountNumber = raAccountNumber;
  }

  public VAccount raHolderName(String raHolderName) {
    this.raHolderName = raHolderName;
    return this;
  }

   /**
   * 入金口座名義 全角文字 
   * @return raHolderName
  **/
  @ApiModelProperty(example = "ＧＭＯあおぞら株式会社", required = true, value = "入金口座名義 全角文字 ")
  public String getRaHolderName() {
    return raHolderName;
  }

  public void setRaHolderName(String raHolderName) {
    this.raHolderName = raHolderName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VAccount vaccount = (VAccount) o;
    return Objects.equals(this.vaId, vaccount.vaId) &&
        Objects.equals(this.vaBranchCode, vaccount.vaBranchCode) &&
        Objects.equals(this.vaBranchName, vaccount.vaBranchName) &&
        Objects.equals(this.vaBranchNameKana, vaccount.vaBranchNameKana) &&
        Objects.equals(this.vaAccountNumber, vaccount.vaAccountNumber) &&
        Objects.equals(this.vaHolderNameKana, vaccount.vaHolderNameKana) &&
        Objects.equals(this.vaTypeCode, vaccount.vaTypeCode) &&
        Objects.equals(this.vaTypeName, vaccount.vaTypeName) &&
        Objects.equals(this.vaStatusCode, vaccount.vaStatusCode) &&
        Objects.equals(this.vaStatusName, vaccount.vaStatusName) &&
        Objects.equals(this.vaStatusChangePossibleCode, vaccount.vaStatusChangePossibleCode) &&
        Objects.equals(this.vaIssueDateTime, vaccount.vaIssueDateTime) &&
        Objects.equals(this.vaChangeStatusDateTime, vaccount.vaChangeStatusDateTime) &&
        Objects.equals(this.vaCloseDateTime, vaccount.vaCloseDateTime) &&
        Objects.equals(this.expireDateTime, vaccount.expireDateTime) &&
        Objects.equals(this.latestDepositDate, vaccount.latestDepositDate) &&
        Objects.equals(this.latestDepositAmount, vaccount.latestDepositAmount) &&
        Objects.equals(this.latestDepositCount, vaccount.latestDepositCount) &&
        Objects.equals(this.raId, vaccount.raId) &&
        Objects.equals(this.raBranchCode, vaccount.raBranchCode) &&
        Objects.equals(this.raBranchName, vaccount.raBranchName) &&
        Objects.equals(this.raAccountNumber, vaccount.raAccountNumber) &&
        Objects.equals(this.raHolderName, vaccount.raHolderName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vaId, vaBranchCode, vaBranchName, vaBranchNameKana, vaAccountNumber, vaHolderNameKana, vaTypeCode, vaTypeName, vaStatusCode, vaStatusName, vaStatusChangePossibleCode, vaIssueDateTime, vaChangeStatusDateTime, vaCloseDateTime, expireDateTime, latestDepositDate, latestDepositAmount, latestDepositCount, raId, raBranchCode, raBranchName, raAccountNumber, raHolderName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VAccount {\n");

    sb.append("    vaId: ").append(toIndentedString(vaId)).append("\n");
    sb.append("    vaBranchCode: ").append(toIndentedString(vaBranchCode)).append("\n");
    sb.append("    vaBranchName: ").append(toIndentedString(vaBranchName)).append("\n");
    sb.append("    vaBranchNameKana: ").append(toIndentedString(vaBranchNameKana)).append("\n");
    sb.append("    vaAccountNumber: ").append(toIndentedString(vaAccountNumber)).append("\n");
    sb.append("    vaHolderNameKana: ").append(toIndentedString(vaHolderNameKana)).append("\n");
    sb.append("    vaTypeCode: ").append(toIndentedString(vaTypeCode)).append("\n");
    sb.append("    vaTypeName: ").append(toIndentedString(vaTypeName)).append("\n");
    sb.append("    vaStatusCode: ").append(toIndentedString(vaStatusCode)).append("\n");
    sb.append("    vaStatusName: ").append(toIndentedString(vaStatusName)).append("\n");
    sb.append("    vaStatusChangePossibleCode: ").append(toIndentedString(vaStatusChangePossibleCode)).append("\n");
    sb.append("    vaIssueDateTime: ").append(toIndentedString(vaIssueDateTime)).append("\n");
    sb.append("    vaChangeStatusDateTime: ").append(toIndentedString(vaChangeStatusDateTime)).append("\n");
    sb.append("    vaCloseDateTime: ").append(toIndentedString(vaCloseDateTime)).append("\n");
    sb.append("    expireDateTime: ").append(toIndentedString(expireDateTime)).append("\n");
    sb.append("    latestDepositDate: ").append(toIndentedString(latestDepositDate)).append("\n");
    sb.append("    latestDepositAmount: ").append(toIndentedString(latestDepositAmount)).append("\n");
    sb.append("    latestDepositCount: ").append(toIndentedString(latestDepositCount)).append("\n");
    sb.append("    raId: ").append(toIndentedString(raId)).append("\n");
    sb.append("    raBranchCode: ").append(toIndentedString(raBranchCode)).append("\n");
    sb.append("    raBranchName: ").append(toIndentedString(raBranchName)).append("\n");
    sb.append("    raAccountNumber: ").append(toIndentedString(raAccountNumber)).append("\n");
    sb.append("    raHolderName: ").append(toIndentedString(raHolderName)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

