package copy.array;

public class TestClass {
	public static void main(String[] args) {
		int temp[] = { 1, 2, 3, 4, 5, 6 };
		int shallow[] = new ShallowCopy().shallowCopy(temp);
		int deep[] = new DeepCopy().deepCopy(temp);

		System.out.println("값이 변하기 전");
		System.out.println("original : " + toString(temp));
		System.out.println("Shallow Copy : " + toString(shallow));
		System.out.println("Deep Copy : " + toString(deep));

		temp[0] = 19;
		System.out.println("----------------------------------");
		System.out.println("값이 변한 후");
		System.out.println("original : " + toString(temp));
		System.out.println("Shallow Copy : " + toString(shallow));
		System.out.println("Deep Copy : " + toString(deep));
	}

	public static String toString(int temp[]) {
		StringBuffer sb = new StringBuffer("[");
		for (int i = 0; i < temp.length; i++) {
			sb.append(" " + temp[i]);
		}
		sb.append(" " + "]");

		return sb.toString();
	}
}
