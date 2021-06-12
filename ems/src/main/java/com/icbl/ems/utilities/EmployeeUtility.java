package com.icbl.ems.utilities;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.icbl.ems.entities.Employee;
import com.icbl.ems.models.EmployeeModel;

@Component
public class EmployeeUtility {

	public Employee modelToEntity(EmployeeModel employeeModel) {

		Employee emp = new Employee();

		emp.setDepartment(employeeModel.getDepartment());
		emp.setFirstName(employeeModel.getFirstName());
		emp.setLastName(employeeModel.getLastName());
		return emp;
	}

	public EmployeeModel entityToModel(Employee emp) {
		EmployeeModel empModel = new EmployeeModel();
		empModel.setId(emp.getId());
		empModel.setFirstName(emp.getFirstName());
		empModel.setLastName(emp.getLastName());
		empModel.setDepartment(emp.getDepartment());
		return empModel;
	}

	public List<EmployeeModel> entityListToModelList(List<Employee> empList) {
		List<EmployeeModel> empModelList = new ArrayList<>();
		empList.forEach(emp -> {
			EmployeeModel empModel = entityToModel(emp);
			empModelList.add(empModel);
		});
		return empModelList;
	}
}
