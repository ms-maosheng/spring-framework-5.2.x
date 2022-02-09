package ms.springframework.proxy.jdk;

public class JdkProxyTest {
    public static void main(String[] args) {
    	// 生成代理对象class文件到本地
		System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        Calculator proxy = CalculatorProxy.getProxy(new MyCalculator());
        proxy.add(1,1);
        System.out.println(proxy.getClass());
    }
}