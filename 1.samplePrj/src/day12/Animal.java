package day12;

public abstract class Animal {	//2. abstract Ŭ���� (�߻� Ŭ����)�� ����. = ����� ������ �� abstract Ŭ���� ����.
	
	private String kind = "������ ����";
	
	public Animal() {
		System.out.println("animal()����");
	}
	
	public Animal(String kind) {
		super();
		this.kind = kind;
	}
	public String getKind() {
		return kind;
	}
	
	public void setKind(String kind) {
		this.kind = kind;
	}
	
	
	/* 1. ������ ���� abstract �޼ҵ� */
	public abstract void breath();
	
}
