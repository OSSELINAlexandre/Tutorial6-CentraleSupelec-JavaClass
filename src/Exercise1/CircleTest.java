package Exercise1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CircleTest {


	
	@Test
	void testAreaCircle() {
		Point p = new Point(1,2);
		Circle c = new Circle(p, 1.0);
		
		double actual = c.getPerimeter();
		double expected = 6.28;
		
		assertEquals(actual, expected, 0.5);
	}
	
	@Test
	void testPerimeterCircle() {
		Point p = new Point(1,2);
		Circle c = new Circle(p, 1.0);
		
		double actual = c.getArea();
		double expected = 3.14;
		
		assertEquals(actual, expected, 0.1);
	}

	

}
