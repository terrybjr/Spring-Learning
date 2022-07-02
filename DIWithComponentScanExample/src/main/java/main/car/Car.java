package main.car;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import main.enginge.Engine;

@Component
public class Car {

	public Car() {

	}

	@Autowired
	private Engine engine;

	public Engine getEngine() {
		return this.engine;
	}

	public void setEngine(final Engine pEngine) {
		this.engine = pEngine;
	}

	public String showEngineHP() {
		return "hp: " + this.engine.getHp();
	}

}
