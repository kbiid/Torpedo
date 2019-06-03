package BaseBallGame_TDD;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/*
 * TDD기반으로 JUnit 테스트 위한 클래스
 * */
class GameTest {

	// 초기 테스트 -> 게임 클래스가 있는가? 3개의 숫자를 만들어 내는가?
	@Test
	void test() {
		Game game = new Game();
		/*
		 * int [] array = game.GetArray(); for(int i=0; i<array.length; i++) {
		 * System.out.println(array[i]); }
		 */
	}

	// 유저가 3개의 숫자를 입력했을 때 정보가 올바르게 저장되었는지 테스트
	@Test
	void test_User_EnterNumber() {
		Game game = new Game(1, 2, 3);
		int[] array = game.getUserArray();
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

	// 스트라이크, 볼 판정 테스트
	@Test
	void test_StrikeAndBall() {
		Game game = new Game(1, 2, 3);
		int[] array = game.getUserArray();
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

}
