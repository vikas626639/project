package com.PhoneBook.Command;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

@Data
public class Contect implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer contect_Id;
	private String contect_Name;
	private String contect_Email;
	private Long contect_PhnoNumber;
	private Date date;
	private Date date1;
}
