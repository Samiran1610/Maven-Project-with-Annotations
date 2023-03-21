package com.samiranit.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.samiranit.AppConfig;
import com.samiranit.bean.Car;

public class AppTest {

	public static void main(String[] args) {

		ApplicationContext context =
				new AnnotationConfigApplicationContext(AppConfig.class);
		Car car = context.getBean(Car.class);
		car.drive();
		
		
	}

}
