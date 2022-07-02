package main;

public class Car {

	// without spring DI
	//	public Car() {
	//		this.engine = new Engine();
	//	}
	// with spring DI
	public Car(final Engine engine) {
		this.engine = engine;
	}

	public Car() {

	}

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
