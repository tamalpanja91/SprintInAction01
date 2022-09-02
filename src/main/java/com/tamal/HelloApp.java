package com.tamal;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloApp {

	public static void main(String[] args) {
		BeanFactory factory  = new ClassPathXmlApplicationContext(
				"applicationContext.xml");

		GreetingService greetingService =
				(GreetingService) factory.getBean("greetingService");
				greetingService.sayGreeting();

	}

}
