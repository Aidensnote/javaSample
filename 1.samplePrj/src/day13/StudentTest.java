/* 기본적인 출력-toString과 비교-equals 오버라이딩을 통한 메소드 구현. */
package day13;

public class StudentTest {
	public static void main(String[] args) {
		//7.객체생성
		Student s = new Student("A",9);		//10. 객체값 지정.
		System.out.println(s);
		System.out.println(s.getClass());	// 8. 타입 비교.
		
		Student s1 = s;
		System.out.println(s.equals(s1)); 	// 9. 비교. null 데이터 없음 = false.
		System.out.println(s1==s); 			// 11. 주소 비교.
		
		Student[] student = {s,new Student("B",1),new Student()};	// 13. 배열,기존에 객체(주소 가능)
		for(int i=0;i<student.length;i++){							// 14. 배열=for(){}
			System.out.println(student[i]);							// 15. 내부적으로 .toString 메소드가 자동 출력. 
			
		}
		//12. .toString시 주소나오면 오버라이딩 안된경우
	}

}
