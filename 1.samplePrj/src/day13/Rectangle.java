package day13;

import java.util.Arrays;

public class Rectangle extends Shape{
	Point[] p = new Point[4];
	int w; //= p[3].getX()-p[0].getX(); p에 포인트 타입까지만 설정되어있음.
	int h; //= p[3].getY()-p[0].getY();	생성자가 나오기 전에 명시적 초기화를 해도 주소가 없음.

	public Rectangle() {
		super();
	}
	
	public Rectangle(Point[] p,String color) {
		super(color);
		this.p = p;
		w = p[3].getX()-p[0].getX();	// 여기서부터는 p의 주소가 들어감. 사용 가능.
		h = p[3].getY()-p[0].getY();
	}

	@Override
	public String toString() {
		return "Rectangle [p=" + Arrays.toString(p) + ",\n w=" + w + ", h=" + h + "]";
	}
	
	@Override
	public void draw() {
		super.draw();
		System.out.println("사각형 그리기");
	}
	
	
}
