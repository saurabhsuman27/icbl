package com.icbl.ems.domain;

import com.icbl.ems.exceptions.EmployeeException;
import com.icbl.ems.models.AddressModel;
import com.icbl.ems.response.ResponseMessage;

public interface AddressDomain {

	ResponseMessage addAddress(AddressModel addressModel) throws EmployeeException;
}
