package day11.prob1;

public class Employee extends Person {
	private String dept;
	
	public String getDept() {
		return dept;
	}

	/* �Ķ���� 3���� �ڵ鸵 �� �� �ִ� ������ �Լ� */
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
		System.out.printf("��   ��: %s\t ��   ��: %d\t ��    ��: %s%n",super.getName(),super.getAge(),dept);
	}

}
