package cloud.feign.consume.service.TestFeignHystrixServiceImpl;

import cloud.feign.consume.service.TestFeignHystrixService;
import org.springframework.stereotype.Component;

@Component
public class TestFeignHystrixHystrixServiceImpl implements TestFeignHystrixService {

	@Override
	public String getFeignTest() {
		return "Feign Hystrix By Call !";
	}

}
