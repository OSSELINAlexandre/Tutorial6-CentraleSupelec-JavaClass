package Exercise2;

public class Circle implements Shapes{
	
	private Point center;
	private double radius;
	
	
	public Circle(Point center, double radius) {
		super();
		this.center = center;
		this.radius = radius;
	}


	public Point getCenter() {
		return center;
	}


	public void setCenter(Point center) {
		this.center = center;
	}


	public double getRadius() {
		return radius;
	}


	public void setRadius(double radius) {
		this.radius = radius;
	}


	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return Math.PI * Math.pow(this.radius, 2);
	}


	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return Math.PI * 2 * this.radius;
	}


	@Override
	public double getSmallestSide() {
		return radius * 2;
	}


	@Override
	public double getBiggestSide() {

		return radius * 2;
	}
	
	
	
}
