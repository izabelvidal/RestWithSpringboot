package br.com.bel.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.bel.data.models.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long>{

}
