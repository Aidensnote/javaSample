package day16.lang;

public class P464 {
	//String = �������� , StringBuffer = ���� ����.
	public static void main(String[] args) {
		String msg = "Hello java test ~~~~";		//1 �ڵ�ǥ�� �ö�. new�ϸ� heap������ �ö�.
		System.out.println(msg);
		
		msg.replace('~', '!');	//2 String�� �б������̹Ƿ� ����x. �������� ������� �ʴ´�.
		System.out.println(msg);
		System.out.println(msg.replace('~', '!'));	//3 ����� �ּҷθ� ȣ���.
		// System.out.println(msg=msg.replace('~', '!'));	//4 ����� ���� �־���߸� ������ ����.
		
		msg.concat("sample");	//5 ���ڿ� ���ϱ�
		System.out.println(msg);	//6 ������ �ٲ��� �ʴ´�.
		
		StringBuffer sb = new StringBuffer("StringBuffer test");		//8
		System.out.println(sb);	//9
		sb.reverse();			//10 �յڷ� ���� �ٲ�
		System.out.println(sb);	//11 ������ �ٲ�
		sb.reverse();	
		
		sb.append(" Sample");	//12 �ڿ� ���̱�.
		System.out.println(sb);	//13
		
		String s = sb.toString();	//14. ���ڿ��� ��ȯ.
		System.out.println(s);
		
		
		
	}
}
