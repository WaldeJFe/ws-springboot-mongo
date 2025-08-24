package wjfe48.springMongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import wjfe48.springMongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}