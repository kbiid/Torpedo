package threadex.traning;

public class RunnableThread implements Runnable {
	private long sum;
	private int minNum, maxNum;
	private AddNum add;
	private BigIntegerFactorial bigInt;

	public RunnableThread() {
		add = new AddNum();
		bigInt = new BigIntegerFactorial();
	}

	public void setMinNum(int minNum) {
		this.minNum = minNum;
	}

	public void setMaxNum(int maxNum) {
		this.maxNum = maxNum;
	}

	@Override
	public void run() {
		for (int i = minNum; i <= maxNum; i++) {
			sum = add.addNum(i);
			bigInt.factorial(i);
		}
	}
}
