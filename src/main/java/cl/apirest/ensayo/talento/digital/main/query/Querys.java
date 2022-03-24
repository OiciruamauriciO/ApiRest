package cl.apirest.ensayo.talento.digital.main.query;

public class Querys {
	
	private Querys() {
		throw new IllegalStateException("Querys class");
	}
	
	public static final String SELECT_ALL_PRODUCTS = "SELECT "
															+ "product_id, product_name, "
															+ "brand_id, category_id, "
															+ "model_year, list_price "
															+ "FROM products";
	
	public static final String SELECT_PRODUCT_BY_ID =  "SELECT "
															+ "product_id, product_name, "
															+ "brand_id, category_id, "
															+ "model_year, list_price "
															+ "FROM products "
															+ "WHERE product_id = ?";

}
