package ms.springframework.test;

import ms.springframework.config.MyClassPathXmlApplicationContext;
import ms.springframework.config.lookupAndReplacedMethod.ChangeMethodTest;
import ms.springframework.config.lookupAndReplacedMethod.GetBeanTest;
import org.springframework.context.ApplicationContext;

/**
 * @description:
 * @author: zukimao
 * @time: 2021/11/22 18:55
 */
public class LookupAndReplacedMethodTest {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new MyClassPathXmlApplicationContext("classpath:lookupAndReplacedMethod.xml");
		ChangeMethodTest changeMethodTest = applicationContext.getBean(ChangeMethodTest.class);
		changeMethodTest.changeMe();
	}
}
