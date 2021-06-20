package com.icbl.ems.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.icbl.ems.domain.CompanyDomain;
import com.icbl.ems.exceptions.EmployeeException;
import com.icbl.ems.models.CompanyModel;
import com.icbl.ems.response.ResponseMessage;
import com.icbl.ems.services.CompanyService;

@Service
public class CompanyServiceImpl implements CompanyService {

	@Autowired
	private CompanyDomain companyDomain;

	@Override
	public ResponseMessage addCompany(CompanyModel companyModel) throws EmployeeException {
		ResponseMessage response = companyDomain.addCompany(companyModel);
		return response;
	}

	@Override
	public List<CompanyModel> findCompany() throws EmployeeException {
		List<CompanyModel> response = companyDomain.findCompany();
		return response;
	}

}
