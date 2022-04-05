package com.skillsoft;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;*/

/*import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;*/

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//normal java object construction
		/*IOTDevice myConstructedObject = new IOTDevice();
		
		System.out.println("IOTDevice initialized with a construtor: " + myConstructedObject);
		
		//IOC container ---> BeanFactory
		System.out.println("BeanFactory container :");
		
		Resource res = new ClassPathResource("applicationContext.xml");
		
		BeanFactory beanfactory = new XmlBeanFactory(res);
		
		IOTDevice myDeviceBean = (IOTDevice) beanfactory.getBean( "myIOTDeviceBean");
		
		System.out.println("XMLBeanFactory(Deprecated) -- "+myDeviceBean);*/
		
		/*Resource res = new ClassPathResource("applicationContext.xml");
		
		BeanDefinitionRegistry beanFactory = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader beanReader = new XmlBeanDefinitionReader(beanFactory);
		beanReader.loadBeanDefinitions(res);
		
		IOTDevice myDeviceBean = (IOTDevice) ((DefaultListableBeanFactory) beanFactory).getBean("myIOTDeviceBean");
		
		System.out.println("Bean from BeanDefinitionRegistry -- " +myDeviceBean);*/
		
		//Loading beans with an application context
		
		/*ApplicationContext appContext = new ClassPathXmlApplicationContext( "applicationContext.xml");
		
		IOTDevice myDeviceBean = (IOTDevice) appContext.getBean("myIOTDeviceBean");
		
		System.out.println("Bean from ApplicationContext:\n" + myDeviceBean);*/
		
		//comparing application context with beanfactory
		
       /* ApplicationContext appContext = new ClassPathXmlApplicationContext( "applicationContext.xml");
        
        BeanFactory beanFactory = (BeanFactory) appContext;
		
		IOTDevice myDeviceBean = (IOTDevice) appContext.getBean("myIOTDeviceBean");
		
		System.out.println("Bean from ApplicationContext:\n" + myDeviceBean);*/
		
		//Diff ways in which beans can be loaded and also configured in an application
		
        ApplicationContext appContext = new ClassPathXmlApplicationContext( "applicationContext.xml");
        
		
		IOTDevice myDeviceBean = (IOTDevice) appContext.getBean("myIOTDeviceBean");
		
		myDeviceBean.setDevice("Fridge");
		myDeviceBean.setDescription("Temperature gauge for the freezer");
		
		
		System.out.println("Bean from ApplicationContext:\n" + myDeviceBean);
		
		
		
		
		
		
		
		
		

	}

}
