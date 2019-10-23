# DiagramApi

All URIs are relative to *https://api.aspose.cloud/v3.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**convertDocument**](DiagramApi.md#convertDocument) | **PUT** /diagram/{name}/convert | Converts document from the request&#39;s content to the specified format.
[**createNew**](DiagramApi.md#createNew) | **PUT** /diagram/{name} | Create Empty file into the specified format.
[**downloadFileWithFormat**](DiagramApi.md#downloadFileWithFormat) | **GET** /diagram/{name} | Exports the document into the specified format.
[**saveAs**](DiagramApi.md#saveAs) | **POST** /diagram/{name}/saveAs | Converts document to destination format with detailed settings and saves result to storage.


<a name="convertDocument"></a>
# **convertDocument**
> File convertDocument(name, file, sourceFilename)

Converts document from the request&#39;s content to the specified format.

### Example
```java
// Import classes:
//import com.aspose.cloud.diagram.client.ApiClient;
//import com.aspose.cloud.diagram.client.ApiException;
//import com.aspose.cloud.diagram.client.Configuration;
//import com.aspose.cloud.diagram.client.auth.*;
//import com.aspose.cloud.diagram.api.DiagramApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: JWT
OAuth JWT = (OAuth) defaultClient.getAuthentication("JWT");
JWT.setAccessToken("YOUR ACCESS TOKEN");

DiagramApi apiInstance = new DiagramApi();
String name = "name_example"; // String | Download document name.
File file = new File("/path/to/file.txt"); // File | File to upload
String sourceFilename = "sourceFilename_example"; // String | Source document name.
try {
    File result = apiInstance.convertDocument(name, file, sourceFilename);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DiagramApi#convertDocument");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Download document name. |
 **file** | **File**| File to upload |
 **sourceFilename** | **String**| Source document name. | [optional]

### Return type

[**File**](File.md)

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: multipart/form-data

<a name="createNew"></a>
# **createNew**
> CreateNewResponse createNew(name, folder, isOverwrite)

Create Empty file into the specified format.

### Example
```java
// Import classes:
//import com.aspose.cloud.diagram.client.ApiClient;
//import com.aspose.cloud.diagram.client.ApiException;
//import com.aspose.cloud.diagram.client.Configuration;
//import com.aspose.cloud.diagram.client.auth.*;
//import com.aspose.cloud.diagram.api.DiagramApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: JWT
OAuth JWT = (OAuth) defaultClient.getAuthentication("JWT");
JWT.setAccessToken("YOUR ACCESS TOKEN");

DiagramApi apiInstance = new DiagramApi();
String name = "name_example"; // String | The document name.
String folder = "folder_example"; // String | The document folder.
Boolean isOverwrite = false; // Boolean | If true overwrite the same name file.The default value is false 
try {
    CreateNewResponse result = apiInstance.createNew(name, folder, isOverwrite);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DiagramApi#createNew");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **folder** | **String**| The document folder. | [optional]
 **isOverwrite** | **Boolean**| If true overwrite the same name file.The default value is false  | [optional] [default to false]

### Return type

[**CreateNewResponse**](CreateNewResponse.md)

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="downloadFileWithFormat"></a>
# **downloadFileWithFormat**
> File downloadFileWithFormat(name, format, folder)

Exports the document into the specified format.

### Example
```java
// Import classes:
//import com.aspose.cloud.diagram.client.ApiClient;
//import com.aspose.cloud.diagram.client.ApiException;
//import com.aspose.cloud.diagram.client.Configuration;
//import com.aspose.cloud.diagram.client.auth.*;
//import com.aspose.cloud.diagram.api.DiagramApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: JWT
OAuth JWT = (OAuth) defaultClient.getAuthentication("JWT");
JWT.setAccessToken("YOUR ACCESS TOKEN");

DiagramApi apiInstance = new DiagramApi();
String name = "name_example"; // String | The document name.
String format = "format_example"; // String | The destination format.
String folder = "folder_example"; // String | Original document folder.
try {
    File result = apiInstance.downloadFileWithFormat(name, format, folder);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DiagramApi#downloadFileWithFormat");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The document name. |
 **format** | **String**| The destination format. |
 **folder** | **String**| Original document folder. | [optional]

### Return type

[**File**](File.md)

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: multipart/form-data

<a name="saveAs"></a>
# **saveAs**
> SaveAsResponse saveAs(name, saveOptionsRequest, folder, isOverwrite)

Converts document to destination format with detailed settings and saves result to storage.

### Example
```java
// Import classes:
//import com.aspose.cloud.diagram.client.ApiClient;
//import com.aspose.cloud.diagram.client.ApiException;
//import com.aspose.cloud.diagram.client.Configuration;
//import com.aspose.cloud.diagram.client.auth.*;
//import com.aspose.cloud.diagram.api.DiagramApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: JWT
OAuth JWT = (OAuth) defaultClient.getAuthentication("JWT");
JWT.setAccessToken("YOUR ACCESS TOKEN");

DiagramApi apiInstance = new DiagramApi();
String name = "name_example"; // String | Original document name.
SaveOptionsRequest saveOptionsRequest = new SaveOptionsRequest(); // SaveOptionsRequest | Save options.
String folder = "folder_example"; // String | Original document folder.
Boolean isOverwrite = false; // Boolean | If true overwrite the same name file.The default value is false 
try {
    SaveAsResponse result = apiInstance.saveAs(name, saveOptionsRequest, folder, isOverwrite);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DiagramApi#saveAs");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Original document name. |
 **saveOptionsRequest** | [**SaveOptionsRequest**](SaveOptionsRequest.md)| Save options. |
 **folder** | **String**| Original document folder. | [optional]
 **isOverwrite** | **Boolean**| If true overwrite the same name file.The default value is false  | [optional] [default to false]

### Return type

[**SaveAsResponse**](SaveAsResponse.md)

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

