package com.webflux.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import reactor.core.publisher.Mono;

@RestController
public class webfluxController {
	@GetMapping(value ="/string", produces = MediaType.APPLICATION_JSON_VALUE)
	public Mono<String> stringDelivery(){
		return Mono.just("Este es un String")
				.doOnSuccess(System.out :: println);
	}

}
