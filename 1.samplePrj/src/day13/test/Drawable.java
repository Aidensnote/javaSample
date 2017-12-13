package day13.test;

public interface Drawable {					// 1. 인터페이스는 ~~able로 접미사를 붙인다. 구성요소: final +
	public abstract void draw();			// 2. 선언부만 있고 바디부 없음 = 추상(abstract), 바디부{}가 들어가면 err. = 자동으로 abstract 구현. = 인스턴스 메소드 불가. = 추상메소드만 구현가능.
	
}

interface Colorable{
	void drawColor();			// 3. 인터페이스는 선언부만 제작.
}