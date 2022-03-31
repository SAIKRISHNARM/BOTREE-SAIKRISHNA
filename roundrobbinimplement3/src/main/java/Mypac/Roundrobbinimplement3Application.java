package Mypac;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.ribbon.RibbonAutoConfiguration;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.netflix.ribbon.apache.HttpClientRibbonConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.ribbon.Ribbon;
@RestController
@SpringBootApplication(scanBasePackages = {"com.netflix.config.iclientconfig"})
@RibbonClient(name="roundservice",configuration=impleclass.class )
public class Roundrobbinimplement3Application {

	public static void main(String[] args) {
		SpringApplication.run(Roundrobbinimplement3Application.class, args);
	}
	@Autowired
	private RestTemplate restTemplate;
	 
	@GetMapping("/load")
	public String callservice() {
		return restTemplate.getForObject("http://roundservice/port",String.class);
	}
	@Bean
	@LoadBalanced
	public RestTemplate createrest()
	{
		 RestTemplate restTemplate = new RestTemplate();
		 return restTemplate;
	
	}

}
