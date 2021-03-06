package ro.andreimihaescu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class RoleMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RoleMicroserviceApplication.class, args);
	}
}
