package ms.springframework.config;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

/**
 * @description:
 * @author: zukimao
 * @time: 2021/9/1 14:56
 */
public class MyAddBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
	
	@Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        System.out.println("进入MyBeanFactoryPostProcessor--postProcessBeanFactory()");
    }
}
