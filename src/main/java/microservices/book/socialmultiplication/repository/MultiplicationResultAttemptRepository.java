package microservices.book.socialmultiplication.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import microservices.book.socialmultiplication.domain.MultiplicationResultAttempt;

public interface MultiplicationResultAttemptRepository extends CrudRepository<MultiplicationResultAttempt, Long> {
	
	List<MultiplicationResultAttempt> findTop5ByUserAliasOrderByIdDesc(String userAlias);

}
