package ms.springframework.test;

import ms.springframework.bean.cycle.A;
import ms.springframework.bean.cycle.B;
import ms.springframework.config.MyClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;

/**
 * 循环依赖测试类
 */
public class CycleApplicationContextText {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new MyClassPathXmlApplicationContext("classpath:cycleApplicationContextText.xml");
		A a = (A) applicationContext.getBean("a");
		System.out.println(a.getB());
		B b = (B) applicationContext.getBean("b");
		System.out.println(b.getA());
	}

}
 
