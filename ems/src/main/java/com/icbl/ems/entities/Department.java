package com.icbl.ems.entities;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "department")
public class Department {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private UUID id;

	@Column(name = "code", unique = true, nullable = false)
	private String code;

	@Column(name = "name", unique = true, nullable = false)
	private String name;

	@Column(name = "added_by", nullable = false)
	private String addedBy;

	@Temporal(TemporalType.DATE)
	@Column(name = "added_on", nullable = false)
	private Date addedon;

	@Column(name = "updated_by", nullable = false)
	private String updatedBy;

	@Temporal(TemporalType.DATE)
	@Column(name = "updated_on", nullable = false)
	private Date updatedOn;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "comapny_id")
	private Company company;
	
	@OneToMany(mappedBy = "department", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<Employee> employees;
}
