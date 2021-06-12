package com.icbl.ems.services;

import java.util.List;

import com.icbl.ems.exceptions.EmployeeException;
import com.icbl.ems.models.EmployeeModel;
import com.icbl.ems.response.ResponseMessage;

public interface EmployeeService {

ResponseMessage addEmployee(EmployeeModel employeeModel) throws EmployeeException;
	
	List<EmployeeModel> findAllEmployee() throws EmployeeException;
}
