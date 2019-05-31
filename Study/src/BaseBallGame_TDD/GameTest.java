package BaseBallGame_TDD;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/*
 * TDD�� ���� JUnit �׽�Ʈ Ŭ����
 * */
class GameTest {

	// ��ǻ�Ͱ� ���� �ٸ� ���� ��(1~9) 3���� ����� ���� �׽�Ʈ
	@Test
	void test() {
		Game game = new Game();
		/*
		 * int [] array = game.GetArray(); for(int i=0; i<array.length; i++) {
		 * System.out.println(array[i]); }
		 */
	}

	// ������ �Է��ϰ��� �ϴ� 3���� ���� �ٸ� ��(1~9)�� ������ ���� �׽�Ʈ
	@Test
	void test_User_EnterNumber() {
		Game game = new Game(1, 2, 3);
		int[] array = game.GetUserArray();
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

	// ��Ʈ����ũ,�� ���� �׽�Ʈ
	@Test
	void test_StrikeAndBall() {
		Game game = new Game(1, 2, 3);
		int[] array = game.GetUserArray();
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

}
