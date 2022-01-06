package ms.springframework.config.populateBean.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AutowiredService {

	@Autowired
	private AutowiredDao autowiredDao;
}
