package main.car;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import main.engine.Engine;

@Component
public class OffroadCar implements Car {

	public OffroadCar() {
		super();
	}

	@Autowired
	@Qualifier("offroadEngine")
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
