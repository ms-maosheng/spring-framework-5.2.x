package ms.springframework.config.lookupAndReplacedMethod;

/**
 * @description: lookup-method 原理
 * @author: zukimao
 * @time: 2021/11/22 18:57
 * 获取注入是一种特殊的方法注入，它是把一个方法声明为返回某种类型的bean
 * 但实际要返回的bean是在配置文件中通过lookup-method标签配置的
 * 这种方式可以设计在有些可插拔的功能上，解除程序依赖
 * #BeanDefinitionParserDelegate.parseLookupOverrideSubElements(Element beanEle, MethodOverrides overrides)
 */
public abstract class GetBeanTest {
	
	/**
	 * 定义一个抽象的getBean方法
	 */
	public abstract User getBean();
	
	public void showMe(){
		// 虽然这里的getBean()没有实现，但是在xml配置文件中制定了lookup-method，getBean实际返回了Teacher对象
		this.getBean().showMe();
	}
}
