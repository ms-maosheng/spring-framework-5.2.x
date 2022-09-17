package ms.springframework.tx.xml;

import ms.springframework.bean.User;
import ms.springframework.tx.xml.service.BookService;
import org.springframework.cglib.core.DebuggingClassWriter;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import java.lang.reflect.Field;
import java.util.Properties;

public class TxXmlTest {
	public static void main(String[] args) throws Exception {
		saveGeneratedCGlibProxyFiles(System.getProperty("user.dir")+"/com/aop/proxy");
		ApplicationContext context = new ClassPathXmlApplicationContext("tx.xml");
		BookService bookService = context.getBean("bookService", BookService.class);
		Component component = bookService.getClass().getAnnotation(Component.class);
		bookService.checkout("zhangsan",1);
	}

	public static void saveGeneratedCGlibProxyFiles(String dir) throws Exception {
		Field field = System.class.getDeclaredField("props");
		field.setAccessible(true);
		Properties props = (Properties) field.get(null);
		System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, dir);//dir为保存文件路径
		props.put("net.sf.cglib.core.DebuggingClassWriter.traceEnabled", "true");
	}
}
