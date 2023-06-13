package com.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.app.modle.Contact;


@Repository
public interface ContactRepository extends CrudRepository<Contact, Integer> {

}
