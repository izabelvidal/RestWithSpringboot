package br.com.bel.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	@RequestMapping(value="/{id}",
			method=RequestMethod.GET,
			produces= MediaType.APPLICATION_JSON_VALUE)
	public Person findById(@PathVariable("id") String id) throws Exception {
		return service.findById(id);
	}
	
}
