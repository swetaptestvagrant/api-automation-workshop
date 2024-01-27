package models.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Session {
	@JsonProperty("access_token")
	private String accessToken;
	@JsonProperty("refresh_token")
	private String refreshToken;
	@JsonProperty("expires_at")
	private int expiresAt;
	@JsonProperty("token_type")
	private String tokenType;
	@JsonProperty("expires_in")
	private int expiresIn;
	private User user;
}