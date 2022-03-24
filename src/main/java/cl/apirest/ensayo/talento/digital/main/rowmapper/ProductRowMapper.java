package cl.apirest.ensayo.talento.digital.main.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import cl.apirest.ensayo.talento.digital.main.model.production.Products;

public class ProductRowMapper implements RowMapper<Products> {

	@Override
	public Products mapRow(ResultSet rs, int rowNum) throws SQLException {

		Products productoEntity = new Products();
		
		productoEntity.setProduct_id(rs.getInt("product_id"));
		productoEntity.setProduct_name(rs.getString("product_name"));
		productoEntity.setBrand_id(rs.getInt("brand_id"));
		productoEntity.setCategory_id(rs.getInt("category_id"));
		productoEntity.setModel_year(rs.getInt("model_year"));
		productoEntity.setList_price(rs.getInt("list_price"));	
		
		return productoEntity;
	}

}
