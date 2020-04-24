package com.aspose.cloud.diagram.api;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import com.aspose.cloud.diagram.client.ApiException;

public class TestBase {

	protected static final String grantType = "client_credentials";
	protected static final String clientId = "yourClientId";
	protected static final String clientSecret = "yourClientSecret";

	private static DiagramApi diagramApi;
	private static StorageApi storageApi;

	private static final String sourceFolder = "D:\\TestFiles\\";
	private static final String storageTestFOLDER = "SDKTests\\Java";
	private static final String localTestSourceFile = "Source.vsd";

	public TestBase() throws ApiException {

	}

	protected static DiagramApi GetDiagramApi() throws ApiException {
		if (diagramApi == null) {
			diagramApi = new DiagramApi(grantType, clientId, clientSecret);
		}
		return diagramApi;
	}

	protected static StorageApi GetStorageApi() throws ApiException {
		if (storageApi == null) {
			storageApi = new StorageApi(grantType, clientId, clientSecret);
		}
		return storageApi;
	}

	protected String GetSourceFolder() {
		return sourceFolder;
	}

	protected static String GetStorageTestFOLDER() {
		return storageTestFOLDER;
	}

	protected String GetLocalTestSourceFile() {
		return localTestSourceFile;
	}

	public static byte[] GetFileData(String filename) {
		try {
			File file = new File(sourceFolder + filename);
			FileInputStream fis = new FileInputStream(file);
			ByteArrayOutputStream bos = new ByteArrayOutputStream(1000);
			byte[] b = new byte[1000];
			int n;
			while ((n = fis.read(b)) != -1) {
				bos.write(b, 0, n);
			}
			fis.close();
			bos.close();
			return bos.toByteArray();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
}
