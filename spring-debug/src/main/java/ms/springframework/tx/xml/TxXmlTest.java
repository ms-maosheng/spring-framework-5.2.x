package ms.springframework.tx.xml;

import ms.springframework.bean.User;
import ms.springframework.tx.xml.service.BookService;
import org.springframework.cglib.core.DebuggingClassWriter;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TxXmlTest {
	public static void main(String[] args) {
		System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY,"d:\\code");
		ApplicationContext context = new ClassPathXmlApplicationContext("tx.xml");
		BookService bookService = context.getBean("bookService", BookService.class);
		bookService.checkout("zhangsan",1);
	}
}
