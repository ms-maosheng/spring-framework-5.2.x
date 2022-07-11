package ms.springframework.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration(proxyBeanMethods = false)
public class FullTest {

	@Bean
	public User user(){
		return new User();
	}
}
