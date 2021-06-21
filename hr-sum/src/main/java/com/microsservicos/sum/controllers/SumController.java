package com.microsservicos.sum.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microsservicos.sum.entities.ClassNumber;
import com.microsservicos.sum.services.SumService;

@RestController
@RequestMapping("/api/v1/sum")
public class SumController {

	@Autowired
	private SumService sumService;
	
	@PostMapping
	public ResponseEntity<Double> sumNumber(@RequestBody ClassNumber classNumber) {
		return ResponseEntity.ok(sumService.getSum(classNumber));
	}
	
}
