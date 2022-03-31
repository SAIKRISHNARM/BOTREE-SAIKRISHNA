package Mypac;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class RoundserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RoundserviceApplication.class, args);
	}
	@RestController
	@SpringBootApplication
	public class RoundrobbinserviceApplication {

		@Value("${server.port}")
		private String port;
		@GetMapping("/port")
		public String portvalue() {
			return "port number "+port;
			
		}

	}


}
