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
import com.aspose.cloud.diagram.model.PageSetting;
import com.aspose.cloud.diagram.model.ShapeData;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * PageData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-04-17T15:16:20.992+08:00")
public class PageData {
  @SerializedName("ID")
  private Integer ID = null;

  @SerializedName("PageSetting")
  private PageSetting pageSetting = null;

  @SerializedName("Shapes")
  private List<ShapeData> shapes = null;

  public PageData ID(Integer ID) {
    this.ID = ID;
    return this;
  }

   /**
   * Page Id
   * @return ID
  **/
  @ApiModelProperty(required = true, value = "Page Id")
  public Integer getID() {
    return ID;
  }

  public void setID(Integer ID) {
    this.ID = ID;
  }

  public PageData pageSetting(PageSetting pageSetting) {
    this.pageSetting = pageSetting;
    return this;
  }

   /**
   * page setting info
   * @return pageSetting
  **/
  @ApiModelProperty(value = "page setting info")
  public PageSetting getPageSetting() {
    return pageSetting;
  }

  public void setPageSetting(PageSetting pageSetting) {
    this.pageSetting = pageSetting;
  }

  public PageData shapes(List<ShapeData> shapes) {
    this.shapes = shapes;
    return this;
  }

  public PageData addShapesItem(ShapeData shapesItem) {
    if (this.shapes == null) {
      this.shapes = new ArrayList<ShapeData>();
    }
    this.shapes.add(shapesItem);
    return this;
  }

   /**
   * shape list
   * @return shapes
  **/
  @ApiModelProperty(value = "shape list")
  public List<ShapeData> getShapes() {
    return shapes;
  }

  public void setShapes(List<ShapeData> shapes) {
    this.shapes = shapes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PageData pageData = (PageData) o;
    return Objects.equals(this.ID, pageData.ID) &&
        Objects.equals(this.pageSetting, pageData.pageSetting) &&
        Objects.equals(this.shapes, pageData.shapes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ID, pageSetting, shapes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PageData {\n");
    
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    pageSetting: ").append(toIndentedString(pageSetting)).append("\n");
    sb.append("    shapes: ").append(toIndentedString(shapes)).append("\n");
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

