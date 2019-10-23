
# PdfEncryptionDetails

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**permissions** | [**PermissionsEnum**](#PermissionsEnum) |  |  [optional]
**encryptionAlgorithm** | [**EncryptionAlgorithmEnum**](#EncryptionAlgorithmEnum) |  |  [optional]
**userPassword** | **String** |  |  [optional]
**ownerPassword** | **String** |  |  [optional]


<a name="PermissionsEnum"></a>
## Enum: PermissionsEnum
Name | Value
---- | -----
DISALLOWALL | &quot;DisallowAll&quot;
PRINTING | &quot;Printing&quot;
MODIFYCONTENTS | &quot;ModifyContents&quot;
CONTENTCOPY | &quot;ContentCopy&quot;
MODIFYANNOTATIONS | &quot;ModifyAnnotations&quot;
FILLIN | &quot;FillIn&quot;
CONTENTCOPYFORACCESSIBILITY | &quot;ContentCopyForAccessibility&quot;
DOCUMENTASSEMBLY | &quot;DocumentAssembly&quot;
HIGHRESOLUTIONPRINTING | &quot;HighResolutionPrinting&quot;
ALLOWALL | &quot;AllowAll&quot;


<a name="EncryptionAlgorithmEnum"></a>
## Enum: EncryptionAlgorithmEnum
Name | Value
---- | -----
_40 | &quot;RC4_40&quot;
_128 | &quot;RC4_128&quot;



