package day5;

public class P186 {

	public static void main(String[] args) {
		// int score ;  �⺻��
		// char chars;
		// String[] names;
		
		/* �迭����
		int[] score;
		char[] chars;
		String[] names;
		*/
		
		/* �迭���� */
		String[] names = new String[3]; 
		char[] chars = new char[names.length];

		/* �ߺ��� �ڵ�
		int[] score;
		score = new int[5];
		System.out.print(score[0]+", "); // �迭�� default �ʱ�ȭ.
		System.out.print(score[1]+", ");
		System.out.print(score[2]+", ");
		System.out.print(score[3]+", ");
		System.out.print(score[4]+", ");
		System.out.print(score[5]+", "); // err. ��ġ Ȯ�� �Ұ�.
		*/
		
		
		/* �ߺ� ���� */
		int[] score;
		score = new int[5];
		for(int i = 0; i < score.length; i++){ // 5=score.length
			System.out.print(score[i]+", ");
		}
		System.out.println("\n====================");
		
		
		/* ���γ��� for{}-������(��)�� ������ Ȱ�� */
		for(int data : score){
			System.out.print(data+"  ");
		}
		System.out.println("\n====================");
		
		/* default �� Ȯ�� (�ʱ�ȭ ��) */
		System.out.println(names[0]+names[1]+names[2]); // �ʱⰪ null
		System.out.println(chars[0]+","+chars[1]+","+chars[2]); // �ʱⰪ ''(��ũ)
		
		
		
	}

}
