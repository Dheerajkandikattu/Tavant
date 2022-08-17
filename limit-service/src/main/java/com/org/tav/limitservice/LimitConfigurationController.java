package com.org.tav.limitservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitConfigurationController {
	@Autowired
	Configuration config;
	@GetMapping("/limit1")
	public LimitConfiguration retrieveLimitsFromConfigurations1() {
		return new LimitConfiguration(config.getMaximum(),config.getMinimum());
	}
	
	@GetMapping("/limit")
	public LimitConfiguration retrieveLimitsFromConfigurations() {
		return new LimitConfiguration(1000,1);
	}
	

}
