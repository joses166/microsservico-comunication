package com.microsservicos.numbers.feignclients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;

import com.microsservicos.numbers.entities.ClassNumber;

@Component
@FeignClient(name = "hr-sum", path = "/api/v1/sum")
public interface SumClient {

	@PostMapping
	ResponseEntity<Double> sumNumber(ClassNumber classNumber); 
	
}
