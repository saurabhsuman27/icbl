package com.icbl.ems.domainImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.icbl.ems.domain.CompanyDomain;
import com.icbl.ems.entities.Company;
import com.icbl.ems.exceptions.EmployeeException;
import com.icbl.ems.models.CompanyModel;
import com.icbl.ems.repositories.CompanyRepository;
import com.icbl.ems.response.ResponseMessage;
import com.icbl.ems.utilities.CommonUtility;

@Component
public class CompanyDomainImpl implements CompanyDomain {

	@Autowired
	private CompanyRepository companyRepo;

	@Override
	public ResponseMessage addCompany(CompanyModel companyModel) throws EmployeeException {
		Company company = CommonUtility.map(companyModel, Company.class);
		companyRepo.save(company);

		return new ResponseMessage("200", "Success");
	}

	@Override
	public List<CompanyModel> findCompany() throws EmployeeException {
		List<Company> companies = companyRepo.findAll();
		List<CompanyModel> companiesModel = CommonUtility.mapAll(companies, CompanyModel.class);
		return companiesModel;
	}

}
