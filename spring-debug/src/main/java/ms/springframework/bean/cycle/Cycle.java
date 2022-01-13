package ms.springframework.bean.cycle;

import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @description:
 * @author: zukimao
 * @time: 2022/1/13 10:09
 */
public class Cycle {

	public void cycleBefore(){
		System.out.println("cycleBefore");
	}

	public void cycleAfter(){
		System.out.println("cycleAfter");
	}

}
