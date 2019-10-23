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
import com.aspose.cloud.diagram.model.PdfDigitalSignatureDetails;
import com.aspose.cloud.diagram.model.PdfEncryptionDetails;
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
 * PdfSaveOptions
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-09-23T16:24:55.850+08:00")
public class PdfSaveOptions extends RenderingSaveOptions {
  @SerializedName("HorizontalResolution")
  private Integer horizontalResolution = null;

  @SerializedName("VerticalResolution")
  private Integer verticalResolution = null;

  @SerializedName("PageCount")
  private Integer pageCount = null;

  @SerializedName("JpegQuality")
  private Integer jpegQuality = null;

  @SerializedName("ExportHiddenPage")
  private Boolean exportHiddenPage = null;

  @SerializedName("PageIndex")
  private Integer pageIndex = null;

  @SerializedName("SaveForegroundPagesOnly")
  private Boolean saveForegroundPagesOnly = null;

  /**
   * Gets or Sets compliance
   */
  @JsonAdapter(ComplianceEnum.Adapter.class)
  public enum ComplianceEnum {
    PDF15("Pdf15"),
    
    PDFA1A("PdfA1a"),
    
    PDFA1B("PdfA1b");

    private String value;

    ComplianceEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ComplianceEnum fromValue(String text) {
      for (ComplianceEnum b : ComplianceEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ComplianceEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ComplianceEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ComplianceEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ComplianceEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("Compliance")
  private ComplianceEnum compliance = null;

  @SerializedName("EncryptionDetails")
  private PdfEncryptionDetails encryptionDetails = null;

  /**
   * Gets or Sets textCompression
   */
  @JsonAdapter(TextCompressionEnum.Adapter.class)
  public enum TextCompressionEnum {
    NONE("None"),
    
    FLATE("Flate");

    private String value;

    TextCompressionEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TextCompressionEnum fromValue(String text) {
      for (TextCompressionEnum b : TextCompressionEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TextCompressionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TextCompressionEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TextCompressionEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TextCompressionEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("TextCompression")
  private TextCompressionEnum textCompression = null;

  @SerializedName("SplitMultiPages")
  private Boolean splitMultiPages = null;

  @SerializedName("DigitalSignatureDetails")
  private PdfDigitalSignatureDetails digitalSignatureDetails = null;

  public PdfSaveOptions horizontalResolution(Integer horizontalResolution) {
    this.horizontalResolution = horizontalResolution;
    return this;
  }

   /**
   * Get horizontalResolution
   * @return horizontalResolution
  **/
  @ApiModelProperty(value = "")
  public Integer getHorizontalResolution() {
    return horizontalResolution;
  }

  public void setHorizontalResolution(Integer horizontalResolution) {
    this.horizontalResolution = horizontalResolution;
  }

  public PdfSaveOptions verticalResolution(Integer verticalResolution) {
    this.verticalResolution = verticalResolution;
    return this;
  }

   /**
   * Get verticalResolution
   * @return verticalResolution
  **/
  @ApiModelProperty(value = "")
  public Integer getVerticalResolution() {
    return verticalResolution;
  }

  public void setVerticalResolution(Integer verticalResolution) {
    this.verticalResolution = verticalResolution;
  }

  public PdfSaveOptions pageCount(Integer pageCount) {
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

  public PdfSaveOptions jpegQuality(Integer jpegQuality) {
    this.jpegQuality = jpegQuality;
    return this;
  }

   /**
   * Get jpegQuality
   * @return jpegQuality
  **/
  @ApiModelProperty(value = "")
  public Integer getJpegQuality() {
    return jpegQuality;
  }

  public void setJpegQuality(Integer jpegQuality) {
    this.jpegQuality = jpegQuality;
  }

  public PdfSaveOptions exportHiddenPage(Boolean exportHiddenPage) {
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

  public PdfSaveOptions pageIndex(Integer pageIndex) {
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

  public PdfSaveOptions saveForegroundPagesOnly(Boolean saveForegroundPagesOnly) {
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

  public PdfSaveOptions compliance(ComplianceEnum compliance) {
    this.compliance = compliance;
    return this;
  }

   /**
   * Get compliance
   * @return compliance
  **/
  @ApiModelProperty(value = "")
  public ComplianceEnum getCompliance() {
    return compliance;
  }

  public void setCompliance(ComplianceEnum compliance) {
    this.compliance = compliance;
  }

  public PdfSaveOptions encryptionDetails(PdfEncryptionDetails encryptionDetails) {
    this.encryptionDetails = encryptionDetails;
    return this;
  }

   /**
   * Get encryptionDetails
   * @return encryptionDetails
  **/
  @ApiModelProperty(value = "")
  public PdfEncryptionDetails getEncryptionDetails() {
    return encryptionDetails;
  }

  public void setEncryptionDetails(PdfEncryptionDetails encryptionDetails) {
    this.encryptionDetails = encryptionDetails;
  }

  public PdfSaveOptions textCompression(TextCompressionEnum textCompression) {
    this.textCompression = textCompression;
    return this;
  }

   /**
   * Get textCompression
   * @return textCompression
  **/
  @ApiModelProperty(value = "")
  public TextCompressionEnum getTextCompression() {
    return textCompression;
  }

  public void setTextCompression(TextCompressionEnum textCompression) {
    this.textCompression = textCompression;
  }

  public PdfSaveOptions splitMultiPages(Boolean splitMultiPages) {
    this.splitMultiPages = splitMultiPages;
    return this;
  }

   /**
   * Get splitMultiPages
   * @return splitMultiPages
  **/
  @ApiModelProperty(value = "")
  public Boolean isSplitMultiPages() {
    return splitMultiPages;
  }

  public void setSplitMultiPages(Boolean splitMultiPages) {
    this.splitMultiPages = splitMultiPages;
  }

  public PdfSaveOptions digitalSignatureDetails(PdfDigitalSignatureDetails digitalSignatureDetails) {
    this.digitalSignatureDetails = digitalSignatureDetails;
    return this;
  }

   /**
   * Get digitalSignatureDetails
   * @return digitalSignatureDetails
  **/
  @ApiModelProperty(value = "")
  public PdfDigitalSignatureDetails getDigitalSignatureDetails() {
    return digitalSignatureDetails;
  }

  public void setDigitalSignatureDetails(PdfDigitalSignatureDetails digitalSignatureDetails) {
    this.digitalSignatureDetails = digitalSignatureDetails;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PdfSaveOptions pdfSaveOptions = (PdfSaveOptions) o;
    return Objects.equals(this.horizontalResolution, pdfSaveOptions.horizontalResolution) &&
        Objects.equals(this.verticalResolution, pdfSaveOptions.verticalResolution) &&
        Objects.equals(this.pageCount, pdfSaveOptions.pageCount) &&
        Objects.equals(this.jpegQuality, pdfSaveOptions.jpegQuality) &&
        Objects.equals(this.exportHiddenPage, pdfSaveOptions.exportHiddenPage) &&
        Objects.equals(this.pageIndex, pdfSaveOptions.pageIndex) &&
        Objects.equals(this.saveForegroundPagesOnly, pdfSaveOptions.saveForegroundPagesOnly) &&
        Objects.equals(this.compliance, pdfSaveOptions.compliance) &&
        Objects.equals(this.encryptionDetails, pdfSaveOptions.encryptionDetails) &&
        Objects.equals(this.textCompression, pdfSaveOptions.textCompression) &&
        Objects.equals(this.splitMultiPages, pdfSaveOptions.splitMultiPages) &&
        Objects.equals(this.digitalSignatureDetails, pdfSaveOptions.digitalSignatureDetails) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(horizontalResolution, verticalResolution, pageCount, jpegQuality, exportHiddenPage, pageIndex, saveForegroundPagesOnly, compliance, encryptionDetails, textCompression, splitMultiPages, digitalSignatureDetails, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PdfSaveOptions {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    horizontalResolution: ").append(toIndentedString(horizontalResolution)).append("\n");
    sb.append("    verticalResolution: ").append(toIndentedString(verticalResolution)).append("\n");
    sb.append("    pageCount: ").append(toIndentedString(pageCount)).append("\n");
    sb.append("    jpegQuality: ").append(toIndentedString(jpegQuality)).append("\n");
    sb.append("    exportHiddenPage: ").append(toIndentedString(exportHiddenPage)).append("\n");
    sb.append("    pageIndex: ").append(toIndentedString(pageIndex)).append("\n");
    sb.append("    saveForegroundPagesOnly: ").append(toIndentedString(saveForegroundPagesOnly)).append("\n");
    sb.append("    compliance: ").append(toIndentedString(compliance)).append("\n");
    sb.append("    encryptionDetails: ").append(toIndentedString(encryptionDetails)).append("\n");
    sb.append("    textCompression: ").append(toIndentedString(textCompression)).append("\n");
    sb.append("    splitMultiPages: ").append(toIndentedString(splitMultiPages)).append("\n");
    sb.append("    digitalSignatureDetails: ").append(toIndentedString(digitalSignatureDetails)).append("\n");
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

