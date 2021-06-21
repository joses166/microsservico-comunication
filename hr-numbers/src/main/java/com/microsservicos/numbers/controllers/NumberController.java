package com.microsservicos.numbers.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microsservicos.numbers.entities.ClassNumber;
import com.microsservicos.numbers.services.NumberService;

@RestController
@RequestMapping("/api/v1/numbers")
public class NumberController {

	@Autowired
	private NumberService numberService;
	
	@PostMapping
	public ResponseEntity<Double> sumNumber(@RequestBody ClassNumber classNumber) {
		return ResponseEntity.ok(numberService.sumNumbers(classNumber));
	}
	
}
