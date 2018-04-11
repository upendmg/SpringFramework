package com.accenture.adf.main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.accenture.adf.entity.Circle;
import com.accenture.adf.entity.Shape;
import com.accenture.adf.entity.Triangle;

public class ClientProg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Shape shape=new Triangle();
		//Shape shape=new Circle();
		Resource resource=new ClassPathResource("applicationContext.xml");
		@SuppressWarnings("deprecation")
		BeanFactory factory = new XmlBeanFactory(resource);
		//Shape shape=(Shape) factory.getBean("triangle");
		Shape shape=(Shape) factory.getBean("circle");
		shape.draw();
		shape.erase();

	}

}
