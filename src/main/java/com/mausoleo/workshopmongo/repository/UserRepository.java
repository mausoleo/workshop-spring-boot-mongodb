package com.mausoleo.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.mausoleo.workshopmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
}

/*
MongoRepository já implementa o Spring Data.
*/