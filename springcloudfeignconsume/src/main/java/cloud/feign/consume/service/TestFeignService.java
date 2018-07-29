package cloud.feign.consume.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "provide-demo-1")
public interface TestFeignService {

	@GetMapping(value = "/test/hw")
	public String getFeignTest();

}
