package com.icbl.ems.services;

import com.icbl.ems.exceptions.EmployeeException;
import com.icbl.ems.models.AddressModel;
import com.icbl.ems.response.ResponseMessage;

public interface AddressService {

	ResponseMessage addAddress(AddressModel addressModel) throws EmployeeException;
	
}
