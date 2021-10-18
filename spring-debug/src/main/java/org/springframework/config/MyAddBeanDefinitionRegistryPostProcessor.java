package org.springframework.config;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;

/**
 * @description:
 * @author: zukimao
 * @time: 2021/10/18 14:29
 */
public class MyAddBeanDefinitionRegistryPostProcessor implements BeanDefinitionRegistryPostProcessor {
	
	@Override
	public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
		System.out.println("进入MyAddBeanDefinitionRegistryPostProcessor--postProcessBeanDefinitionRegistry()");
	}
	
	
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println("进入MyAddBeanDefinitionRegistryPostProcessor--postProcessBeanFactory()");
	}
}
