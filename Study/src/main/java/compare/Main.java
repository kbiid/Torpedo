package compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		
		//Comparable 실습
//		List<Point> pointList = new ArrayList<>();
//		pointList.add(new Point(1, 2));
//		pointList.add(new Point(1, 3));
//		pointList.add(new Point(1, 5));
//		pointList.add(new Point(1, 4));
//		pointList.add(new Point(1, 1));
//
//		for (Point point : pointList) {
//			System.out.println(point.getY());
//		}
//
//		System.out.println("--------------------------");
//		
//		Collections.sort(pointList);
//
//		for (Point point : pointList) {
//			System.out.println(point.getY());
//		}
		
		//Comparator 실습
		List<Point> pointList = new ArrayList<>();
		pointList.add(new Point(1, 6));
		pointList.add(new Point(1, 2));
		pointList.add(new Point(1, 3));
		pointList.add(new Point(1, 5));
		pointList.add(new Point(1, 7));
		
		for (Point point : pointList) {
			System.out.println(point.getY());
		}

		System.out.println("--------------------------");
		
		MyComparator myComparator = new MyComparator();
		
		Collections.sort(pointList, myComparator);
		
		for (Point point : pointList) {
			System.out.println(point.getY());
		}
	}
}
