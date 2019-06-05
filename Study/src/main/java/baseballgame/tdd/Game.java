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
				if (i == j) {
					userNumberArray[j] = userEnterNumberArray[i];
				}
			}
		}
	}

	// 게임 실행 메소드
	public void play() {
		scanner = new Scanner(System.in);

		printString("야구 게임을 시작합니다!");
		printString("서로 다른 3개의 숫자를 입력해 주세요.");

		runGame();

		printString("정답입니다." + getAnswerCount() + "번 만에 맞췄습니다!");
		scanner.close();
	}

	public void runGame() {
		while (!isThreeStrike()) {
			initializeBaseballCount();
			enterNumber();

			setStrikeCount();
			setBallCount();

			printString(printBaseballCount() + "입니다.");
			addAnserCount();
		}
	}

	// 숫자의 입력을 받는 메소드
	public void enterNumber() {
		for (int i = 0; i < userNumberArray.length; i++) {
			userNumberArray[i] = scanner.nextInt();
		}
	}

	public void printString(String str) {
		System.out.println(str);
	}

	// 숫자를 랜덤으로 만들어주는 메소드
	public void makeRandomNumber() {
		for (int i = 0; i < randomNumberArray.length; i++) {
			randomNumberArray[i] = (int) (Math.random() * 9) + 1;
		}
		checkOverlap(randomNumberArray);
	}

	public int[] getRandomNumberArray() {
		return randomNumberArray;
	}

	public void setRandomNumberArray(int[] randomNumberArray) {
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
	}

	public int[] getUserArray() {
		return userNumberArray;
	}

	public void setStrikeCount() {
		for (int i = 0; i < randomNumberArray.length; i++) {
			if (randomNumberArray[i] == userNumberArray[i]) {
				strike++;
			}
		}
	}

	public int getStrikeCount() {
		return strike;
	}

	public void setBallCount() {
		for (int i = 0; i < randomNumberArray.length; i++) {
			for (int j = 0; j < userNumberArray.length; j++) {
				if (i != j) {
					if (randomNumberArray[i] == userNumberArray[j]) {
						ball++;
					}
				}
			}
		}
	}

	public void initializeBaseballCount() {
		strike = 0;
		ball = 0;
	}

	public int getBallCount() {
		return ball;
	}

	public String printBaseballCount() {
		return strike + "S" + " " + ball + "B";
	}

	public boolean isThreeStrike() {
		if (getStrikeCount() == 3) {
			return true;
		} else {
			return false;
		}
	}

	public void addAnserCount() {
		answerCount++;
	}

	public int getAnswerCount() {
		return answerCount;
	}

}
