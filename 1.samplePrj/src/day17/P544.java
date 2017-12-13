package day17;

import java.util.Calendar;
import java.util.Date;

public class P544 {

	public static void main(String[] args) {
		String name = "ȫ�浿";
		System.out.printf("%s , %s, %d, %f %n",name,"~~~",90,5.5);			//1 printf ����. ���ڿ��� %s=���� %d=���� %f=�Ǽ� %n�ٹٲ�.. ������� ����
		
		String msg = String.format("%s , %s, %d, %f %n",name,"~~~",90,5.5); //2 �״�� �Է� ���� �޼ҵ�.
		System.out.println(msg);
		
		String df = String.format("%5.2f", Math.PI); 						//3 ��ü�ڸ� 5��, �Ҽ��� 2��.
		System.out.println(df);
		//4 ���� ���Ŀ� �����ʹ� StringŸ�� = ����Ұ�. => format = ���������� ���� ������ ����ϴ� ���� ����.
		
		Date d = new Date(2017,11,21);	
		System.out.println(d);
//		System.out.println(d.getYear());	6 ����������Ƽ�� = ������ �����ϴٰ� ��ü ����� ����ϰ� �ϴ°�. ������ ������ ���x
		System.out.println("===============================");
		
				
//		Calendar c = new Calendar;	7 �����ڸ� ���ؼ� ��ü���� �Ұ�.
		Calendar c = Calendar.getInstance();			// 8 getInstance �޼ҵ� ����ؾ���.
		System.out.println(c);							// 9 c�ȿ��� toString�� ���Ե� �پ��� �޼ҵ尡 ���ԵǾ��ִ�.
		System.out.println(c.get(Calendar.YEAR));		// 10 get()�ȿ��� �޼ҵ带 �����.
//		c.set(2016, 11, 21);							// 11 ��¥ �Է�
		System.out.println(c);							// 12 set�޼ҵ带 ���ؼ� ����. ������ 2016������ 2017�� ����.
		
		
		df = String.format("%tY�� %tm�� %te�� %n", c,c,c);	// 13 �����ȣ, ���ó�¥ ������� �ڵ鸵. ��-��-���� ���. = %tY�� %tm�� %te�� 
		System.out.println(df);
		df = String.format("%1$tY�� %1$tm�� %1$te�� %n", c,"~~~");	// 14 �ϳ��� �������� ���� ���. ���� ��ġ�� �ߺ��Ǽ� ���� ���: [%�ڿ� ��ġ�ε���$�Էµ�����] ���·� �Ѵ�.
		System.out.println(df);
		df = String.format("%1$tY�� %1$tm�� %1$te�� %1$ta���� %n", c,"~~~");	// 15 ta�� ����.
		System.out.println(df);
	}
}
