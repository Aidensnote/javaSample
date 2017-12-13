package day8;

public class P294 {
	public static void main(String[] args) {
		String s1 = new String(); //디폴트
		System.out.println(s1);
		
		String s2 = new String("Hello"); //문자열-char의 연속적인 형태
		System.out.println(s2);
		
		char[] c = {'a','b','c','d','e','f'};
		String s3 = new String(c);
		System.out.println(s3);
		
		char[] d = {'a','b','c','d','e','f'};
		String s4 = new String(d,0,4); //쪼개서 만들수 있다.
		System.out.println(s4);
	}
}
