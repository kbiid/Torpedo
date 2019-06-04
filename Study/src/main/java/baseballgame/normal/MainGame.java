package baseballgame.normal;

import java.util.Scanner;

// 게임의 주된 로직이 담겨 있는 클래스
public class MainGame {

	// 게임 시작
	protected void play() {

		int[] randomNumArray = new int[3];
		int[] playerNumArray = new int[3];

		int strike, ball, answerCount;

		Scanner scanner = new Scanner(System.in);

		setArrayRandomNum(randomNumArray);

		printString("야구게임을 시작합니다!!");
		printString("서로 다른 3개의 숫자를 입력하세요.");

		answerCount = 0;

		while (true) {
			strike = 0;
			ball = 0;

			enterNumber(playerNumArray, scanner);

			strike = countStrike(randomNumArray, playerNumArray);
			ball = countBall(randomNumArray, playerNumArray);

			if (strike == 3) {
				printString(answerCount + "번만에 맞췄습니다!");
				scanner.close();
				break;
			} else {
				printString(strike + "S" + " " + ball + "B 입니다.");
				answerCount++;
			}
		}

	}

	private void printString(String str) {
		System.out.println(str);
	}

	// 숫자 입력과 예외 처리에 관한 메소드.
	private void enterNumber(int[] array, Scanner scanner) {
		for (int i = 0; i < array.length; i++) {
			while (!isNumber(scanner)) {
				printString("숫자가 입력되지 않았습니다.");
				scanner.nextLine();
			}
			array[i] = scanner.nextInt();
		}
	}

	// 숫자를 제대로 입력했는지에 대해서 true,false를 리턴하는 메소드
	private boolean isNumber(Scanner scanner) {
		if (!scanner.hasNextInt())
			return false;
		else
			return true;
	}

	// 배열의 크기만큼 랜덤으로 숫자를 생성해주는 메소드
	private void setArrayRandomNum(int[] array) {

		Random random = new Random(9);

		for (int i = 0; i < array.length; i++) {
			array[i] = random.getRandomNumber();

			changeOverlapValue(array, i, array[i]);
		}

	}

	// 숫자의 중복 검사를 위한 메소드
	private void changeOverlapValue(int[] array, int index, int indexValue) {

		boolean isSuccess = false;
		Random random = new Random(9);

		for (int i = 0; i < array.length; i++) {
			if (i != index && indexValue == array[i]) {
				while (!isSuccess) {

					array[i] = random.getRandomNumber();

					if (indexValue != array[i])
						isSuccess = true;
				}
			}
		}
	}

	protected int countStrike(int[] array1, int[] array2) {
		int strike = 0;

		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array2.length; j++) {
				if (i == j && array1[i] == array2[j]) {
					strike++;
					break;
				}
			}
		}

		return strike;
	}

	protected int countBall(int[] array1, int[] array2) {
		int ball = 0;

		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array2.length; j++) {
				if (i != j && array1[i] == array2[j]) {
					ball++;
					break;
				}
			}
		}

		return ball;
	}

}
