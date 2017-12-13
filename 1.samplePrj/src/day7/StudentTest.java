package day7;

public class StudentTest {

	public static void main(String[] args) {
		Student s1 = new Student(); // 객채생성

		s1.name = "홍길동"; // 데이터 입력
		s1.score = new int[] { 88, 99, 50 }; // 데이터 입력

		s1.process(); // 메소드를 호출해야지 처리가 된다.
		s1.process(); // sum=0;으로 설정해서 반복해도 유효한 값이 출력된다.
		s1.display(); // 메소드를 호출해야지 처리가 된다.

	}

}
