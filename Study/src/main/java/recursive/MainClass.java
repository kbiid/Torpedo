package recursive;

//메인 클래스
public class MainClass {

	public static void main(String[] args) {
		int num = 100;
		int sum = 0;

		Recursive recursive = new Recursive();
		sum = recursive.recursiveMethod(num);

		System.out.println(sum);
	}
}
