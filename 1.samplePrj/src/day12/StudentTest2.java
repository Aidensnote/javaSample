package day12;

public class StudentTest2 {

	public static void main(String[] args) {

		
		/*��ü �񱳸� �ؾ��ϹǷ� equals�޼ҵ� */
		String name = new String("java Test~~~~");
		String name2 = new String("java Test~~~~");		
		System.out.println(name==name2);				// name !=name2 �� �ּҰ� �ٸ���.
		System.out.println(name.equals(name2));			// name1�� �ּҿ� equals�����ڸ� �̿��ؼ� name�� name2�� �ּҿ� ��ü���� ���Ѵ�.
														// ����(name)-�񱳴����(name2) ����
		
		java.util.Date date = new java.util.Date();
		java.util.Date date2 = new java.util.Date();	 
		System.out.println(date==date2);				// ������ ����ִ� �ּ� ���� ���Ѵ�.
		System.out.println(date.equals(date2));
		
		
		Student s = new Student("ȫ�浿", 22, 1);
		Student s2 = new Student("ȫ�浿", 22, 1);		
		System.out.println(s==s2);						// ������ ����ִ� �ּ� ���� ���Ѵ�. �⺻�� ���� ��.
		System.out.println(s.equals(s2));				// ==�� ���� ���� ��µ�. ��ü�� ���Ҷ��� equals�� ����Ѵ�. equals�޼ҵ� �������̵��� �Ǿ����� �ʱ� ������.
		System.out.println(s.equals(date));				// date ��ü�� object��ü. (�ٸ�Ÿ���� ���� �� ����.=��� �ּ�/Ÿ�Ե� ���� �� ����.) 
		
		String s3 = null;								// �ʱ�ȭ.
		System.out.println(s.equals(s3)); 


		
		System.out.println("=============================");
		/* ==�� equals */
		int i=10, j=10;					//== ������. ������ ���� ���ϼ���.
		System.out.println(i==j);
		
		
		
	
	
	
	}
}
