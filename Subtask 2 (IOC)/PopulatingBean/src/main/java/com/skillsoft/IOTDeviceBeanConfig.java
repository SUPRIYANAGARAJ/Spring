package com.skillsoft;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class IOTDeviceBeanConfig {
	
	@Bean(name = "FridgeBean", initMethod="initBean", destroyMethod="destroyBean")
	public IOTDevice FirstIOTDeviceBean() {
		
		IOTDevice device = new IOTDevice();
		device.setDevice("Frifge");
		device.setDescription("Temperature gauge for the freezer");
		
		return device;
	}
	
	@Bean(name = "DishwasherBean", initMethod="initBean", destroyMethod="destroyBean")
	public IOTDevice SecondIOTDeviceBean() {
		
		IOTDevice device = new IOTDevice();
		device.setDevice("Dishwasher");
		device.setDescription("Monitors water flow");
		
		return device;
	}

}
