package thread.traning;

public class AddNum {
	public long addNum(int num) {
		if (num <= 0) {
			return 0;
		} else {
			return num + addNum(num - 1);
		}
	}
}
