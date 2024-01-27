import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static org.apache.http.HttpStatus.SC_CREATED;
import static org.apache.http.HttpStatus.SC_OK;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;

public class UserSignUp extends BaseAPITest{
    @Test
    public void successfulRegistrationTest(){
        //Resource end point > /api/auth/signup
        String signUpEndpointResource = "/api/auth/signup";
        String email = "maardaala134@hello.com";
        String password = "8447_22@11s";

        String signUpRequestBody = String.format("{\"email\": \"%s\", \"password\": \"%s\"}", email, password);
        Response response = RestAssured.given()
                .contentType(ContentType.JSON)
                .body(signUpRequestBody)
                .post(signUpEndpointResource);

        int statusCode = response.getStatusCode();
       String authenticatedEmailId = response.jsonPath().get("data.user.email");
       String authenticatedUserRole = response.jsonPath().get("data.user.role");
       String accessToken = response.jsonPath().get("data.session.access_token");

        System.out.println(statusCode);
        System.out.println(authenticatedEmailId);
        System.out.println(authenticatedUserRole);
        System.out.println(accessToken);

        assertEquals(statusCode, SC_CREATED, "The status code should be "+ SC_CREATED);
        assertEquals(authenticatedEmailId, email, "The emailId should be "+ email);
        assertEquals(authenticatedUserRole, "authenticated", "The authentication role should be authenticated");
        assertNotNull(accessToken, "The access token should not be null");
    }
}
