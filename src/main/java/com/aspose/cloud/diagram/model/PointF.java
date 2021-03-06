/*
 * Aspose.Diagram Cloud API Reference
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 3.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.aspose.cloud.diagram.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModelProperty;

/**
 * PointF
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-09-23T16:24:55.850+08:00")
public class PointF {
  @SerializedName("IsEmpty")
  private Boolean isEmpty = null;

  @SerializedName("X")
  private Double X = null;

  @SerializedName("Y")
  private Double Y = null;

  public PointF isEmpty(Boolean isEmpty) {
    this.isEmpty = isEmpty;
    return this;
  }
  
  public PointF(double x,double y) {
	  this.X = x;
	  this.Y = y;
  }

   /**
   * Get isEmpty
   * @return isEmpty
  **/
  @ApiModelProperty(required = true, value = "")
  public Boolean isIsEmpty() {
    return isEmpty;
  }

  public void setIsEmpty(Boolean isEmpty) {
    this.isEmpty = isEmpty;
  }

  public PointF X(Double X) {
    this.X = X;
    return this;
  }

   /**
   * Get X
   * @return X
  **/
  @ApiModelProperty(required = true, value = "")
  public Double getX() {
    return X;
  }

  public void setX(Double X) {
    this.X = X;
  }

  public PointF Y(Double Y) {
    this.Y = Y;
    return this;
  }

   /**
   * Get Y
   * @return Y
  **/
  @ApiModelProperty(required = true, value = "")
  public Double getY() {
    return Y;
  }

  public void setY(Double Y) {
    this.Y = Y;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PointF pointF = (PointF) o;
    return Objects.equals(this.isEmpty, pointF.isEmpty) &&
        Objects.equals(this.X, pointF.X) &&
        Objects.equals(this.Y, pointF.Y);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isEmpty, X, Y);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PointF {\n");
    
    sb.append("    isEmpty: ").append(toIndentedString(isEmpty)).append("\n");
    sb.append("    X: ").append(toIndentedString(X)).append("\n");
    sb.append("    Y: ").append(toIndentedString(Y)).append("\n");
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

