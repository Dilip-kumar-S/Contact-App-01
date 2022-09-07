package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;


@Data
@Entity
@Table(name = "contact_dtls")
public class Contact 
{

	@Id
	@GeneratedValue
	private int cId;
	private String name;
	private String email;
	private long phoneNo;
	private String activeSw;
	
	
	
}
