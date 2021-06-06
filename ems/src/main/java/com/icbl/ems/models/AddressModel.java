package com.icbl.ems.models;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddressModel {

	private UUID id;

	private String addressLine1;

	private String addressLine2;

	private String landMark;

	private String city;

	private String state;

	private String country;

	private String zipCode;

}
