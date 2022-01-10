package ms.springframework.bean.cycle;

import org.springframework.beans.factory.annotation.Autowired;

public class A {

	@Autowired
	private B b;

	public B getB() {
		return b;
	}

	public void setB(B b) {
		this.b = b;
	}
}
