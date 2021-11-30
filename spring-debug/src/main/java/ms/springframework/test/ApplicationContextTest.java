package ms.springframework.test;

import ms.springframework.bean.ConstructorPerson;
import ms.springframework.bean.User;
import ms.springframework.config.MyClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;

public class ApplicationContextTest {

	public static void main(String[] args) {

		// 多例对象缓存构造方法测试
		ApplicationContext applicationContext = new MyClassPathXmlApplicationContext("classpath:applicationContext.xml");
		User user = (User) applicationContext.getBean("user");
		System.out.println(user.getId());
	}
}
