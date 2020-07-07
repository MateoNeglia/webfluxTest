package com.webflux.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.webflux.controller.webfluxController;

import reactor.core.publisher.Mono;

@Service
public class webfluxService implements IWebfluxService {
	private final static Logger logger = LogManager.getLogger(webfluxController.class);
	
	private String url = "http://vic.npe.intl.ar-nane1.gcp.efx/apiProductos/getProducto/";
	private String fullUrl = "http://vic.npe.intl.ar-nane1.gcp.efx/apiProductos/product/all";
	
	
	public Mono<String> call(String url){
		WebClient webClient = WebClient.builder().build();
		
		return webClient.get()
				.uri(fullUrl)
				.accept(MediaType.APPLICATION_JSON)
				.retrieve()
				.bodyToMono(String.class);
				
	}
}
