package thread.traning;

public class Main {
	public static void main(String[] args) {
		long start, end;
		ThreadTest test = new ThreadTest(Integer.parseInt(args[0]));
		test.setTestNum(100);

		start = System.currentTimeMillis();
		test.testExtendsThread();
		end = System.currentTimeMillis();
		System.out.println("Thread 갯수 " + args[0] + " 소요 시간 : " + (end - start));

//		start = System.currentTimeMillis();
//		test.testRunnableThread();
//		end = System.currentTimeMillis();
//		System.out.println("Thread 갯수 " + args[0] + " 소요 시간 : " + (end - start));
	}
}
