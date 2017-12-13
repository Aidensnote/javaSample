package day11.prob1;

public class Student extends Person {
	private int id;
	
	public Student() {
		super();
	}

	/* 파라미터 3개를 핸들링 할 수 있는 생성자 함수 */
	public Student(String name, int age, int id) {
		super(name, age);	// 부모의 변수 2개를 부모의 생성자 함수에서 출력.
		this.id = id;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Student(int id) {
		super();
		this.id = id;
	}
	

	public void display(){
		System.out.printf("이   름: %s\t 나   이: %d\t 학    번: %d\n",super.getName(),super.getAge(),id);
	}
}
