package day13.test;	// ���-1��, �׵ڿ� implements �ڿ��� �������̽��� ������ ����.

public class Circle extends Shape implements Drawable, Colorable{	//�����
	
	
	
	//4. �������̵� ����
	@Override
	public void calculationArea() {
		System.out.println(getClass().getSimpleName()+"�� ������ ����մϴ�."); // 7.Circle�� �޼ҵ� ����.
		
	}
	//5. Drawable
	@Override
	public void draw() {
		System.out.println(getClass().getSimpleName()+" �� �׸���.");
		
		
	}
	//6. Colorable
	@Override
	public void drawColor() {
		System.out.println(getClass().getSimpleName()+" ��ĥ�ϱ�.");
		
		
	}
	
	
}
