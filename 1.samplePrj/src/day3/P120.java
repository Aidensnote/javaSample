package day3;

public class P120 {

	public static void main(String[] args) {
		char c = '0'; // 0 ~ 9
		boolean result = '0'<=c && c <='9' ; // �������� Ȯ���ϴ� ����.
		
		/* System.out.println(c + " ����? " + result);
		System.out.println('0'+" ==> "+((int)'0')); // �ƽ�Ű �ڵ尪 ��¹�.
		System.out.println('9'+" ==> "+((int)'9')); // �ƽ�Ű �ڵ尪 ��¹�.
		System.out.println("==========================");

		boolean result1 = 48<=c && c <=57; // �������� Ȯ���ϴ� ����. (�ƽ�Ű�ڵ带 Ȱ���� ���)
		System.out.println(c + " ����? " + result1);
		System.out.println("==========================");
		
		boolean f1, f2;
		boolean result3 = (f1 = '0' <= c) & (f2 = c <= '9');  &�� true�� false�� ����, �ڿ����� ��� ����
		boolean result3 = (f1 = '0' <= c) && (f2 = c <= '9'); // &�� true�� false�� ����, && �տ��� false�̸� �ڿ��� ���������ʰ� �ٷ� ��� (����Ŷ����)
		System.out.println(result3); */
		
		System.out.println(11); // P127 toBinaryString�� �̿��ؼ� ������ 2������ ���.
		System.out.println(Integer.toBinaryString(11)); // 2����
		System.out.println("  "+Integer.toBinaryString(3)); // 2����
		System.out.println("   " + (11 & 3)); // byte����
		System.out.println("  "+Integer.toBinaryString( 11 & 3 )); // 2����
		
		
	}
}