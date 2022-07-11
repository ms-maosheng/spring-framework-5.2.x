package ms.springframework.tx.annotation;

import ms.springframework.tx.annotation.config.TransactionConfig;
import ms.springframework.tx.annotation.service.BookService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TxAnnotationTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
		applicationContext.register(TransactionConfig.class);
		applicationContext.refresh();
		BookService bean = applicationContext.getBean(BookService.class);
		bean.checkout("zhangsan",1);
	}
}
