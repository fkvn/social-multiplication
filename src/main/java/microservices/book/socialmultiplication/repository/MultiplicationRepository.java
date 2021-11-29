package microservices.book.socialmultiplication.repository;

import org.springframework.data.repository.CrudRepository;

import microservices.book.socialmultiplication.domain.Multiplication;

public interface MultiplicationRepository extends CrudRepository<Multiplication, Long> {

}
