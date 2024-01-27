package models.response;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class User {
	private String aud;
	private String role;
	@JsonProperty("email_confirmed_at")
	private String emailConfirmedAt;
	@JsonProperty("user_metadata")
	private UserMetadata userMetadata;
	private List<IdentitiesItem> identities;
	@JsonProperty("last_sign_in_at")
	private String lastSignInAt;
	@JsonProperty("updated_at")
	private String updatedAt;
	private String phone;
	@JsonProperty("created_at")
	private String createdAt;
	private String id;
	private String email;
	@JsonProperty("app_metadata")
	private AppMetadata appMetadata;
}