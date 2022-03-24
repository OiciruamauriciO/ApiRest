package cl.apirest.ensayo.talento.digital.main.response;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ListProductsResponse extends ProductsGenericResponse{
	
	@JsonProperty("listProducts")
	private List<ProductsResponse> listProducts; 

}
