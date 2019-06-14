package copy;

public class ShallowCopy {
	private int[] arr;

	public ShallowCopy() {
		arr = null;
	}

	public int[] shallowCopy(int arr[]) {
		this.arr = arr;

		return arr;
	}
}
