package thread.traning;

public class ThreadTest {
	private int threadCount;
	private int testNum;
	private int min, max;

	public ThreadTest(int threadCount) {
		this.threadCount = threadCount;
	}

	public void setTestNum(int testNum) {
		this.testNum = testNum;
	}

	private void initNumValue() {
		min = 0;
		max = 0;
	}

	public void testRunnableThread() {
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
			try {
				t.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public void testExtendsThread() {
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
			try {
				t.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
