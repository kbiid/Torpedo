package thread.traning;

public class AddNum {
	public synchronized long addNum(int num) {
		if (num <= 0) {
			return 0;
		} else {
			return num + addNum(num - 1);
		}
	}
}
