package day13.test;

public class Test01 {

	public static void main(String[] args) {
		Circle c = new Circle();	//1. 객체생성
		c.calculationArea();
		c.draw();
		c.drawColor();
		
		Shape s = c;			// 2. 같은 객체 생성. = 주소 연결
		s.calculationArea();
		System.out.println(c);	// 3. toString메소드
		System.out.println(s);  // 그 외에 메소드 호출에 여러움이 있다.
		
		
		Drawable d= c;
		d.draw();
		
		//4. 배열제작 = 부모타입으로는 배열 생성&핸들링 가능. = 핸들링 할 수 있는 객체가 많다 = 관리 어려움. = drawable,colorable은 캐스팅 필요.
		Shape[] ss = {
			new Circle(),
			new Rectangle()
		};
		
		//5. 캐스팅을 통해서 메소드 호출
		for(int i=0;i<ss.length;i++){
			ss[i].calculationArea();
			((Drawable)ss[i]).draw();
			((Colorable)ss[i]).drawColor();
		}
		
	}

}
