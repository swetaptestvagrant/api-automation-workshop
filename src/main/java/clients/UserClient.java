package clients;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class UserClient {

    public Response createUser(String email, String password) {
        String signUpEndpointResource = "/api/auth/signup";

        String signUpRequestBody = String.format("{\"email\": \"%s\", \"password\": \"%s\"}", email, password);
        Response signUpResponse = RestAssured.given()
                .contentType(ContentType.JSON)
                .body(signUpRequestBody)
                .post(signUpEndpointResource);

        return signUpResponse;
    }
}
