package compare;

/**
 * x좌표가 오름차순, x좌표가 같으면 y좌표는 내림차순으로 정렬
 * 
 * @author user
 *
 */
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
