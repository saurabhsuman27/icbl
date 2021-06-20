package com.icbl.ems.models;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CompanyModel {

	private UUID id;

	private String code;

	private String name;

	private String resgistratioNumber;

	private AddressModel address;
}
