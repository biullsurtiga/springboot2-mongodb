package com.urtiga.springboot2mongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.urtiga.springboot2mongodb.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{

	
}
