package day17;

import java.util.Calendar;
import java.util.Date;

public class P544 {

	public static void main(String[] args) {
		String name = "홍길동";
		System.out.printf("%s , %s, %d, %f %n",name,"~~~",90,5.5);			//1 printf 포멧. 문자열로 %s=문자 %d=정수 %f=실수 %n줄바꿈.. 순서대로 대입
		
		String msg = String.format("%s , %s, %d, %f %n",name,"~~~",90,5.5); //2 그대로 입력 포멧 메소드.
		System.out.println(msg);
		
		String df = String.format("%5.2f", Math.PI); 						//3 전체자리 5개, 소숫점 2개.
		System.out.println(df);
		//4 포멧 이후에 데이터는 String타입 = 연산불가. => format = 최종적으로 연산 끝나고 출력하는 형태 적용.
		
		Date d = new Date(2017,11,21);	
		System.out.println(d);
//		System.out.println(d.getYear());	6 디프리케이티드 = 예전엔 제공하다가 대체 기능을 사용하게 하는것. 지원은 되지만 사용x
		System.out.println("===============================");
		
				
//		Calendar c = new Calendar;	7 생성자를 통해서 객체생성 불가.
		Calendar c = Calendar.getInstance();			// 8 getInstance 메소드 사용해야함.
		System.out.println(c);							// 9 c안에는 toString도 포함된 다양한 메소드가 포함되어있다.
		System.out.println(c.get(Calendar.YEAR));		// 10 get()안에서 메소드를 출력함.
//		c.set(2016, 11, 21);							// 11 날짜 입력
		System.out.println(c);							// 12 set메소드를 통해서 셋팅. 설정은 2016이지만 2017로 동작.
		
		
		df = String.format("%tY년 %tm월 %te일 %n", c,c,c);	// 13 포멧기호, 오늘날짜 기반으로 핸들링. 년-일-월만 출력. = %tY년 %tm월 %te일 
		System.out.println(df);
		df = String.format("%1$tY년 %1$tm월 %1$te일 %n", c,"~~~");	// 14 하나의 변수에서 값을 출력. 같은 위치가 중복되서 사용될 경우: [%뒤에 위치인덱스$입력될포멧] 형태로 한다.
		System.out.println(df);
		df = String.format("%1$tY년 %1$tm월 %1$te일 %1$ta요일 %n", c,"~~~");	// 15 ta가 요일.
		System.out.println(df);
	}
}
