# StorageApi

All URIs are relative to *https://api.aspose.cloud/v3.0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**copyFile**](StorageApi.md#copyFile) | **PUT** /diagram/storage/file/copy/{srcPath} | Copy file
[**copyFolder**](StorageApi.md#copyFolder) | **PUT** /diagram/storage/folder/copy/{srcPath} | Copy folder
[**createFolder**](StorageApi.md#createFolder) | **PUT** /diagram/storage/folder/{path} | Create the folder
[**deleteFile**](StorageApi.md#deleteFile) | **DELETE** /diagram/storage/file/{path} | Delete file
[**deleteFolder**](StorageApi.md#deleteFolder) | **DELETE** /diagram/storage/folder/{path} | Delete folder
[**downloadFile**](StorageApi.md#downloadFile) | **GET** /diagram/storage/file/{path} | Download file
[**getDiscUsage**](StorageApi.md#getDiscUsage) | **GET** /diagram/storage/disc | Get disc usage
[**getFileVersions**](StorageApi.md#getFileVersions) | **GET** /diagram/storage/version/{path} | Get file versions
[**getFilesList**](StorageApi.md#getFilesList) | **GET** /diagram/storage/folder/{path} | Get all files and folders within a folder
[**moveFile**](StorageApi.md#moveFile) | **PUT** /diagram/storage/file/move/{srcPath} | Move file
[**moveFolder**](StorageApi.md#moveFolder) | **PUT** /diagram/storage/folder/move/{srcPath} | Move folder
[**objectExists**](StorageApi.md#objectExists) | **GET** /diagram/storage/exist/{path} | Check if file or folder exists
[**storageExists**](StorageApi.md#storageExists) | **GET** /diagram/storage/{storageName}/exist | Check if storage exists
[**uploadFile**](StorageApi.md#uploadFile) | **PUT** /diagram/storage/file/{path} | Upload file


<a name="copyFile"></a>
# **copyFile**
> copyFile(srcPath, destPath, srcStorageName, destStorageName, versionId)

Copy file

### Example
```java
// Import classes:
//import com.aspose.cloud.diagram.client.ApiClient;
//import com.aspose.cloud.diagram.client.ApiException;
//import com.aspose.cloud.diagram.client.Configuration;
//import com.aspose.cloud.diagram.client.auth.*;
//import com.aspose.cloud.diagram.api.StorageApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: JWT
OAuth JWT = (OAuth) defaultClient.getAuthentication("JWT");
JWT.setAccessToken("YOUR ACCESS TOKEN");

StorageApi apiInstance = new StorageApi();
String srcPath = "srcPath_example"; // String | Source file path e.g. '/folder/file.ext'
String destPath = "destPath_example"; // String | Destination file path
String srcStorageName = "srcStorageName_example"; // String | Source storage name
String destStorageName = "destStorageName_example"; // String | Destination storage name
String versionId = "versionId_example"; // String | File version ID to copy
try {
    apiInstance.copyFile(srcPath, destPath, srcStorageName, destStorageName, versionId);
} catch (ApiException e) {
    System.err.println("Exception when calling StorageApi#copyFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **srcPath** | **String**| Source file path e.g. &#39;/folder/file.ext&#39; |
 **destPath** | **String**| Destination file path |
 **srcStorageName** | **String**| Source storage name | [optional]
 **destStorageName** | **String**| Destination storage name | [optional]
 **versionId** | **String**| File version ID to copy | [optional]

### Return type

null (empty response body)

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="copyFolder"></a>
# **copyFolder**
> copyFolder(srcPath, destPath, srcStorageName, destStorageName)

Copy folder

### Example
```java
// Import classes:
//import com.aspose.cloud.diagram.client.ApiClient;
//import com.aspose.cloud.diagram.client.ApiException;
//import com.aspose.cloud.diagram.client.Configuration;
//import com.aspose.cloud.diagram.client.auth.*;
//import com.aspose.cloud.diagram.api.StorageApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: JWT
OAuth JWT = (OAuth) defaultClient.getAuthentication("JWT");
JWT.setAccessToken("YOUR ACCESS TOKEN");

StorageApi apiInstance = new StorageApi();
String srcPath = "srcPath_example"; // String | Source folder path e.g. '/src'
String destPath = "destPath_example"; // String | Destination folder path e.g. '/dst'
String srcStorageName = "srcStorageName_example"; // String | Source storage name
String destStorageName = "destStorageName_example"; // String | Destination storage name
try {
    apiInstance.copyFolder(srcPath, destPath, srcStorageName, destStorageName);
} catch (ApiException e) {
    System.err.println("Exception when calling StorageApi#copyFolder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **srcPath** | **String**| Source folder path e.g. &#39;/src&#39; |
 **destPath** | **String**| Destination folder path e.g. &#39;/dst&#39; |
 **srcStorageName** | **String**| Source storage name | [optional]
 **destStorageName** | **String**| Destination storage name | [optional]

### Return type

null (empty response body)

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createFolder"></a>
# **createFolder**
> createFolder(path, storageName)

Create the folder

### Example
```java
// Import classes:
//import com.aspose.cloud.diagram.client.ApiClient;
//import com.aspose.cloud.diagram.client.ApiException;
//import com.aspose.cloud.diagram.client.Configuration;
//import com.aspose.cloud.diagram.client.auth.*;
//import com.aspose.cloud.diagram.api.StorageApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: JWT
OAuth JWT = (OAuth) defaultClient.getAuthentication("JWT");
JWT.setAccessToken("YOUR ACCESS TOKEN");

StorageApi apiInstance = new StorageApi();
String path = "path_example"; // String | Folder path to create e.g. 'folder_1/folder_2/'
String storageName = "storageName_example"; // String | Storage name
try {
    apiInstance.createFolder(path, storageName);
} catch (ApiException e) {
    System.err.println("Exception when calling StorageApi#createFolder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **String**| Folder path to create e.g. &#39;folder_1/folder_2/&#39; |
 **storageName** | **String**| Storage name | [optional]

### Return type

null (empty response body)

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteFile"></a>
# **deleteFile**
> deleteFile(path, storageName, versionId)

Delete file

### Example
```java
// Import classes:
//import com.aspose.cloud.diagram.client.ApiClient;
//import com.aspose.cloud.diagram.client.ApiException;
//import com.aspose.cloud.diagram.client.Configuration;
//import com.aspose.cloud.diagram.client.auth.*;
//import com.aspose.cloud.diagram.api.StorageApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: JWT
OAuth JWT = (OAuth) defaultClient.getAuthentication("JWT");
JWT.setAccessToken("YOUR ACCESS TOKEN");

StorageApi apiInstance = new StorageApi();
String path = "path_example"; // String | File path e.g. '/folder/file.ext'
String storageName = "storageName_example"; // String | Storage name
String versionId = "versionId_example"; // String | File version ID to delete
try {
    apiInstance.deleteFile(path, storageName, versionId);
} catch (ApiException e) {
    System.err.println("Exception when calling StorageApi#deleteFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **String**| File path e.g. &#39;/folder/file.ext&#39; |
 **storageName** | **String**| Storage name | [optional]
 **versionId** | **String**| File version ID to delete | [optional]

### Return type

null (empty response body)

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteFolder"></a>
# **deleteFolder**
> deleteFolder(path, storageName, recursive)

Delete folder

### Example
```java
// Import classes:
//import com.aspose.cloud.diagram.client.ApiClient;
//import com.aspose.cloud.diagram.client.ApiException;
//import com.aspose.cloud.diagram.client.Configuration;
//import com.aspose.cloud.diagram.client.auth.*;
//import com.aspose.cloud.diagram.api.StorageApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: JWT
OAuth JWT = (OAuth) defaultClient.getAuthentication("JWT");
JWT.setAccessToken("YOUR ACCESS TOKEN");

StorageApi apiInstance = new StorageApi();
String path = "path_example"; // String | Folder path e.g. '/folder'
String storageName = "storageName_example"; // String | Storage name
Boolean recursive = false; // Boolean | Enable to delete folders, subfolders and files
try {
    apiInstance.deleteFolder(path, storageName, recursive);
} catch (ApiException e) {
    System.err.println("Exception when calling StorageApi#deleteFolder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **String**| Folder path e.g. &#39;/folder&#39; |
 **storageName** | **String**| Storage name | [optional]
 **recursive** | **Boolean**| Enable to delete folders, subfolders and files | [optional] [default to false]

### Return type

null (empty response body)

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="downloadFile"></a>
# **downloadFile**
> File downloadFile(path, storageName, versionId)

Download file

### Example
```java
// Import classes:
//import com.aspose.cloud.diagram.client.ApiClient;
//import com.aspose.cloud.diagram.client.ApiException;
//import com.aspose.cloud.diagram.client.Configuration;
//import com.aspose.cloud.diagram.client.auth.*;
//import com.aspose.cloud.diagram.api.StorageApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: JWT
OAuth JWT = (OAuth) defaultClient.getAuthentication("JWT");
JWT.setAccessToken("YOUR ACCESS TOKEN");

StorageApi apiInstance = new StorageApi();
String path = "path_example"; // String | File path e.g. '/folder/file.ext'
String storageName = "storageName_example"; // String | Storage name
String versionId = "versionId_example"; // String | File version ID to download
try {
    File result = apiInstance.downloadFile(path, storageName, versionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorageApi#downloadFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **String**| File path e.g. &#39;/folder/file.ext&#39; |
 **storageName** | **String**| Storage name | [optional]
 **versionId** | **String**| File version ID to download | [optional]

### Return type

[**File**](File.md)

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: multipart/form-data

<a name="getDiscUsage"></a>
# **getDiscUsage**
> DiscUsage getDiscUsage(storageName)

Get disc usage

### Example
```java
// Import classes:
//import com.aspose.cloud.diagram.client.ApiClient;
//import com.aspose.cloud.diagram.client.ApiException;
//import com.aspose.cloud.diagram.client.Configuration;
//import com.aspose.cloud.diagram.client.auth.*;
//import com.aspose.cloud.diagram.api.StorageApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: JWT
OAuth JWT = (OAuth) defaultClient.getAuthentication("JWT");
JWT.setAccessToken("YOUR ACCESS TOKEN");

StorageApi apiInstance = new StorageApi();
String storageName = "storageName_example"; // String | Storage name
try {
    DiscUsage result = apiInstance.getDiscUsage(storageName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorageApi#getDiscUsage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storageName** | **String**| Storage name | [optional]

### Return type

[**DiscUsage**](DiscUsage.md)

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getFileVersions"></a>
# **getFileVersions**
> FileVersions getFileVersions(path, storageName)

Get file versions

### Example
```java
// Import classes:
//import com.aspose.cloud.diagram.client.ApiClient;
//import com.aspose.cloud.diagram.client.ApiException;
//import com.aspose.cloud.diagram.client.Configuration;
//import com.aspose.cloud.diagram.client.auth.*;
//import com.aspose.cloud.diagram.api.StorageApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: JWT
OAuth JWT = (OAuth) defaultClient.getAuthentication("JWT");
JWT.setAccessToken("YOUR ACCESS TOKEN");

StorageApi apiInstance = new StorageApi();
String path = "path_example"; // String | File path e.g. '/file.ext'
String storageName = "storageName_example"; // String | Storage name
try {
    FileVersions result = apiInstance.getFileVersions(path, storageName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorageApi#getFileVersions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **String**| File path e.g. &#39;/file.ext&#39; |
 **storageName** | **String**| Storage name | [optional]

### Return type

[**FileVersions**](FileVersions.md)

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getFilesList"></a>
# **getFilesList**
> FilesList getFilesList(path, storageName)

Get all files and folders within a folder

### Example
```java
// Import classes:
//import com.aspose.cloud.diagram.client.ApiClient;
//import com.aspose.cloud.diagram.client.ApiException;
//import com.aspose.cloud.diagram.client.Configuration;
//import com.aspose.cloud.diagram.client.auth.*;
//import com.aspose.cloud.diagram.api.StorageApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: JWT
OAuth JWT = (OAuth) defaultClient.getAuthentication("JWT");
JWT.setAccessToken("YOUR ACCESS TOKEN");

StorageApi apiInstance = new StorageApi();
String path = "path_example"; // String | Folder path e.g. '/folder'
String storageName = "storageName_example"; // String | Storage name
try {
    FilesList result = apiInstance.getFilesList(path, storageName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorageApi#getFilesList");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **String**| Folder path e.g. &#39;/folder&#39; |
 **storageName** | **String**| Storage name | [optional]

### Return type

[**FilesList**](FilesList.md)

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="moveFile"></a>
# **moveFile**
> moveFile(srcPath, destPath, srcStorageName, destStorageName, versionId)

Move file

### Example
```java
// Import classes:
//import com.aspose.cloud.diagram.client.ApiClient;
//import com.aspose.cloud.diagram.client.ApiException;
//import com.aspose.cloud.diagram.client.Configuration;
//import com.aspose.cloud.diagram.client.auth.*;
//import com.aspose.cloud.diagram.api.StorageApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: JWT
OAuth JWT = (OAuth) defaultClient.getAuthentication("JWT");
JWT.setAccessToken("YOUR ACCESS TOKEN");

StorageApi apiInstance = new StorageApi();
String srcPath = "srcPath_example"; // String | Source file path e.g. '/src.ext'
String destPath = "destPath_example"; // String | Destination file path e.g. '/dest.ext'
String srcStorageName = "srcStorageName_example"; // String | Source storage name
String destStorageName = "destStorageName_example"; // String | Destination storage name
String versionId = "versionId_example"; // String | File version ID to move
try {
    apiInstance.moveFile(srcPath, destPath, srcStorageName, destStorageName, versionId);
} catch (ApiException e) {
    System.err.println("Exception when calling StorageApi#moveFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **srcPath** | **String**| Source file path e.g. &#39;/src.ext&#39; |
 **destPath** | **String**| Destination file path e.g. &#39;/dest.ext&#39; |
 **srcStorageName** | **String**| Source storage name | [optional]
 **destStorageName** | **String**| Destination storage name | [optional]
 **versionId** | **String**| File version ID to move | [optional]

### Return type

null (empty response body)

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="moveFolder"></a>
# **moveFolder**
> moveFolder(srcPath, destPath, srcStorageName, destStorageName)

Move folder

### Example
```java
// Import classes:
//import com.aspose.cloud.diagram.client.ApiClient;
//import com.aspose.cloud.diagram.client.ApiException;
//import com.aspose.cloud.diagram.client.Configuration;
//import com.aspose.cloud.diagram.client.auth.*;
//import com.aspose.cloud.diagram.api.StorageApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: JWT
OAuth JWT = (OAuth) defaultClient.getAuthentication("JWT");
JWT.setAccessToken("YOUR ACCESS TOKEN");

StorageApi apiInstance = new StorageApi();
String srcPath = "srcPath_example"; // String | Folder path to move e.g. '/folder'
String destPath = "destPath_example"; // String | Destination folder path to move to e.g '/dst'
String srcStorageName = "srcStorageName_example"; // String | Source storage name
String destStorageName = "destStorageName_example"; // String | Destination storage name
try {
    apiInstance.moveFolder(srcPath, destPath, srcStorageName, destStorageName);
} catch (ApiException e) {
    System.err.println("Exception when calling StorageApi#moveFolder");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **srcPath** | **String**| Folder path to move e.g. &#39;/folder&#39; |
 **destPath** | **String**| Destination folder path to move to e.g &#39;/dst&#39; |
 **srcStorageName** | **String**| Source storage name | [optional]
 **destStorageName** | **String**| Destination storage name | [optional]

### Return type

null (empty response body)

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="objectExists"></a>
# **objectExists**
> ObjectExist objectExists(path, storageName, versionId)

Check if file or folder exists

### Example
```java
// Import classes:
//import com.aspose.cloud.diagram.client.ApiClient;
//import com.aspose.cloud.diagram.client.ApiException;
//import com.aspose.cloud.diagram.client.Configuration;
//import com.aspose.cloud.diagram.client.auth.*;
//import com.aspose.cloud.diagram.api.StorageApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: JWT
OAuth JWT = (OAuth) defaultClient.getAuthentication("JWT");
JWT.setAccessToken("YOUR ACCESS TOKEN");

StorageApi apiInstance = new StorageApi();
String path = "path_example"; // String | File or folder path e.g. '/file.ext' or '/folder'
String storageName = "storageName_example"; // String | Storage name
String versionId = "versionId_example"; // String | File version ID
try {
    ObjectExist result = apiInstance.objectExists(path, storageName, versionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorageApi#objectExists");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **String**| File or folder path e.g. &#39;/file.ext&#39; or &#39;/folder&#39; |
 **storageName** | **String**| Storage name | [optional]
 **versionId** | **String**| File version ID | [optional]

### Return type

[**ObjectExist**](ObjectExist.md)

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="storageExists"></a>
# **storageExists**
> StorageExist storageExists(storageName)

Check if storage exists

### Example
```java
// Import classes:
//import com.aspose.cloud.diagram.client.ApiClient;
//import com.aspose.cloud.diagram.client.ApiException;
//import com.aspose.cloud.diagram.client.Configuration;
//import com.aspose.cloud.diagram.client.auth.*;
//import com.aspose.cloud.diagram.api.StorageApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: JWT
OAuth JWT = (OAuth) defaultClient.getAuthentication("JWT");
JWT.setAccessToken("YOUR ACCESS TOKEN");

StorageApi apiInstance = new StorageApi();
String storageName = "storageName_example"; // String | Storage name
try {
    StorageExist result = apiInstance.storageExists(storageName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorageApi#storageExists");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **storageName** | **String**| Storage name |

### Return type

[**StorageExist**](StorageExist.md)

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="uploadFile"></a>
# **uploadFile**
> FilesUploadResult uploadFile(path, file, storageName)

Upload file

### Example
```java
// Import classes:
//import com.aspose.cloud.diagram.client.ApiClient;
//import com.aspose.cloud.diagram.client.ApiException;
//import com.aspose.cloud.diagram.client.Configuration;
//import com.aspose.cloud.diagram.client.auth.*;
//import com.aspose.cloud.diagram.api.StorageApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: JWT
OAuth JWT = (OAuth) defaultClient.getAuthentication("JWT");
JWT.setAccessToken("YOUR ACCESS TOKEN");

StorageApi apiInstance = new StorageApi();
String path = "path_example"; // String | Path where to upload including filename and extension e.g. /file.ext or /Folder 1/file.ext             If the content is multipart and path does not contains the file name it tries to get them from filename parameter             from Content-Disposition header.             
File file = new File("/path/to/file.txt"); // File | File to upload
String storageName = "storageName_example"; // String | Storage name
try {
    FilesUploadResult result = apiInstance.uploadFile(path, file, storageName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorageApi#uploadFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **String**| Path where to upload including filename and extension e.g. /file.ext or /Folder 1/file.ext             If the content is multipart and path does not contains the file name it tries to get them from filename parameter             from Content-Disposition header.              |
 **file** | **File**| File to upload |
 **storageName** | **String**| Storage name | [optional]

### Return type

[**FilesUploadResult**](FilesUploadResult.md)

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

