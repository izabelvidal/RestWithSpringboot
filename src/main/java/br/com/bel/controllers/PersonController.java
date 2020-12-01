package br.com.bel.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.bel.models.Person;
import br.com.bel.services.PersonService;

@RestController
@RequestMapping("/person")
public class PersonController {
	
	@Autowired
	private PersonService service;
	
	@GetMapping
	public List<Person> findAll(){
		return service.findAll();
	}
	
	@GetMapping("/{id}")
	public Person findById(@PathVariable("id") Long id){
		return service.findById(id);
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public Person create(@RequestBody Person person){
		return service.create(person);
	}
	
	@RequestMapping(method=RequestMethod.PUT)
	public Person update(@RequestBody Person person){
		return service.update(person);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Person> delete(@PathVariable("id") Long id){
		service.delete(id);
		return ResponseEntity.ok().build();
	}
}
