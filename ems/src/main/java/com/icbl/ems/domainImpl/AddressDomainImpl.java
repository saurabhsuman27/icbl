package com.icbl.ems.domainImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.icbl.ems.domain.AddressDomain;
import com.icbl.ems.entities.Address;
import com.icbl.ems.exceptions.EmployeeException;
import com.icbl.ems.models.AddressModel;
import com.icbl.ems.repositories.AddressRepository;
import com.icbl.ems.response.ResponseMessage;
import com.icbl.ems.utilities.AddressUtility;

@Component
public class AddressDomainImpl implements AddressDomain {

	@Autowired
	private AddressRepository addressRepo;

	@Autowired
	private AddressUtility addressUtils;

	@Override
	public ResponseMessage addAddress(AddressModel addressModel) throws EmployeeException {
		Address address = addressUtils.ModelToEntity(addressModel);
		addressRepo.save(address);
		ResponseMessage response = new ResponseMessage("200", "Address added successfully");
		return response;
	}

}
