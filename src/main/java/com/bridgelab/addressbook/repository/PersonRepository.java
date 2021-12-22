package com.bridgelab.addressbook.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bridgelab.addressbook.model.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Integer>{

}
