package day7;

public class Prob_fin {
	public String leftPad(String str, int size, char padChar) {
		String result = "";

		/* ���� str>size, str���. */
		if (str.length() > size) { //str�� ����� size���� ũ�� str �״�� ���.
			return str;
		}
		for (int i = 0; i < size - str.length(); i++) { // size���� ũ�Ⱑ Ŭ������ padChar�� ��� ����.
			result += padChar;
		}
		return result + str; // void�� �ƴϹǷ� return�� Ÿ�� ��ġ��Ų�� (=String)
	}
	public static void main(String args[]) {
		Prob_fin p = new Prob_fin();
		System.out.println(p.leftPad("SDS", 9, '@'));	// @@@@@@SDS
		System.out.println(p.leftPad("SDS", 9, '@').equals("@@@@@@SDS"));	// ���󰪰� ������ ���� ���Գ� �׽�Ʈ&����.
		
		System.out.println(p.leftPad("sds", 2, '$'));	// sds
		System.out.println(p.leftPad("sds", 2, '$').equals("sds"));	// ���󰪰� ������ ���� ���Գ� �׽�Ʈ&����.
		
	}
}