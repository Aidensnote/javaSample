package day4;

public class P157 {

	public static void main(String[] args) {
		
		/*
		System.out.println("Hello java");
		System.out.println("Hello java");
		System.out.println("Hello java");
		System.out.println("Hello java");
		System.out.println("Hello java");
		System.out.println("Hello java");
		System.out.println("Hello java");
		System.out.println("Hello java");
		System.out.println("Hello java");
		
		카운팅 추가
		int count = 0;
		System.out.println("Hello java "+count++);
		System.out.println("Hello java "+count++);
		System.out.println("Hello java "+count++);
		System.out.println("Hello java "+count++);
		System.out.println("Hello java "+count++);
		System.out.println("Hello java "+count++);
		System.out.println("Hello java "+count++);
		System.out.println("Hello java "+count++);
		System.out.println("Hello java "+count++);
		System.out.println("Hello java "+count++); */


		/* for을 써서 조건만큼 반복하기
		for(int count=0; count<5;count++){
			System.out.println("Hello java  "+count); */
		
		/* 영어 소문자 & 대문자 아스키 코드값 체크*/
		
			System.out.println("영어 소문자 코드값 확인"); //'a'~'z'까지
			char c = 'a', d = 'A';
			for(int count=0; count<26;count++){
			//char c = 'a', d = 'A'; 변수 선언을 안에 하면 변화가 없다. a증가됬다,지웠다 증가됬다,지웠다를 반복
			System.out.println(c+" "+(int)(c++)+","+d+" "+(int)(d++)); //a=97
		}
			// System.out.println(count); 	count 역시 선언이 for안에서 선언이므로 수명 끝, 만약 선언을 for{} 위에 하면 유효하다.
			// System.out.println(c);		}뒤이므로 수명이 끊났다.
	}
}