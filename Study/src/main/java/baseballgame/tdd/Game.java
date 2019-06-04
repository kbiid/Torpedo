package baseballgame.tdd;

import java.util.Scanner;

//테스트 코드에 기반하면 만들어진 게임 클래스
public class Game {

	private int[] randomNumberArray = new int[3];
	private int[] userNumberArray = new int[3];

	private int strike, ball, answerCount;
	private Scanner scanner;

	public Game() {
		strike = 0;
		ball = 0;
		answerCount = 0;

		makeRandomNumber();
	}

	// 사용자의 입력값을 임의로 준 생성자
	public Game(int[] userEnterNumberArray) {
		strike = 0;
		ball = 0;
		answerCount = 0;

		for (int i = 0; i < userEnterNumberArray.length; i++) {
			for (int j = 0; j < userNumberArray.length; j++) {
				if (i == j)
					userNumberArray[j] = userEnterNumberArray[i];
			}
		}
	}

	// 게임 실행 메소드
	protected void play() {

		scanner = new Scanner(System.in);

		printString("야구 게임을 시작합니다!");
		printString("서로 다른 3개의 숫자를 입력해 주세요.");

		while (true) {
			enterNumber();

			setStrikeCount();
			setBallCount();

			if (getStrikeCount() == 3) {
				scanner.close();
				printString("정답입니다." + getAnswerCount() + "번 만에 맞췄습니다!");
				break;
			} else {
				printString(printBaseballCount() + "입니다.");
				addAnserCount();
			}

			initializeBaseballCount();

		}

	}

	// 숫자의 입력을 받는 메소드
	protected void enterNumber() {
		for (int i = 0; i < userNumberArray.length; i++) {
			userNumberArray[i] = scanner.nextInt();
		}
	}

	protected void printString(String str) {
		System.out.println(str);
	}

	// 숫자를 랜덤으로 만들어주는 메소드
	protected void makeRandomNumber() {
		for (int i = 0; i < randomNumberArray.length; i++) {
			randomNumberArray[i] = (int) (Math.random() * 9) + 1;
		}

		checkOverlap(randomNumberArray);
	}

	protected int[] getRandomNumberArray() {
		return randomNumberArray;
	}

	protected void setRandomNumberArray(int[] randomNumberArray) {
		this.randomNumberArray = randomNumberArray;
	}

	// 숫자 중복 검사 위한 메소드
	private void checkOverlap(int[] array) {

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if (i != j) {
					while (array[i] == array[j]) {
						array[j] = (int) (Math.random() * 9) + 1;
					}
				}
			}
		}

		/*
		 * for (int i = 0; i < array.length; i++) System.out.println(array[i]);
		 */
	}

	protected int[] getUserArray() {
		return userNumberArray;
	}

	protected void setStrikeCount() {
		for (int i = 0; i < randomNumberArray.length; i++) {
			if (randomNumberArray[i] == userNumberArray[i])
				strike++;
		}
	}

	protected int getStrikeCount() {
		return strike;
	}

	protected void setBallCount() {
		for (int i = 0; i < randomNumberArray.length; i++) {
			for (int j = 0; j < userNumberArray.length; j++) {
				if (i != j) {
					if (randomNumberArray[i] == userNumberArray[j])
						ball++;
				}
			}
		}
	}

	private void initializeBaseballCount() {
		strike = 0;
		ball = 0;
	}

	protected int getBallCount() {
		return ball;
	}

	protected String printBaseballCount() {
		String countString = strike + "S" + " " + ball + "B";

		return countString;
	}

	protected boolean is3Strike() {
		if (strike == 3)
			return true;
		else
			return false;
	}

	protected void addAnserCount() {
		answerCount++;
	}

	protected int getAnswerCount() {
		return answerCount;
	}

}
