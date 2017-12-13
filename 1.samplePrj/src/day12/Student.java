package day12;

import day11.prob1.Person;

public class Student extends Object {	//extends Object생략되어 있는 내용.
	
	//1. 변수선언 , encapsulation.
	private String name;
	private int age;
	private int id;
	
	//2. 디폴트 초기화
	public Student() {
		super();	// 생략해도 수행됨. 부모는 Object
	}
	//3. 생성자 함수
	public Student(String name, int age, int id) {
		super();
		this.name = name;
		this.age = age;
		this.id = id;
	}
	
	//4. set&get
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	//13. 오버라이딩
	@Override
		public String toString() {
			//return "Student["+name+","+age+","+id+"]";	//14. 출력한 내용을 리턴 타입(String)에 맞춰서 설정. 7개의 객채생성 = 성능저하의 코딩. String = char의 배열. 리사이징,불변 = 변하면 객체 새로 생성.
			
			//15. String builder,String Buffer를 써야한다.
			StringBuilder sb = new StringBuilder();			
			
			sb.append("Student[");							//16. 생성된 객체에 내용을 나눠서 생성한다.
			sb.append(name);
			sb.append(",");
			sb.append(age);
			sb.append(",");
			sb.append(id);
			sb.append("]");
			return sb.toString();							// 선언부와 return 타입은 일치.
	}
	/* 오버라이딩.	toString을 이용하는것 지양. String은 위험하다.
	@Override
	public boolean equals(Object obj) { // 부모의 선언부 그대로. object타입.
		return ((Student)obj).toString().equals(this.toString()); //instanceof 확인필요.
	} */
	
	@Override
	public boolean equals(Object obj) { 					// 1. 부모의 선언부 그대로. object타입.
		if(!(obj instanceof Student))	return false;		// 2. 타입체크. 일치하지않으면 false. 
			Student data = (Student) obj;					// 3. 비교작업 시작.
			if(id==data.id && age ==data.age && name.equals(data.name)){	// 4. 비교할 것 체크. = 오버라이딩.
				return true;
			}
			return false;
	}
}
	