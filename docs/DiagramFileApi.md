# DiagramFileApi

All URIs are relative to *https://api.aspose.cloud/v1.1/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**diagramFileGetDiagram**](DiagramFileApi.md#diagramFileGetDiagram) | **GET** /diagram/{name} | Read document info or export.
[**diagramFilePostSaveAs**](DiagramFileApi.md#diagramFilePostSaveAs) | **POST** /diagram/{name}/SaveAs | Convert document and save result to storage.
[**diagramFilePutCreate**](DiagramFileApi.md#diagramFilePutCreate) | **PUT** /diagram/{name} | Create new diagram and save result to storage.
[**diagramFilePutUpload**](DiagramFileApi.md#diagramFilePutUpload) | **PUT** /diagram/{name}/upload | Upload file and save result to storage.


<a name="diagramFileGetDiagram"></a>
# **diagramFileGetDiagram**
> File diagramFileGetDiagram(name, format, folder, storage)

Read document info or export.

### Example
```java
// Import classes:
//import com.aspose.cloud.diagram.client.ApiException;
//import com.aspose.cloud.diagram.api.DiagramFileApi;


DiagramFileApi apiInstance = new DiagramFileApi();
String name = "name_example"; // String | The document name.
String format = "format_example"; // String | The exported file format.
String folder = "folder_example"; // String | The document folder.
String storage = "storage_example"; // String | storage name.
try {
    File result = apiInstance.diagramFileGetDiagram(name, format, folder, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DiagramFileApi#diagramFileGetDiagram");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **format** | **String**| The exported file format. | [optional]
 **folder** | **String**| The document folder. | [optional]
 **storage** | **String**| storage name. | [optional]

### Return type

[**File**](File.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="diagramFilePostSaveAs"></a>
# **diagramFilePostSaveAs**
> SaveResponse diagramFilePostSaveAs(name, format, newfilename, folder, isOverwrite, storage)

Convert document and save result to storage.

### Example
```java
// Import classes:
//import com.aspose.cloud.diagram.client.ApiException;
//import com.aspose.cloud.diagram.api.DiagramFileApi;


DiagramFileApi apiInstance = new DiagramFileApi();
String name = "name_example"; // String | The document name.
FileFormatRequest format = new FileFormatRequest(); // FileFormatRequest | Save format.
String newfilename = "newfilename_example"; // String | The new file name.
String folder = "folder_example"; // String | The document folder.
Boolean isOverwrite = false; // Boolean | If true overwrite the same name file.The default value is false.
String storage = "storage_example"; // String | storage name.
try {
    SaveResponse result = apiInstance.diagramFilePostSaveAs(name, format, newfilename, folder, isOverwrite, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DiagramFileApi#diagramFilePostSaveAs");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **format** | [**FileFormatRequest**](FileFormatRequest.md)| Save format. | [optional]
 **newfilename** | **String**| The new file name. | [optional]
 **folder** | **String**| The document folder. | [optional]
 **isOverwrite** | **Boolean**| If true overwrite the same name file.The default value is false. | [optional] [default to false]
 **storage** | **String**| storage name. | [optional]

### Return type

[**SaveResponse**](SaveResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="diagramFilePutCreate"></a>
# **diagramFilePutCreate**
> SaaSposeResponse diagramFilePutCreate(name, folder, isOverwrite, storage)

Create new diagram and save result to storage.

### Example
```java
// Import classes:
//import com.aspose.cloud.diagram.client.ApiException;
//import com.aspose.cloud.diagram.api.DiagramFileApi;


DiagramFileApi apiInstance = new DiagramFileApi();
String name = "name_example"; // String | The new document name.
String folder = "folder_example"; // String | The new document folder.
Boolean isOverwrite = false; // Boolean | If true overwrite the same name file.The default value is false.
String storage = "storage_example"; // String | storage name.
try {
    SaaSposeResponse result = apiInstance.diagramFilePutCreate(name, folder, isOverwrite, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DiagramFileApi#diagramFilePutCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The new document name. |
 **folder** | **String**| The new document folder. | [optional]
 **isOverwrite** | **Boolean**| If true overwrite the same name file.The default value is false. | [optional] [default to false]
 **storage** | **String**| storage name. | [optional]

### Return type

[**SaaSposeResponse**](SaaSposeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="diagramFilePutUpload"></a>
# **diagramFilePutUpload**
> SaaSposeResponse diagramFilePutUpload(name, folder, isOverwrite, storage)

Upload file and save result to storage.

### Example
```java
// Import classes:
//import com.aspose.cloud.diagram.client.ApiException;
//import com.aspose.cloud.diagram.api.DiagramFileApi;


DiagramFileApi apiInstance = new DiagramFileApi();
String name = "name_example"; // String | The document name.
String folder = "folder_example"; // String | The document folder.
Boolean isOverwrite = false; // Boolean | If true overwrite the same name file.The default value is false.
String storage = "storage_example"; // String | storage name.
try {
    SaaSposeResponse result = apiInstance.diagramFilePutUpload(name, folder, isOverwrite, storage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DiagramFileApi#diagramFilePutUpload");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **folder** | **String**| The document folder. | [optional]
 **isOverwrite** | **Boolean**| If true overwrite the same name file.The default value is false. | [optional] [default to false]
 **storage** | **String**| storage name. | [optional]

### Return type

[**SaaSposeResponse**](SaaSposeResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

