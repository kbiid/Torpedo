package thread.singlethread;

public class SingleThreadRunnable implements Runnable {
	private int[] temp;

	public SingleThreadRunnable() {
		temp = new int[10];

		for (int i = 0; i < temp.length; i++) {
			temp[i] = i;
		}
	}

	@Override
	public void run() {
		for (int i : temp) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			System.out.println("Thread 이름 : " + Thread.currentThread().getName());
			System.out.println("temp value : " + i);
		}
	}
}
