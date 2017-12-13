package day2;

public class Test1 {

	public static void main(String[] args) {
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE);
		
		char c = 'a';
		
		//내부적으로 처리함.
		System.out.println(c+" 숫자니? "+Character.isDigit(c));
		
		// int num = "600"; 불가능
		int num = Integer.parseInt("600");
		System.out.println(num/10);
		// System.out.println("600"/10); 불가능.
		
	}
}