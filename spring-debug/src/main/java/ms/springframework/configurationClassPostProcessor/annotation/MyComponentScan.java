package ms.springframework.configurationClassPostProcessor.annotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

@Configuration
@ComponentScan("ms.springframework.tx.annotation.config")
public class MyComponentScan {

    @ComponentScan("ms.springframework.tx.annotation.config")
    @Configuration
    @Order(90)
    class InnerClass{

    }

}
