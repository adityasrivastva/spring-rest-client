package com.aditya.techunt.rest.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.aditya.techunt.rest.domain.User;
import com.aditya.techunt.rest.domain.UserData;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ApiServiceImpl implements ApiService {
	
	private RestTemplate restTemplate;
	
	

	public ApiServiceImpl(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}

	@Override
	public List<User> getUsers(Integer limit) {
		UserData userData = restTemplate.getForObject("http://apifaketory.com/api/user?limit="+limit, UserData.class);
		
		return userData.getData();
	}

	@Override
	public Flux<User> getUsers(Mono<Integer> limit) {
		// TODO Auto-generated method stub
		return null;
	}

}
