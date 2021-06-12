package com.icbl.ems.domain;

import java.util.List;

import com.icbl.ems.exceptions.EmployeeException;
import com.icbl.ems.models.EmployeeModel;
import com.icbl.ems.response.ResponseMessage;

public interface EmployeeDomain {

	ResponseMessage addEmploye(EmployeeModel employeeModel) throws EmployeeException;
	
	List<EmployeeModel> findAllEmployee() throws EmployeeException;
}
