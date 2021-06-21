package com.microsservicos.sum;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class HrSumApplication {

	public static void main(String[] args) {
		SpringApplication.run(HrSumApplication.class, args);
	}

}
