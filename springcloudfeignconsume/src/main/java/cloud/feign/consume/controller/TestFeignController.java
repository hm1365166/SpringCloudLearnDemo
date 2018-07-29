package cloud.feign.consume.controller;

import cloud.feign.consume.service.TestFeignHystrixService;
import cloud.feign.consume.service.TestFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/test")
public class TestFeignController {

	@Autowired
	private TestFeignService testFeignService;

	@GetMapping(value = "/hw")
	@ResponseBody
	public String getFeignTest() {
		return testFeignService.getFeignTest();
	}

}
