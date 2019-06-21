package threadex.traning;

public class ThreadTest {
	private int threadCount;
	private int testNum;
	private int min, max;
	private long start, end;

	public ThreadTest(int threadCount) {
		this.threadCount = threadCount;
	}

	public void setTestNum(int testNum) {
		this.testNum = testNum;
	}

	public int getTestNum() {
		return testNum;
	}

	private void initNumValue() {
		min = 0;
		max = 0;
	}

	public void runTestSwitch(String str) {
		start = System.currentTimeMillis();

		switch (str) {
		case "extends":
			testExtendsThread();
			break;
		case "runnable":
			testRunnableThread();
			break;
		case "service":
			testExecutorService();
			break;
		case "single":
			testSingleExecutor();
			break;
		case "cache":
			testCachedExecutor();
			break;
		}

		end = System.currentTimeMillis();
		System.out.println(str + "methods Thread 갯수 " + threadCount + " 소요 시간 : " + (end - start));
	}

	private void testExecutorService() {
		ExecutorServicer executor = new ExecutorServicer();
		executor.runExecutor(threadCount, testNum);
	}

	private void testSingleExecutor() {
		ExecutorServicer executor = new ExecutorServicer();
		executor.runSingleThreadExecutor(threadCount, testNum);
	}

	private void testCachedExecutor() {
		ExecutorServicer executor = new ExecutorServicer();
		executor.runCachedTreadPool(threadCount, testNum);
	}

	private void testRunnableThread() {
		initNumValue();
		Thread t = null;
		RunnableThread rt;
		min = 1;

		for (int i = 1; i <= threadCount; i++) {
			rt = new RunnableThread();
			rt.setMinNum(min);
			max = (testNum / threadCount) * i;
			if ((threadCount != 1) && (i == threadCount) && (threadCount % 2 == 1)) {
				max += 1;
			}
			rt.setMaxNum(max);
			t = new Thread(rt);
			t.start();
			min = max + 1;
		}
	}

	private void testExtendsThread() {
		initNumValue();
		ExtendsThread t;
		min = 1;

		for (int i = 1; i <= threadCount; i++) {
			t = new ExtendsThread();
			t.setMinNum(min);
			max = (testNum / threadCount) * i;
			if ((threadCount != 1) && (i == threadCount) && (threadCount % 2 == 1)) {
				max += 1;
			}
			t.setMaxNum(max);
			t.start();
			min = max + 1;
		}
	}
}
