package com.microsservicos.numbers.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microsservicos.numbers.entities.ClassNumber;
import com.microsservicos.numbers.feignclients.SumClient;
import com.microsservicos.numbers.services.NumberService;

@Service
public class NumberServiceImpl implements NumberService {

	@Autowired
	private SumClient sumClient;
	
	@Override
	public Double sumNumbers(ClassNumber classNumber) {
		return this.sumClient.sumNumber(classNumber).getBody();
	}

}