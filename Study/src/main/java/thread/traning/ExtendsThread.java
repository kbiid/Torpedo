package thread.traning;

public class ExtendsThread extends Thread {
	private long sum;
	private int minNum, maxNum;
	private Factorial fac;
	private AddNum add;
	private String result;

	public ExtendsThread() {
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
			setResult(i + " add result = " + sum);
//				System.out.println(i + " add result = " + sum);
			sum = fac.factorial(i);
			setResult(getResult() + " " + i + " factorial result = " + sum);
//				System.out.println(i + " factorial result = " + sum);
		}
	}

	public void setResult(String str) {
		result = str;
	}

	public String getResult() {
		return result;
	}
}
