package com.mycompany.spring.mybatis.persistence;

import java.util.List;

import com.mycompany.spring.mybatis.domain.ContactTelDetail;

public interface ContactTelDetailMapper {

	public void insertContactTelDetail(ContactTelDetail contactTelDetail);

	public List<ContactTelDetail> selectTelDetailForContact(Long contactId);

	public void updateContactTelDetail(ContactTelDetail contactTelDetail);

	public void deleteOrphanContactTelDetail(List<Long> ids);

	public void deleteTelDetailForContact(Long contactId);
}
