package ms.springframework.config.populateBean.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class AutowiredController {

	@Autowired
	private AutowiredService autowiredService;
}
