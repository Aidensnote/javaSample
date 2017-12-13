package day13.lacture;

public abstract class Shape {	//4
	int numSide;

	public Shape() {			//9
		super();
	}

	public int getNumSide() {	//1
		return numSide;
	}

	public Shape(int numSide) {	//2
		super();
		this.numSide = numSide;
	}
	
	abstract double getArea();	//3
}


interface Resizable{	//5 �������̽� ����.
	public void resize(double s);	//6 �������̽������� ����θ�,�ٵ�� ����. abstract ��� �����ʾƵ� �ڵ� ó��.
	
}


class RectTriangle extends Shape{	//7. extends
	double w;
	double h;
		
	public RectTriangle(double w, double h) {	//10
		super(3);	//12
		this.w = w;
		this.h = h;
	}
	@Override	//11
	double getArea() {
		return w*h/2;
	}
	
	
}



class Rectangle extends Shape implements Resizable{	//8. extends,implement �Ѵ� �������̵� �ؾ���.
	double w;
	double h;
	
	public Rectangle(double w, double h) {	//10
		super(4);	//12
		this.w = w;
		this.h = h;
	}
	@Override	//11
	public void resize(double s) {
		this.w = w*s;
		this.h = h*s;
		
	}
	@Override	//11
	double getArea() {
		return w*h;
		
	}
	
	
	
}