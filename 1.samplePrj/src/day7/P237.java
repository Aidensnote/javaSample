package day7;

public class P237 {
	public static void main(String[] args) {
		int[] score; //주소,데이터
		String name; //주소
		// Employee emp; 클래스를 찾아올수 없어서 오류 발생. Employee는 데이터 type이다. 새로운 데이터 타입이 Employee이 생성됨으로 오류 발생 안한다.
		// Employee emp = null; 주소가 가리키는 곳이 없어서 예외 에러. "주소 = object/instance"
		
		Employee emp1 = new Employee(); // 객체생성 new = 메모리에 뜬 주소 = object/instance
		emp1.display(); //초기화가 안되서 쓸수 없음.
		emp1.num = "001";
		emp1.name = "홍길동";
		emp1.dept = "기획부";
				
		Employee emp2 = new Employee(); // 새로운 객체 반복 생성. = Employee타입에 배열 생성 가능.
		emp2.display();
		emp2.num = "002";
		emp2.name = "고길동";
		emp2.dept = "개발부";
		
		emp1.display();
		emp2.display();
	}
}