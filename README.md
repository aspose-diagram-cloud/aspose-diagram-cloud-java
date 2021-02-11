![](https://img.shields.io/badge/api-v3.0-lightgrey) ![GitHub last commit](https://img.shields.io/github/last-commit/Aspose-Diagram-Cloud/aspose-diagram-cloud-java)  [![GitHub license](https://img.shields.io/github/license/aspose-diagram-cloud/aspose-Diagram-cloud-android)](https://github.com/aspose-diagram-cloud/aspose-Diagram-cloud-java/blob/master/LICENSE)


# Java Cloud REST API for Visio Processing

[Aspose.Diagram Cloud SDK for Java](https://products.aspose.cloud/Diagram/java) wraps the Aspose.Diagram REST API which allows developers to view, export and convert Microsoft Visio format files to various other formats including fixed-layout, web and images.

## Visio Processing Features

- [Convert diagrams](https://docs.aspose.cloud/diagram/convert-diagram-file-to-another-format/) to 20+ different file formats.
- Retrieve document information of a Visio diagram.
- Programmatically create a new Microsoft Visio diagram file.
- Convert Visio flow-charts to other supported formats.
- Upload your business-oriented Visio diagrams to cloud storage.
- Export Visio files to raster images, fixed-layout, and HTML formats.

## Read Diagrams From

**Microsoft Visio** VSDX, VDX, VSD, VSX, VTX, VSSX, VSTX, VSDM, VSSM, VSTM, VDW, VSS, VST

## Save Diagrams As

**Microsoft Visio** VSDX, VDX, VSX, VTX, VSSX, VSTX, VSDM, VSSM, VSTM
**Fixed-Layout** PDF, XPS
**Multimedia** SWF, SVG, EMF, JPEG, PNG, BMP, TIFF
**Web** HTML

## Integrated Storage API

- Upload, download, copy, move and delete files, including versions handling (if you are using Cloud storage that supports this feature - true by default).
- Create, copy, move and delete folders.
- Copy and move files and folders accross separate storages in scope of a single operation.
- Check if certain file, folder or storage exists.

## Get Started with Aspose.Diagram Cloud SDK for Java

Register an account at [Aspose Cloud Dashboard](https://dashboard.aspose.cloud/applications) to get you application information. Next, add the following dependency to your project's POM to automatically fetch the required artifacts.

```xml
<dependencies>
	<dependency>
		<groupId>com.aspose</groupId>
		<artifactId>aspose-diagram-cloud</artifactId>
		<version>21.1</version>
	</dependency>
</dependencies>
```
```xml
<repositories>
	<repository>
		<id>AsposeJavaAPI</id>
		<name>Aspose Java API</name>
		<url>https://repository.aspose.cloud/repo/</url>
	</repository>
</repositories>
```

## Create VDX Diagram in Java

```java
	// Get your ClientId and ClientSecret from https://dashboard.aspose.cloud (free registration required).
	DiagramApi api = new DiagramApi("client_credentials", "MY_CLIENT_ID", "MY_CLIENT_SECRET");

	String fileName = "sample.vdx";
	String folder = "my_output";
	Boolean is_overwrite = "true";
	CreateNewResponse response = api.postDiagramConvert(fileName, folder, is_overwrite);
```


## Aspose.Diagram Cloud SDKs in Popular Languages

| .NET | Java | PHP | Python | Ruby | Node.js | Android | Perl | Swift |
|---|---|---|---|---|---|---|---|---|
| [GitHub](https://github.com/aspose-diagram-cloud/aspose-diagram-cloud-dotnet) | [GitHub](https://github.com/aspose-diagram-cloud/aspose-diagram-cloud-java) | [GitHub](https://github.com/aspose-diagram-cloud/aspose-diagram-cloud-php) | [GitHub](https://github.com/aspose-diagram-cloud/aspose-diagram-cloud-python) | [GitHub](https://github.com/aspose-diagram-cloud/aspose-diagram-cloud-ruby)  | [GitHub](https://github.com/aspose-diagram-cloud/aspose-diagram-cloud-node) | [GitHub](https://github.com/aspose-diagram-cloud/aspose-diagram-cloud-android) | [GitHub](https://github.com/aspose-diagram-cloud/aspose-diagram-cloud-perl) | [GitHub](https://github.com/aspose-diagram-cloud/aspose-diagram-cloud-swift) |
| [NuGet](https://www.nuget.org/packages/Aspose.Diagram-Cloud/) | [Maven](https://repository.aspose.cloud/webapp/#/artifacts/browse/tree/General/repo/com/aspose/aspose-diagram-cloud) | [Composer](https://packagist.org/packages/aspose/diagram-sdk-php) | [PIP](https://pypi.org/project/asposediagramcloud/) | [GEM](https://rubygems.org/gems/aspose_diagram_cloud)  | [NPM](https://www.npmjs.com/package/asposediagramcloud) | [Maven](https://repository.aspose.cloud/webapp/#/artifacts/browse/tree/General/repo/com/aspose/aspose-diagram-cloud-android) |  [CPAN](https://metacpan.org/release/AsposeDiagramCloud-DiagramApi) | [POD](https://cocoapods.org/pods/AsposeDiagramCloud) |

[Home](https://www.aspose.cloud) | [Product Page](https://products.aspose.cloud/diagram/java) | [Documentation](https://docs.aspose.cloud/diagram/) | [Live Demo](https://products.aspose.app/diagram/family) | [API Reference](https://apireference.aspose.cloud/diagram/) | [Code Samples](https://github.com/aspose-diagram-cloud/aspose-diagram-cloud-java) | [Blog](https://blog.aspose.cloud/category/diagram/) | [Free Support](https://forum.aspose.cloud/c/diagram) | [Free Trial](https://dashboard.aspose.cloud/)
