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
 * TransferAccept
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-12-18T06:43:57.831Z")
public class TransferAccept {
  @SerializedName("acceptNo")
  private String acceptNo = null;

  @SerializedName("acceptDatetime")
  private String acceptDatetime = null;

  public TransferAccept acceptNo(String acceptNo) {
    this.acceptNo = acceptNo;
    return this;
  }

   /**
   * 受付番号（振込　受付番号） 半角数字 振込で取引が成立/予約中になると採番（振込、総合振込、定額自動振込で共通） 
   * @return acceptNo
  **/
  @ApiModelProperty(example = "2018072901234567", value = "受付番号（振込　受付番号） 半角数字 振込で取引が成立/予約中になると採番（振込、総合振込、定額自動振込で共通） ")
  public String getAcceptNo() {
    return acceptNo;
  }

  public void setAcceptNo(String acceptNo) {
    this.acceptNo = acceptNo;
  }

  public TransferAccept acceptDatetime(String acceptDatetime) {
    this.acceptDatetime = acceptDatetime;
    return this;
  }

   /**
   * 振込受付日時 半角文字 YYYY-MM-DDTHH:MM:SS+09:00形式 この申請の受付日時 
   * @return acceptDatetime
  **/
  @ApiModelProperty(example = "2018-07-29T10:00:00+09:00", value = "振込受付日時 半角文字 YYYY-MM-DDTHH:MM:SS+09:00形式 この申請の受付日時 ")
  public String getAcceptDatetime() {
    return acceptDatetime;
  }

  public void setAcceptDatetime(String acceptDatetime) {
    this.acceptDatetime = acceptDatetime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransferAccept transferAccept = (TransferAccept) o;
    return Objects.equals(this.acceptNo, transferAccept.acceptNo) &&
        Objects.equals(this.acceptDatetime, transferAccept.acceptDatetime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acceptNo, acceptDatetime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransferAccept {\n");
    
    sb.append("    acceptNo: ").append(toIndentedString(acceptNo)).append("\n");
    sb.append("    acceptDatetime: ").append(toIndentedString(acceptDatetime)).append("\n");
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

