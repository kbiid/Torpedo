package BaseballGame;

import java.util.Scanner;

// 게임의 주된 로직이 담겨 있는 클래스
public class MainGame {
	
	//게임 시작
	protected void play() {
		
		int [] randomNumArray = new int[3];
		int [] playerNumArray = new int[3];
		
		int strike,ball,answerCount;
		
		Scanner scanner = new Scanner(System.in);
		
		setArrayRandomNum(randomNumArray);
		
		printString("야구게임을 시작합니다!!");
		printString("서로 다른 3개의 숫자를 입력하세요.");
		
		answerCount = 0;
		
		while(true) {	
			strike = 0;
			ball = 0;
			
			enterNumber(playerNumArray, scanner);
			
			strike = countStrike(randomNumArray, playerNumArray);
			ball = countBall(randomNumArray, playerNumArray);
			
			if(strike == 3) {
				printString(answerCount + "번만에 맞췄습니다!");
				scanner.close();
				break;
			}
			else {
				printString(strike + "S" + " " + ball + "B 입니다."  );
				answerCount++;
			}
		}
		
	}
	
	private void printString(String str) {
		System.out.println(str);
	}
	
	private void enterNumber(int [] array, Scanner scanner) {
		for(int i=0; i<array.length; i++) {
			while(!isNumber(scanner)) {
				printString("숫자가 입력되지 않았습니다.");
				scanner.nextLine();
			}
			array[i] = scanner.nextInt();
		}
	}
	
	private boolean isNumber(Scanner scanner) {
		if(!scanner.hasNextInt()) 
			return false;
		else 
			return true;
	}
	
	private void setArrayRandomNum(int [] array) {
		
		Random random = new Random(9);
		
		for(int i=0; i<array.length; i++) {
			array[i] = random.getRandomNumber();
			
			changeOverlapValue(array, i, array[i]);
		}
		
	}
	
	private void changeOverlapValue(int [] array, int index, int indexValue) {

		boolean isSuccess = false;
		Random random = new Random(9);
		
		for(int i=0; i<array.length; i++) {
			if(i != index && indexValue == array[i]) {
				while(!isSuccess) {
					
					array[i] = random.getRandomNumber();
					
					if(indexValue != array[i])
						isSuccess = true;
				}
			} 
		}
	}
	
	protected int countStrike(int[] array1, int[] array2) {
		int strike = 0;
		
		for(int i=0; i<array1.length; i++) {
			for(int j=0; j<array2.length; j++) {
				if(i == j && array1[i] == array2[j]) {
					strike++;
					break;
				}
			}
		}
		
		return strike;
	}
	
	protected int countBall(int[] array1, int[] array2) {
		int ball = 0;
		
		for(int i=0; i<array1.length; i++) {
			for(int j=0; j<array2.length; j++) {
				if(i != j && array1[i] == array2[j]) {
					ball++;
					break;
				}
			}
		}
		
		return ball;
	}
	
}
