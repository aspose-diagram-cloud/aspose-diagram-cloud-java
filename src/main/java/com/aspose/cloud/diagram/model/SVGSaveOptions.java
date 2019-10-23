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
import com.aspose.cloud.diagram.model.PageSize;
import com.aspose.cloud.diagram.model.RectangleF;
import com.aspose.cloud.diagram.model.RenderingSaveOptions;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * SVGSaveOptions
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-09-23T16:24:55.850+08:00")
public class SVGSaveOptions extends RenderingSaveOptions {
  @SerializedName("ExportHiddenPage")
  private Boolean exportHiddenPage = null;

  @SerializedName("Quality")
  private Integer quality = null;

  @SerializedName("PageIndex")
  private Integer pageIndex = null;

  @SerializedName("SVGFitToViewPort")
  private Boolean svGFitToViewPort = null;

  @SerializedName("ExportElementAsRectTag")
  private Boolean exportElementAsRectTag = null;

  public SVGSaveOptions exportHiddenPage(Boolean exportHiddenPage) {
    this.exportHiddenPage = exportHiddenPage;
    return this;
  }

   /**
   * Get exportHiddenPage
   * @return exportHiddenPage
  **/
  @ApiModelProperty(value = "")
  public Boolean isExportHiddenPage() {
    return exportHiddenPage;
  }

  public void setExportHiddenPage(Boolean exportHiddenPage) {
    this.exportHiddenPage = exportHiddenPage;
  }

  public SVGSaveOptions quality(Integer quality) {
    this.quality = quality;
    return this;
  }

   /**
   * Get quality
   * @return quality
  **/
  @ApiModelProperty(value = "")
  public Integer getQuality() {
    return quality;
  }

  public void setQuality(Integer quality) {
    this.quality = quality;
  }

  public SVGSaveOptions pageIndex(Integer pageIndex) {
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

  public SVGSaveOptions svGFitToViewPort(Boolean svGFitToViewPort) {
    this.svGFitToViewPort = svGFitToViewPort;
    return this;
  }

   /**
   * Get svGFitToViewPort
   * @return svGFitToViewPort
  **/
  @ApiModelProperty(value = "")
  public Boolean isSvGFitToViewPort() {
    return svGFitToViewPort;
  }

  public void setSvGFitToViewPort(Boolean svGFitToViewPort) {
    this.svGFitToViewPort = svGFitToViewPort;
  }

  public SVGSaveOptions exportElementAsRectTag(Boolean exportElementAsRectTag) {
    this.exportElementAsRectTag = exportElementAsRectTag;
    return this;
  }

   /**
   * Get exportElementAsRectTag
   * @return exportElementAsRectTag
  **/
  @ApiModelProperty(value = "")
  public Boolean isExportElementAsRectTag() {
    return exportElementAsRectTag;
  }

  public void setExportElementAsRectTag(Boolean exportElementAsRectTag) {
    this.exportElementAsRectTag = exportElementAsRectTag;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SVGSaveOptions svGSaveOptions = (SVGSaveOptions) o;
    return Objects.equals(this.exportHiddenPage, svGSaveOptions.exportHiddenPage) &&
        Objects.equals(this.quality, svGSaveOptions.quality) &&
        Objects.equals(this.pageIndex, svGSaveOptions.pageIndex) &&
        Objects.equals(this.svGFitToViewPort, svGSaveOptions.svGFitToViewPort) &&
        Objects.equals(this.exportElementAsRectTag, svGSaveOptions.exportElementAsRectTag) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exportHiddenPage, quality, pageIndex, svGFitToViewPort, exportElementAsRectTag, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SVGSaveOptions {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    exportHiddenPage: ").append(toIndentedString(exportHiddenPage)).append("\n");
    sb.append("    quality: ").append(toIndentedString(quality)).append("\n");
    sb.append("    pageIndex: ").append(toIndentedString(pageIndex)).append("\n");
    sb.append("    svGFitToViewPort: ").append(toIndentedString(svGFitToViewPort)).append("\n");
    sb.append("    exportElementAsRectTag: ").append(toIndentedString(exportElementAsRectTag)).append("\n");
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

