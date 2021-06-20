package com.icbl.ems.services;

import java.util.List;

import com.icbl.ems.exceptions.EmployeeException;
import com.icbl.ems.models.CompanyModel;
import com.icbl.ems.response.ResponseMessage;

public interface CompanyService {

	ResponseMessage addCompany(CompanyModel companyModel) throws EmployeeException;

	List<CompanyModel> findCompany() throws EmployeeException;
}
