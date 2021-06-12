package com.icbl.ems.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.icbl.ems.exceptions.EmployeeException;
import com.icbl.ems.models.AddressModel;
import com.icbl.ems.response.ResponseMessage;
import com.icbl.ems.services.AddressService;

@RestController
@RequestMapping("/address")
public class AddressController {

	@Autowired
	private AddressService addressService;

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public ResponseMessage addAddress(@RequestBody AddressModel addressModel) throws EmployeeException {
		ResponseMessage response = addressService.addAddress(addressModel);
		return response;
	}
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public List<AddressModel> getAdresses() throws EmployeeException {
		List<AddressModel> addressModelList = addressService.getAddress();
		return addressModelList;
	}
}
