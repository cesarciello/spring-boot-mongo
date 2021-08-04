package ciello.arsenal.course.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import ciello.arsenal.course.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {}