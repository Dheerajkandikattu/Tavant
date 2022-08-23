package com.org.tav;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


import org.apache.logging.log4j.util.Strings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AddressController {
	@Autowired
	AddressRepository adrepo;
	
	
	@RequestMapping("/")
	public String home(Model model)
	{
		List<String> names=adrepo.search();
		model.addAttribute("names", names);
		return("index");
	}
	@RequestMapping("/saveaddr")
	public String saveaddr(Model model,Address addr)
	{
		
		adrepo.save(addr);
		List<String> names=adrepo.search();
		model.addAttribute("names", names);
		return("index");
	}
	@GetMapping("/getaddr")
	public String getaddr(Model model ,@RequestParam("ad") String s)
	{
		List<String> names=adrepo.search();
		model.addAttribute("names", names);
		Address ad=adrepo.findByAddr(s);
		model.addAttribute("resultSet",ad);
		return("index");
	}
	@GetMapping("/getsimilar")
	public String getsimilar(Model model,@RequestParam("word") String s)
	{
		List<String> names=adrepo.search();
		model.addAttribute("names", names);
		List<Address> a=adrepo.findBySimilarity(s);
		model.addAttribute("adlist",a);
		return("index");
		
	}
	@RequestMapping(value="/FileUpload",method = RequestMethod.POST)
	public String FileUpload(Model model,@RequestParam("file") MultipartFile file) throws IOException  {
	     List<Address> addresses = new ArrayList<>();
	     InputStream inputStream = file.getInputStream(); 
	     BufferedReader bufferReader =   new BufferedReader(new InputStreamReader(inputStream));
	     String addressLine;
	     while ((addressLine = bufferReader.readLine()) != null) {
	        addresses.add(new Address(addressLine));
	     }
	     bufferReader.close();
	     adrepo.saveAll(addresses);
	     List<String> names=adrepo.search();
	     model.addAttribute("names", names);
	     return("index");
	     
	     /* pint all numbers */
	     
	     
	}
	
}
