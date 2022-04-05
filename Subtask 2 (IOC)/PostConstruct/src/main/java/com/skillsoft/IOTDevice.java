package com.skillsoft;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class IOTDevice {
	
	String device;
    String description;
    
    //constructor
    public IOTDevice() {
    	System.out.println("Object created successfully");
    }
	
    public String getDevice() {
		return device;
	}
	public void setDevice(String device) {
		this.device = device;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	@Override
	public String toString() {
		return "IOTDevice [device=" + device + ", description=" + description + "]";
	}
	
	@PostConstruct
	public void initBean() throws Exception{
		System.out.println("IOTDevice bean has been instantiated. Inside the initBean() method.");
	}
	
	@PreDestroy
	public void destroyBean() throws Exception{
		System.out.println("IOTDevice bean has been destroyed. Inside the destroyBean() method.");
	}



}
