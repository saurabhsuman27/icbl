package com.icbl.ems.domainImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.icbl.ems.domain.AddressDomain;
import com.icbl.ems.entities.Address;
import com.icbl.ems.exceptions.EmployeeException;
import com.icbl.ems.models.AddressModel;
import com.icbl.ems.repositories.AddressRepository;
import com.icbl.ems.response.ResponseMessage;
import com.icbl.ems.utilities.CommonUtility;

@Component
public class AddressDomainImpl implements AddressDomain {

	@Autowired
	private AddressRepository addressRepo;

	@Override
	public ResponseMessage addAddress(AddressModel addressModel) throws EmployeeException {
		Address address = CommonUtility.map(addressModel, Address.class);
		addressRepo.save(address);
		ResponseMessage response = new ResponseMessage("200", "Address added successfully");
		return response;
	}

	@Override
	public List<AddressModel> getAddress() throws EmployeeException {
		List<Address> addressList = addressRepo.findAll();
		List<AddressModel> addressModelList = CommonUtility.mapAll(addressList, AddressModel.class);
		return addressModelList;
	}

}
