package com.icbl.ems.services;

import com.icbl.ems.exceptions.EmployeeException;
import com.icbl.ems.models.EmployeeModel;
import com.icbl.ems.response.ResponseMessage;

public interface EmployeeService {

	ResponseMessage addEmployee(EmployeeModel employeeModel) throws EmployeeException;
}
