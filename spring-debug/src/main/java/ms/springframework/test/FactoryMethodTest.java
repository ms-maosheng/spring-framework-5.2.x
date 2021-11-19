package ms.springframework.test;

import ms.springframework.bean.Persion;
import ms.springframework.config.MyClassPathXmlApplicationContext;
import ms.springframework.config.factoryMethod.Person;
import org.springframework.context.ApplicationContext;

public class FactoryMethodTest {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new MyClassPathXmlApplicationContext("classpath:factoryMethod.xml");
		// 通过静态工厂创建实例
		Person person1 = applicationContext.getBean(Person.class);
		System.out.println(person1.getName());
		// 通过实例工厂创建实例
		Person person2 = applicationContext.getBean(Person.class);
		System.out.println(person2.getName());
	}
}
