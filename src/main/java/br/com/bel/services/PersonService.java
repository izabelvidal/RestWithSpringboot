package br.com.bel.services;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Service;

import br.com.bel.models.Person;

@Service
public class PersonService {
	private final AtomicLong counter = new AtomicLong();
	
	public Person create(Person person) {
		return person;
	}
	
	public Person update(Person person) {
		return person;
	}
	
	public void delete(String id) {
		
	}
	
	public Person findById(String id) {
		Person person = new Person();
		person.setId(counter.incrementAndGet());
		person.setFirstName("Izabel");
		person.setLastName("Vidal");
		person.setAddress("Rua Maria de Lourdes, Garanhuns, PE");
		person.setGender("Female");
		return person;
	}
	
	public List<Person> findAll(){
		List<Person> people = new ArrayList<Person>();
		for (int i = 0; i < 8; i++) {
			Person person = mockPerson(i);
			people.add(person);
		}
		return people ;
	}

	private Person mockPerson(int i) {
		Person person = new Person();
		person.setId(counter.incrementAndGet());
		person.setFirstName("Person Name" + i);
		person.setLastName("Person Last Name" + i);
		person.setAddress("Rua Maria de Lourdes, Garanhuns, PE" + i);
		person.setGender("M/F" + i);
		return person;
	}
}
