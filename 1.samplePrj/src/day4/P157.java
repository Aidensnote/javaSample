package day4;

public class P157 {

	public static void main(String[] args) {
		
		/*
		System.out.println("Hello java");
		System.out.println("Hello java");
		System.out.println("Hello java");
		System.out.println("Hello java");
		System.out.println("Hello java");
		System.out.println("Hello java");
		System.out.println("Hello java");
		System.out.println("Hello java");
		System.out.println("Hello java");
		
		ī���� �߰�
		int count = 0;
		System.out.println("Hello java "+count++);
		System.out.println("Hello java "+count++);
		System.out.println("Hello java "+count++);
		System.out.println("Hello java "+count++);
		System.out.println("Hello java "+count++);
		System.out.println("Hello java "+count++);
		System.out.println("Hello java "+count++);
		System.out.println("Hello java "+count++);
		System.out.println("Hello java "+count++);
		System.out.println("Hello java "+count++); */


		/* for�� �Ἥ ���Ǹ�ŭ �ݺ��ϱ�
		for(int count=0; count<5;count++){
			System.out.println("Hello java  "+count); */
		
		/* ���� �ҹ��� & �빮�� �ƽ�Ű �ڵ尪 üũ*/
		
			System.out.println("���� �ҹ��� �ڵ尪 Ȯ��"); //'a'~'z'����
			char c = 'a', d = 'A';
			for(int count=0; count<26;count++){
			//char c = 'a', d = 'A'; ���� ������ �ȿ� �ϸ� ��ȭ�� ����. a�������,������ �������,�����ٸ� �ݺ�
			System.out.println(c+" "+(int)(c++)+","+d+" "+(int)(d++)); //a=97
		}
			// System.out.println(count); 	count ���� ������ for�ȿ��� �����̹Ƿ� ���� ��, ���� ������ for{} ���� �ϸ� ��ȿ�ϴ�.
			// System.out.println(c);		}���̹Ƿ� ������ ������.
	}
}