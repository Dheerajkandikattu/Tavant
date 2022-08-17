package com.org.tav.SpringBootSecurityDemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	@RequestMapping("/")
	public String hellouser()
	{
		return("hello User");
	}
	@RequestMapping("/admin")
	
    public String admin()
    {
        return "Hello Admin";
    }
	

}
