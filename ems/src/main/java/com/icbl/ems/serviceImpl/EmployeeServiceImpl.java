package com.icbl.ems.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.icbl.ems.domain.EmployeeDomain;
import com.icbl.ems.exceptions.EmployeeException;
import com.icbl.ems.models.EmployeeModel;
import com.icbl.ems.response.ResponseMessage;
import com.icbl.ems.services.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeDomain empDomain;

	@Override
	public ResponseMessage addEmployee(EmployeeModel employeeModel) throws EmployeeException {
		ResponseMessage response = empDomain.addEmploye(employeeModel);
		return response;
	}

	@Override
	public List<EmployeeModel> findAllEmployee() throws EmployeeException {
		List<EmployeeModel> response = empDomain.findAllEmployee();
		return response;
	}

	

}
