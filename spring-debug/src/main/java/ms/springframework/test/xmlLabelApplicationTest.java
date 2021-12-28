package ms.springframework.test;

import ms.springframework.config.MyClassPathXmlApplicationContext;
import ms.springframework.config.supplier.User;
import org.springframework.context.ApplicationContext;

/**
 * @description:
 * @author: zukimao
 * @time: 2021/12/28 12:18
 */
public class xmlLabelApplicationTest {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new MyClassPathXmlApplicationContext("classpath:xmlLabelApplication.xml");
		User user = (User) applicationContext.getBean("user2");
		System.out.println(user.getUserName());
	}
}
