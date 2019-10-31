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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;

/**
 * File or folder information
 */
@ApiModel(description = "File or folder information")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-09-23T16:24:55.850+08:00")

public class StorageFile {
  @SerializedName("Name")
  private String name = null;

  @SerializedName("IsFolder")
  private Boolean isFolder = null;

  @SerializedName("ModifiedDate")
  private OffsetDateTime modifiedDate = null;

  @SerializedName("Size")
  private Long size = null;

  @SerializedName("Path")
  private String path = null;

  public StorageFile name(String name) {
    this.name = name;
    return this;
  }

   /**
   * File or folder name.
   * @return name
  **/
  @ApiModelProperty(value = "File or folder name.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public StorageFile isFolder(Boolean isFolder) {
    this.isFolder = isFolder;
    return this;
  }

   /**
   * True if it is a folder.
   * @return isFolder
  **/
  @ApiModelProperty(required = true, value = "True if it is a folder.")
  public Boolean isIsFolder() {
    return isFolder;
  }

  public void setIsFolder(Boolean isFolder) {
    this.isFolder = isFolder;
  }

  public StorageFile modifiedDate(OffsetDateTime modifiedDate) {
    this.modifiedDate = modifiedDate;
    return this;
  }

   /**
   * File or folder last modified DateTime.
   * @return modifiedDate
  **/
  @ApiModelProperty(value = "File or folder last modified DateTime.")
  public OffsetDateTime getModifiedDate() {
    return modifiedDate;
  }

  public void setModifiedDate(OffsetDateTime modifiedDate) {
    this.modifiedDate = modifiedDate;
  }

  public StorageFile size(Long size) {
    this.size = size;
    return this;
  }

   /**
   * File or folder size.
   * @return size
  **/
  @ApiModelProperty(required = true, value = "File or folder size.")
  public Long getSize() {
    return size;
  }

  public void setSize(Long size) {
    this.size = size;
  }

  public StorageFile path(String path) {
    this.path = path;
    return this;
  }

   /**
   * File or folder path.
   * @return path
  **/
  @ApiModelProperty(value = "File or folder path.")
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StorageFile storageFile = (StorageFile) o;
    return Objects.equals(this.name, storageFile.name) &&
        Objects.equals(this.isFolder, storageFile.isFolder) &&
        Objects.equals(this.modifiedDate, storageFile.modifiedDate) &&
        Objects.equals(this.size, storageFile.size) &&
        Objects.equals(this.path, storageFile.path);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, isFolder, modifiedDate, size, path);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StorageFile {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    isFolder: ").append(toIndentedString(isFolder)).append("\n");
    sb.append("    modifiedDate: ").append(toIndentedString(modifiedDate)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
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
