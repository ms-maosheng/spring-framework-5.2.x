package ms.springframework.test;

import ms.springframework.bean.ConstructorPersion;
import ms.springframework.bean.Persion;
import ms.springframework.config.MyClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;

public class ApplicationContextTest {

	public static void main(String[] args) {

		// 多例对象缓存构造方法测试
		ApplicationContext applicationContext = new MyClassPathXmlApplicationContext("classpath:applicationContext.xml");
		ConstructorPersion bean1 = applicationContext.getBean(ConstructorPersion.class);
		ConstructorPersion bean2 = applicationContext.getBean(ConstructorPersion.class);
	}
}
