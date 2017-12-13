package day12.Prob1_ÃÖ±â¿ø;

public abstract class Shape {
	
	private String name;
	protected double area;
	
	public Shape(String name) {
		this.setName(name);
	}
	public Shape(String name, double area) {
		super();
		this.name = name;
		this.area = area;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public abstract double calculationArea();
	public abstract void print();
}
