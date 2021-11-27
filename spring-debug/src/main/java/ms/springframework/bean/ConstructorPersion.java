package ms.springframework.bean;

import org.springframework.beans.factory.annotation.Autowired;

public class ConstructorPersion {
	private Integer id;
	private String name;
	private String address;

	public ConstructorPersion() {
	}

	@Autowired
	public ConstructorPersion(Integer id, String name) {
		this.id = id;
		this.name = name;
	}

	public ConstructorPersion(String name, String address) {
		this.name = name;
		this.name = address;
	}

	public ConstructorPersion(Integer id, String name, String address) {
		this.id = id;
		this.name = name;
		this.address = address;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}
