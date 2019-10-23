
# PdfSaveOptions

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**horizontalResolution** | **Integer** |  |  [optional]
**verticalResolution** | **Integer** |  |  [optional]
**pageCount** | **Integer** |  |  [optional]
**jpegQuality** | **Integer** |  |  [optional]
**exportHiddenPage** | **Boolean** |  |  [optional]
**pageIndex** | **Integer** |  |  [optional]
**saveForegroundPagesOnly** | **Boolean** |  |  [optional]
**compliance** | [**ComplianceEnum**](#ComplianceEnum) |  |  [optional]
**encryptionDetails** | [**PdfEncryptionDetails**](PdfEncryptionDetails.md) |  |  [optional]
**textCompression** | [**TextCompressionEnum**](#TextCompressionEnum) |  |  [optional]
**splitMultiPages** | **Boolean** |  |  [optional]
**digitalSignatureDetails** | [**PdfDigitalSignatureDetails**](PdfDigitalSignatureDetails.md) |  |  [optional]


<a name="ComplianceEnum"></a>
## Enum: ComplianceEnum
Name | Value
---- | -----
PDF15 | &quot;Pdf15&quot;
PDFA1A | &quot;PdfA1a&quot;
PDFA1B | &quot;PdfA1b&quot;


<a name="TextCompressionEnum"></a>
## Enum: TextCompressionEnum
Name | Value
---- | -----
NONE | &quot;None&quot;
FLATE | &quot;Flate&quot;



