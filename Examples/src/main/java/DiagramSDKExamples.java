import com.aspose.cloud.diagram.api.DiagramFileApi;
import com.aspose.cloud.diagram.api.OAuthApi;
import com.aspose.cloud.diagram.client.ApiClient;
import com.aspose.cloud.diagram.client.ApiException;
import com.aspose.cloud.diagram.model.AccessTokenResponse;
import com.aspose.cloud.diagram.model.FileFormatRequest;
import com.aspose.cloud.diagram.model.SaaSposeResponse;
import com.aspose.cloud.diagram.model.SaveResponse;
import com.aspose.storage.api.StorageApi;
import com.aspose.storage.model.ResponseMessage;

import java.io.File;

/**
 * Created by muhammadsohailismail on 02/02/2019.
 */
public class DiagramSDKExamples {

    private static String accesstoken;
    private static String grantType = "client_credentials";
    private static String clientId = ""; // Get App key and App SID from https://dashboard.aspose.cloud/
    private static String clientSecret = ""; // Get App key and App SID from https://dashboard.aspose.cloud/
    private static String basePath = "https://api.aspose.cloud/v1.1";

    public static void main(String[] args) {
        DiagramSDKExamples diagramSDKExamples = new DiagramSDKExamples();
        // Get document info
        diagramSDKExamples.getDocumentInfo();
        // Save File as another format like 'png', 'pdf' and more
        diagramSDKExamples.saveFileAsAnotherFormat();
        // Create new file
        diagramSDKExamples.createNewFile();
        // Upload file
        diagramSDKExamples.uploadFile();
    }

    public void getDocumentInfo() {
        try {
            DiagramFileApi api = new DiagramFileApi();
            StorageApi storageApi = new StorageApi(basePath, clientSecret, clientId);

            String name = "file_get_1.vdx";
            String format = "pdf";
            String folder = null;
            String storage = null;

            // Upload file to Cloud Storage
            File file = new File("src/main/resources/" + name);
            ResponseMessage uploadFileResponse = storageApi.PutCreate(name, null, null, file);

            api.setApiClient(getAPIClient());
            File response = api.diagramFileGetDiagram(name, format, folder, storage);
            System.out.println(response.getAbsolutePath());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void saveFileAsAnotherFormat() {
        try {
            // Initialize DiagramFileApi and StorageApi object
            DiagramFileApi diagramAPI = new DiagramFileApi();
            diagramAPI.setApiClient(getAPIClient());
            StorageApi storageAPI = new StorageApi(basePath, clientSecret, clientId);

            String name = "file_get_1.vdx";
            FileFormatRequest format = new FileFormatRequest();
            format.setFormat("pdf");

            String newfilename = "file_saveas_java.pdf";
            String folder = null;
            Boolean isOverwrite = true;
            String storage = null;

            // Upload file to Cloud Storage
            File file = new File("src/main/resources/" + name);
            ResponseMessage uploadFileResponse = storageAPI.PutCreate(name, null, null, file);

            SaveResponse response = diagramAPI.diagramFilePostSaveAs(name, format, newfilename, folder, isOverwrite, storage);
            System.out.println("API Response: " + response);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void createNewFile() {
        try {
            DiagramFileApi diagramAPI = new DiagramFileApi();
            diagramAPI.setApiClient(getAPIClient());

            String name = "file_create_java.vdx";
            String folder = null;
            Boolean isOverwrite = true;
            String storage = null;

            SaaSposeResponse response = diagramAPI.diagramFilePutCreate(name, folder, isOverwrite, storage);
            System.out.println("API Response: " + response);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void uploadFile() {
        try {
            DiagramFileApi diagramAPI = new DiagramFileApi();
            diagramAPI.setApiClient(getAPIClient());

            String name = "file_get_1.vdx";
            String folder = null;
            Boolean isOverwrite = true;
            String storage = null;

            // Upload file to Cloud Storage
            String localFilePath= "src/main/resources/" + name;
            SaaSposeResponse response = diagramAPI.diagramFilePutUpload(localFilePath, name, folder, isOverwrite, storage);
            System.out.println("API Response: " + response);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static ApiClient getAPIClient() {
        DiagramFileApi apiTask = new DiagramFileApi();
        ApiClient apiClient = new ApiClient();
        apiClient.setBasePath(basePath);
        apiClient.addDefaultHeader("Authorization", "Bearer " + getAccessToken());
        apiTask.setApiClient(apiClient);
        return apiClient;
    }

    public static String getAccessToken() {
        try {
            if (accesstoken == null || accesstoken == "") {
                ApiClient apiClient = new ApiClient();
                apiClient.setBasePath("https://api.aspose.cloud/");
                OAuthApi oauth2 = new OAuthApi();
                oauth2.setApiClient(apiClient);
                AccessTokenResponse accessTokenResponse = oauth2.oAuthPost(grantType, clientId, clientSecret);
                accesstoken = accessTokenResponse.getAccessToken();
            }
        } catch (ApiException e) {
            System.out.println(e.getMessage());
        }
        return accesstoken;
    }
}
