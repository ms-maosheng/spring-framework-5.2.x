package ms.springframework.config.populateBean.autowired;

import java.lang.annotation.*;

/**
 * 自定义注解实现Autowired
 */
@Target({ElementType.CONSTRUCTOR, ElementType.METHOD, ElementType.PARAMETER, ElementType.FIELD, ElementType.ANNOTATION_TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface CustomAutowired {
	
	boolean required() default true;

}
