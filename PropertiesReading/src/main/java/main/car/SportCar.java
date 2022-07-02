package main.car;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import main.engine.Engine;

@Component
public class SportCar implements Car {

	@Value("${car.color}")
	private String color;

	@Autowired
	@Qualifier("sportEngine")
	private Engine engine;

	public SportCar() {

	}

	public Engine getEngine() {
		return this.engine;
	}

	public void setEngine(final Engine pEngine) {
		this.engine = pEngine;
	}

	public String getColor() {
		return this.color;
	}

	public void setColor(final String pColor) {
		this.color = pColor;
	}

	@Override
	public String showEngineHP() {
		return "hp: " + this.engine.getHP();
	}

	@Override
	public void showInfo() {
		System.out.println("color: " + this.color);

	}

}
