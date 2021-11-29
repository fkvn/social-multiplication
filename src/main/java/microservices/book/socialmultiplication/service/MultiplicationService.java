package microservices.book.socialmultiplication.service;

import java.util.List;

import microservices.book.socialmultiplication.domain.Multiplication;
import microservices.book.socialmultiplication.domain.MultiplicationResultAttempt;

public interface MultiplicationService {
	
	Multiplication createRandomMultiplication();
	
	List<MultiplicationResultAttempt> getStatsForUser(String userAlias);
	
	boolean checkAttempt(final MultiplicationResultAttempt resultAttempt);
}
