package day11.prob1;

public class Test_lecture {
	public static void main(String[] args) {
		
		// 1.Object s = new Student("길동", 20, 1);
		// 2. s. Object 타입은 불가능하다.
		Object s = new Student("길동", 20, 1);
		if(s instanceof Student)((Student)s).display(); // 3.Object 타입은 불가능하기 때문에 다운캐스팅을 해야한다.

		/* 4. 자바의 모든 객체타입 Object = 반드시 다운캐스팅을 해야만 기능을 쓸 수 있다. = 다운캐스팅은 컴파일 타입에 핸들링이 어렵고 위험하다. */
		s = "Hello";			// 5. String의 부모는 Object이므로 s는 다시 Hello의 주소로 변경한다.
		/* 7. instanceof는 타입체크할때 사용하는 연산자 */
		// 다운캐스팅 직전 = 타입체크 = instanceof 연산을 실시.
		if(s instanceof Student)((Student)s).display(); // 6. Object 타입은 불가능하기 때문에 다운캐스팅, 컴파일러가 인식 불가.
		
		
		String name = "OOO";
		Student s1 = new Student("길동",20,1);
		Teacher t1 = new Teacher("홍쌤",40,"JAVA");
		Employee e1 = new Employee("홍길동",44,"교무실");
		
		
		
		// 8. Object,Person 배열 생성 - 상속관계를 잘하면 하나의 배열안에 여러 타입의 변수 선언 가능 = 자바 히트로지니어스
		Object[] obj1 = {name,s1,t1,e1};
		Person[] p = {s1,t1,e1,new Student("고길동",22,2)};		// 9. 중복시 err. person 타입엔 String 객체가 들어갈 수 없다. name불가.
		
		
		
		// 장점: 다양성, 단점: 번거로움(캐스팅 반복)
		System.out.println("===================================================");
		/* 9. p가 가리키는 곳의 모양 확인(Person 타입의 배열) - p[0],p[1]...는 print메소드를 활용 불가능. */
		for(int i=0;i<p.length;i++){
			//((Student)p[i]).display(); // 10. Student외에 다른 타입들도 포함되어 있으므로 다른 타입은 메소드 출력 불가능.
			if(p[i] instanceof Student)((Student)p[i]).display(); 	// 11. Student 타입일치 확인 instanceof 연산.
			if(p[i] instanceof Employee)((Employee)p[i]).display(); 	// 12. Employee 타입일치 확인 instanceof 연산.
			if(p[i] instanceof Teacher)((Teacher)p[i]).display(); 	// 13. Teacher 타입일치 확인 instanceof 연산.
		}
		System.out.println("===================================================");
		
		/* 10. 오버라이딩을 유도하여 다양한 타입의 배열된 자식의 메소드를 활용 하는 법. = 오버라이딩을 통해서 자식의 메소드를 출력. */
		for(int i=0;i<p.length;i++){ // 배열의 기본 제작
			p[i].display(); // 11. 오버라이딩 = 캐스팅 없이 메소드 활용 = 부모타입에서 자식영역 엑서스 = Person에 display의 메소드의 선언부만 동일하게 추가=자식의 메소드를 활용.
		}
		System.out.println("===================================================");
		
		
		/* 12. 자바 폴리모피즘(다형성) = 메소드는 하나인데 바인딩되는 타입에 따라 다양한 기능 구현 */
		Person pp = s1;		// 13. Person,Employee,Student 타입 다 가능.
		pp.display();		// 14. 어떤 객체가 바인딩 되느냐에 따라서 출력되는 메소드가 다름.
	
		
		System.out.println("===================================================");
		// 15. obj에서 Person 타입만 출력. = 캐스팅 필요 = Person타입으로 캐스팅(=오버라이딩 때문에 그 이하까지 할 필요 없음)
		Object[] obj = {name,s1,t1,e1};
		for(int i =0;i<obj.length;i++)
			if(obj[i] instanceof Person)((Person)obj[i]).display();	// 16. 캐스팅 필요, name은 String이므로 err. instanceof로 타입 일치된 경우만 출력.
	}
}














