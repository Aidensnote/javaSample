package day2;

public class Test1 {

	public static void main(String[] args) {
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE);
		
		char c = 'a';
		
		//���������� ó����.
		System.out.println(c+" ���ڴ�? "+Character.isDigit(c));
		
		// int num = "600"; �Ұ���
		int num = Integer.parseInt("600");
		System.out.println(num/10);
		// System.out.println("600"/10); �Ұ���.
		
	}
}