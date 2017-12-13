package day2;

public class Prob1_최기원 {

	public static void main(String[] args) {
		int tom = -1; // 초기값 설정 및 변수 선언
	    char marry = '9'; //싱글 코테이션 안에는 '문자'
	    boolean john = false; 
	    String sarah = "Sarah Jang" ; // String=class, new를 써야하나 String의 특성상 기본형처럼 바로 동작한다. (기본형 같은 레퍼런스)

            System.out.println( "our friends..\n"
            + tom + ", " + marry + ", " + john + " and " + sarah);
	}
}

/*
[클래스 실행결과]
our friends..
-1, 9, false and Sarah Jang
 */