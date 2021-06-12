package com.icbl.ems.entities;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "address")
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Address {

	@Id
	private UUID id;

	@Column(name = "address_line1", nullable = false)
	private String addressLine1;
	
	@Column(name = "address_line2", nullable = true)
	private String addressLine2;
	
	@Column(name = "land_mark", nullable = true)
	private String landMark;
	
	@Column(name = "city", nullable = false)
	private String city;
	
	@Column(name = "state", nullable = false)
	private String state;
	
	@Column(name = "country", nullable = false)
	private String country;
	
	@Column(name = "zip_code", nullable = false)
	private String zipCode;
	
	/*
	 * @OneToMany(mappedBy = "employee", cascade = CascadeType.ALL) private
	 * List<Empoyee> employees;
	 * 
	 * @ManyToOne(fetch = FetchType.LAZY)
	 * 
	 * @JoinColumn(name = "employee_id") private Employee employee;
	 */
	
}
