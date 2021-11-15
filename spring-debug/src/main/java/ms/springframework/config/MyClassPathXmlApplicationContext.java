package ms.springframework.config;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyClassPathXmlApplicationContext extends ClassPathXmlApplicationContext {

	public MyClassPathXmlApplicationContext(String configLocation) throws BeansException {
		super(configLocation);
	}

	/**
	 * @description: 构建工厂的obtainFreshBeanFactory()——refreshBeanFactory()
	 * @param: [beanFactory]
	 * @return: void
	 * @auther: zukimao
	 * @date: 2021/10/18 14:43
	 */
	@Override
	protected void customizeBeanFactory(DefaultListableBeanFactory beanFactory) {
		System.out.println("进入MyClassPathXmlApplicationContext().customizeBeanFactory()，自定义beanFactory");
		// 个人自定义
		super.addBeanFactoryPostProcessor(new MyAddBeanFactoryPostProcessor());
		super.addBeanFactoryPostProcessor(new MyAddBeanDefinitionRegistryPostProcessor());
		// 执行父类方法
		super.customizeBeanFactory(beanFactory);
	}
}
