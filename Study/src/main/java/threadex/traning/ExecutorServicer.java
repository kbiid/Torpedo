package threadex.traning;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorServicer {
	private int min, max;
	private ExecutorService executor;

	public void runExecutor(int threadCount, int testNum) {
		executor = Executors.newFixedThreadPool(threadCount);
		ExtendsThread t;
		min = 1;

		for (int i = 1; i <= threadCount; i++) {
			max = (testNum / threadCount) * i;
			if ((threadCount != 1) && (i == threadCount) && (threadCount % 2 == 1)) {
				max += 1;
			}
			t = new ExtendsThread();
			t.setMinNum(min);
			t.setMaxNum(max);
			executor.submit(t);
			min = max + 1;
		}
		executor.shutdown();
//		while (!executor.isTerminated()) {
//		}
	}

	public void runSingleThreadExecutor(int threadCount, int testNum) {
		executor = Executors.newSingleThreadExecutor();
		ExtendsThread t;
		min = 1;

		for (int i = 1; i <= threadCount; i++) {
			max = (testNum / threadCount) * i;
			if ((threadCount != 1) && (i == threadCount) && (threadCount % 2 == 1)) {
				max += 1;
			}
			t = new ExtendsThread();
			t.setMinNum(min);
			t.setMaxNum(max);
			executor.submit(t);
			min = max + 1;
		}
		executor.shutdown();
//		while (!executor.isTerminated()) {
//		}
	}

	public void runCachedTreadPool(int threadCount, int testNum) {
		executor = Executors.newCachedThreadPool();
		ExtendsThread t;
		min = 1;

		for (int i = 1; i <= threadCount; i++) {
			max = (testNum / threadCount) * i;
			if ((threadCount != 1) && (i == threadCount) && (threadCount % 2 == 1)) {
				max += 1;
			}
			t = new ExtendsThread();
			t.setMinNum(min);
			t.setMaxNum(max);
			executor.execute(t);
			min = max + 1;
		}
		executor.shutdown();
//		while (!executor.isTerminated()) {
//		}
	}

	public void printExecutor() {
		ExecutorService executor = Executors.newFixedThreadPool(4);
		executor.submit(() -> {
			String threadName = Thread.currentThread().getName();
			System.out.println("Job1 " + threadName);
		});
		executor.submit(() -> {
			String threadName = Thread.currentThread().getName();
			System.out.println("Job2 " + threadName);
		});
		executor.submit(() -> {
			String threadName = Thread.currentThread().getName();
			System.out.println("Job3 " + threadName);
		});
		executor.submit(() -> {
			String threadName = Thread.currentThread().getName();
			System.out.println("Job4 " + threadName);
		});

		try {
			TimeUnit.SECONDS.sleep(3);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		executor.shutdownNow();
		System.out.println("end");
	}
}
