package com.al.ikubinfo.akademia.mavenDemo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="hello")
public class HelloEntity implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private int helloId;
	
	@Column(name="MESSAGE")
	private String message;

	public int getHelloId() {
		return helloId;
	}

	public void setHelloId(int helloId) {
		this.helloId = helloId;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
