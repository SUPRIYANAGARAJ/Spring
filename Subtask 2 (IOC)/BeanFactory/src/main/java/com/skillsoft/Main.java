package com.skillsoft;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ApplicationContext appContext = new ClassPathXmlApplicationContext( "applicationContext.xml");
		
		//BeanFactory
         Resource res = new ClassPathResource("applicationContext.xml");
		
		BeanDefinitionRegistry beanFactory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader beanReader = new XmlBeanDefinitionReader(beanFactory);
		beanReader.loadBeanDefinitions(res);
		
		IOTDevice myDeviceBean = (IOTDevice) ((DefaultListableBeanFactory) beanFactory).getBean("myIOTDeviceBean");
		

	}

}
