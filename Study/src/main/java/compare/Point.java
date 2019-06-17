package compare;

public class Point implements Comparable<Point> {
	private int x, y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	@Override
	public int compareTo(Point p) {
		if (this.x > p.x) {
			return 1; // x에 대해서는 오름차순
		} else if (this.x == p.x) {
			if (this.y < p.y) { // y에 대해서는 내림차순
				return 1;
			}
		}
		return -1;
	}
}
