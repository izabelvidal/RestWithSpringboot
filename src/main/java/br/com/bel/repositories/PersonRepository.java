package br.com.bel.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.bel.models.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long>{

}
