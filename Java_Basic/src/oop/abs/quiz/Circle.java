package oop.abs.quiz;

public class Circle extends Shape{
	
	private int radius;
	
	public Circle(String name,int radius) {
		super(name);
		this.radius = radius;
		
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return 0;
	}

	public int getRadius() {
		// TODO Auto-generated method stub
		return radius;
	}
	public void setRadius(int radius) {
		// TODO Auto-generated method stub
		this.radius = radius;
	}
	
}
