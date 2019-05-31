package BaseballGame;

import java.util.Scanner;

// 게임에 관한 코드가 들어있는 클래스
public class MainGame {
	
	protected void Play() {
		
		int [] randomNumArray = new int[3];
		int [] playerNumArray = new int[3];
		
		int strike,ball,answerCount;
		
		Scanner scanner = new Scanner(System.in);
		
		SetArrayRandomNum(randomNumArray);
		
		PrintString("야구 게임을 시작합니다!!");
		PrintString("서로 다른 3개의 숫자를 입력해 주세요.");
		
		answerCount = 0;
		
		while(true) {	
			strike = 0;
			ball = 0;
			
			EnterNumber(playerNumArray, scanner);
			
			strike = countStrike(randomNumArray, playerNumArray);
			ball = countBall(randomNumArray, playerNumArray);
			
			if(strike == 3) {
				PrintString(answerCount + "번만에 정답입니다!");
				scanner.close();
				break;
			}
			else {
				PrintString(strike + "S" + " " + ball + "B 입니다."  );
				answerCount++;
			}
		}
		
	}
	
	private void PrintString(String str) {
		System.out.println(str);
	}
	
	private void EnterNumber(int [] array, Scanner scanner) {
		for(int i=0; i<array.length; i++) {
			while(!IsNumber(scanner)) {
				PrintString("숫자가 아닌 것이 포함되어 있습니다.");
				scanner.nextLine();
			}
			array[i] = scanner.nextInt();
		}
	}
	
	private boolean IsNumber(Scanner scanner) {
		if(!scanner.hasNextInt()) 
			return false;
		else 
			return true;
	}
	
	private void SetArrayRandomNum(int [] array) {
		
		Random random = new Random(9);
		
		for(int i=0; i<array.length; i++) {
			array[i] = random.GetRandomNumber();
			
			ChangeOverlapValue(array, i, array[i]);
		}
		
	}
	
	private void ChangeOverlapValue(int [] array, int index, int indexValue) {

		boolean isSuccess = false;
		Random random = new Random(9);
		
		for(int i=0; i<array.length; i++) {
			if(i != index && indexValue == array[i]) {
				while(!isSuccess) {
					
					array[i] = random.GetRandomNumber();
					
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
