package day13.Prob1_ÃÖ±â¿ø;

public class Rectangle extends Shape implements Resizable {
	private double width;
	private double height;

	public Rectangle() {
		super();
	}

	public Rectangle(double w, double h) {
		super();
		this.width = w;
		this.height = h;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	double getArea() {
		return this.getWidth() * this.getHeight();
	}

	@Override
	public void resize(double s) {
		this.width = width * s;
		this.height = height * s;

	}
}
