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
			
			for(int i=0; i<playerNumArray.length; i++) {
				playerNumArray[i] = scanner.nextInt();
			}
			
			for(int i=0; i<randomNumArray.length; i++) {
				for(int j=0; j<playerNumArray.length; j++) {
					if(i == j && randomNumArray[i] == playerNumArray[j]) {
						strike++;
					}
					else if(i != j && randomNumArray[i] == playerNumArray[j]) {
						ball++;
					}
				}
			}
			
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
	
	private void SetArrayRandomNum(int [] array) {
		
		Random random = new Random(9);
		
		for(int i=0; i<array.length; i++) {
			array[i] = random.GetRandomNumber();
			
			ChangeOverlapValue(array, i, array[i]);
		}
		
	}
	
	private static void ChangeOverlapValue(int [] array, int index, int indexValue) {

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
	
	
}
