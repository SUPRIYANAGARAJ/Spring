package com.skillsoft;

import org.springframework.context.annotation.Configuration;

@Configuration
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

}
