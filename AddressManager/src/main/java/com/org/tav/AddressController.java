package com.org.tav;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AddressController {
	@Autowired
	AddressRepository adrepo;
	
	
	@RequestMapping("/")
	public String home()
	{
		return("home");
	}
	@RequestMapping("/saveaddr")
	public String saveaddr(Address addr)
	{
		adrepo.save(addr);
		return("home");
	}

}
