package com.icbl.ems.entities;

import java.util.Date;
import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "branch")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Branch {

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

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "address_id")
	private Address address;

}
