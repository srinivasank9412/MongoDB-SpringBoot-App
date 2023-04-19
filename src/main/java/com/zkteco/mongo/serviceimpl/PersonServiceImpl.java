package com.zkteco.mongo.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zkteco.mongo.collection.Person;
import com.zkteco.mongo.repository.PersonRepository;
import com.zkteco.mongo.service.PersonService;

@Service
 class PersonServiceImpl implements PersonService {

	@Autowired
	private PersonRepository repo;
	
	@Override
	public String save(Person person) {
		return repo.save(person).getId();
	}

}
