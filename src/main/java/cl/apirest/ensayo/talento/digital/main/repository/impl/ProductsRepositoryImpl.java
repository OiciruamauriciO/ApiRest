package cl.apirest.ensayo.talento.digital.main.repository.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.jdbc.core.RowMapper;
import cl.apirest.ensayo.talento.digital.main.model.production.Products;
import cl.apirest.ensayo.talento.digital.main.query.Querys;
import cl.apirest.ensayo.talento.digital.main.repository.IProductsRepository;
import cl.apirest.ensayo.talento.digital.main.rowmapper.ProductRowMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.BadSqlGrammarException;
import org.springframework.jdbc.UncategorizedSQLException;
import org.springframework.jdbc.core.JdbcTemplate;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class ProductsRepositoryImpl implements IProductsRepository{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;	
	
	@Override
	public List<Products> repositoryProductsGetAll() {
		log.info("Repository:Impl::repositoryProductsGetAll");
		
		List<Products> productsList = null;
		
		try {
			
			RowMapper<Products> rmp = new ProductRowMapper();
			productsList = jdbcTemplate.query(Querys.SELECT_ALL_PRODUCTS, rmp);
			
		}catch (EmptyResultDataAccessException e) {
			log.error("ERROR - DAO EmptyResultDataAccessException: {} ", e.getMessage());
		} catch(BadSqlGrammarException e) {
			log.error("ERROR - DAO BadSqlGrammarException: {} ", e.getMessage());
		} catch(UncategorizedSQLException e) {
			log.error("ERROR - DAO UncategorizedSQLException {} ", e.getMessage());
		}catch (Exception e) {
			log.error("ERROR - DAO Exception {} ", e.getMessage());
		}
		
		return productsList;
	}

	@Override
	public List<Products> repositoryProductsGetProductById(int productId) {

		List<Products> productsList = null;
		
		try {
			
			RowMapper<Products> rmpid = new ProductRowMapper();
			productsList = jdbcTemplate.query(Querys.SELECT_PRODUCT_BY_ID, rmpid, productId);
			
		}catch (EmptyResultDataAccessException e) {
			log.error("ERROR - DAO EmptyResultDataAccessException: {} ", e.getMessage());
		} catch(BadSqlGrammarException e) {
			log.error("ERROR - DAO BadSqlGrammarException: {} ", e.getMessage());
		} catch(UncategorizedSQLException e) {
			log.error("ERROR - DAO UncategorizedSQLException {} ", e.getMessage());
		}catch (Exception e) {
			log.error("ERROR - DAO Exception {} ", e.getMessage());
		}
		
		return productsList;
	}

}
