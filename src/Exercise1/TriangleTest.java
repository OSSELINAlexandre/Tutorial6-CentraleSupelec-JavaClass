package Exercise1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TriangleTest {

	@Test
	public void testPerimeter()  {
		Point p1 = new Point(2, 2);
		Point p2 = new Point(5, 2);
		Point p3 = new Point(5, 6);
		Triangle t = new Triangle(p1, p2, p3);
		
		Double actual = t.getPerimeter();
		Double expected = 12.0;
		
		System.out.println("perimenter actual:" + actual);
		
		assertEquals(expected, actual);
		
	}

	
	@Test
	public void testArea()  {
		Point p1 = new Point(2, 2);
		Point p2 = new Point(5, 2);
		Point p3 = new Point(5, 6);
		Triangle t = new Triangle(p1, p2, p3);
		
		Double actual = t.getArea();
		Double expected = 6.0;
		
		System.out.println("area actual:" + actual);
		
		assertEquals(expected, actual);
		
	}
	
	@Test
	public void testSideLength() throws Exception {
		
		
		Point p1 = new Point(4, 7);
		Point p2 = new Point(1, 3);
		Point p3 = new Point(2, 3);
		Triangle t = new Triangle(p1, p2, p3);
		
		Double actual1 = p1.calculatedistancein2Dplan(p2);
		Double expected1 = 5.0;
		
		Double actual2 = p2.calculatedistancein2Dplan(p3);
		Double expected2 = 1.0;
		
		Double actual3 = p1.calculatedistancein2Dplan(p3);
		Double expected3 = 4.472;
		
		System.out.println("side actual1:" + actual1);
		System.out.println("side actual2:" + actual2);
		System.out.println("side actual3:" + actual3);
		
		assertEquals(expected1,actual1);
		assertEquals(expected2,actual2);
		assertEquals(expected3, actual3,0.001);
	}
}
