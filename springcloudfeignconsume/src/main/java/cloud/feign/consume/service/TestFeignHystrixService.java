package cloud.feign.consume.service;

import cloud.feign.consume.service.TestFeignHystrixServiceImpl.TestFeignHystrixHystrixServiceImpl;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(qualifier = "feignHystrixService",value = "provide-demo-1", fallback = TestFeignHystrixHystrixServiceImpl.class)
public interface TestFeignHystrixService {

	@GetMapping(value = "/test/hw")
	public String getFeignTest();

}
