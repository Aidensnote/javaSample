package day13.test;

public abstract class Shape { //상속 = 객체생성 불가.
	//인스턴스 베리어블
	protected double area;
	protected String name;
	
	public abstract void calculationArea();
	
	//toString메소드
	@Override
	public String toString() {
		return "["+name+", 면적: "+area+"]";
	}
	
}

