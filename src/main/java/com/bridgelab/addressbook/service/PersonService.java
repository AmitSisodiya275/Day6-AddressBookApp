package com.bridgelab.addressbook.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bridgelab.addressbook.model.Person;
import com.bridgelab.addressbook.repository.PersonRepository;

@Service
public class PersonService implements IPersonService{

	public List<Person> personList = new ArrayList<Person>();

	@Autowired
	PersonRepository personRepository;
	
	@Override
	public List<Person> getAllPerson() {
		return personRepository.findAll();
	}

	@Override
	public Person getPersonById(int id) {
		return personRepository.findById(id).orElse(null);
	}

	@Override
	public Person savePerson(Person person) {
		return personRepository.save(person);
	}

	@Override
	public Person updatePerson(int id, Person person) {
		Person per = personRepository.findById(id).orElse(null);
		if(per!=null) {
			per.setName(person.getName());
			per.setEmail(person.getEmail());
			per.setCity(person.getCity());
			per.setMobileNo(person.getMobileNo());
			return per;
		}
		return null;
	}

	@Override
	public void deletePerson(int id) {
		personRepository.deleteById(id);
	}
}
