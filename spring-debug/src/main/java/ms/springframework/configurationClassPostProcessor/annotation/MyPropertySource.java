package ms.springframework.configurationClassPostProcessor.annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource({"classpath:dbconfig.properties"})
public class MyPropertySource {
	@Value("${jdbc.driverClassName}")
	private String driverClassname;
	@Value("${jdbc.url}")
	private String url;
	@Value("${jdbc.username}")
	private String username;
	@Value("${jdbc.password}")
	private String password;

}
