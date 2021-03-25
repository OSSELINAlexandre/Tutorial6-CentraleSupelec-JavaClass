package Exercise1;

public class Triangle implements Shapes{
	
	private Point c1;
	private Point c2;
	private Point c3;
	private double sideA;
	private double sideB;
	private double sideC;

	
	public Triangle(Point c1, Point c2, Point c3) {
		super();

		this.c1 = c1;
		this.c2 = c2;
		this.c3 = c3;
		this.sideA = c1.calculatedistancein2Dplan(c2) ;
		this.sideB = c1.calculatedistancein2Dplan(c3) ;
		this.sideC = c2.calculatedistancein2Dplan(c3) ;
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

	
	

	public double getSideA() {
		return sideA;
	}


	public double getSideB() {
		return sideB;
	}


	public double getSideC() {
		return sideC;
	}


	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		
		double s = (sideA + sideB + sideC) / 2 ;
		return Math.sqrt(s * (s - sideA) * (s - sideB ) * ( s - sideC ));
	}


	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return sideA + sideB + sideC;
	}
	
	

}
