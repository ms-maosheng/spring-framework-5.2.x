package ms.springframework.config.lookupAndReplacedMethod;

import org.springframework.beans.factory.support.MethodReplacer;

import java.lang.reflect.Method;

/**
 * @description:
 * @author: zukimao
 * @time: 2021/11/23 15:51
 */
public class MethodReplacedTest implements MethodReplacer {

	@Override
	public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
		System.out.println("通过replaced-method替换了ChangeMethodTest.changeMe()");
		return null;
	}
}
