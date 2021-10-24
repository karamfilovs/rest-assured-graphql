package api;

import io.restassured.RestAssured;
import io.restassured.authentication.AuthenticationScheme;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class HTTPClient {

    public static void setup(AuthenticationScheme authenticationScheme, String baseUri, String basePath) {
        RestAssured.authentication = authenticationScheme;
        RestAssured.baseURI = baseUri;
        RestAssured.basePath = basePath;
    }

    protected Response post(String url, String body) {
        Response response = defaultClient()
                .with()
                .body(body)
                .when()
                .post();
        response.prettyPrint();
        return response;
    }

    protected Response put(String url, String body) {
        Response response = defaultClient()
                .with()
                .body(body)
                .when()
                .post();
        response.prettyPrint();
        return response;
    }

    protected Response get(String url) {
        Response response = defaultClient().get(url);
        response.prettyPrint();
        return response;
    }

    private RequestSpecification defaultClient() {
        return RestAssured
                .given()
                .log()
                .all()
                .contentType(ContentType.JSON)
                .when();
    }

}
