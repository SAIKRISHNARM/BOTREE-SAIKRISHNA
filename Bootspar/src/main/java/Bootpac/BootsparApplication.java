package Bootpac;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class BootsparApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext con= SpringApplication.run(BootsparApplication.class, args);
		BookShop bok = con.getBean(BookShop.class);
		System.out.println(bok);
	}

}
