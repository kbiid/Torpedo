package threadex.traning;

public class ExtendsThread extends Thread {
	private long sum;
	private int minNum, maxNum;
	private AddNum add;
	private BigIntegerFactorial bigInt;

	public ExtendsThread() {
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
//				System.out.println(i + " add result = " + sum);
			bigInt.factorial(i);
//			System.out.println(i + " factorial : " + bigInt.factorial(i));
		}
	}
}
