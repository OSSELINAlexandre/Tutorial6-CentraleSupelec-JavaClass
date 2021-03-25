package Exercise1;

public class Quadrilateral implements Shapes{
	
	private Point c1;
	private Point c2;
	private Point c3;
	private Point c4;
	private double sideA;
	private double sideB;
	private double sideC;
	private double sideD;
	
	
	
	
	public Quadrilateral(Point c1, Point c2, Point c3, Point c4) {
		super();
		this.c1 = c1;
		this.c2 = c2;
		this.c3 = c3;
		this.c4 = c4;
		this.sideA = c1.calculatedistancein2Dplan(c2);
		this.sideB = c1.calculatedistancein2Dplan(c3);
		this.sideC = c2.calculatedistancein2Dplan(c4);
		this.sideD = c3.calculatedistancein2Dplan(c4);
	}
	public Point getC1() {
		return c1;
	}
	public void setC1(Point c1) {
		this.c1 = c1;
	}
	public Point getC2() {
		return c2;
	}
	public void setC2(Point c2) {
		this.c2 = c2;
	}
	public Point getC3() {
		return c3;
	}
	public void setC3(Point c3) {
		this.c3 = c3;
	}
	public Point getC4() {
		return c4;
	}
	public void setC4(Point c4) {
		this.c4 = c4;
	}
	public double getSideA() {
		return sideA;
	}

	public double getSideB() {
		return sideB;
	}

	public double getSideC() {
		return sideC;
	}

	public double getSideD() {
		return sideD;
	}
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		double s = (sideA + sideB + sideC + sideD) / 2;
		return Math.sqrt((s - sideA) * (s - sideB) * (s - sideC) * (s - sideD));
	}
	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		//We consider here that the quadrilateral would be convex 
		
		return sideA + sideB + sideC + sideD;
	}

	
	

}
