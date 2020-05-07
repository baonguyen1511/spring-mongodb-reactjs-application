package com.baonguyen.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.baonguyen.demo.models.Contact;

public interface ContactRepository extends CrudRepository<Contact, String> {
    @Override
    void delete(Contact deleted);
}
