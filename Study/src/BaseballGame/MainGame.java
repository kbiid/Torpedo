package BaseballGame;

import java.util.Scanner;

// ���ӿ� ���� �ڵ尡 ����ִ� Ŭ����
public class MainGame {
	
	protected void Play() {
		
		int [] randomNumArray = new int[3];
		int [] playerNumArray = new int[3];
		
		int strike,ball,answerCount;
		
		Scanner scanner = new Scanner(System.in);
		
		SetArrayRandomNum(randomNumArray);
		
		PrintString("�߱� ������ �����մϴ�!!");
		PrintString("���� �ٸ� 3���� ���ڸ� �Է��� �ּ���.");
		
		answerCount = 0;
		
		while(true) {	
			strike = 0;
			ball = 0;
			
			EnterNumber(playerNumArray, scanner);
			
			strike = countStrike(randomNumArray, playerNumArray);
			ball = countBall(randomNumArray, playerNumArray);
			
			if(strike == 3) {
				PrintString(answerCount + "������ �����Դϴ�!");
				scanner.close();
				break;
			}
			else {
				PrintString(strike + "S" + " " + ball + "B �Դϴ�."  );
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
				PrintString("���ڰ� �ƴ� ���� ���ԵǾ� �ֽ��ϴ�.");
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
