package generic;

//비제네릭 타입 이용
public class BoxExample {
	public static void main(String[] args) {
		Box box = new Box();
		box.set("홍길동");
		String name = (String) box.get();
		System.out.println(name);

		box.set(new Apple());
		Apple apple = (Apple) box.get();
	}
}
