package com.org.tav.emp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@GetMapping("/actuator/info")
	public String hello()
	{
		return("Hello ATM");
	}

}
