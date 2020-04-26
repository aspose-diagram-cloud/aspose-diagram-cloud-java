package com.aspose.cloud.diagram.api;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import com.aspose.cloud.diagram.client.ApiException;
import com.aspose.cloud.diagram.model.CreateNewResponse;
import com.aspose.cloud.diagram.model.EllipseData;
import com.aspose.cloud.diagram.model.LineData;
import com.aspose.cloud.diagram.model.ModifyResponse;
import com.aspose.cloud.diagram.model.PointF;
import com.aspose.cloud.diagram.model.PolylineData;
import com.aspose.cloud.diagram.model.ShapeStyleData;
import com.aspose.cloud.diagram.model.TextStyleData;

public class DrawingTests extends TestBase {

	private static DiagramApi diagramApi;
	private static final String fileName = "drawingTest.vsdx";
	private static final String pageName = "Page-0";

	public DrawingTests() throws ApiException {
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
	public void DrawLine() throws ApiException {
		LineData request = new LineData();
		request.setPinX(1d);
		request.setPinY(2d);
		request.setWidth(1d);
		request.setHeight(1d);
		List<PointF> points = new ArrayList<PointF>();
		points.add(new PointF(0, 0));
		points.add(new PointF(0, 1));
		request.setPoints(points);
		request.setText("test draw line");
		ShapeStyleData shapeStyleData = new ShapeStyleData();
		shapeStyleData.setBackGroundColor("#FF0000");
		TextStyleData textStyleData = new TextStyleData();
		textStyleData.setFontSize(0.25);
		textStyleData.setFontName("Times New Roman");
		request.setShapeStyleData(shapeStyleData);
		request.setTextStyleData(textStyleData);

		ModifyResponse response = diagramApi.putDrawLine(fileName, pageName, request, GetStorageTestFOLDER());
		Assert.assertTrue(response.isIsSuccess());
	}

	@Test
	public void DrawEllipse() throws ApiException {
		EllipseData request = new EllipseData();
		request.setPinX(5d);
		request.setPinY(5d);
		request.setWidth(1d);
		request.setHeight(1d);

		request.setText("test draw ellipse");
		ShapeStyleData shapeStyleData = new ShapeStyleData();
		shapeStyleData.setBackGroundColor("#FF0000");
		TextStyleData textStyleData = new TextStyleData();
		textStyleData.setFontSize(0.25);
		textStyleData.setFontName("Times New Roman");
		request.setShapeStyleData(shapeStyleData);
		request.setTextStyleData(textStyleData);

		ModifyResponse response = diagramApi.putDrawEllipse(fileName, pageName, request, GetStorageTestFOLDER());
		Assert.assertTrue(response.isIsSuccess());
	}

	@Test
	public void DrawPolyline() throws ApiException {
		PolylineData request = new PolylineData();
		request.setPinX(3d);
		request.setPinY(3d);
		request.setWidth(1d);
		request.setHeight(1d);
		List<PointF> points = new ArrayList<PointF>();
		points.add(new PointF(0, 0));
		points.add(new PointF(0, 1));
		points.add(new PointF(1, 1));
		points.add(new PointF(1, 0));
		request.setPoints(points);
		request.setText("test draw polyline");
		ShapeStyleData shapeStyleData = new ShapeStyleData();
		shapeStyleData.setBackGroundColor("#FF0000");
		TextStyleData textStyleData = new TextStyleData();
		textStyleData.setFontSize(0.25);
		textStyleData.setFontName("Times New Roman");
		request.setShapeStyleData(shapeStyleData);
		request.setTextStyleData(textStyleData);

		ModifyResponse response = diagramApi.putDrawPolyline(fileName, pageName, request, GetStorageTestFOLDER());
		Assert.assertTrue(response.isIsSuccess());
	}

}
