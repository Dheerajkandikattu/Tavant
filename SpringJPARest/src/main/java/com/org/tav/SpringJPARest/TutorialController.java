package com.org.tav.SpringJPARest;

import java.awt.PageAttributes.MediaType;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class TutorialController {
   private TutorialRepository repo;
   


	public TutorialController(TutorialRepository repo) {
	super();
	this.repo = repo;
}



	@GetMapping("/tutorial")
	public List<Tutorial> getAll()
	{
		return repo.findAll();
	}
	
	@PostMapping(value = { "/tutorial" }, consumes = MediaType.APPLICATION_JSON, produces = MediaType.APPLICATION_JSON_VALUE )
	public ResponseEntity<Tutorial> savetutorial(@RequestBody Tutorial tutorial) throws Exception
	{
		return new ResponseEntity<Tutorial>(repo.save(tutorial), HttpStatus.CREATED);
	}
	
}
