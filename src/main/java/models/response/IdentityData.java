package models.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class IdentityData {
	private String sub;
	@JsonProperty("email_verified")
	private boolean emailVerified;
	@JsonProperty("phone_verified")
	private boolean phoneVerified;
	private String email;
}