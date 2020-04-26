package com.aspose.cloud.diagram.api;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import com.aspose.cloud.diagram.client.ApiException;
import com.aspose.cloud.diagram.model.ApiResponseOfListOfPageData;
import com.aspose.cloud.diagram.model.CreateNewResponse;
import com.aspose.cloud.diagram.model.ModifyResponse;
import com.aspose.cloud.diagram.model.PageSetting;

public class PageTests extends TestBase {

	private static DiagramApi diagramApi;
	private static final String fileName = "pageTest.vsdx";

	public PageTests() throws ApiException {
		super();
		// TODO Auto-generated constructor stub
	}

	@BeforeClass
	public static void CreateEmptyDocument() throws ApiException {
		diagramApi = GetDiagramApi();
		String folder = GetStorageTestFOLDER();
		CreateNewResponse response = diagramApi.createNew(fileName, folder, true);
		Assert.assertNotNull(response.getCreated());
	}

	@Test
	public void PutNewPage() throws ApiException {
		ModifyResponse response = diagramApi.putNewPage(fileName, "newPage", GetStorageTestFOLDER());
		Assert.assertTrue(response.isIsSuccess());
	}

	@Test
	public void GetPages() throws ApiException {
		ApiResponseOfListOfPageData response = diagramApi.getPages(fileName, GetStorageTestFOLDER());
		Assert.assertTrue(response.getModel().size() > 0);
	}

	@Test
	public void PostPageSetup() throws ApiException {
		PageSetting request = new PageSetting();
		request.setPageHeight(2d);
		request.setPageWidth(2d);
		ModifyResponse response = diagramApi.postPageSetup(fileName, "Page-0", request, GetStorageTestFOLDER());
		Assert.assertTrue(response.isIsSuccess());
	}
}
