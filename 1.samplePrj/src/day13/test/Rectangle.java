package day13.test;

public class Rectangle extends Shape implements Colorable, Drawable{ //8. �����.(���/���ø���Ʈ), ������ + 3�� ���� �������̵�.

	@Override
	public void draw() {
		System.out.println(getClass().getSimpleName()+"�� ������ ����մϴ�.");	// �޼ҵ� ����
		
	}

	@Override
	public void drawColor() {
		System.out.println(getClass().getSimpleName()+" �׸���.");
		
	}

	@Override
	public void calculationArea() {
		System.out.println(getClass().getSimpleName()+" ��ĥ�ϱ�.");
		
	}	

}
