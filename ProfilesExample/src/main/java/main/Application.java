package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import main.config.Config;

public class Application {

	public static void main(final String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);

		((AnnotationConfigApplicationContext) ctx).close();

	}

}
