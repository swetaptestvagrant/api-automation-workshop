package models.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class IdentitiesItem {
	@JsonProperty("identity_data")
	private IdentityData identityData;
	@JsonProperty("last_sign_in_at")
	private String lastSignInAt;
	@JsonProperty("updated_at")
	private String updatedAt;
	@JsonProperty("identity_id")
	private String identityId;
	@JsonProperty("user_id")
	private String userId;
	private String provider;
	@JsonProperty("created_at")
	private String createdAt;
	private String id;
	private String email;
}