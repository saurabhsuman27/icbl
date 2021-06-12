package com.icbl.ems.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.icbl.ems.exceptions.EmployeeException;
import com.icbl.ems.models.EmployeeModel;
import com.icbl.ems.response.ResponseMessage;
import com.icbl.ems.services.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	private EmployeeService empService;

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public ResponseMessage addEmployee(@RequestBody EmployeeModel employeeModel) throws EmployeeException {
		ResponseMessage response = empService.addEmployee(employeeModel);
		return response;
	}

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public List<EmployeeModel> findAllEmployee() throws EmployeeException {
		List<EmployeeModel> empList = empService.findAllEmployee();
		return empList;
	}
}
