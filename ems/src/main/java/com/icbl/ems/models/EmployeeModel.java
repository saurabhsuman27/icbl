package com.icbl.ems.models;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeModel {

	private UUID id;

	private String employeeId;

	private String firstName;

	private String lastName;

	private CompanyModel company;

	private DepartmentModel department;

	private AddressModel address;

	private BranchModel branch;
}
