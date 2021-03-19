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
 * BulkTransfer
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-12-18T06:43:57.831Z")
public class BulkTransfer {
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

  public BulkTransfer itemId(String itemId) {
    this.itemId = itemId;
    return this;
  }

   /**
   * 明細番号 半角数字 重複/0はエラー　1～9999とします 
   * @return itemId
  **/
  @ApiModelProperty(example = "4", required = true, value = "明細番号 半角数字 重複/0はエラー　1～9999とします ")
  public String getItemId() {
    return itemId;
  }

  public void setItemId(String itemId) {
    this.itemId = itemId;
  }

  public BulkTransfer beneficiaryBankCode(String beneficiaryBankCode) {
    this.beneficiaryBankCode = beneficiaryBankCode;
    return this;
  }

   /**
   * 被仕向金融機関番号 半角数字 
   * @return beneficiaryBankCode
  **/
  @ApiModelProperty(example = "0398", required = true, value = "被仕向金融機関番号 半角数字 ")
  public String getBeneficiaryBankCode() {
    return beneficiaryBankCode;
  }

  public void setBeneficiaryBankCode(String beneficiaryBankCode) {
    this.beneficiaryBankCode = beneficiaryBankCode;
  }

  public BulkTransfer beneficiaryBankName(String beneficiaryBankName) {
    this.beneficiaryBankName = beneficiaryBankName;
    return this;
  }

   /**
   * 被仕向金融機関名カナ 半角文字 参考値、処理に利用しません 
   * @return beneficiaryBankName
  **/
  @ApiModelProperty(example = "ｱｵｿﾞﾗ", value = "被仕向金融機関名カナ 半角文字 参考値、処理に利用しません ")
  public String getBeneficiaryBankName() {
    return beneficiaryBankName;
  }

  public void setBeneficiaryBankName(String beneficiaryBankName) {
    this.beneficiaryBankName = beneficiaryBankName;
  }

  public BulkTransfer beneficiaryBranchCode(String beneficiaryBranchCode) {
    this.beneficiaryBranchCode = beneficiaryBranchCode;
    return this;
  }

   /**
   * 被仕向支店番号 半角数字 
   * @return beneficiaryBranchCode
  **/
  @ApiModelProperty(example = "111", required = true, value = "被仕向支店番号 半角数字 ")
  public String getBeneficiaryBranchCode() {
    return beneficiaryBranchCode;
  }

  public void setBeneficiaryBranchCode(String beneficiaryBranchCode) {
    this.beneficiaryBranchCode = beneficiaryBranchCode;
  }

  public BulkTransfer beneficiaryBranchName(String beneficiaryBranchName) {
    this.beneficiaryBranchName = beneficiaryBranchName;
    return this;
  }

   /**
   * 被仕向支店名カナ 半角文字 参考値、処理に利用しません 
   * @return beneficiaryBranchName
  **/
  @ApiModelProperty(example = "ﾎﾝﾃﾝ", value = "被仕向支店名カナ 半角文字 参考値、処理に利用しません ")
  public String getBeneficiaryBranchName() {
    return beneficiaryBranchName;
  }

  public void setBeneficiaryBranchName(String beneficiaryBranchName) {
    this.beneficiaryBranchName = beneficiaryBranchName;
  }

  public BulkTransfer clearingHouseName(String clearingHouseName) {
    this.clearingHouseName = clearingHouseName;
    return this;
  }

   /**
   * 手形交換所番号 半角文字 入力する場合は、ALL０,ALLスペースであること 参考値、処理に利用しません 
   * @return clearingHouseName
  **/
  @ApiModelProperty(example = "0000", value = "手形交換所番号 半角文字 入力する場合は、ALL０,ALLスペースであること 参考値、処理に利用しません ")
  public String getClearingHouseName() {
    return clearingHouseName;
  }

  public void setClearingHouseName(String clearingHouseName) {
    this.clearingHouseName = clearingHouseName;
  }

  public BulkTransfer accountTypeCode(String accountTypeCode) {
    this.accountTypeCode = accountTypeCode;
    return this;
  }

   /**
   * 科目コード（預金種別コード） 半角数字 1：普通、2：当座、4：貯蓄、9：その他 
   * @return accountTypeCode
  **/
  @ApiModelProperty(example = "1", required = true, value = "科目コード（預金種別コード） 半角数字 1：普通、2：当座、4：貯蓄、9：その他 ")
  public String getAccountTypeCode() {
    return accountTypeCode;
  }

  public void setAccountTypeCode(String accountTypeCode) {
    this.accountTypeCode = accountTypeCode;
  }

  public BulkTransfer accountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
    return this;
  }

   /**
   * 口座番号 半角数字 7桁未満の番号は右詰で、前ゼロで埋めること 
   * @return accountNumber
  **/
  @ApiModelProperty(example = "1234567", required = true, value = "口座番号 半角数字 7桁未満の番号は右詰で、前ゼロで埋めること ")
  public String getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }

  public BulkTransfer beneficiaryName(String beneficiaryName) {
    this.beneficiaryName = beneficiaryName;
    return this;
  }

   /**
   * 受取人名 半角文字 振込許容文字を指定可 ただし、一部の非許容文字は、許容文字に変換を行う 
   * @return beneficiaryName
  **/
  @ApiModelProperty(example = "ｶ)ｱｵｿﾞﾗｻﾝｷﾞｮｳ", required = true, value = "受取人名 半角文字 振込許容文字を指定可 ただし、一部の非許容文字は、許容文字に変換を行う ")
  public String getBeneficiaryName() {
    return beneficiaryName;
  }

  public void setBeneficiaryName(String beneficiaryName) {
    this.beneficiaryName = beneficiaryName;
  }

  public BulkTransfer transferAmount(String transferAmount) {
    this.transferAmount = transferAmount;
    return this;
  }

   /**
   * 振込金額 半角数字 1以上9,999,999,999円以下　数値のみでカンマ、マイナス不可 
   * @return transferAmount
  **/
  @ApiModelProperty(example = "1000", required = true, value = "振込金額 半角数字 1以上9,999,999,999円以下　数値のみでカンマ、マイナス不可 ")
  public String getTransferAmount() {
    return transferAmount;
  }

  public void setTransferAmount(String transferAmount) {
    this.transferAmount = transferAmount;
  }

  public BulkTransfer newCode(String newCode) {
    this.newCode = newCode;
    return this;
  }

   /**
   * 新規コード 半角文字 入力する場合は、数値またはスペースであること 参考値、処理に利用しません 
   * @return newCode
  **/
  @ApiModelProperty(example = "1", value = "新規コード 半角文字 入力する場合は、数値またはスペースであること 参考値、処理に利用しません ")
  public String getNewCode() {
    return newCode;
  }

  public void setNewCode(String newCode) {
    this.newCode = newCode;
  }

  public BulkTransfer ediInfo(String ediInfo) {
    this.ediInfo = ediInfo;
    return this;
  }

   /**
   * EDI情報 半角文字 振込許容文字を指定可 
   * @return ediInfo
  **/
  @ApiModelProperty(example = "ｾｲｷｭｳｼｮﾊﾞﾝｺﾞｳ1234", value = "EDI情報 半角文字 振込許容文字を指定可 ")
  public String getEdiInfo() {
    return ediInfo;
  }

  public void setEdiInfo(String ediInfo) {
    this.ediInfo = ediInfo;
  }

  public BulkTransfer transferDesignnatedType(String transferDesignnatedType) {
    this.transferDesignnatedType = transferDesignnatedType;
    return this;
  }

   /**
   * 振込指定区分 半角文字 入力する場合は、7：電信のみ　またはスペースであること 参考値、処理に利用しません（入力にかかわらず、すべて7：電信扱いとなります） 
   * @return transferDesignnatedType
  **/
  @ApiModelProperty(example = "7", value = "振込指定区分 半角文字 入力する場合は、7：電信のみ　またはスペースであること 参考値、処理に利用しません（入力にかかわらず、すべて7：電信扱いとなります） ")
  public String getTransferDesignnatedType() {
    return transferDesignnatedType;
  }

  public void setTransferDesignnatedType(String transferDesignnatedType) {
    this.transferDesignnatedType = transferDesignnatedType;
  }

  public BulkTransfer identification(String identification) {
    this.identification = identification;
    return this;
  }

   /**
   * 識別表示 半角文字 本項目が「Y」であればEDI情報は顧客に通知、または省略/NULL/スペースであれば顧客には通知しません 
   * @return identification
  **/
  @ApiModelProperty(example = "Y", value = "識別表示 半角文字 本項目が「Y」であればEDI情報は顧客に通知、または省略/NULL/スペースであれば顧客には通知しません ")
  public String getIdentification() {
    return identification;
  }

  public void setIdentification(String identification) {
    this.identification = identification;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BulkTransfer bulkTransfer = (BulkTransfer) o;
    return Objects.equals(this.itemId, bulkTransfer.itemId) &&
        Objects.equals(this.beneficiaryBankCode, bulkTransfer.beneficiaryBankCode) &&
        Objects.equals(this.beneficiaryBankName, bulkTransfer.beneficiaryBankName) &&
        Objects.equals(this.beneficiaryBranchCode, bulkTransfer.beneficiaryBranchCode) &&
        Objects.equals(this.beneficiaryBranchName, bulkTransfer.beneficiaryBranchName) &&
        Objects.equals(this.clearingHouseName, bulkTransfer.clearingHouseName) &&
        Objects.equals(this.accountTypeCode, bulkTransfer.accountTypeCode) &&
        Objects.equals(this.accountNumber, bulkTransfer.accountNumber) &&
        Objects.equals(this.beneficiaryName, bulkTransfer.beneficiaryName) &&
        Objects.equals(this.transferAmount, bulkTransfer.transferAmount) &&
        Objects.equals(this.newCode, bulkTransfer.newCode) &&
        Objects.equals(this.ediInfo, bulkTransfer.ediInfo) &&
        Objects.equals(this.transferDesignnatedType, bulkTransfer.transferDesignnatedType) &&
        Objects.equals(this.identification, bulkTransfer.identification);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemId, beneficiaryBankCode, beneficiaryBankName, beneficiaryBranchCode, beneficiaryBranchName, clearingHouseName, accountTypeCode, accountNumber, beneficiaryName, transferAmount, newCode, ediInfo, transferDesignnatedType, identification);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkTransfer {\n");
    
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

