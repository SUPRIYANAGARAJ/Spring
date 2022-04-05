package com.skillsoft;
import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "com.skillsoft")
public class IOTDeviceBeanConfig {
	
	@Bean
	public IOTDevice IOTDeviceBean() {
		return new IOTDevice();
	}

}
