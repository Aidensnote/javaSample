package day16.lang;

public class Test03 {

	public static void main(String[] args) {
		Point p1 = new Point(1,1);	//1
		System.out.println(p1);		//2
		
		
		Point p2 = (Point) p1.clone();	//3. P456  9.object�� �ٿ�ĳ���� �ʿ�
		p1.setX(99);					//12 ������ ����.
		System.out.println(p2);			//11 �������.
		System.out.println(p1);			//13 ������ �ص� Ŭ��(����)�� ������ �״�� ���. �����x
		

	}
}
