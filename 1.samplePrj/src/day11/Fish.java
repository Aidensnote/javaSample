package day11;

public class Fish extends Animal { //11. ���
	
	/* 12. �������� */
	String name;
	
	@Override //�������̵� �������̼� �ּ�.
	public void breath(){						// 13. �θ��� ����� �״��.
		System.out.println("�ư��̷� ������ ~~~~");	//14. �����θ� �����ϸ� �������̵�. �������� ����.
	}

	/* 15. ����Ʈ , �������Լ� */
	public Fish() {
		super();
	}

	public Fish(String name) {
		super();
		this.name = name;
	}
	public Fish(String kind, String name) {
		super(kind);	// ���ۿ� �Ķ���� �κ��� �θ��� kind�� �̾�޾Ƽ� Ȱ��.
		//super(); ���� 1������ �Ʒ��� 2������ ��ģ ���.
		//super.setKind(kind);
		this.name = name;
	}

	
	// 16. ���
	public void display(){
		System.out.printf("Fish[%s]%n",super.getKind(),name); //�θ𿡰Լ� kind�� ��������. private�� get�޼ҵ带 �����.
	}
}
