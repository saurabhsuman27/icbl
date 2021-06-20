package com.icbl.ems.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.icbl.ems.exceptions.EmployeeException;
import com.icbl.ems.models.CompanyModel;
import com.icbl.ems.response.ResponseMessage;
import com.icbl.ems.services.CompanyService;

@RestController
@RequestMapping("/company")
public class CompanyController {

	@Autowired
	private CompanyService companyService;

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public ResponseMessage addCompany(@RequestBody CompanyModel companyModel) throws EmployeeException {
		ResponseMessage response = companyService.addCompany(companyModel);
		return response;
	}

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public List<CompanyModel> findCompany() throws EmployeeException {
		List<CompanyModel> response = companyService.findCompany();
		return response;
	}

}
