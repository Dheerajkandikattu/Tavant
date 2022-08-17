package com.org.tav.RestServices;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.org.rest.req.PostRequest;
import com.org.rest.req.PostResponse;

@RestController
public class WebController {
	@RequestMapping("/sample")

	public SampleResponse Sample(@RequestParam(value="name",defaultValue="Rest Service") String name) {
		SampleResponse res =new SampleResponse();
		res.setId(101);
		res.setMessage("You are learning " + name);
		return res;
		
	}
	@RequestMapping("/hello")
	public String sayhi()
	{
		return("Hello everyone");
	}
	@RequestMapping("/test")
	public int test()
	{
		return(101);
	}
	//postrequest
	@RequestMapping(value="/req", method=RequestMethod.POST)
	
	public PostResponse Test(@RequestBody PostRequest input)
	//@RequestBody PostRequest  input --> inidcates that post request will have an input post body of type postrequest . input post body is stored in input object
	{
		PostResponse res= new PostResponse();
		res.setId(input.getId());
		res.setMessage("Hello Everyone Iam learning "+input.getName());
		res.setExtra("Best in Industry");
		return res;
		
	}
}
