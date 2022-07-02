package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import main.car.Car;
import main.config.Config;

public class Application {

	public static void main(final String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);

		Car car = ctx.getBean(Car.class);
		System.out.println("car engine: " + car.showEngineHP());
		((AnnotationConfigApplicationContext) ctx).close();

	}

}
