package day12;

public class Fish extends Animal {
	
	String name;
	
	/* 4. �̹� �������̵� */
	@Override
	public void breath(){
		System.out.println("�ư��̷� ������ ~~~~");
	}

	
	public Fish() {
		super();
	}

	public Fish(String name) {
		super();
		this.name = name;
	}
	public Fish(String kind, String name) {
		super(kind);
		this.name = name;
	}

	
	public void display(){
		System.out.printf("Fish[%s]%n",super.getKind(),name);
	}
}
