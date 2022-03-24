package cl.apirest.ensayo.talento.digital.main.controller;

import org.springframework.beans.factory.annotation.Autowired;

import cl.apirest.ensayo.talento.digital.main.response.ListProductsResponse;
import cl.apirest.ensayo.talento.digital.main.service.IProductsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@Slf4j
public class MicroServiceController {
	
	@Autowired
	IProductsService productsService;
	
	@GetMapping(value = "/methodGetProducts/{pathparameter}")
	public ListProductsResponse methodGetProducts(@PathVariable(required = true) String pathparameter, @RequestParam(required = false) String parameter) {
		log.info("Controller::methodGetProducts");
		return productsService.serviceMethodGet(pathparameter, parameter);
	}
	
	@GetMapping(value = "/methodGetProducts/{pathparameter}/{parameter}")
	public ListProductsResponse methodGetProductById(@PathVariable(required = true) String pathparameter, @RequestParam(required = true) String parameter) {
		log.info("Controller::methodGetProductById");
		return productsService.serviceMethodGet(pathparameter, parameter);
	}	
	

}
