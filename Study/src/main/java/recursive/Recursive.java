package recursive;

//재귀 함수가 들어있는 클래스
public class Recursive {

	// 입력된 수부터 1까지 더하는 메소드
	public int recursiveMethod(int num) {
		if (num <= 1) {
			return 1;
		} else {
			return num + recursiveMethod(num - 1);
		}
	}
}
