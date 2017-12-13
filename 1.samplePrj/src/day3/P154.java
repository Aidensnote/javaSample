/* switch �������� ����ó�� */
package day3;

import java.util.Scanner;

public class P154 {
	public static void main(String[] args) {
		
		//���ǰ��� �ʱ⼳��
		int jumsu;
		char grade = ' ';
		
		//���� �Է¹ޱ�
		Scanner scanner = new Scanner(System.in);
		System.out.print("������ �Է��ϼ���! \n�Է¿���) 0~100 ");
		jumsu = Integer.parseInt(scanner.nextLine()); // jumsu = intŸ��, �����°� stringŸ��, �׷��Ƿ� ��ȯ�ϱ����� integerȰ��.
				
		//���� ���� ���� �������� ��� ��������.
		if(!(0<=jumsu&&jumsu<=100)){
			System.out.println("������ ��ȿ���� �ʾ� ����˴ϴ�....");
			return; //������ ��� ���� ����. �Լ��� ���������� ���ư��°��� �Լ������� ����.
		}

		
		
		
		//���ó��	 (switch)
		
		System.out.println("�������� switch���� ����ó�� ~~~~~ ");
		/*
		if(jumsu>=90){
			grade = 'A';
		}else if (jumsu>=80){
			grade = 'B';
		}else if (jumsu>=70){
			grade = 'C';
		}else if (jumsu>=60){
			grade = 'D';
		}else{
			grade = 'F';
		}
		*/
		
		
		// �˰����� ���� ���(case)�� ����ȭ ���Ѿ� �Ѵ�.
		switch(jumsu/10){ // ����/100�� �ϰԵǸ� 0~10������ ����� ���� ����ȭ.
			case 10:
			case 9: // 100,99���� ������ A������� ���.
				grade = 'A';
				break;
			case 8:
				grade = 'B';
				break;
			case 7:
				grade = 'C';
				break;
			case 6:
				grade = 'D';
				break;
			default:
				grade = 'F';
				//default �ؿ��� break�� �����Ǿ� �ִ�.
		}
		
		System.out.println(jumsu+"���� ����� "+grade+"�Դϴ�.");
	}
}