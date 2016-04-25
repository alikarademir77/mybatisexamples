package com.mycompany.spring.mybatis.persistence;

import com.mycompany.spring.mybatis.domain.ContactHobbyDetail;

public interface ContactHobbyDetailMapper {

	void insertContactHobbyDetail(ContactHobbyDetail contactHobbyDetail);

	void deleteHobbyDetailForContact(Long contactId);
}
