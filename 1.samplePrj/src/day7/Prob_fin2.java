package day7;

public class Prob_fin2 {
	public String leftPad(String str, int size, char padChar) {
		String result = "";

		/* ���� str>size, str���. */
		if (str.length() > size) { //str�� ����� size���� ũ�� str �״�� ���.
			return str;
		}
		int tmp = size-str.length();
		for (int i = 0; i <tmp; i++) { // size���� ũ�Ⱑ Ŭ������ padChar�� ��� ����.
			str = padChar+str;
		}
		return str;
	}
	public static void main(String args[]) {
		Prob_fin2 p = new Prob_fin2();
		System.out.println(p.leftPad("SDS", 9, '@'));	// @@@@@@SDS
		System.out.println(p.leftPad("SDS", 9, '@').equals("@@@@@@SDS"));	// ���󰪰� ������ ���� ���Գ� �׽�Ʈ&����.
		
		System.out.println(p.leftPad("sds", 2, '$'));	// sds
		System.out.println(p.leftPad("sds", 2, '$').equals("sds"));	// ���󰪰� ������ ���� ���Գ� �׽�Ʈ&����.
		
	}
}