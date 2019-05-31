package BaseBallGame_TDD;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/*
 * TDD를 위한 JUnit 테스트 클래스
 * */
class GameTest {

	// 컴퓨터가 서로 다른 임의 수(1~9) 3개를 만드는 것을 테스트
	@Test
	void test() {
		Game game = new Game();
		/*
		 * int [] array = game.GetArray(); for(int i=0; i<array.length; i++) {
		 * System.out.println(array[i]); }
		 */
	}

	// 유저가 입력하고자 하는 3개의 서로 다른 수(1~9)가 나오는 것을 테스트
	@Test
	void test_User_EnterNumber() {
		Game game = new Game(1, 2, 3);
		int[] array = game.GetUserArray();
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

	// 스트라이크,볼 판정 테스트
	@Test
	void test_StrikeAndBall() {
		Game game = new Game(1, 2, 3);
		int[] array = game.GetUserArray();
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

}
