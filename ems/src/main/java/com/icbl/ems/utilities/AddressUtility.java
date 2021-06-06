package com.icbl.ems.utilities;

import java.util.UUID;

import org.springframework.stereotype.Component;

import com.icbl.ems.entities.Address;
import com.icbl.ems.models.AddressModel;

@Component
public class AddressUtility {

	public Address ModelToEntity(AddressModel addressModel) {

		Address address = new Address();
		address.setId(UUID.randomUUID());
		address.setAddressLine1(addressModel.getAddressLine1());
		address.setAddressLine2(addressModel.getAddressLine2());
		address.setLandMark(addressModel.getLandMark());
		address.setCity(addressModel.getCity());
		address.setState(addressModel.getState());
		address.setCountry(addressModel.getCountry());
		address.setZipCode(addressModel.getZipCode());

		return address;
	}
}
