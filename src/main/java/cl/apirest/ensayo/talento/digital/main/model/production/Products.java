package cl.apirest.ensayo.talento.digital.main.model.production;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Products {
	
	private int product_id;
	private String product_name;
	private int brand_id;
	private int category_id;
	private int model_year;
	private int list_price;

}
