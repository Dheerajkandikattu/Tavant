package com.org.tav.SpringJPARest1;

import java.awt.PageAttributes.MediaType;
import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/tutorials")
public class TutorialController {
   private TutorialRepository repo;
   


	public TutorialController(TutorialRepository repo) {

	this.repo = repo;
}



	@GetMapping
	public List<Tutorial> getAll()
	{
		return repo.findAll();
	}
	
	@PostMapping
	public ResponseEntity<Tutorial> savetutorial(@RequestBody Tutorial tutorial) 
	{
		return new ResponseEntity<Tutorial>(repo.save(tutorial),HttpStatus.CREATED);
	}
	@GetMapping("{id}")
	public Tutorial getTutorialById(@PathVariable(name = "id") int id) throws ResourceNotFoundException
	{
		return repo.findById(id).orElseThrow(()->new ResourceNotFoundException("Tutorial","id", id));
		
	}
	@PutMapping("{id}")
	public ResponseEntity<Tutorial> updateTutorial(@PathVariable(name="id") int id,@RequestBody Tutorial tutorial)
	{
		Tutorial existing=repo.findById(id).orElseThrow(()->new ResourceNotFoundException("Tutorial", "ID", id));
		existing.setDescription(tutorial.getDescription());
		existing.setPublished(tutorial.isPublished());
		existing.setTitle(tutorial.getTitle());
		return new ResponseEntity<Tutorial>(repo.save(existing), HttpStatus.CREATED);
	}
	@DeleteMapping("{id}")
	public ResponseEntity<String> deleteTutorialbyId(@PathVariable(name="id") int id)
	{
		repo.findById(id).orElseThrow(()->new ResourceNotFoundException("Tutorial","Id",id));
		repo.deleteById(id);
		return new ResponseEntity<String>("Tutorial deleted successfully",HttpStatus.OK);
	}
	@DeleteMapping
	public ResponseEntity<String> deleteAllTutorials()
	{
		repo.deleteAll();
		return new ResponseEntity<String>("All tutorials Deleted successfully",HttpStatus.OK);
	}
	@GetMapping("/published")
	public ResponseEntity<List<Tutorial>> getTutorialByPublished()
	{
		List<Tutorial> t=repo.findByPublished(true);
		if(t.isEmpty())
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		else
			return new ResponseEntity<List<Tutorial>>(t, HttpStatus.OK);
	}
//	@GetMapping
//	public ResponseEntity<List<Tutorial>> getTutorialByTitle(@RequestParam(name="title") String keyword)
//	{
//		List<Tutorial> t=repo.findByTitleContaining(keyword);
//		if(t.isEmpty())
//			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//		else
//			return new ResponseEntity<List<Tutorial>>(t, HttpStatus.OK);
//	}
//	
	
}
