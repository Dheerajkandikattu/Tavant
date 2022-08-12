package com.org.tav.InternetBankingapigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class InternetBankingApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(InternetBankingApiGatewayApplication.class, args);
	}

}
