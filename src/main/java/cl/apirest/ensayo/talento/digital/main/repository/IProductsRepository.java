package cl.apirest.ensayo.talento.digital.main.repository;

import java.util.List;

import cl.apirest.ensayo.talento.digital.main.model.production.Products;

public interface IProductsRepository {
	
	public List<Products> repositoryProductsGetAll();
	public List<Products> repositoryProductsGetProductById(int productId);

}
