package com.mycompany.spring.mybatis.domain;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Hobby implements Serializable {

	private String hobbyId;

	public String getHobbyId() {
		return hobbyId;
	}

	public void setHobbyId(String hobbyId) {
		this.hobbyId = hobbyId;
	}

	// Getter/setter methods omitted
	public String toString() {
		return "Hobby :" + getHobbyId();
	}
}
