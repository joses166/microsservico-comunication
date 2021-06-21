package com.microsservicos.sum.services.impl;

import org.springframework.stereotype.Service;

import com.microsservicos.sum.entities.ClassNumber;
import com.microsservicos.sum.services.SumService;

@Service
public class SumServiceImpl implements SumService {

	@Override
	public Double getSum(ClassNumber classNumber) {
		
		Double a = classNumber.getNumber1().doubleValue();
		Double b = classNumber.getNumber2().doubleValue();
		Double c = a + b;

		return c;
	}
	
}
