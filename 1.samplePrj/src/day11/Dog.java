package day11;

public class Dog extends Animal { // 6. ��� ó��
	
	/* 7. �������� */
	String kind = "������ ����";
	String name;
	
	// 8. ����Ʈ �ʱ�ȭ
	public Dog(String kind, String name) {
		//super();	//������ animal�� defalut �����ڸ� �ٳ�´�.
		this.kind = kind;
		this.name = name;
	}
	
	public Dog(String superk,String kind, String name) {
		//super(); �۽�Ʈ ������Ʈ��Ʈ. �ϳ��� ����.
		super(superk);	//������ animal�� defalut �����ڸ� �ٳ�´�.
		this.kind = kind;
		this.name = name;
	}
	
	// 9. ������ �Լ�
	public Dog() {
		super();
	}
	// 10. ��� �޼ҵ�
	public void display(){
		System.out.printf("Dog[%s %s %s]%n",super.getKind(),kind,name);
	}

}
