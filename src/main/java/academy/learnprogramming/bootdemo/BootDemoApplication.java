package academy.learnprogramming.bootdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.UrlBasedViewResolver;

@SpringBootApplication
public class BootDemoApplication {


	public static void main(String[] args) {
		SpringApplication.run(BootDemoApplication.class, args);
	}

}
