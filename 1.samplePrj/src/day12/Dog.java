package day12;

public class Dog extends Animal { //��ü���� �Ұ�
	
	
	String kind = "������ ����";
	String name;
	
	
	public Dog(String kind, String name) {
		this.kind = kind;
		this.name = name;
	}
	
	public Dog(String superk,String kind, String name) {
		super(superk);
		this.kind = kind;
		this.name = name;
	}
	
	
	public Dog() {
		super();
	}
	
	public void display(){
		System.out.printf("Dog[%s %s %s]%n",super.getKind(),kind,name);
	}
	
	/* 3. ���� ���̵� */
	@Override
	public void breath() {
		System.out.println("��� ����");
		
	}
}
