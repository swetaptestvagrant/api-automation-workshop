import clients.UserClient;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static org.apache.http.HttpStatus.SC_CREATED;
import java.util.*;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;

public class UserSignUp extends BaseAPITest{
    @Test
    public void successfulRegistrationTest(){
        //Resource end point > /api/auth/signup
        String signUpEndpointResource = "/api/auth/signup";
        String email = UUID.randomUUID().toString() + "@hello.com";
        String password = "8447_22@11s";


        UserClient userClient = new UserClient();
        Response response = userClient.createUser(email, password);

        int statusCode = response.getStatusCode();
       String authenticatedEmailId = response.jsonPath().get("data.user.email");
       String authenticatedUserRole = response.jsonPath().get("data.user.role");
       String accessToken = response.jsonPath().get("data.session.access_token");

        assertEquals(statusCode, SC_CREATED, "The status code should be "+ SC_CREATED);
        assertEquals(authenticatedEmailId, email, "The emailId should be "+ email);
        assertEquals(authenticatedUserRole, "authenticated", "The authentication role should be authenticated");
        assertNotNull(accessToken, "The access token should not be null");
    }
}
