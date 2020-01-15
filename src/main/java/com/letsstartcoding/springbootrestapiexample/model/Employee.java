package com.letsstartcoding.springbootrestapiexample.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name="Employees")
@EntityListeners(AuditingEntityListener.class)

public class Employee {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@NotBlank
	private String firstname;
	
	@NotBlank
	private String lastname;
	
	@NotBlank
	private String nomp�re;
	
	@NotBlank
	private String nomm�re;
	
	@NotBlank
	private String datedenaissance;
	
	@NotBlank
	private String cin;
	public String getCin() {
		return cin;
	}
	public void setCin(String cin) {
		this.cin = cin;
	}
	@NotBlank
	private String Jurisprudence;
	
	public Employee() {
		super();
	}
	public Employee(Long id, String firstname, String lastname, String nomp�re, String nomm�re, String datedenaissance,
			String jurisprudence) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.nomp�re = nomp�re;
		this.nomm�re = nomm�re;
		this.datedenaissance = datedenaissance;
		Jurisprudence = jurisprudence;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getNomp�re() {
		return nomp�re;
	}
	public void setNomp�re(String nomp�re) {
		this.nomp�re = nomp�re;
	}
	public String getNomm�re() {
		return nomm�re;
	}
	public void setNomm�re(String nomm�re) {
		this.nomm�re = nomm�re;
	}
	public String getDatedenaissance() {
		return datedenaissance;
	}
	
	
	public void setDatedenaissance(String datedenaissance) {
		this.datedenaissance = datedenaissance;
	}
	public String getJurisprudence() {
		return Jurisprudence;
	}
	public void setJurisprudence(String jurisprudence) {
		Jurisprudence = jurisprudence;
	}
	

}
