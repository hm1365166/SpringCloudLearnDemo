package cloud.server_01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MircProvideApplication_01 {


	public static void main(String[] args) {
		SpringApplication.run(MircProvideApplication_01.class, args);
	}

}
