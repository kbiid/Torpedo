package copy.array;

public class DeepCopy {
	public int[] deepCopy(int arr[]) {
		if (arr == null) {
			throw new NullPointerException("Array is Null");
		}
		int result[] = new int[arr.length];
		System.arraycopy(arr, 0, result, 0, arr.length);

		return result;
	}
}
