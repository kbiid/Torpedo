package baseballgame.normal;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GameTest {

	//스트라이크 올바르게 판단하는지 테스트
	@Test
	void testCountStrike() {
		int[] array1 = {1,2,3};
		int[] array2 = {1,2,4};
		
		MainGame mainGame = new MainGame();
		assertEquals(2,mainGame.countStrike(array1, array2));
	}

	//볼 올바르게 판단하는지 테스트
	@Test
	void testCountBall() {
		int[] array1 = {1,2,3};
		int[] array2 = {4,1,3};
		
		MainGame mainGame = new MainGame();
		assertEquals(1,mainGame.countBall(array1, array2));
	}

}
