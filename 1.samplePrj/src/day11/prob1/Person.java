package day11.prob1; // ��Ű�� �ȿ� ��Ű��

public class Person {
	
	/* ����� �κ�=��ӵǴ� �κ� + encapsulation(privateó��) */
	private String name;
	private int age;

	
	/* ������, default �ʱ�ȭ */
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
	
	/* 12. �������̵��� ���� ��� �޼ҵ�(����θ� ����) */
	public void display(){}
	
}
