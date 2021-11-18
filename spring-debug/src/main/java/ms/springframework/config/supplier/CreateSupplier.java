package ms.springframework.config.supplier;

/**
 * 这个类作为supplier的回调用于创建User对象
 */
public class CreateSupplier {

	public static User createUser(){
		return new User("张三");
	}
}
