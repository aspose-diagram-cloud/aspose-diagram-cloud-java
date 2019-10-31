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
 * DiagramSaveOptions
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-09-23T16:24:55.850+08:00")
public class DiagramSaveOptions extends SaveOptionsModel {
  @SerializedName("AutoFitPageToDrawingContent")
  private Boolean autoFitPageToDrawingContent = null;

  public DiagramSaveOptions autoFitPageToDrawingContent(Boolean autoFitPageToDrawingContent) {
    this.autoFitPageToDrawingContent = autoFitPageToDrawingContent;
    return this;
  }

   /**
   * Get autoFitPageToDrawingContent
   * @return autoFitPageToDrawingContent
  **/
  @ApiModelProperty(value = "")
  public Boolean isAutoFitPageToDrawingContent() {
    return autoFitPageToDrawingContent;
  }

  public void setAutoFitPageToDrawingContent(Boolean autoFitPageToDrawingContent) {
    this.autoFitPageToDrawingContent = autoFitPageToDrawingContent;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DiagramSaveOptions diagramSaveOptions = (DiagramSaveOptions) o;
    return Objects.equals(this.autoFitPageToDrawingContent, diagramSaveOptions.autoFitPageToDrawingContent) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(autoFitPageToDrawingContent, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DiagramSaveOptions {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    autoFitPageToDrawingContent: ").append(toIndentedString(autoFitPageToDrawingContent)).append("\n");
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
