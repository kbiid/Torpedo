package thread.singlethread;

public class Main {
	public static void main(String[] args) {
//		SingleThreadEx st = new SingleThreadEx("first");
//		st.start();

		SingleThreadRunnable stRunnable = new SingleThreadRunnable();
		Thread t = new Thread(stRunnable, "first");

		t.start();
	}
}
