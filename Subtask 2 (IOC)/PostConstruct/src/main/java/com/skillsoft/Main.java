package com.skillsoft;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
    //ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml"); 
		AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext(IOTDeviceBeanConfig.class);  
		
		System.out.println("\nAbout to retrieve the instantiated beans...\n");
		IOTDevice myFirstDeviceBean = (IOTDevice) appContext.getBean("FridgeBean");
		IOTDevice mySecondDeviceBean = (IOTDevice) appContext.getBean("DishwasherBean");
		
		myFirstDeviceBean.setDevice("Fridge");
		myFirstDeviceBean.setDescription("Temperature gauge for the freezer");
		
		mySecondDeviceBean.setDevice("Dishwasher");
		mySecondDeviceBean.setDescription("Monitors water flow");
		
		
		System.out.println("Bean from ApplicationContext:\n" + myFirstDeviceBean);
		System.out.println("Bean from ApplicationContext:\n" + mySecondDeviceBean);
		
		//appContext.close();
	}

	}


