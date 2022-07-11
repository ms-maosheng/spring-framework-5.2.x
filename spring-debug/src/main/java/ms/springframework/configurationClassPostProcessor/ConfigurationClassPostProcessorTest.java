package ms.springframework.configurationClassPostProcessor;

import ms.springframework.tx.xml.service.BookService;
import org.springframework.cglib.core.DebuggingClassWriter;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConfigurationClassPostProcessorTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("configurationClassPostProcessor.xml");
	}
}
