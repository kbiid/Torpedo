package baseballgame.tdd;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/*
 * TDD기반으로 JUnit 테스트 위한 클래스
 * */
class GameTest {

	// 초기 테스트 -> 게임 클래스가 있는가? 3개의 숫자를 만들어 내는가?
	@Test
	void test() {
		Game game = new Game();
		int[] array = game.getRandomNumberArray();

		Assertions.assertEquals(3, array.length);
	}

	// 유저가 3개의 숫자를 입력했을 때 정보가 올바르게 저장되었는지 테스트
	@Test
	void test_User_EnterNumber() {
		int[] expectNumberArray = { 1, 2, 3 };
		Game game = new Game(expectNumberArray);
		int[] array = game.getUserArray();

		Assert.assertArrayEquals(expectNumberArray, array);
	}

	// 스트라이크 판정 테스트
	@Test
	void test_StrikeCount() {
		int[] problemNumberArray = { 4, 2, 3 };
		int[] expectNumberArray = { 1, 2, 3 };
		Game game = new Game(expectNumberArray);
		game.setRandomNumberArray(problemNumberArray);
		game.setStrikeCount();

		Assertions.assertEquals(2, game.getStrikeCount());
	}

	// 볼 판정 테스트
	@Test
	void test_BallCount() {
		int[] problemNumberArray = { 4, 2, 3 };
		int[] expectNumberArray = { 2, 5, 1 };
		Game game = new Game(expectNumberArray);
		game.setRandomNumberArray(problemNumberArray);
		game.setBallCount();

		Assertions.assertEquals(1, game.getBallCount());
	}

	// 스트라이크 볼 카운트를 출력
	@Test
	void test_PrintCount() {
		int[] problemNumberArray = { 4, 2, 3 };
		int[] expectNumberArray = { 2, 5, 3 };
		Game game = new Game(expectNumberArray);
		game.setRandomNumberArray(problemNumberArray);
		game.setStrikeCount();
		game.setBallCount();

		Assertions.assertEquals("1S 1B", game.printBaseballCount());
	}

	// 3S가 아닐경우 false를 리턴
	@Test
	void test_Is3Strike() {
		int[] problemNumberArray = { 2, 4, 3 };
		int[] expectNumberArray = { 2, 5, 3 };
		Game game = new Game(expectNumberArray);
		game.setRandomNumberArray(problemNumberArray);
		game.setStrikeCount();
		game.setBallCount();

		Assertions.assertEquals(false, game.isThreeStrike());
	}

}
