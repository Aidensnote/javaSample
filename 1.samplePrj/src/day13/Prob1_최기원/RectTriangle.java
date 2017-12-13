package day13.Prob1_ÃÖ±â¿ø;

public class RectTriangle extends Shape {
	private double width;
	private double height;

	public RectTriangle() {
		super();
	}

	public RectTriangle(double w, double h) {
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
	public double getArea() {
		return this.getWidth() * this.getHeight() / 2;
	}

}
