package day13.Prob1_ÃÖ±â¿ø;

public abstract class Shape {
	private int numSide;

	public Shape() {
		super();
	}

	public Shape(int numSide) {
		super();
		this.numSide = numSide;
	}

	public int getNumSide() {
		return numSide;
	}

	public void setNumSide(int numSide) {
		this.numSide = numSide;
	}

	abstract double getArea();

}
