package Exercise1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PointTest {

	@Test
	void testPointCreation() {
		Point p = new Point(1,2);
		assertTrue(p.getX() == 1);
	}
	
	@Test
	void testDistanceBetween2Points() {
		Point p = new Point(1,2);
		Point q = new Point(2,1);
		
		
		assertEquals(1.4, p.calculatedistancein2Dplan(q), 0.1);
	}
	

}
