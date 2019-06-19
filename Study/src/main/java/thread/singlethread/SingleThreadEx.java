package thread.singlethread;

/**
 * Single Thread(Thread 클래스 상속)
 * 
 * @author user
 *
 */
public class SingleThreadEx extends Thread {
	private int[] temp;

	public SingleThreadEx(String threadName) {
		super(threadName);
		temp = new int[10];

		for (int i = 0; i < temp.length; i++) {
			temp[i] = i;
		}
	}

	public void run() {
		for (int i : temp) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Thread 이름 : " + currentThread().getName());
			System.out.println("temp value : " + i);
		}
	}
}
