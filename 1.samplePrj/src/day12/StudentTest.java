package day12;

public class StudentTest {

	public static void main(String[] args) {
		//5 ��ü����
		String name = new String("java Test~~~~");
		System.out.println(name);	// 6. name �ȿ��� �ּ�����. ������ ����� ������ ���.
		
		// System.out.println(new java.util.Date());	//7. fullfath �ּ�
		java.util.Date date = new java.util.Date();
		System.out.println(date);						//8. ���� ���.
		
		Student s = new Student("ȫ�浿", 22, 1);			//9. �ּҸ� ����� toString�޼ҵ带 �������̵� ���� �ʾұ� ������.
		System.out.println(s);							//10. ��ǻ� ������ �������� �̷�����. name.toString�� ȣ���ϴ� ���̴�.

		System.out.println("==================================");
		//11. �θ� toString�� ������ �ִٴ� �ǹ� Ȯ��.
		System.out.println(name.toString());	
		System.out.println(date.toString());	
	
		/* �������̵� ���Ŀ� ���� ���,�ּ����x */
		System.out.println(s);				//15. �������̵� ���Ķ� �������
		System.out.println(s.toString());	//12. �������̵��� �ȵǼ� �ּ����							
	
		System.out.println(name);	// 6. name �ȿ��� �ּ�����. ������ ����� ������ ���.
	
	}
}
