package day13.test;

public abstract class Shape { //��� = ��ü���� �Ұ�.
	//�ν��Ͻ� �������
	protected double area;
	protected String name;
	
	public abstract void calculationArea();
	
	//toString�޼ҵ�
	@Override
	public String toString() {
		return "["+name+", ����: "+area+"]";
	}
	
}

