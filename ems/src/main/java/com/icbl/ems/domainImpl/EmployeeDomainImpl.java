package com.icbl.ems.domainImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.icbl.ems.domain.EmployeeDomain;
import com.icbl.ems.entities.Employee;
import com.icbl.ems.exceptions.EmployeeException;
import com.icbl.ems.models.EmployeeModel;
import com.icbl.ems.repositories.EmployeeRepository;
import com.icbl.ems.response.ResponseMessage;
import com.icbl.ems.utilities.CommonUtility;

@Component
public class EmployeeDomainImpl implements EmployeeDomain {

	@Autowired
	private EmployeeRepository empRepo;

	@Override
	public ResponseMessage addEmploye(EmployeeModel employeeModel) throws EmployeeException {

		Employee emp = CommonUtility.map(employeeModel, Employee.class);
		empRepo.save(emp);
		return new ResponseMessage("200", "Employee addedd successfully");
	}

	@Override
	public List<EmployeeModel> findAllEmployee() throws EmployeeException {
		List<Employee> empList = empRepo.findAll();
		return null;
	}

}
