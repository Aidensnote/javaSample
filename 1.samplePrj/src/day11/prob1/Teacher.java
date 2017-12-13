package day11.prob1;

public class Teacher extends Person {
	private String subject;

	/* ��Ӱ��谡 �ο��������� default ������ �Լ��� �����ϴ°� ����. */
	public Teacher() {
		super();
	}

	/* �Ķ���� 3���� �ڵ鸵 �� �� �ִ� ������ �Լ� */
	public Teacher(String name, int age, String subject) {
		/* ���� ���� ���� 3���� �� �� ���ٷ� ���� ���� */
		//super();
		//setName(name);
		//setAge(age);
		super(name, age);
		this.subject = subject;
	}
	

	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public Teacher(String subject) {
		super();
		this.subject = subject;
	}


	public void display(){
		System.out.printf("��   ��: %s\t ��   ��: %d\t ������: %s%n",super.getName(),super.getAge(),subject);
	}
}
