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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * BulkTransferInfo
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-12-18T06:43:57.831Z")
public class BulkTransferInfo {
  @SerializedName("itemId")
  private String itemId = null;

  @SerializedName("beneficiaryBankCode")
  private String beneficiaryBankCode = null;

  @SerializedName("beneficiaryBankName")
  private String beneficiaryBankName = null;

  @SerializedName("beneficiaryBranchCode")
  private String beneficiaryBranchCode = null;

  @SerializedName("beneficiaryBranchName")
  private String beneficiaryBranchName = null;

  @SerializedName("clearingHouseName")
  private String clearingHouseName = null;

  @SerializedName("accountTypeCode")
  private String accountTypeCode = null;

  @SerializedName("accountNumber")
  private String accountNumber = null;

  @SerializedName("beneficiaryName")
  private String beneficiaryName = null;

  @SerializedName("transferAmount")
  private String transferAmount = null;

  @SerializedName("newCode")
  private String newCode = null;

  @SerializedName("ediInfo")
  private String ediInfo = null;

  @SerializedName("transferDesignnatedType")
  private String transferDesignnatedType = null;

  @SerializedName("identification")
  private String identification = null;

  @SerializedName("transferDetailResponses")
  private List<TransferDetailResponse> transferDetailResponses = null;

  @SerializedName("unableDetailInfos")
  private List<UnableDetailInfo> unableDetailInfos = null;

  public BulkTransferInfo itemId(String itemId) {
    this.itemId = itemId;
    return this;
  }

   /**
   * 明細番号 半角数字 重複/0はエラー　1～9999とします
   * @return itemId
  **/
  @ApiModelProperty(example = "4", value = "明細番号 半角数字 重複/0はエラー　1～9999とします ")
  public String getItemId() {
    return itemId;
  }

  public void setItemId(String itemId) {
    this.itemId = itemId;
  }

  public BulkTransferInfo beneficiaryBankCode(String beneficiaryBankCode) {
    this.beneficiaryBankCode = beneficiaryBankCode;
    return this;
  }

   /**
   * 被仕向金融機関番号 半角数字
   * @return beneficiaryBankCode
  **/
  @ApiModelProperty(example = "0398", value = "被仕向金融機関番号 半角数字 ")
  public String getBeneficiaryBankCode() {
    return beneficiaryBankCode;
  }

  public void setBeneficiaryBankCode(String beneficiaryBankCode) {
    this.beneficiaryBankCode = beneficiaryBankCode;
  }

  public BulkTransferInfo beneficiaryBankName(String beneficiaryBankName) {
    this.beneficiaryBankName = beneficiaryBankName;
    return this;
  }

   /**
   * 被仕向金融機関名カナ 半角文字 該当する情報が無い場合はNULLを返却
   * @return beneficiaryBankName
  **/
  @ApiModelProperty(example = "ｱｵｿﾞﾗ", value = "被仕向金融機関名カナ 半角文字 該当する情報が無い場合はNULLを返却 ")
  public String getBeneficiaryBankName() {
    return beneficiaryBankName;
  }

  public void setBeneficiaryBankName(String beneficiaryBankName) {
    this.beneficiaryBankName = beneficiaryBankName;
  }

  public BulkTransferInfo beneficiaryBranchCode(String beneficiaryBranchCode) {
    this.beneficiaryBranchCode = beneficiaryBranchCode;
    return this;
  }

   /**
   * 被仕向支店番号 半角数字
   * @return beneficiaryBranchCode
  **/
  @ApiModelProperty(example = "111", value = "被仕向支店番号 半角数字 ")
  public String getBeneficiaryBranchCode() {
    return beneficiaryBranchCode;
  }

  public void setBeneficiaryBranchCode(String beneficiaryBranchCode) {
    this.beneficiaryBranchCode = beneficiaryBranchCode;
  }

  public BulkTransferInfo beneficiaryBranchName(String beneficiaryBranchName) {
    this.beneficiaryBranchName = beneficiaryBranchName;
    return this;
  }

   /**
   * 被仕向支店名カナ 半角文字 該当する情報が無い場合はNULLを返却
   * @return beneficiaryBranchName
  **/
  @ApiModelProperty(example = "ﾎﾝﾃﾝ", value = "被仕向支店名カナ 半角文字 該当する情報が無い場合はNULLを返却 ")
  public String getBeneficiaryBranchName() {
    return beneficiaryBranchName;
  }

  public void setBeneficiaryBranchName(String beneficiaryBranchName) {
    this.beneficiaryBranchName = beneficiaryBranchName;
  }

  public BulkTransferInfo clearingHouseName(String clearingHouseName) {
    this.clearingHouseName = clearingHouseName;
    return this;
  }

   /**
   * 手形交換所番号 半角文字 該当する情報が無い場合はNULLを返却
   * @return clearingHouseName
  **/
  @ApiModelProperty(example = "0000", value = "手形交換所番号 半角文字 該当する情報が無い場合はNULLを返却 ")
  public String getClearingHouseName() {
    return clearingHouseName;
  }

  public void setClearingHouseName(String clearingHouseName) {
    this.clearingHouseName = clearingHouseName;
  }

  public BulkTransferInfo accountTypeCode(String accountTypeCode) {
    this.accountTypeCode = accountTypeCode;
    return this;
  }

   /**
   * 科目コード（預金種別コード） 半角数字 1：普通、2：当座、4：貯蓄、9：その他
   * @return accountTypeCode
  **/
  @ApiModelProperty(example = "1", value = "科目コード（預金種別コード） 半角数字 1：普通、2：当座、4：貯蓄、9：その他 ")
  public String getAccountTypeCode() {
    return accountTypeCode;
  }

  public void setAccountTypeCode(String accountTypeCode) {
    this.accountTypeCode = accountTypeCode;
  }

  public BulkTransferInfo accountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
    return this;
  }

   /**
   * 口座番号 半角数字 7桁未満の番号は右詰で、前ゼロで埋めること
   * @return accountNumber
  **/
  @ApiModelProperty(example = "1234567", value = "口座番号 半角数字 7桁未満の番号は右詰で、前ゼロで埋めること ")
  public String getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }

  public BulkTransferInfo beneficiaryName(String beneficiaryName) {
    this.beneficiaryName = beneficiaryName;
    return this;
  }

   /**
   * 受取人名 半角文字 該当する情報が無い場合はNULLを返却
   * @return beneficiaryName
  **/
  @ApiModelProperty(example = "ｶ)ｱｵｿﾞﾗｻﾝｷﾞｮｳ", value = "受取人名 半角文字 該当する情報が無い場合はNULLを返却 ")
  public String getBeneficiaryName() {
    return beneficiaryName;
  }

  public void setBeneficiaryName(String beneficiaryName) {
    this.beneficiaryName = beneficiaryName;
  }

  public BulkTransferInfo transferAmount(String transferAmount) {
    this.transferAmount = transferAmount;
    return this;
  }

   /**
   * 振込金額 半角数字 1以上9,999,999,999円以下　数値のみでカンマ、マイナス不可
   * @return transferAmount
  **/
  @ApiModelProperty(example = "1000", value = "振込金額 半角数字 1以上9,999,999,999円以下　数値のみでカンマ、マイナス不可 ")
  public String getTransferAmount() {
    return transferAmount;
  }

  public void setTransferAmount(String transferAmount) {
    this.transferAmount = transferAmount;
  }

  public BulkTransferInfo newCode(String newCode) {
    this.newCode = newCode;
    return this;
  }

   /**
   * 新規コード 半角文字 該当する情報が無い場合はNULLを返却
   * @return newCode
  **/
  @ApiModelProperty(example = "1", value = "新規コード 半角文字 該当する情報が無い場合はNULLを返却 ")
  public String getNewCode() {
    return newCode;
  }

  public void setNewCode(String newCode) {
    this.newCode = newCode;
  }

  public BulkTransferInfo ediInfo(String ediInfo) {
    this.ediInfo = ediInfo;
    return this;
  }

   /**
   * EDI情報 半角文字 該当する情報が無い場合はNULLを返却
   * @return ediInfo
  **/
  @ApiModelProperty(example = "ｾｲｷｭｳｼｮﾊﾞﾝｺﾞｳ1234", value = "EDI情報 半角文字 該当する情報が無い場合はNULLを返却 ")
  public String getEdiInfo() {
    return ediInfo;
  }

  public void setEdiInfo(String ediInfo) {
    this.ediInfo = ediInfo;
  }

  public BulkTransferInfo transferDesignnatedType(String transferDesignnatedType) {
    this.transferDesignnatedType = transferDesignnatedType;
    return this;
  }

   /**
   * 振込指定区分 半角文字 該当する情報が無い場合はNULLを返却
   * @return transferDesignnatedType
  **/
  @ApiModelProperty(example = "7", value = "振込指定区分 半角文字 該当する情報が無い場合はNULLを返却 ")
  public String getTransferDesignnatedType() {
    return transferDesignnatedType;
  }

  public void setTransferDesignnatedType(String transferDesignnatedType) {
    this.transferDesignnatedType = transferDesignnatedType;
  }

  public BulkTransferInfo identification(String identification) {
    this.identification = identification;
    return this;
  }

   /**
   * 識別表示 半角文字 該当する情報が無い場合はNULLを返却
   * @return identification
  **/
  @ApiModelProperty(example = "Y", value = "識別表示 半角文字 該当する情報が無い場合はNULLを返却 ")
  public String getIdentification() {
    return identification;
  }

  public void setIdentification(String identification) {
    this.identification = identification;
  }

  public BulkTransferInfo transferDetailResponses(List<TransferDetailResponse> transferDetailResponses) {
    this.transferDetailResponses = transferDetailResponses;
    return this;
  }

  public BulkTransferInfo addTransferDetailResponsesItem(TransferDetailResponse transferDetailResponsesItem) {
    if (this.transferDetailResponses == null) {
      this.transferDetailResponses = new ArrayList<>();
    }
    this.transferDetailResponses.add(transferDetailResponsesItem);
    return this;
  }

   /**
   * 振込明細結果 振込明細結果のリスト 正常時のみ応答 該当する情報が無い場合は空のリストを返却
   * @return transferDetailResponses
  **/
  @ApiModelProperty(value = "振込明細結果 振込明細結果のリスト 正常時のみ応答 該当する情報が無い場合は空のリストを返却 ")
  public List<TransferDetailResponse> getTransferDetailResponses() {
    return transferDetailResponses;
  }

  public void setTransferDetailResponses(List<TransferDetailResponse> transferDetailResponses) {
    this.transferDetailResponses = transferDetailResponses;
  }

  public BulkTransferInfo unableDetailInfos(List<UnableDetailInfo> unableDetailInfos) {
    this.unableDetailInfos = unableDetailInfos;
    return this;
  }

  public BulkTransferInfo addUnableDetailInfosItem(UnableDetailInfo unableDetailInfosItem) {
    if (this.unableDetailInfos == null) {
      this.unableDetailInfos = new ArrayList<>();
    }
    this.unableDetailInfos.add(unableDetailInfosItem);
    return this;
  }

   /**
   * 不能明細情報 不能明細情報のリスト 該当する情報が無い場合は項目自体を設定しません
   * @return unableDetailInfos
  **/
  @ApiModelProperty(value = "不能明細情報 不能明細情報のリスト 該当する情報が無い場合は項目自体を設定しません ")
  public List<UnableDetailInfo> getUnableDetailInfos() {
    return unableDetailInfos;
  }

  public void setUnableDetailInfos(List<UnableDetailInfo> unableDetailInfos) {
    this.unableDetailInfos = unableDetailInfos;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BulkTransferInfo bulkTransferInfo = (BulkTransferInfo) o;
    return Objects.equals(this.itemId, bulkTransferInfo.itemId) &&
        Objects.equals(this.beneficiaryBankCode, bulkTransferInfo.beneficiaryBankCode) &&
        Objects.equals(this.beneficiaryBankName, bulkTransferInfo.beneficiaryBankName) &&
        Objects.equals(this.beneficiaryBranchCode, bulkTransferInfo.beneficiaryBranchCode) &&
        Objects.equals(this.beneficiaryBranchName, bulkTransferInfo.beneficiaryBranchName) &&
        Objects.equals(this.clearingHouseName, bulkTransferInfo.clearingHouseName) &&
        Objects.equals(this.accountTypeCode, bulkTransferInfo.accountTypeCode) &&
        Objects.equals(this.accountNumber, bulkTransferInfo.accountNumber) &&
        Objects.equals(this.beneficiaryName, bulkTransferInfo.beneficiaryName) &&
        Objects.equals(this.transferAmount, bulkTransferInfo.transferAmount) &&
        Objects.equals(this.newCode, bulkTransferInfo.newCode) &&
        Objects.equals(this.ediInfo, bulkTransferInfo.ediInfo) &&
        Objects.equals(this.transferDesignnatedType, bulkTransferInfo.transferDesignnatedType) &&
        Objects.equals(this.identification, bulkTransferInfo.identification) &&
        Objects.equals(this.transferDetailResponses, bulkTransferInfo.transferDetailResponses) &&
        Objects.equals(this.unableDetailInfos, bulkTransferInfo.unableDetailInfos);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemId, beneficiaryBankCode, beneficiaryBankName, beneficiaryBranchCode, beneficiaryBranchName, clearingHouseName, accountTypeCode, accountNumber, beneficiaryName, transferAmount, newCode, ediInfo, transferDesignnatedType, identification, transferDetailResponses, unableDetailInfos);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkTransferInfo {\n");

    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    beneficiaryBankCode: ").append(toIndentedString(beneficiaryBankCode)).append("\n");
    sb.append("    beneficiaryBankName: ").append(toIndentedString(beneficiaryBankName)).append("\n");
    sb.append("    beneficiaryBranchCode: ").append(toIndentedString(beneficiaryBranchCode)).append("\n");
    sb.append("    beneficiaryBranchName: ").append(toIndentedString(beneficiaryBranchName)).append("\n");
    sb.append("    clearingHouseName: ").append(toIndentedString(clearingHouseName)).append("\n");
    sb.append("    accountTypeCode: ").append(toIndentedString(accountTypeCode)).append("\n");
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    beneficiaryName: ").append(toIndentedString(beneficiaryName)).append("\n");
    sb.append("    transferAmount: ").append(toIndentedString(transferAmount)).append("\n");
    sb.append("    newCode: ").append(toIndentedString(newCode)).append("\n");
    sb.append("    ediInfo: ").append(toIndentedString(ediInfo)).append("\n");
    sb.append("    transferDesignnatedType: ").append(toIndentedString(transferDesignnatedType)).append("\n");
    sb.append("    identification: ").append(toIndentedString(identification)).append("\n");
    sb.append("    transferDetailResponses: ").append(toIndentedString(transferDetailResponses)).append("\n");
    sb.append("    unableDetailInfos: ").append(toIndentedString(unableDetailInfos)).append("\n");
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

