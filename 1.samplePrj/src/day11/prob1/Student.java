package day11.prob1;

public class Student extends Person {
	private int id;
	
	public Student() {
		super();
	}

	/* �Ķ���� 3���� �ڵ鸵 �� �� �ִ� ������ �Լ� */
	public Student(String name, int age, int id) {
		super(name, age);	// �θ��� ���� 2���� �θ��� ������ �Լ����� ���.
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
		System.out.printf("��   ��: %s\t ��   ��: %d\t ��    ��: %d\n",super.getName(),super.getAge(),id);
	}
}
