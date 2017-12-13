package day13.test;	// 상속-1개, 그뒤에 implements 뒤에는 인터페이스를 여러개 가능.

public class Circle extends Shape implements Drawable, Colorable{	//선언부
	
	
	
	//4. 오버라이드 구현
	@Override
	public void calculationArea() {
		System.out.println(getClass().getSimpleName()+"의 면적을 계산합니다."); // 7.Circle의 메소드 구현.
		
	}
	//5. Drawable
	@Override
	public void draw() {
		System.out.println(getClass().getSimpleName()+" 을 그리다.");
		
		
	}
	//6. Colorable
	@Override
	public void drawColor() {
		System.out.println(getClass().getSimpleName()+" 색칠하기.");
		
		
	}
	
	
}
