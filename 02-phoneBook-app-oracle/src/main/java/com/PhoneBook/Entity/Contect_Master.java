package com.PhoneBook.Entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;
@Data
@Entity
@Table(name = "CONTECT_DTLS")
public class Contect_Master implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column( name = "ID")
	@SequenceGenerator(name="cid_seq_gen",sequenceName ="CONTECT_ID_SEQ",allocationSize = 1 )
	@GeneratedValue(generator ="cid_seq_gen", strategy = GenerationType.SEQUENCE )
	private Integer contect_Id;
	
	@Column( name = "CONTECT_NAME")
	private String contect_Name;
	
	@Column( name = "CONTECT_EMAIL")
	private String contect_Email;
	
	@Column( name = "CONTECT_NUMBER")
	private Long contect_PhnoNumber;
	
	@CreationTimestamp
	@Temporal(TemporalType.DATE)
	@Column(name="CREATED_DATE", updatable = false)
	private Date date;
	
	@UpdateTimestamp
	@Temporal(TemporalType.DATE)
	@Column(name="UPDATE_DATE", insertable = false)
	private Date date1;
	
}
