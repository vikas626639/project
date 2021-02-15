package com.PhoneBook.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
@Data
@Entity
public class Contect_Master {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer contect_Id;
	private String contect_Name;
	private String contect_Email;
	private Long contect_PhnoNumber;
}
