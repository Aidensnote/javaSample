package day11.prob1;

public class Employee extends Person {
	private String dept;
	
	public String getDept() {
		return dept;
	}

	/* 파라미터 3개를 핸들링 할 수 있는 생성자 함수 */
	public Employee(String name, int age, String dept) {
		super(name, age);
		this.dept = dept;
	}

	
	public void setDept(String dept) {
		this.dept = dept;
	}
	public Employee() {
		super();
	}
	public Employee(String dept) {
		super();
		this.dept = dept;
	}
	
	
	public void display(){
		System.out.printf("이   름: %s\t 나   이: %d\t 부    서: %s%n",super.getName(),super.getAge(),dept);
	}

}
