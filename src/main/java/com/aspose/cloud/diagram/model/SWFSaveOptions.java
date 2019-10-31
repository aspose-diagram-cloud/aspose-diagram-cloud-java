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
import com.aspose.cloud.diagram.model.SaveOptionsModel;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * SWFSaveOptions
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-09-23T16:24:55.850+08:00")
public class SWFSaveOptions extends SaveOptionsModel {
  @SerializedName("PageCount")
  private Integer pageCount = null;

  @SerializedName("ViewerIncluded")
  private Boolean viewerIncluded = null;

  @SerializedName("PageIndex")
  private Integer pageIndex = null;

  @SerializedName("SaveForegroundPagesOnly")
  private Boolean saveForegroundPagesOnly = null;

  public SWFSaveOptions pageCount(Integer pageCount) {
    this.pageCount = pageCount;
    return this;
  }

   /**
   * Get pageCount
   * @return pageCount
  **/
  @ApiModelProperty(value = "")
  public Integer getPageCount() {
    return pageCount;
  }

  public void setPageCount(Integer pageCount) {
    this.pageCount = pageCount;
  }

  public SWFSaveOptions viewerIncluded(Boolean viewerIncluded) {
    this.viewerIncluded = viewerIncluded;
    return this;
  }

   /**
   * Get viewerIncluded
   * @return viewerIncluded
  **/
  @ApiModelProperty(value = "")
  public Boolean isViewerIncluded() {
    return viewerIncluded;
  }

  public void setViewerIncluded(Boolean viewerIncluded) {
    this.viewerIncluded = viewerIncluded;
  }

  public SWFSaveOptions pageIndex(Integer pageIndex) {
    this.pageIndex = pageIndex;
    return this;
  }

   /**
   * Get pageIndex
   * @return pageIndex
  **/
  @ApiModelProperty(value = "")
  public Integer getPageIndex() {
    return pageIndex;
  }

  public void setPageIndex(Integer pageIndex) {
    this.pageIndex = pageIndex;
  }

  public SWFSaveOptions saveForegroundPagesOnly(Boolean saveForegroundPagesOnly) {
    this.saveForegroundPagesOnly = saveForegroundPagesOnly;
    return this;
  }

   /**
   * Get saveForegroundPagesOnly
   * @return saveForegroundPagesOnly
  **/
  @ApiModelProperty(value = "")
  public Boolean isSaveForegroundPagesOnly() {
    return saveForegroundPagesOnly;
  }

  public void setSaveForegroundPagesOnly(Boolean saveForegroundPagesOnly) {
    this.saveForegroundPagesOnly = saveForegroundPagesOnly;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SWFSaveOptions swFSaveOptions = (SWFSaveOptions) o;
    return Objects.equals(this.pageCount, swFSaveOptions.pageCount) &&
        Objects.equals(this.viewerIncluded, swFSaveOptions.viewerIncluded) &&
        Objects.equals(this.pageIndex, swFSaveOptions.pageIndex) &&
        Objects.equals(this.saveForegroundPagesOnly, swFSaveOptions.saveForegroundPagesOnly) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageCount, viewerIncluded, pageIndex, saveForegroundPagesOnly, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SWFSaveOptions {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    pageCount: ").append(toIndentedString(pageCount)).append("\n");
    sb.append("    viewerIncluded: ").append(toIndentedString(viewerIncluded)).append("\n");
    sb.append("    pageIndex: ").append(toIndentedString(pageIndex)).append("\n");
    sb.append("    saveForegroundPagesOnly: ").append(toIndentedString(saveForegroundPagesOnly)).append("\n");
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
