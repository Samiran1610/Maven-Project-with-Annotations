package com.samiranit.dao.impl;

//import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.samiranit.dao.IEngine;

@Component("diesel")
//@Primary
public class DieselEngine implements IEngine {

	@Override
	public boolean start() {
		System.out.println("Diesel engine started...!!");
		return true;
	}

}
