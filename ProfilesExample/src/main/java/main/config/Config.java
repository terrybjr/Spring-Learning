package main.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "main")
@PropertySource("classpath:application.properties")
public class Config {

	@Bean
	public void standardBean() {
		System.out.println("Standard bean created.");
	}

	@Bean
	@Profile("dev")
	public void developmentBean() {
		System.out.println("Development bean created.");
	}

	@Bean
	@Profile("prod")
	public void productionBean() {
		System.out.println("Production bean created.");
	}

}
