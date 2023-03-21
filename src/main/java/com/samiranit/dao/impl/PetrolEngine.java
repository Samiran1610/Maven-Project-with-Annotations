package com.samiranit.dao.impl;

import org.springframework.stereotype.Component;

import com.samiranit.dao.IEngine;

@Component("petrol")
public class PetrolEngine implements IEngine {

	@Override
	public boolean start() {
		System.out.println("Petrol engine started...!!");
		return true;
	}

}
