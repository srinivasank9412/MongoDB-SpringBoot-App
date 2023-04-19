package com.zkteco.mongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.zkteco.mongo.collection.Person;

@Repository
public interface PersonRepository extends MongoRepository<Person, String>{

}
