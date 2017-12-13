package day11.prob1; // 패키지 안에 패키지

public class Person {
	
	/* 공통된 부분=상속되는 부분 + encapsulation(private처리) */
	private String name;
	private int age;

	
	/* 생성자, default 초기화 */
	public Person() {
		super();
	}
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	/* set & get */
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
	
	/* 12. 오버라이딩을 위한 출력 메소드(선언부만 동일) */
	public void display(){}
	
}
