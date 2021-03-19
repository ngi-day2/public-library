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
 * TransferDetail
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-12-18T06:43:57.831Z")
public class TransferDetail {
  @SerializedName("transferStatus")
  private String transferStatus = null;

  @SerializedName("transferStatusName")
  private String transferStatusName = null;

  @SerializedName("transferTypeName")
  private String transferTypeName = null;

  @SerializedName("isFeeFreeUse")
  private Boolean isFeeFreeUse = null;

  @SerializedName("isFeePointUse")
  private Boolean isFeePointUse = null;

  @SerializedName("pointName")
  private String pointName = null;

  @SerializedName("totalFee")
  private String totalFee = null;

  @SerializedName("totalDebitAmount")
  private String totalDebitAmount = null;

  @SerializedName("transferApplies")
  private List<TransferApply> transferApplies = null;

  @SerializedName("transferAccepts")
  private List<TransferAccept> transferAccepts = null;

  @SerializedName("transferResponses")
  private List<TransferResponse> transferResponses = null;

  public TransferDetail transferStatus(String transferStatus) {
    this.transferStatus = transferStatus;
    return this;
  }

   /**
   * 振込ステータス 半角数字 2:申請中、3:差戻、4:取下げ、5:期限切れ、8:承認取消/予約取消、 11:予約中、12:手続中、13:リトライ中、 20:手続済、22:資金返却、24:組戻手続中、25:組戻済、26:組戻不成立、 40:手続不成立 
   * @return transferStatus
  **/
  @ApiModelProperty(example = "3", value = "振込ステータス 半角数字 2:申請中、3:差戻、4:取下げ、5:期限切れ、8:承認取消/予約取消、 11:予約中、12:手続中、13:リトライ中、 20:手続済、22:資金返却、24:組戻手続中、25:組戻済、26:組戻不成立、 40:手続不成立 ")
  public String getTransferStatus() {
    return transferStatus;
  }

  public void setTransferStatus(String transferStatus) {
    this.transferStatus = transferStatus;
  }

  public TransferDetail transferStatusName(String transferStatusName) {
    this.transferStatusName = transferStatusName;
    return this;
  }

   /**
   * 振込ステータス名 全角文字 
   * @return transferStatusName
  **/
  @ApiModelProperty(example = "リトライ中", value = "振込ステータス名 全角文字 ")
  public String getTransferStatusName() {
    return transferStatusName;
  }

  public void setTransferStatusName(String transferStatusName) {
    this.transferStatusName = transferStatusName;
  }

  public TransferDetail transferTypeName(String transferTypeName) {
    this.transferTypeName = transferTypeName;
    return this;
  }

   /**
   * 種類 全角文字 振込振替　または　定額自動振込　を表示 
   * @return transferTypeName
  **/
  @ApiModelProperty(example = "振込振替", value = "種類 全角文字 振込振替　または　定額自動振込　を表示 ")
  public String getTransferTypeName() {
    return transferTypeName;
  }

  public void setTransferTypeName(String transferTypeName) {
    this.transferTypeName = transferTypeName;
  }

  public TransferDetail isFeeFreeUse(Boolean isFeeFreeUse) {
    this.isFeeFreeUse = isFeeFreeUse;
    return this;
  }

   /**
   * 振込無料回数利用可否 振込利用回数の利用可否（無料回数の利用可否の設定であり、実際の利用有無ではありません） 
   * @return isFeeFreeUse
  **/
  @ApiModelProperty(example = "true", value = "振込無料回数利用可否 振込利用回数の利用可否（無料回数の利用可否の設定であり、実際の利用有無ではありません） ")
  public Boolean isIsFeeFreeUse() {
    return isFeeFreeUse;
  }

  public void setIsFeeFreeUse(Boolean isFeeFreeUse) {
    this.isFeeFreeUse = isFeeFreeUse;
  }

  public TransferDetail isFeePointUse(Boolean isFeePointUse) {
    this.isFeePointUse = isFeePointUse;
    return this;
  }

   /**
   * ポイント利用可否 ポイント会社の利用可否 
   * @return isFeePointUse
  **/
  @ApiModelProperty(example = "true", value = "ポイント利用可否 ポイント会社の利用可否 ")
  public Boolean isIsFeePointUse() {
    return isFeePointUse;
  }

  public void setIsFeePointUse(Boolean isFeePointUse) {
    this.isFeePointUse = isFeePointUse;
  }

  public TransferDetail pointName(String pointName) {
    this.pointName = pointName;
    return this;
  }

   /**
   * ポイント会社名 全角文字 該当する情報が無い場合はNULLを返却 
   * @return pointName
  **/
  @ApiModelProperty(example = "GMOポイント", value = "ポイント会社名 全角文字 該当する情報が無い場合はNULLを返却 ")
  public String getPointName() {
    return pointName;
  }

  public void setPointName(String pointName) {
    this.pointName = pointName;
  }

  public TransferDetail totalFee(String totalFee) {
    this.totalFee = totalFee;
    return this;
  }

   /**
   * 合計手数料 半角数字 振り込み完了時以外は、予定の手数料 
   * @return totalFee
  **/
  @ApiModelProperty(example = "345", value = "合計手数料 半角数字 振り込み完了時以外は、予定の手数料 ")
  public String getTotalFee() {
    return totalFee;
  }

  public void setTotalFee(String totalFee) {
    this.totalFee = totalFee;
  }

  public TransferDetail totalDebitAmount(String totalDebitAmount) {
    this.totalDebitAmount = totalDebitAmount;
    return this;
  }

   /**
   * 合計出金金額 半角数字 手数料+振込金額　ただし、振込完了時以外は、予定の手数料 
   * @return totalDebitAmount
  **/
  @ApiModelProperty(example = "123456", value = "合計出金金額 半角数字 手数料+振込金額　ただし、振込完了時以外は、予定の手数料 ")
  public String getTotalDebitAmount() {
    return totalDebitAmount;
  }

  public void setTotalDebitAmount(String totalDebitAmount) {
    this.totalDebitAmount = totalDebitAmount;
  }

  public TransferDetail transferApplies(List<TransferApply> transferApplies) {
    this.transferApplies = transferApplies;
    return this;
  }

  public TransferDetail addTransferAppliesItem(TransferApply transferAppliesItem) {
    if (this.transferApplies == null) {
      this.transferApplies = new ArrayList<>();
    }
    this.transferApplies.add(transferAppliesItem);
    return this;
  }

   /**
   * 振込申請情報 振込申請情報のリスト 
   * @return transferApplies
  **/
  @ApiModelProperty(value = "振込申請情報 振込申請情報のリスト ")
  public List<TransferApply> getTransferApplies() {
    return transferApplies;
  }

  public void setTransferApplies(List<TransferApply> transferApplies) {
    this.transferApplies = transferApplies;
  }

  public TransferDetail transferAccepts(List<TransferAccept> transferAccepts) {
    this.transferAccepts = transferAccepts;
    return this;
  }

  public TransferDetail addTransferAcceptsItem(TransferAccept transferAcceptsItem) {
    if (this.transferAccepts == null) {
      this.transferAccepts = new ArrayList<>();
    }
    this.transferAccepts.add(transferAcceptsItem);
    return this;
  }

   /**
   * 振込受付情報 振込受付情報のリスト 該当する情報が無い場合は空のリストを返却 
   * @return transferAccepts
  **/
  @ApiModelProperty(value = "振込受付情報 振込受付情報のリスト 該当する情報が無い場合は空のリストを返却 ")
  public List<TransferAccept> getTransferAccepts() {
    return transferAccepts;
  }

  public void setTransferAccepts(List<TransferAccept> transferAccepts) {
    this.transferAccepts = transferAccepts;
  }

  public TransferDetail transferResponses(List<TransferResponse> transferResponses) {
    this.transferResponses = transferResponses;
    return this;
  }

  public TransferDetail addTransferResponsesItem(TransferResponse transferResponsesItem) {
    if (this.transferResponses == null) {
      this.transferResponses = new ArrayList<>();
    }
    this.transferResponses.add(transferResponsesItem);
    return this;
  }

   /**
   * 振込レスポンス情報 振込レスポンス情報のリスト 該当する情報が無い場合は空のリストを返却 
   * @return transferResponses
  **/
  @ApiModelProperty(value = "振込レスポンス情報 振込レスポンス情報のリスト 該当する情報が無い場合は空のリストを返却 ")
  public List<TransferResponse> getTransferResponses() {
    return transferResponses;
  }

  public void setTransferResponses(List<TransferResponse> transferResponses) {
    this.transferResponses = transferResponses;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransferDetail transferDetail = (TransferDetail) o;
    return Objects.equals(this.transferStatus, transferDetail.transferStatus) &&
        Objects.equals(this.transferStatusName, transferDetail.transferStatusName) &&
        Objects.equals(this.transferTypeName, transferDetail.transferTypeName) &&
        Objects.equals(this.isFeeFreeUse, transferDetail.isFeeFreeUse) &&
        Objects.equals(this.isFeePointUse, transferDetail.isFeePointUse) &&
        Objects.equals(this.pointName, transferDetail.pointName) &&
        Objects.equals(this.totalFee, transferDetail.totalFee) &&
        Objects.equals(this.totalDebitAmount, transferDetail.totalDebitAmount) &&
        Objects.equals(this.transferApplies, transferDetail.transferApplies) &&
        Objects.equals(this.transferAccepts, transferDetail.transferAccepts) &&
        Objects.equals(this.transferResponses, transferDetail.transferResponses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transferStatus, transferStatusName, transferTypeName, isFeeFreeUse, isFeePointUse, pointName, totalFee, totalDebitAmount, transferApplies, transferAccepts, transferResponses);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransferDetail {\n");

    sb.append("    transferStatus: ").append(toIndentedString(transferStatus)).append("\n");
    sb.append("    transferStatusName: ").append(toIndentedString(transferStatusName)).append("\n");
    sb.append("    transferTypeName: ").append(toIndentedString(transferTypeName)).append("\n");
    sb.append("    isFeeFreeUse: ").append(toIndentedString(isFeeFreeUse)).append("\n");
    sb.append("    isFeePointUse: ").append(toIndentedString(isFeePointUse)).append("\n");
    sb.append("    pointName: ").append(toIndentedString(pointName)).append("\n");
    sb.append("    totalFee: ").append(toIndentedString(totalFee)).append("\n");
    sb.append("    totalDebitAmount: ").append(toIndentedString(totalDebitAmount)).append("\n");
    sb.append("    transferApplies: ").append(toIndentedString(transferApplies)).append("\n");
    sb.append("    transferAccepts: ").append(toIndentedString(transferAccepts)).append("\n");
    sb.append("    transferResponses: ").append(toIndentedString(transferResponses)).append("\n");
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

