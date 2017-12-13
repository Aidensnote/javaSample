package day13.test;

public class Rectangle extends Shape implements Colorable, Drawable{ //8. 선언부.(상속/임플리먼트), 구현할 + 3개 동시 오버라이딩.

	@Override
	public void draw() {
		System.out.println(getClass().getSimpleName()+"의 면적을 계산합니다.");	// 메소드 구현
		
	}

	@Override
	public void drawColor() {
		System.out.println(getClass().getSimpleName()+" 그리다.");
		
	}

	@Override
	public void calculationArea() {
		System.out.println(getClass().getSimpleName()+" 색칠하기.");
		
	}	

}
