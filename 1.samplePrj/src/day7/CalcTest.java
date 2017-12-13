package day7;

public class CalcTest {
	public static void main(String[] args) {

		/* 객체 생성 */
		Calc c1 = new Calc();
		Calc c2 = new Calc();
		Calc c3 = new Calc();

		/* c1,c2,c3는 일치하는 일을 반복 수행
		 * add는 동일한 연산을 수행.
		 * 메모리에 데이터를 핸들링 할 게 없음.
		 * new로 새로 객체를 새로 메모리에 띄울 의미가 없음.
		 * 공유 개념으로 static 처리 실시.  
		
		c1.add(455, 765); 동일해도 결과값이 변하지 않음. 결과값을 버림.
		System.out.println(Calc.add(455, 765));
		c2.add(455, 765);
		System.out.println(c2.add(455, 765));
		c3.add(455, 765);
		System.out.println(c3.add(455, 765));
		*/
		
		System.out.println(c1.add(455, 765)); // static 메모리에서 끌어와서 쓰므로 동일한 함수 진행.
		System.out.println(Calc.add(455, 765)); // (클래스 네임.메소드) 형식으로 만든다.
		System.out.println(Calc.sub(455, 765));
		System.out.println(Calc.multi(455, 765));
		System.out.println(Calc.div(455, 765));
		
		

	}

}
