package ms.springframework.config.factoryMethod;

/**
 * 静态工厂
 */
public class PersonStaticFactory {
	public static Person getPerson(String name){
		Person person = new Person();
		person.setId("1");
		person.setName(name);
		return person;
	}
}
