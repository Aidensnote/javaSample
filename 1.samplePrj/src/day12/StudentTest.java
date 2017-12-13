package day12;

public class StudentTest {

	public static void main(String[] args) {
		//5 객체생성
		String name = new String("java Test~~~~");
		System.out.println(name);	// 6. name 안에는 주소있음. 하지만 출력은 내용이 출력.
		
		// System.out.println(new java.util.Date());	//7. fullfath 주소
		java.util.Date date = new java.util.Date();
		System.out.println(date);						//8. 정상 출력.
		
		Student s = new Student("홍길동", 22, 1);			//9. 주소를 찍어줌 toString메소드를 오버라이딩 하지 않았기 때문에.
		System.out.println(s);							//10. 사실상 내부적 컨버팅이 이뤄진다. name.toString을 호출하는 것이다.

		System.out.println("==================================");
		//11. 부모가 toString을 가지고 있다는 의미 확인.
		System.out.println(name.toString());	
		System.out.println(date.toString());	
	
		/* 오버라이딩 이후에 정상 출력,주소출력x */
		System.out.println(s);				//15. 오버라이딩 이후라서 정상출력
		System.out.println(s.toString());	//12. 오버라이딩이 안되서 주소출력							
	
		System.out.println(name);	// 6. name 안에는 주소있음. 하지만 출력은 내용이 출력.
	
	}
}
