package copy;

public class DeepCopy {
	private int[] arr;

	public DeepCopy() {
		arr = null;
	}

	public int[] deepCopy(int arr[]) {
		if (arr == null) {
			throw new NullPointerException("Array is Null");
		}
		int result[] = new int[arr.length];
		System.arraycopy(arr, 0, result, 0, arr.length);

		return result;
	}
}