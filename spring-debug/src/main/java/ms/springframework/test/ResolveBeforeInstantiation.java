package ms.springframework.test;

import ms.springframework.config.instantiation.BeforeInstantiation;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ResolveBeforeInstantiation {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("resolveBeforeInstantiation.xml");
		BeforeInstantiation beforeInstantiation = applicationContext.getBean(BeforeInstantiation.class);
		beforeInstantiation.doSomeThing();
	}
}
