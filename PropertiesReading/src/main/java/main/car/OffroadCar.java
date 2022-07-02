package main.car;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import main.engine.Engine;

@Component
public class OffroadCar implements Car {

	@Autowired
	@Qualifier("offroadEngine")
	private Engine engine;

	@Autowired
	Environment environment;

	public OffroadCar() {
		super();
	}

	public Engine getEngine() {
		return this.engine;
	}

	public void setEngine(final Engine pEngine) {
		this.engine = pEngine;
	}

	@Override
	public String showEngineHP() {
		return "hp: " + this.engine.getHP();
	}

	@Override
	public void showInfo() {
		System.out.println("color: " + this.environment.getProperty("car.color"));

	}
}
