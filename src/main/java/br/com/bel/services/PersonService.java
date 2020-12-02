package br.com.bel.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.bel.data.models.Person;
import br.com.bel.exception.ResourceNotFoundException;
import br.com.bel.repositories.PersonRepository;

@Service
public class PersonService {

	@Autowired
	PersonRepository repo;

	public Person create(Person person) {
		return repo.save(person);
	}

	public List<Person> findAll() {
		return repo.findAll();
	}

	public Person findById(Long id) {
		return repo.findById(id).orElseThrow(() -> new ResourceNotFoundException("No records found for this ID"));
	}

	public Person update(Person person) {
		Person entity = repo.findById(person.getId())
				.orElseThrow(() -> new ResourceNotFoundException("No records found for this ID"));

		entity.setFirstName(person.getFirstName());
		entity.setLastName(person.getLastName());
		entity.setAddress(person.getAddress());
		entity.setGender(person.getGender());

		return repo.save(entity);
	}

	public void delete(Long id) {
		Person entity = repo.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("No records found for this ID"));
		repo.delete(entity);
	}
}
