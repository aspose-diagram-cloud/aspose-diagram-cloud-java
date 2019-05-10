# aspose-Diagram-cloud

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>com.aspose</groupId>
    <artifactId>aspose-Diagram-cloud</artifactId>
    <version>18.10</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.aspose:aspose-Diagram-cloud:18.10"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/aspose-Diagram-cloud-18.10.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import com.aspose.cloud.diagram.client.*;
import com.aspose.cloud.diagram.client.auth.*;
import com.aspose.cloud.diagram.model.*;
import com.aspose.cloud.diagram.api.DiagramFileApi;

import java.io.File;
import java.util.*;

public class DiagramFileApiExample {

    public static void main(String[] args) {
        
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
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api.aspose.cloud/v1.1/*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DiagramFileApi* | [**diagramFileGetDiagram**](docs/DiagramFileApi.md#diagramFileGetDiagram) | **GET** /diagram/{name} | Read document info or export.
*DiagramFileApi* | [**diagramFilePostSaveAs**](docs/DiagramFileApi.md#diagramFilePostSaveAs) | **POST** /diagram/{name}/SaveAs | Convert document and save result to storage.
*DiagramFileApi* | [**diagramFilePutCreate**](docs/DiagramFileApi.md#diagramFilePutCreate) | **PUT** /diagram/{name} | Create new diagram and save result to storage.
*DiagramFileApi* | [**diagramFilePutUpload**](docs/DiagramFileApi.md#diagramFilePutUpload) | **PUT** /diagram/{name}/upload | Upload file and save result to storage.
*OAuthApi* | [**oAuthPost**](docs/OAuthApi.md#oAuthPost) | **POST** /oauth2/token | Get Access token


## Documentation for Models

 - [AccessTokenResponse](docs/AccessTokenResponse.md)
 - [DiagramModel](docs/DiagramModel.md)
 - [FileFormatRequest](docs/FileFormatRequest.md)
 - [Link](docs/Link.md)
 - [PageModel](docs/PageModel.md)
 - [SaaSposeResponse](docs/SaaSposeResponse.md)
 - [SaveResult](docs/SaveResult.md)
 - [SharpModel](docs/SharpModel.md)
 - [DiagramResponse](docs/DiagramResponse.md)
 - [SaveResponse](docs/SaveResponse.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### appsid

- **Type**: API key
- **API key parameter name**: appsid
- **Location**: URL query string

### oauth

- **Type**: OAuth
- **Flow**: implicit
- **Authorization URL**: 
- **Scopes**: 
  - write:pets: modify pets in your account

### signature

- **Type**: API key
- **API key parameter name**: signature
- **Location**: URL query string


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Resources
+ [**Website**](https://www.aspose.cloud)
+ [**Product Home**](https://products.aspose.cloud/diagram)
+ [**Documentation**](https://docs.aspose.cloud/display/diagramcloud/Home)
+ [**API Reference**](https://apireference.aspose.cloud/diagram/)
+ [**Free Support Forum**](https://forum.aspose.cloud/c/diagram)
+ [**Paid Support Helpdesk**](https://helpdesk.aspose.cloud/)
+ [**Blog**](https://blog.aspose.cloud/category/diagram/)




