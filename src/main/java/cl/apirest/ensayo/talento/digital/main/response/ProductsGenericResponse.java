package cl.apirest.ensayo.talento.digital.main.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter 
public class ProductsGenericResponse {
	
	@JsonProperty("status")
	private int status;
	
	@JsonProperty("message")
	private String message;
}
