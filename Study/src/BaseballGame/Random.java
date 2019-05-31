package BaseballGame;

/*
 * 랜덤으로 숫자를 만들기 위한 클래스
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
