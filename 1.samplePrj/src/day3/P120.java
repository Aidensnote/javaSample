package day3;

public class P120 {

	public static void main(String[] args) {
		char c = '0'; // 0 ~ 9
		boolean result = '0'<=c && c <='9' ; // 숫자인지 확인하는 수식.
		
		/* System.out.println(c + " 숫자? " + result);
		System.out.println('0'+" ==> "+((int)'0')); // 아스키 코드값 출력법.
		System.out.println('9'+" ==> "+((int)'9')); // 아스키 코드값 출력법.
		System.out.println("==========================");

		boolean result1 = 48<=c && c <=57; // 숫자인지 확인하는 수식. (아스키코드를 활용한 방법)
		System.out.println(c + " 숫자? " + result1);
		System.out.println("==========================");
		
		boolean f1, f2;
		boolean result3 = (f1 = '0' <= c) & (f2 = c <= '9');  &는 true던 false던 연산, 뒤에까지 모두 연산
		boolean result3 = (f1 = '0' <= c) && (f2 = c <= '9'); // &는 true던 false던 연산, && 앞에서 false이면 뒤에는 연산하지않고 바로 출력 (숏서킷로직)
		System.out.println(result3); */
		
		System.out.println(11); // P127 toBinaryString을 이용해서 정수로 2진수로 출력.
		System.out.println(Integer.toBinaryString(11)); // 2진수
		System.out.println("  "+Integer.toBinaryString(3)); // 2진수
		System.out.println("   " + (11 & 3)); // byte연산
		System.out.println("  "+Integer.toBinaryString( 11 & 3 )); // 2진수
		
		
	}
}