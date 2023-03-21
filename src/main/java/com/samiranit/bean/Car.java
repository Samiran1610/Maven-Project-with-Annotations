package com.samiranit.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.samiranit.dao.IEngine;

@Component
public class Car {

	//@Autowired
	IEngine eng;

	@Autowired
	@Qualifier("petrol")
	public void setEngine(IEngine eng) {
		this.eng = eng;
	}
	
	public void drive() {
		boolean status = eng.start();
		if(status) {
			System.out.println("Journey started...!!");
		}else {
			System.out.println("Journey not started ... ;(");
		}
	}

}
