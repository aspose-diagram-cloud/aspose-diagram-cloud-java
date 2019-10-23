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
 * ImageSaveOptions
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-09-23T16:24:55.850+08:00")
public class ImageSaveOptions extends RenderingSaveOptions {
  @SerializedName("ImageBrightness")
  private Double imageBrightness = null;

  @SerializedName("ImageContrast")
  private Double imageContrast = null;

  @SerializedName("JpegQuality")
  private Integer jpegQuality = null;

  @SerializedName("PageCount")
  private Integer pageCount = null;

  @SerializedName("Resolution")
  private Double resolution = null;

  @SerializedName("Scale")
  private Double scale = null;

  /**
   * Gets or Sets tiffCompression
   */
  @JsonAdapter(TiffCompressionEnum.Adapter.class)
  public enum TiffCompressionEnum {
    NONE("None"),
    
    RLE("Rle"),
    
    CCITT3("Ccitt3"),
    
    CCITT4("Ccitt4"),
    
    LZW("Lzw");

    private String value;

    TiffCompressionEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TiffCompressionEnum fromValue(String text) {
      for (TiffCompressionEnum b : TiffCompressionEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TiffCompressionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TiffCompressionEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TiffCompressionEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TiffCompressionEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("TiffCompression")
  private TiffCompressionEnum tiffCompression = null;

  @SerializedName("ExportHiddenPage")
  private Boolean exportHiddenPage = null;

  /**
   * Gets or Sets imageColorMode
   */
  @JsonAdapter(ImageColorModeEnum.Adapter.class)
  public enum ImageColorModeEnum {
    NONE("None"),
    
    GRAYSCALE("Grayscale"),
    
    BLACKANDWHITE("BlackAndWhite");

    private String value;

    ImageColorModeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ImageColorModeEnum fromValue(String text) {
      for (ImageColorModeEnum b : ImageColorModeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ImageColorModeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ImageColorModeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ImageColorModeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ImageColorModeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("ImageColorMode")
  private ImageColorModeEnum imageColorMode = null;

  @SerializedName("PageIndex")
  private Integer pageIndex = null;

  @SerializedName("SaveForegroundPagesOnly")
  private Boolean saveForegroundPagesOnly = null;

  @SerializedName("SameAsPdfConversionArea")
  private Boolean sameAsPdfConversionArea = null;

  /**
   * Gets or Sets pixelOffsetMode
   */
  @JsonAdapter(PixelOffsetModeEnum.Adapter.class)
  public enum PixelOffsetModeEnum {
    DEFAULT("Default"),
    
    HIGHSPEED("HighSpeed"),
    
    HIGHQUALITY("HighQuality"),
    
    NONE("None"),
    
    HALF("Half"),
    
    INVALID("Invalid");

    private String value;

    PixelOffsetModeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PixelOffsetModeEnum fromValue(String text) {
      for (PixelOffsetModeEnum b : PixelOffsetModeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<PixelOffsetModeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PixelOffsetModeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PixelOffsetModeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return PixelOffsetModeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("PixelOffsetMode")
  private PixelOffsetModeEnum pixelOffsetMode = null;

  /**
   * Gets or Sets smoothingMode
   */
  @JsonAdapter(SmoothingModeEnum.Adapter.class)
  public enum SmoothingModeEnum {
    DEFAULT("Default"),
    
    HIGHSPEED("HighSpeed"),
    
    HIGHQUALITY("HighQuality"),
    
    NONE("None"),
    
    ANTIALIAS("AntiAlias"),
    
    INVALID("Invalid");

    private String value;

    SmoothingModeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SmoothingModeEnum fromValue(String text) {
      for (SmoothingModeEnum b : SmoothingModeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<SmoothingModeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SmoothingModeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SmoothingModeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return SmoothingModeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("SmoothingMode")
  private SmoothingModeEnum smoothingMode = null;

  /**
   * Gets or Sets compositingQuality
   */
  @JsonAdapter(CompositingQualityEnum.Adapter.class)
  public enum CompositingQualityEnum {
    DEFAULT("Default"),
    
    HIGHSPEED("HighSpeed"),
    
    HIGHQUALITY("HighQuality"),
    
    GAMMACORRECTED("GammaCorrected"),
    
    ASSUMELINEAR("AssumeLinear"),
    
    INVALID("Invalid");

    private String value;

    CompositingQualityEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CompositingQualityEnum fromValue(String text) {
      for (CompositingQualityEnum b : CompositingQualityEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<CompositingQualityEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CompositingQualityEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CompositingQualityEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return CompositingQualityEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("CompositingQuality")
  private CompositingQualityEnum compositingQuality = null;

  /**
   * Gets or Sets interpolationMode
   */
  @JsonAdapter(InterpolationModeEnum.Adapter.class)
  public enum InterpolationModeEnum {
    DEFAULT("Default"),
    
    LOW("Low"),
    
    HIGH("High"),
    
    BILINEAR("Bilinear"),
    
    BICUBIC("Bicubic"),
    
    NEARESTNEIGHBOR("NearestNeighbor"),
    
    HIGHQUALITYBILINEAR("HighQualityBilinear"),
    
    HIGHQUALITYBICUBIC("HighQualityBicubic"),
    
    INVALID("Invalid");

    private String value;

    InterpolationModeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static InterpolationModeEnum fromValue(String text) {
      for (InterpolationModeEnum b : InterpolationModeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<InterpolationModeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final InterpolationModeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public InterpolationModeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return InterpolationModeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("InterpolationMode")
  private InterpolationModeEnum interpolationMode = null;

  public ImageSaveOptions imageBrightness(Double imageBrightness) {
    this.imageBrightness = imageBrightness;
    return this;
  }

   /**
   * Get imageBrightness
   * @return imageBrightness
  **/
  @ApiModelProperty(value = "")
  public Double getImageBrightness() {
    return imageBrightness;
  }

  public void setImageBrightness(Double imageBrightness) {
    this.imageBrightness = imageBrightness;
  }

  public ImageSaveOptions imageContrast(Double imageContrast) {
    this.imageContrast = imageContrast;
    return this;
  }

   /**
   * Get imageContrast
   * @return imageContrast
  **/
  @ApiModelProperty(value = "")
  public Double getImageContrast() {
    return imageContrast;
  }

  public void setImageContrast(Double imageContrast) {
    this.imageContrast = imageContrast;
  }

  public ImageSaveOptions jpegQuality(Integer jpegQuality) {
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

  public ImageSaveOptions pageCount(Integer pageCount) {
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

  public ImageSaveOptions resolution(Double resolution) {
    this.resolution = resolution;
    return this;
  }

   /**
   * Get resolution
   * @return resolution
  **/
  @ApiModelProperty(value = "")
  public Double getResolution() {
    return resolution;
  }

  public void setResolution(Double resolution) {
    this.resolution = resolution;
  }

  public ImageSaveOptions scale(Double scale) {
    this.scale = scale;
    return this;
  }

   /**
   * Get scale
   * @return scale
  **/
  @ApiModelProperty(value = "")
  public Double getScale() {
    return scale;
  }

  public void setScale(Double scale) {
    this.scale = scale;
  }

  public ImageSaveOptions tiffCompression(TiffCompressionEnum tiffCompression) {
    this.tiffCompression = tiffCompression;
    return this;
  }

   /**
   * Get tiffCompression
   * @return tiffCompression
  **/
  @ApiModelProperty(value = "")
  public TiffCompressionEnum getTiffCompression() {
    return tiffCompression;
  }

  public void setTiffCompression(TiffCompressionEnum tiffCompression) {
    this.tiffCompression = tiffCompression;
  }

  public ImageSaveOptions exportHiddenPage(Boolean exportHiddenPage) {
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

  public ImageSaveOptions imageColorMode(ImageColorModeEnum imageColorMode) {
    this.imageColorMode = imageColorMode;
    return this;
  }

   /**
   * Get imageColorMode
   * @return imageColorMode
  **/
  @ApiModelProperty(value = "")
  public ImageColorModeEnum getImageColorMode() {
    return imageColorMode;
  }

  public void setImageColorMode(ImageColorModeEnum imageColorMode) {
    this.imageColorMode = imageColorMode;
  }

  public ImageSaveOptions pageIndex(Integer pageIndex) {
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

  public ImageSaveOptions saveForegroundPagesOnly(Boolean saveForegroundPagesOnly) {
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

  public ImageSaveOptions sameAsPdfConversionArea(Boolean sameAsPdfConversionArea) {
    this.sameAsPdfConversionArea = sameAsPdfConversionArea;
    return this;
  }

   /**
   * Get sameAsPdfConversionArea
   * @return sameAsPdfConversionArea
  **/
  @ApiModelProperty(value = "")
  public Boolean isSameAsPdfConversionArea() {
    return sameAsPdfConversionArea;
  }

  public void setSameAsPdfConversionArea(Boolean sameAsPdfConversionArea) {
    this.sameAsPdfConversionArea = sameAsPdfConversionArea;
  }

  public ImageSaveOptions pixelOffsetMode(PixelOffsetModeEnum pixelOffsetMode) {
    this.pixelOffsetMode = pixelOffsetMode;
    return this;
  }

   /**
   * Get pixelOffsetMode
   * @return pixelOffsetMode
  **/
  @ApiModelProperty(value = "")
  public PixelOffsetModeEnum getPixelOffsetMode() {
    return pixelOffsetMode;
  }

  public void setPixelOffsetMode(PixelOffsetModeEnum pixelOffsetMode) {
    this.pixelOffsetMode = pixelOffsetMode;
  }

  public ImageSaveOptions smoothingMode(SmoothingModeEnum smoothingMode) {
    this.smoothingMode = smoothingMode;
    return this;
  }

   /**
   * Get smoothingMode
   * @return smoothingMode
  **/
  @ApiModelProperty(value = "")
  public SmoothingModeEnum getSmoothingMode() {
    return smoothingMode;
  }

  public void setSmoothingMode(SmoothingModeEnum smoothingMode) {
    this.smoothingMode = smoothingMode;
  }

  public ImageSaveOptions compositingQuality(CompositingQualityEnum compositingQuality) {
    this.compositingQuality = compositingQuality;
    return this;
  }

   /**
   * Get compositingQuality
   * @return compositingQuality
  **/
  @ApiModelProperty(value = "")
  public CompositingQualityEnum getCompositingQuality() {
    return compositingQuality;
  }

  public void setCompositingQuality(CompositingQualityEnum compositingQuality) {
    this.compositingQuality = compositingQuality;
  }

  public ImageSaveOptions interpolationMode(InterpolationModeEnum interpolationMode) {
    this.interpolationMode = interpolationMode;
    return this;
  }

   /**
   * Get interpolationMode
   * @return interpolationMode
  **/
  @ApiModelProperty(value = "")
  public InterpolationModeEnum getInterpolationMode() {
    return interpolationMode;
  }

  public void setInterpolationMode(InterpolationModeEnum interpolationMode) {
    this.interpolationMode = interpolationMode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImageSaveOptions imageSaveOptions = (ImageSaveOptions) o;
    return Objects.equals(this.imageBrightness, imageSaveOptions.imageBrightness) &&
        Objects.equals(this.imageContrast, imageSaveOptions.imageContrast) &&
        Objects.equals(this.jpegQuality, imageSaveOptions.jpegQuality) &&
        Objects.equals(this.pageCount, imageSaveOptions.pageCount) &&
        Objects.equals(this.resolution, imageSaveOptions.resolution) &&
        Objects.equals(this.scale, imageSaveOptions.scale) &&
        Objects.equals(this.tiffCompression, imageSaveOptions.tiffCompression) &&
        Objects.equals(this.exportHiddenPage, imageSaveOptions.exportHiddenPage) &&
        Objects.equals(this.imageColorMode, imageSaveOptions.imageColorMode) &&
        Objects.equals(this.pageIndex, imageSaveOptions.pageIndex) &&
        Objects.equals(this.saveForegroundPagesOnly, imageSaveOptions.saveForegroundPagesOnly) &&
        Objects.equals(this.sameAsPdfConversionArea, imageSaveOptions.sameAsPdfConversionArea) &&
        Objects.equals(this.pixelOffsetMode, imageSaveOptions.pixelOffsetMode) &&
        Objects.equals(this.smoothingMode, imageSaveOptions.smoothingMode) &&
        Objects.equals(this.compositingQuality, imageSaveOptions.compositingQuality) &&
        Objects.equals(this.interpolationMode, imageSaveOptions.interpolationMode) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(imageBrightness, imageContrast, jpegQuality, pageCount, resolution, scale, tiffCompression, exportHiddenPage, imageColorMode, pageIndex, saveForegroundPagesOnly, sameAsPdfConversionArea, pixelOffsetMode, smoothingMode, compositingQuality, interpolationMode, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImageSaveOptions {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    imageBrightness: ").append(toIndentedString(imageBrightness)).append("\n");
    sb.append("    imageContrast: ").append(toIndentedString(imageContrast)).append("\n");
    sb.append("    jpegQuality: ").append(toIndentedString(jpegQuality)).append("\n");
    sb.append("    pageCount: ").append(toIndentedString(pageCount)).append("\n");
    sb.append("    resolution: ").append(toIndentedString(resolution)).append("\n");
    sb.append("    scale: ").append(toIndentedString(scale)).append("\n");
    sb.append("    tiffCompression: ").append(toIndentedString(tiffCompression)).append("\n");
    sb.append("    exportHiddenPage: ").append(toIndentedString(exportHiddenPage)).append("\n");
    sb.append("    imageColorMode: ").append(toIndentedString(imageColorMode)).append("\n");
    sb.append("    pageIndex: ").append(toIndentedString(pageIndex)).append("\n");
    sb.append("    saveForegroundPagesOnly: ").append(toIndentedString(saveForegroundPagesOnly)).append("\n");
    sb.append("    sameAsPdfConversionArea: ").append(toIndentedString(sameAsPdfConversionArea)).append("\n");
    sb.append("    pixelOffsetMode: ").append(toIndentedString(pixelOffsetMode)).append("\n");
    sb.append("    smoothingMode: ").append(toIndentedString(smoothingMode)).append("\n");
    sb.append("    compositingQuality: ").append(toIndentedString(compositingQuality)).append("\n");
    sb.append("    interpolationMode: ").append(toIndentedString(interpolationMode)).append("\n");
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

