package day11.prob1;

public class Test {
	public static void main(String[] args) {
		
		/* 객채생성, 선언, 파라미터 값 입력(String & int등 클래스별 타입 일치) */
		Student S = new Student("홍길동",20,200201);
		Teacher T = new Teacher("이순신",30,"JAVA");
		Employee E = new Employee("유관순",40,"교무과");
		
		/* 출력하는 display 메소드 */
		S.display();
		T.display();
		E.display();
		
	}
}
