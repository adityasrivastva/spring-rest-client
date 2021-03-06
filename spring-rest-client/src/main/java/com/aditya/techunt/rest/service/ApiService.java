package com.aditya.techunt.rest.service;

import java.util.List;

import com.aditya.techunt.rest.domain.User;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ApiService {
	List<User> getUsers(Integer limit);

    Flux<User> getUsers(Mono<Integer> limit);
}
