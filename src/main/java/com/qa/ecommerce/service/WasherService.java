package com.qa.ecommerce.service;

import com.qa.ecommerce.repository.WasherRepository;

import java.util.List;

import com.qa.ecommerce.pojo.IPSOwasher;

public class WasherService {
	public List<IPSOwasher> getAllWashers() throws Exception {

		// WasherRepository washerDao = new WasherRepository();

		List<IPSOwasher> AllWashers = WasherRepository.getAllwashers();

		return AllWashers;
	}

}
