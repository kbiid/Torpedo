package thread.traning;

public class RunnableThread implements Runnable {
	private long sum;
	private int minNum, maxNum;
	private Factorial fac;
	private AddNum add;

	public RunnableThread() {
		fac = new Factorial();
		add = new AddNum();
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
//			System.out.println(i + " add result = " + sum);
			sum = fac.factorial(i);
//			System.out.println(i + " factorial result = " + sum);
		}
	}
}
