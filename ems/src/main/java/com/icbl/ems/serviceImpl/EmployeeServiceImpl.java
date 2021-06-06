package com.icbl.ems.serviceImpl;

import java.util.Objects;

import org.springframework.stereotype.Service;

import com.icbl.ems.exceptions.EmployeeException;
import com.icbl.ems.models.EmployeeModel;
import com.icbl.ems.response.ResponseMessage;
import com.icbl.ems.services.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Override
	public ResponseMessage addEmployee(EmployeeModel employeeModel) throws EmployeeException {

		ResponseMessage response = null;
		if (Objects.nonNull(employeeModel)) {
			String empId = "EMP" + Math.random();
//			employeeModel.setId(empId);
			response = new ResponseMessage();
			response.setCode("200");
			response.setMessage("Epmloyee details added, with employee id: "+empId);
		} else {
			throw new EmployeeException("100", "Employee info is missing");
		}
		return response;
	}

}
