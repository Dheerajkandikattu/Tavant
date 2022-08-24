package com.org.tav.Controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.org.tav.Entity.Address;
import com.org.tav.Service.AddressService;
import com.org.tav.Service.ApiService;

@Controller
public class AddressController {
	@Autowired
	AddressService service;
	@Autowired
	ApiService api;
	
	
	@RequestMapping("/")
	public String home(Model model)
	{
		List<String> names=service.search();
		model.addAttribute("names", names);
		return("index");
	}
	@RequestMapping("/saveaddr")
	public String saveaddr(Model model,Address addr) throws IOException
	{
		if(api.validation(addr.getAddr()))
		{
			service.saveaddr(addr);
			List<String> names=service.search();
			model.addAttribute("names", names);
		}
		
		return("index");
	}
//	@GetMapping("/getaddr")
//	public String getaddr(Model model ,@RequestParam("ad") String s)
//	{
//		List<String> names=adrepo.search();
//		model.addAttribute("names", names);
//		Address ad=adrepo.findByAddr(s);
//		model.addAttribute("resultSet",ad);
//		return("index");
//	}
	@GetMapping("/getsimilar")
	public String getsimilar(Model model,@RequestParam("word") String s)
	{
		List<String> names=service.search();
		model.addAttribute("names", names);
		List<Address> a=service.getsimilar(s);
		model.addAttribute("adlist",a);
		return("index");
		
	}
	@RequestMapping(value="/FileUpload",method = RequestMethod.POST)
	public String FileUpload(Model model,@RequestParam("file") MultipartFile file) throws IOException  {
	     service.fileupload(file);
	     List<String> names=service.search();
	     model.addAttribute("names", names);
	     return("index");
	     
	     /* pint all numbers */
	     
	     
	}
	
}
