/* Ű���带 ���ؼ� ������ �Է¹ް�
    �� ������ ��ȿ�ϴٸ� ���ó�� (A~D/F) */
package day3;

import java.util.Scanner;

public class P142 {
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
				
		//���ó��	 (��ø if else)
		
		System.out.println("�������� ����ó�� ~~~~~ ");
		
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
		
		System.out.println(jumsu+"���� ����� "+grade+"�Դϴ�.");
	}
}