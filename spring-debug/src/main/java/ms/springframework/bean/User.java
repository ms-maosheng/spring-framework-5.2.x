package ms.springframework.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class User {

	private Integer id;
	private String name;

	@Autowired
	private Persion persion;
	
	@PostConstruct
	public void init(){
		System.out.println("执行init方法。。。");
	}
	@PreDestroy
	public void PreDestroy(){
		System.out.println("执行PreDestroy方法。。。");
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
