package tdd;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GameTest {

	Game game;
	
	@BeforeEach
	void setUp() throws Exception {
		game = new Game();
	}

	@Test
	void test_aucune_quilles() {
		for (int i = 0; i < 20; i++) {
			game.roll(0);

		}
		assertEquals(0, game.score());
	}
	
	@Test
	void test_20roll1_quilles() {
		for (int i = 0; i < 20; i++) {
			game.roll(1);

		}
		assertEquals(20, game.score());
	}
	
	@Test
	void test_10roll1and10roll2_quilles() {
		for (int i = 0; i < 10; i++) {
			game.roll(1);

		}
		for (int i = 0; i < 10; i++) {
			game.roll(2);

		}
		assertEquals(30, game.score());
	}

}

