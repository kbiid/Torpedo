package loop;

/*
 * 수를 계산하기 위한 클래스
 * */
public class Calculator {
	private int minNum;
	private int maxNum;

	public Calculator(int minNum, int maxNum) {
		this.minNum = minNum;
		this.maxNum = maxNum;
	}

	public void SetMinNum(int minNum) {
		this.minNum = minNum;
	}

	public int GetMinNum() {
		return minNum;
	}

	public void SetMaxNum(int maxNum) {
		this.maxNum = maxNum;
	}

	public int GetMaxNum() {
		return maxNum;
	}

	// minNum부터 maxNum까지 더하고 결과를 리턴하는 메소드
	public int LoopSum() {
		int sum = 0;

		for (int i = minNum; i <= maxNum; i++) {
			sum += i;
		}

		return sum;
	}
}
