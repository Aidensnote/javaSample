package day11;	//�θ� Ŭ����

public class Animal {
	
	/* 1. �������� */
	private String kind = "������ ����";
	
	/* 5. ������ �Լ� */
	public Animal() {
		System.out.println("animal()����");		// �θ� �Լ��� ����Ʈ�� �׻� �켱 ����ȴ�.
	}
	
	/* 4. ����Ʈ�ʱ�ȭ */
	public Animal(String kind) {
		super();
		this.kind = kind;
	}
	/* 3 set&get ���� */
	public String getKind() {
		return kind;
	}
	
	public void setKind(String kind) {
		this.kind = kind;
	}
	
	
	/* 2. �޼ҵ� */
	public void breath(){	//�����
		System.out.println("��� ������ ~~~~");	//������
	}

	

}
