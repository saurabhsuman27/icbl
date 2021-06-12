package com.icbl.ems.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.icbl.ems.domain.AddressDomain;
import com.icbl.ems.exceptions.EmployeeException;
import com.icbl.ems.models.AddressModel;
import com.icbl.ems.response.ResponseMessage;
import com.icbl.ems.services.AddressService;

@Service
public class AddressSevriceImpl implements AddressService {

	@Autowired
	private AddressDomain addressDomain;

	@Override
	public ResponseMessage addAddress(AddressModel addressModel) throws EmployeeException {
		ResponseMessage response = addressDomain.addAddress(addressModel);
		return response;
	}

	@Override
	public List<AddressModel> getAddress() throws EmployeeException {
		List<AddressModel> addressList = addressDomain.getAddress();
		return addressList;
	}

}
