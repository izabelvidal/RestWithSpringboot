package br.com.bel.services;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Service;

import br.com.bel.models.Person;

@Service
public class PersonService {
	private final AtomicLong counter = new AtomicLong();
	
	public Person findById(String id) {
		Person person = new Person();
		person.setId(counter.incrementAndGet());
		person.setFirstName("Izabel");
		person.setLastName("Vidal");
		person.setAddress("Rua Maria de Lourdes, Garanhuns, PE");
		person.setGender("Female");
		return person;
	}
}
