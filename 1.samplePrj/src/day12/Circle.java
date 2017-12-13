package day12;

public class Circle extends Shape{		// 4. 반드시 상속 받아야한다.
	// 1. 원의 면적을 구하는 기능 = 메소드
	// 2. 리턴타입, 메소드네임, 매개변수 정리.
	// 3. PI 활요
	
	
	public double getArea(double r){
		return Math.PI*r*r;
	}
	
	
	
}
