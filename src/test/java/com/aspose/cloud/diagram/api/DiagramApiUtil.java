package com.aspose.cloud.diagram.api;

import com.aspose.cloud.diagram.client.ApiClient;
import com.aspose.cloud.diagram.client.ApiException;
import com.aspose.cloud.diagram.model.AccessTokenResponse;

public class DiagramApiUtil {
	private static String accesstoken;
	private static String grantType = "client_credentials";
	private static String clientId = "xxxxxxxx";
	private static String clientSecret = "xxxxxx";
	private static String sourceFolder ="D:\\Projects\\Aspose\\Aspose.Cloud\\Aspose.Cells.Cloud.SDK\\src\\TestData\\";
	public static String GetSourceFolder() {
		return sourceFolder;
	}
	public static String GetGrantType() {
		return grantType;
	}

	public static String GetClientId() {
		return clientId;
	}

	public static String GetClientSecret() {
		return clientSecret;
	}

	public static String GetAccessToken() {
		try {
			if (accesstoken == null || accesstoken == "") {
				System.out.println("--------------------------");
				ApiClient apiClient = new ApiClient();
				apiClient.setBasePath("https://api.aspose.cloud/");
				OAuthApi oauth2 = new OAuthApi();
				oauth2.setApiClient(apiClient);
				AccessTokenResponse accessTokenResponse = oauth2.oAuthPost(grantType, clientId, clientSecret);
				accesstoken = accessTokenResponse.getAccessToken();
			}

		} catch (ApiException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return accesstoken;
	}

	public static ApiClient Ready() {
		DiagramFileApi apiTask = new DiagramFileApi();
		ApiClient apiClient = new ApiClient();
		apiClient.setBasePath("https://api.aspose.cloud/v1.1");
		apiClient.addDefaultHeader("Authorization", "Bearer " + GetAccessToken());
		apiTask.setApiClient(apiClient);
		return apiClient;
	}
}
