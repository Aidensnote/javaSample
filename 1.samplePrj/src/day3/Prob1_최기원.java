/* Q1���� lowerCase�� �ƴѰ�� errmsg�� ����� ��� Ȯ�� �ʿ� */

package day3;

public class Prob1_�ֱ�� {

	public static void main(String[] args) {
		
        /*
          ������ �빮�ڸ� �ҹ��ڷ� �����ϴ� �ڵ��Դϴ�.
          ���� ch�� ����� ���ڰ� �빮�� �� ��쿡�� �ҹ��ڷ� �����ϴ� �ڵ带 �ϼ� �մϴ�.
        
        1. �빮��/�ҹ����� ��Ģ(�˰���) Ȯ��
        2. 
        */
		
		
		char ch = 'P';
		char lowerCase = ch >= 'A' && ch <= 'Z'	? (char)(ch+32) : ch;
		//char upperCase = ch >= 'a' && ch <= 'z' ? (char)(ch-32) : ch;
		System.out.print("ch:"+ch);
		System.out.println(" to lowerCase :"+lowerCase);


		/*
		 �Ʒ��� ���� num�� ��������  ��� ���� 0�� ����ϴ� �ڵ��Դϴ�.
		���� �����ڸ� �̿��ؼ� �� �˸��� �ڵ带 �ϼ��ϼ���. 
		*/
		
		int num = -90;
		System.out.println(num > 0 ? "���" : (num==0 ? "0" : "����"));
	}
}