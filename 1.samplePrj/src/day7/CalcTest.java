package day7;

public class CalcTest {
	public static void main(String[] args) {

		/* ��ü ���� */
		Calc c1 = new Calc();
		Calc c2 = new Calc();
		Calc c3 = new Calc();

		/* c1,c2,c3�� ��ġ�ϴ� ���� �ݺ� ����
		 * add�� ������ ������ ����.
		 * �޸𸮿� �����͸� �ڵ鸵 �� �� ����.
		 * new�� ���� ��ü�� ���� �޸𸮿� ��� �ǹ̰� ����.
		 * ���� �������� static ó�� �ǽ�.  
		
		c1.add(455, 765); �����ص� ������� ������ ����. ������� ����.
		System.out.println(Calc.add(455, 765));
		c2.add(455, 765);
		System.out.println(c2.add(455, 765));
		c3.add(455, 765);
		System.out.println(c3.add(455, 765));
		*/
		
		System.out.println(c1.add(455, 765)); // static �޸𸮿��� ����ͼ� ���Ƿ� ������ �Լ� ����.
		System.out.println(Calc.add(455, 765)); // (Ŭ���� ����.�޼ҵ�) �������� �����.
		System.out.println(Calc.sub(455, 765));
		System.out.println(Calc.multi(455, 765));
		System.out.println(Calc.div(455, 765));
		
		

	}

}
