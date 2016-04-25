package com.mycompany.spring.mybatis.domain;

import java.io.Serializable;

@SuppressWarnings("serial")
public class ContactHobbyDetail implements Serializable{

	private Long contactId;
	private String hobbyId;
	public Long getContactId() {
		return contactId;
	}
	public void setContactId(Long contactId) {
		this.contactId = contactId;
	}
	public String getHobbyId() {
		return hobbyId;
	}
	public void setHobbyId(String hobbyId) {
		this.hobbyId = hobbyId;
	}
	
	
}
