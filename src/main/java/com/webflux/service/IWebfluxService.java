package com.webflux.service;

import org.springframework.stereotype.Service;

import reactor.core.publisher.Mono;

@Service
public interface IWebfluxService {
	public Mono<String> call(String url);
}
