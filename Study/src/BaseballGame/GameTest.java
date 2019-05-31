package BaseballGame;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GameTest {

	@Test
	void testCountStrike() {
		int[] array1 = {1,2,3};
		int[] array2 = {1,2,4};
		
		MainGame mainGame = new MainGame();
		assertEquals(2,mainGame.countStrike(array1, array2));
	}

	@Test
	void testCountBall() {
		int[] array1 = {1,2,3};
		int[] array2 = {4,1,3};
		
		MainGame mainGame = new MainGame();
		assertEquals(1,mainGame.countBall(array1, array2));
	}

}
