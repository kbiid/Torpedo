package Java_Loop;

/*
 * 수를 계산하기 위한 클래스
 * */
public class Calculator {

	private int minNum;
	private int maxNum;
	
	protected Calculator(int minNum, int maxNum) {
		this.minNum = minNum;
		this.maxNum = maxNum;
	}
	
	protected void SetMinNum(int minNum) {
		this.minNum = minNum;
	}
	
	protected int GetMinNum() {
		return minNum;
	}
	
	protected void SetMaxNum(int maxNum) {
		this.maxNum = maxNum;
	}
	
	protected int GetMaxNum() {
		return maxNum;
	}
	
	//minNum부터 maxNum까지 더하고 결과를 리턴하는 메소드
	protected int LoopSum() {
		
		int sum = 0;
		
		for(int i=minNum; i<=maxNum; i++) {
			sum += i;
		}
		
		return sum;
		
	}
	
}
