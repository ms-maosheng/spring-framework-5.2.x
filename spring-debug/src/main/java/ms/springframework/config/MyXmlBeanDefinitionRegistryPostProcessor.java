package ms.springframework.config;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.core.PriorityOrdered;

/**
 * @description:
 * @author: zukimao
 * @time: 2021/9/1 15:07
 */
public class MyXmlBeanDefinitionRegistryPostProcessor implements BeanDefinitionRegistryPostProcessor, PriorityOrdered {

	@Override
	public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
        registry.registerBeanDefinition("addBDRPP", BeanDefinitionBuilder.genericBeanDefinition(MyAddBeanDefinitionRegistryPostProcessor.class).getBeanDefinition());
        System.out.println("进入MyXmlBeanDefinitionRegistryPostProcessor--postProcessBeanDefinitionRegistry()");
    }
    
	@Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        System.out.println("进入MyXmlBeanDefinitionRegistryPostProcessor--postProcessBeanFactory()");
    }

	@Override
    public int getOrder() {
        return 1;
    }
}
