package BaseballGame;

/*
 * �������� ���ڸ� ����� ���� Ŭ����
 * */
public class Random {

	private int num;
	
	protected Random(int num) {
		this.num = num;
	}
	
	protected void SetNum(int num) {
		this.num = num;
	}
	
	protected int GetNum() {
		return num;
	}
	
	protected int GetRandomNumber() {
		int number = (int)(Math.random() * num) + 1;
		
		return number;
	}
	
}
