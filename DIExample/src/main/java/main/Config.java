package main;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class Config {

	@Bean
	public Car getCar() {
		Car car = new Car(this.getEngine());
		return car;
	}

	@Bean
	public Engine getEngine() {
		return new Engine();
	}
}
