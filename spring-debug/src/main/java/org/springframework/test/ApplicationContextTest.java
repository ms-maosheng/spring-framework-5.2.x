package org.springframework.test;

import org.springframework.bean.Persion;
import org.springframework.config.MyClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;

public class ApplicationContextTest {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new MyClassPathXmlApplicationContext("classpath:applicationContext.xml");
		Persion persion = applicationContext.getBean(Persion.class);
		System.out.println(persion.getName());
	}
}
