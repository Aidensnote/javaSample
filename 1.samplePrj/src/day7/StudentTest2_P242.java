package day7;

public class StudentTest2_P242 {
	public static void main(String[] args) {

		 /* 중복 발생 = 같은 타입이 여러개 = "배열"
		 Student s1 = new Student();
		 Student s2 = new Student();
		 Student s3 = new Student();
		 Student s4 = new Student();
		 Student s5 = new Student();
		 */

		// Student[] s = new Student[5]; //배열 타입으로 [x]개의 객채 생성

		Student s1 = new Student(); // 객채생성
		s1.name = "홍길동"; // 데이터 입력
		s1.score = new int[] { 88, 99, 50 }; // 데이터 입력

		/* 배열의 생성,선언,초기화 한번에 진행 */
		Student[] s = { s1, // 바로 주소를 넣어도 가능하고, 생성해서 선언도 가능.
				new Student(), new Student(), new Student(), new Student(), };

		// 학생의 수는 s.length만큼 존재한다.
		s[4].name = "최씨"; // name 변수
		s[4].score = new int[] { 99, 99, 99 }; // 데이터값 설정

		for (int i = 0; i < s.length; i++) {
			s[i].process(); // 성적처리.
			s[i].display(); // 학생정보 출력.
		}
	}
}