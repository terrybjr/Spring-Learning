package main.car;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import main.engine.Engine;

@Component
public class SportCar implements Car {

	public SportCar() {

	}

	@Autowired
	@Qualifier("sportEngine")
	private Engine engine;

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

}
