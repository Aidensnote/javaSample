package day12;

public class StudentTest2 {

	public static void main(String[] args) {

		
		/*객체 비교를 해야하므로 equals메소드 */
		String name = new String("java Test~~~~");
		String name2 = new String("java Test~~~~");		
		System.out.println(name==name2);				// name !=name2 는 주소가 다르다.
		System.out.println(name.equals(name2));			// name1에 주소에 equals연산자를 이용해서 name과 name2의 주소에 객체값을 비교한다.
														// 비교자(name)-비교대상자(name2) 관계
		
		java.util.Date date = new java.util.Date();
		java.util.Date date2 = new java.util.Date();	 
		System.out.println(date==date2);				// 각각에 들어있는 주소 값을 비교한다.
		System.out.println(date.equals(date2));
		
		
		Student s = new Student("홍길동", 22, 1);
		Student s2 = new Student("홍길동", 22, 1);		
		System.out.println(s==s2);						// 각각에 들어있는 주소 값을 비교한다. 기본형 값을 비교.
		System.out.println(s.equals(s2));				// ==와 같은 값이 출력됨. 객체를 비교할때는 equals를 써야한다. equals메소드 오버라이딩이 되어있지 않기 때문에.
		System.out.println(s.equals(date));				// date 객체는 object객체. (다른타입이 들어올 수 있음.=어떠한 주소/타입도 들어올 수 있음.) 
		
		String s3 = null;								// 초기화.
		System.out.println(s.equals(s3)); 


		
		System.out.println("=============================");
		/* ==와 equals */
		int i=10, j=10;					//== 연산자. 양쪽의 값을 비교하세요.
		System.out.println(i==j);
		
		
		
	
	
	
	}
}
