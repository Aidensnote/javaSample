package day8;

public class P294 {
	public static void main(String[] args) {
		String s1 = new String(); //����Ʈ
		System.out.println(s1);
		
		String s2 = new String("Hello"); //���ڿ�-char�� �������� ����
		System.out.println(s2);
		
		char[] c = {'a','b','c','d','e','f'};
		String s3 = new String(c);
		System.out.println(s3);
		
		char[] d = {'a','b','c','d','e','f'};
		String s4 = new String(d,0,4); //�ɰ��� ����� �ִ�.
		System.out.println(s4);
	}
}
