package day12.Prob1_�ֱ��;

public class Circle extends Shape{
	private double radius;
	
	public Circle(String name) {
		super(name);
	}

	public Circle(String name, double radius) {
		super(name);
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	@Override
	public double calculationArea() {
		return Math.PI*this.getRadius()*this.getRadius();
	}
	@Override
	public void print() {
		System.out.println(this.getName()+"�� ����:"+this.calculationArea());
	}
}
