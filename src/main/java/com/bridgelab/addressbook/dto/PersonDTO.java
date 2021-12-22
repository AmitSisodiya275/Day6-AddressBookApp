package com.bridgelab.addressbook.dto;

import lombok.Data;

@Data
public class PersonDTO {

	private int id;
	private String name;
	private String email;
	private String city;
	private long mobileNo;

}
