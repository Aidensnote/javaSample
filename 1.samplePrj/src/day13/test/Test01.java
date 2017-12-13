package day13.test;

public class Test01 {

	public static void main(String[] args) {
		Circle c = new Circle();	//1. ��ü����
		c.calculationArea();
		c.draw();
		c.drawColor();
		
		Shape s = c;			// 2. ���� ��ü ����. = �ּ� ����
		s.calculationArea();
		System.out.println(c);	// 3. toString�޼ҵ�
		System.out.println(s);  // �� �ܿ� �޼ҵ� ȣ�⿡ �������� �ִ�.
		
		
		Drawable d= c;
		d.draw();
		
		//4. �迭���� = �θ�Ÿ�����δ� �迭 ����&�ڵ鸵 ����. = �ڵ鸵 �� �� �ִ� ��ü�� ���� = ���� �����. = drawable,colorable�� ĳ���� �ʿ�.
		Shape[] ss = {
			new Circle(),
			new Rectangle()
		};
		
		//5. ĳ������ ���ؼ� �޼ҵ� ȣ��
		for(int i=0;i<ss.length;i++){
			ss[i].calculationArea();
			((Drawable)ss[i]).draw();
			((Colorable)ss[i]).drawColor();
		}
		
	}

}
