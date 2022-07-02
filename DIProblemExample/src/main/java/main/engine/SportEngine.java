package main.engine;

import org.springframework.stereotype.Component;

@Component
public class SportEngine implements Engine {
	private final int hp = 200;

	@Override
	public int getHP() {
		return this.hp;
	}
}
