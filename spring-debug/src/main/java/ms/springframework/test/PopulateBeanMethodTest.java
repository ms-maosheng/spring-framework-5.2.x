package ms.springframework.test;

import ms.springframework.bean.Persion;
import ms.springframework.config.MyClassPathXmlApplicationContext;
import ms.springframework.config.populateBean.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * bean的属性填充测试 AbstractAutowireCapableBeanFactory.populateBean()
 */
public class PopulateBeanMethodTest {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext = new MyClassPathXmlApplicationContext("classpath:populateBean.xml");
		Person person1 = (Person)applicationContext.getBean("person1");
		Person person2 = (Person)applicationContext.getBean("person2");
		applicationContext.close();

	}

}
