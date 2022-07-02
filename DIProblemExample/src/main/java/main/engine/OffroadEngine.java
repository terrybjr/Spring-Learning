package main.engine;

import org.springframework.stereotype.Component;

@Component
public class OffroadEngine implements Engine {
	private final int hp = 160;

	@Override
	public int getHP() {
		return this.hp;
	}
}

