package day7;

public class Prob_fin3 {
	public static String leftPad(String str, int size, char padChar) { //static method�� �ּҰ� �ʿ���� Ŭ���� �̸��� �˸� �ҷ����� ����.
		String result = "";

		/* ���� str>size, str���. */
		if (str.length() > size) { //3>7 for�������� ������
			return str;
		}
		int tmp = size-str.length(); //4=7-3
		for (int i = 0; i <tmp; i++) { // 0~4���� �� 4�� �ݺ�
			str = padChar+str;			// !sds->!!sds->!!!sds->!!!!sds���� �ݺ�
		}
		return str;
	} /* rigthPad �߰� */
	
	public static void main(String[] args){ //�׽�Ʈ�ϱ� ���ؼ� main�� �ʿ��ϴ�. J unit test�δ� �ش� �κ� ���� �׽�Ʈ����.
		String s = Prob_fin3.leftPad("SDS", 7, '!'); //�ּ��ʿ�x, Ŭ������������ �ҷ��´� = �̹� �޸𸮿� ������=static ->"�Ű�����/�޼ҵ��� ����θ� �˾ƾ��Ѵ�. // s�ȿ� ���ڿ��� ����.
		System.out.println(s);	// ���� !!!!SDS�� S�� �ּҰ� �����.
		System.out.println(s.equals("!!!!SDS"));
	}
	
}