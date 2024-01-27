package models.response;

import java.util.List;
import lombok.Data;

@Data
public class AppMetadata {
	private String provider;
	private List<String> providers;
}