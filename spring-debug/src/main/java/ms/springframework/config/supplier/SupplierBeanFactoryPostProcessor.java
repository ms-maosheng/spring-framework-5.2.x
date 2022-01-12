package ms.springframework.config.supplier;

import ms.springframework.bean.Persion;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.GenericBeanDefinition;

public class SupplierBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		// 获取User的BeanFactoryPostProcessor
		BeanDefinition beanDefinition = beanFactory.getBeanDefinition("user");
		GenericBeanDefinition genericBeanDefinition = (GenericBeanDefinition)beanDefinition;
		// 给user的BeanDefinition指定supplier创建实例
		genericBeanDefinition.setInstanceSupplier(CreateSupplier::createUser);
	}
}
