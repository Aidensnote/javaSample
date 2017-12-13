package day12.Prob1_최기원;

public class Rectangle extends Shape{
	private double width;
	private double hight;
	
		
	public Rectangle(String name) {
		super(name);
	}

	public Rectangle(String name, double width, double hight) {
		super(name);
		this.width = width;
		this.hight = hight;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHight() {
		return hight;
	}

	public void setHight(double hight) {
		this.hight = hight;
	}
	
	@Override
	public double calculationArea() {
		return this.getHight()*this.getWidth();
	}
	@Override
	public void print() {
		System.out.println(this.getName()+"의 면적:"+this.calculationArea());
	}
}
