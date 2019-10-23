
# ImageSaveOptions

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**imageBrightness** | **Double** |  |  [optional]
**imageContrast** | **Double** |  |  [optional]
**jpegQuality** | **Integer** |  |  [optional]
**pageCount** | **Integer** |  |  [optional]
**resolution** | **Double** |  |  [optional]
**scale** | **Double** |  |  [optional]
**tiffCompression** | [**TiffCompressionEnum**](#TiffCompressionEnum) |  |  [optional]
**exportHiddenPage** | **Boolean** |  |  [optional]
**imageColorMode** | [**ImageColorModeEnum**](#ImageColorModeEnum) |  |  [optional]
**pageIndex** | **Integer** |  |  [optional]
**saveForegroundPagesOnly** | **Boolean** |  |  [optional]
**sameAsPdfConversionArea** | **Boolean** |  |  [optional]
**pixelOffsetMode** | [**PixelOffsetModeEnum**](#PixelOffsetModeEnum) |  |  [optional]
**smoothingMode** | [**SmoothingModeEnum**](#SmoothingModeEnum) |  |  [optional]
**compositingQuality** | [**CompositingQualityEnum**](#CompositingQualityEnum) |  |  [optional]
**interpolationMode** | [**InterpolationModeEnum**](#InterpolationModeEnum) |  |  [optional]


<a name="TiffCompressionEnum"></a>
## Enum: TiffCompressionEnum
Name | Value
---- | -----
NONE | &quot;None&quot;
RLE | &quot;Rle&quot;
CCITT3 | &quot;Ccitt3&quot;
CCITT4 | &quot;Ccitt4&quot;
LZW | &quot;Lzw&quot;


<a name="ImageColorModeEnum"></a>
## Enum: ImageColorModeEnum
Name | Value
---- | -----
NONE | &quot;None&quot;
GRAYSCALE | &quot;Grayscale&quot;
BLACKANDWHITE | &quot;BlackAndWhite&quot;


<a name="PixelOffsetModeEnum"></a>
## Enum: PixelOffsetModeEnum
Name | Value
---- | -----
DEFAULT | &quot;Default&quot;
HIGHSPEED | &quot;HighSpeed&quot;
HIGHQUALITY | &quot;HighQuality&quot;
NONE | &quot;None&quot;
HALF | &quot;Half&quot;
INVALID | &quot;Invalid&quot;


<a name="SmoothingModeEnum"></a>
## Enum: SmoothingModeEnum
Name | Value
---- | -----
DEFAULT | &quot;Default&quot;
HIGHSPEED | &quot;HighSpeed&quot;
HIGHQUALITY | &quot;HighQuality&quot;
NONE | &quot;None&quot;
ANTIALIAS | &quot;AntiAlias&quot;
INVALID | &quot;Invalid&quot;


<a name="CompositingQualityEnum"></a>
## Enum: CompositingQualityEnum
Name | Value
---- | -----
DEFAULT | &quot;Default&quot;
HIGHSPEED | &quot;HighSpeed&quot;
HIGHQUALITY | &quot;HighQuality&quot;
GAMMACORRECTED | &quot;GammaCorrected&quot;
ASSUMELINEAR | &quot;AssumeLinear&quot;
INVALID | &quot;Invalid&quot;


<a name="InterpolationModeEnum"></a>
## Enum: InterpolationModeEnum
Name | Value
---- | -----
DEFAULT | &quot;Default&quot;
LOW | &quot;Low&quot;
HIGH | &quot;High&quot;
BILINEAR | &quot;Bilinear&quot;
BICUBIC | &quot;Bicubic&quot;
NEARESTNEIGHBOR | &quot;NearestNeighbor&quot;
HIGHQUALITYBILINEAR | &quot;HighQualityBilinear&quot;
HIGHQUALITYBICUBIC | &quot;HighQualityBicubic&quot;
INVALID | &quot;Invalid&quot;



