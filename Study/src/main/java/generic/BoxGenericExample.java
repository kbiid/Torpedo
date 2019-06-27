package generic;

public class BoxGenericExample {
	public static void main(String[] args) {
		BoxGeneric<String> box1 = new BoxGeneric<>();
		box1.set("hello");
		String str = box1.get();
		System.out.println(str);

		BoxGeneric<Integer> box2 = new BoxGeneric<Integer>();
		box2.set(6);
		int value = box2.get();
		System.out.println(value);
	}
}
