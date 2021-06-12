package com.icbl.ems.domain;

import java.util.List;

import com.icbl.ems.exceptions.EmployeeException;
import com.icbl.ems.models.AddressModel;
import com.icbl.ems.response.ResponseMessage;

public interface AddressDomain {

	ResponseMessage addAddress(AddressModel addressModel) throws EmployeeException;
	
	List<AddressModel> getAddress() throws EmployeeException;
}
