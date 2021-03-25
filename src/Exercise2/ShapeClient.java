package Exercise2;

import java.util.ArrayList;
import java.util.Collections;

public class ShapeClient {

	public static void main(String[] args) {
		
		Point p1 = new Point(-9,-10);
		Point p2 = new Point(10,10);
		Point p3 = new Point(-10,10);
		Point p4 = new Point(15,-10);

		Triangle t1 = new Triangle(p1, p2 ,p3);
		Triangle t2 = new Triangle(p2, p3 ,p4);
		Triangle t3 = new Triangle(p1, p2 ,p4);

		
		
		ArrayList<Shapes> l = new ArrayList<>();
		l.add(t1);
		l.add(t2);
		l.add(t3);
		
		for(Shapes s : l ) {
			System.out.println(s.getPerimeter());
		}
		System.out.println("======1");
		
		MyListingSorting ml = new MyListingSorting(l, new LongestPerimeter());
		
		l = ml.sortingTheList();
		for(Shapes s : l ) {
			System.out.println(s.getPerimeter());
		}
		
		System.out.println("======2");
		ml.setbehavior(new ShortestPerimeter());
		l = ml.sortingTheList();

		for(Shapes s : l ) {
			System.out.println(s.getPerimeter());
		}
		System.out.println("======3");
		
		ml.setbehavior(new LongestSide());
		l = ml.sortingTheList();

		for(Shapes s : l ) {
			System.out.println(s.getBiggestSide());
		}
		System.out.println("======4");
		
		ml.setbehavior(new ShortestSide());
		l = ml.sortingTheList();

		for(Shapes s : l ) {
			System.out.println(s.getSmallestSide());
		}
	}
}
