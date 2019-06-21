package threadex.traning;

public class Main {
	public static void main(String[] args) {
		ThreadTest test = new ThreadTest(Integer.parseInt(args[0]));
		test.setTestNum(100);
		test.runTestSwitch("extends");
	}
}
