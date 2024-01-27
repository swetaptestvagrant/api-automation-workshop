package models.request;

import lombok.Data;

@Data
public class SignUpRequestBody {
	private String password;
	private String email;
}