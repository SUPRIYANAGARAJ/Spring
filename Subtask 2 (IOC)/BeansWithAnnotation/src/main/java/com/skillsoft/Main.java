package com.skillsoft;

import org.springframework.context.ApplicationContext;
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        
		
		IOTDevice myDeviceBean = (IOTDevice) appContext.getBean("myIOTDeviceBean");
		
		myDeviceBean.setDevice("Fridge");
		myDeviceBean.setDescription("Temperature gauge for the freezer");
		
		
		System.out.println("Bean from ApplicationContext:\n" + myDeviceBean);
		
		

	}

}
