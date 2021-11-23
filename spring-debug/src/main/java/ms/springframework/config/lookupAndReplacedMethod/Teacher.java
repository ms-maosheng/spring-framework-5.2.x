package ms.springframework.config.lookupAndReplacedMethod;

/**
 * @description:
 * @author: zukimao
 * @time: 2021/11/22 18:56
 */
public class Teacher extends User{
	@Override
	public void showMe(){
		System.out.println("i am teacher");
	}
}
