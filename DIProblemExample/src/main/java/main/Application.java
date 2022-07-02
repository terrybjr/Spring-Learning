package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import main.car.Car;
import main.car.OffroadCar;
import main.car.SportCar;
import main.config.Config;

public class Application {

	public static void main(final String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);

		Car sportCar = ctx.getBean(SportCar.class);
		Car offroadCar = ctx.getBean(OffroadCar.class);
		System.out.println("sportCar engine: " + sportCar.showEngineHP());
		System.out.println("offroadCar engine: " + offroadCar.showEngineHP());
		((AnnotationConfigApplicationContext) ctx).close();

	}

}
