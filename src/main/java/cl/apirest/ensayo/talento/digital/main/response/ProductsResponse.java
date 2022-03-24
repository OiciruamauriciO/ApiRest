package cl.apirest.ensayo.talento.digital.main.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ProductsResponse {

	@JsonProperty("product_id")
	private int product_id;
	
	@JsonProperty("product_name")
	private String product_name;
	
	@JsonProperty("brand_id")
	private int brand_id;
	
	@JsonProperty("category_id")
	private int category_id;
	
	@JsonProperty("model_year")
	private int model_year;
	
	@JsonProperty("list_price")
	private int list_price;
}
