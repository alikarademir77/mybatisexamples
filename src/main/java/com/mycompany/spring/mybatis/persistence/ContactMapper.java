package com.mycompany.spring.mybatis.persistence;

import java.util.List;

import com.mycompany.spring.mybatis.domain.Contact;
import com.mycompany.spring.mybatis.domain.SearchCriteria;

public interface ContactMapper {
	public List<Contact> findAll();

	public List<Contact> findAllWithDetail();

	public Contact findById(Long id);

	public List<Contact> findByFirstNameAndLastName(SearchCriteria criteria);

	public void insertContact(Contact contact);

	public void updateContact(Contact contact);
	
	void deleteContact(Long id);
}
