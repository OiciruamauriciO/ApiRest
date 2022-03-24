package cl.apirest.ensayo.talento.digital.main.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.google.gson.Gson;

import cl.apirest.ensayo.talento.digital.main.model.production.Products;
import cl.apirest.ensayo.talento.digital.main.repository.IProductsRepository;
import cl.apirest.ensayo.talento.digital.main.response.ListProductsResponse;
import cl.apirest.ensayo.talento.digital.main.response.ProductsResponse;
import cl.apirest.ensayo.talento.digital.main.service.IProductsService;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class ProductsServiceImpl implements IProductsService {
	
	@Autowired
	IProductsRepository productsRepository;

	@Override
	public ListProductsResponse serviceMethodGet(String pathparameter, String parameter) {
		log.info("Service:Impl::serviceMethodGet");
		log.debug("pathparameter {}, parameter {}", pathparameter, parameter);
		
		ListProductsResponse productsResponse = null;
		List<ProductsResponse> listProductsResponse = new ArrayList<>();
		List<Products> productsList = null;
		
		try {
			
			switch (pathparameter) {
			
				case "all":					
					productsList = productsRepository.repositoryProductsGetAll();
				break;
				
				case "byid":
					productsList = productsRepository.repositoryProductsGetProductById(Integer.valueOf(parameter));
				break;
					
				default: 
				break;
			}
			
			if(productsList != null) {
				
				for(Products pm : productsList) {					
					ProductsResponse archetypeReponse = new ProductsResponse(pm.getProduct_id(), pm.getProduct_name(), pm.getBrand_id(), pm.getCategory_id(), pm.getModel_year(), pm.getList_price());
					listProductsResponse.add(archetypeReponse);
				}
				
				productsResponse = new ListProductsResponse(listProductsResponse);
				productsResponse.setStatus(200);
				productsResponse.setMessage("OK");
				
			}else {
				
				productsResponse = new ListProductsResponse(listProductsResponse);
				productsResponse.setStatus(500);
				productsResponse.setMessage("[Message] Error al obtener lista - revise logs");
				
				log.error("[Lista Null] Error al obtener lista - revise logs");
			}
		}catch(Exception e) {
			productsResponse = new ListProductsResponse(listProductsResponse);
			productsResponse.setStatus(500);
			productsResponse.setMessage("[Exception] Error al obtener lista - revise logs");
			
			log.error(e.getMessage());
		}finally {
			Gson gson = new Gson();			
			log.info("response {}", gson.toJson(productsResponse));
		}
		
		return productsResponse;
		
	}

}
