package ms.springframework.test;

import ms.springframework.config.MyClassPathXmlApplicationContext;
import ms.springframework.config.supplier.User;
import org.springframework.context.ApplicationContext;

public class SupplierApplicationContextTest {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new MyClassPathXmlApplicationContext("classpath:supplierApplicationContext.xml");
		User user = applicationContext.getBean(User.class);
		System.out.println(user.getUserName());
	}
}
