package cl.apirest.ensayo.talento.digital.main.service;

import cl.apirest.ensayo.talento.digital.main.response.ListProductsResponse;

public interface IProductsService {
	
	public ListProductsResponse serviceMethodGet(String pathparameter, String parameter);
}
