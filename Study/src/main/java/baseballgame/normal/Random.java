package baseballgame.normal;

/*
 * 랜덤으로 숫자를 만들기 위한 클래스
 * */
public class Random {
	private int num;

	public Random(int num) {
		this.num = num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getNum() {
		return num;
	}

	// 랜덤으로 만들어진 숫자를 리턴하는 메소드
	public int getRandomNumber() {
		int number = (int) (Math.random() * num) + 1;
		return number;
	}
}
