package thread.traning;

/**
 * factorial 클래스
 * 
 * @author user
 *
 */
public class Factorial {
	public synchronized long factorial(long num) {
		if (num <= 1) {
			return 1;
		} else {
			return num * factorial(num - 1);
		}
	}
}
