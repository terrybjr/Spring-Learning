package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

	public static void main(final String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);

		Car car1 = ctx.getBean(Car.class);
		Car car2 = ctx.getBean(Car.class);

		System.out.println("Car1: " + car1);
		System.out.println("Car2: " + car2);
		((AnnotationConfigApplicationContext) ctx).close();

	}

}
