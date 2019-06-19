package thread.traning;

public class Main {
	public static void main(String[] args) {
		ThreadTest test = new ThreadTest(Integer.parseInt(args[0]));
		test.setTestNum(100);

//		test.testExtendsThread();
//		test.testRunnableThread();
//		test.testExecutorService();
//		ExecutorServicer ex = new ExecutorServicer();
//		ex.printExecutor();
//		test.testSingleExecutor();
		test.testCachedExecutor();
	}
}
