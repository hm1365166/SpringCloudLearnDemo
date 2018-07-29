package cloud.consume.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

@Controller
@RequestMapping("/test")
public class TestController {

	@Autowired
	@Qualifier(value = "remoteRestTemplate")
	private RestTemplate rest;

	@GetMapping("/hw")
	@ResponseBody
	public String getUser() {
		String forObject = rest.getForObject("http://provide-demo-1/test/hw/", String.class);
		return forObject;
	}

}