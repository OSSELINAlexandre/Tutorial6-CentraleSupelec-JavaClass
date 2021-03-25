package Exercise1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class QuadrilateralTest {


	@Test
	public void testArea() throws Exception {
		
		Point p1 = new Point(0, 1);
		Point p2 = new Point(1, 1);
		Point p3 = new Point(1, 0);
		Point p4 = new Point(0, 0);
		Quadrilateral r = new Quadrilateral(p4,p3,p2,p1);
		
		Double actual = r.getPerimeter();
		Double expected = 4.0;
		
		
		System.out.println("area actual:" + actual);
		
		assertEquals(expected,actual,3);
		
	}
	

	

}
