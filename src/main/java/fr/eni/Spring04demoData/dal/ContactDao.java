package fr.eni.Spring04demoData.dal;

import org.springframework.data.repository.CrudRepository;

import fr.eni.Spring04demoData.bo.Contact;

public interface ContactDao extends CrudRepository<Contact, Integer>{

}
