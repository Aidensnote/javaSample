package day4;

import java.util.Scanner;

public class P155 {

	public static void main(String[] args) {
		char gender;
		String regNo; //�ֹι�ȣ
		Scanner scanner = new Scanner(System.in); //Scanner�� �޸𸮿� �÷��� ����, Ű����� �޾Ƽ� �� �Է�.
		
		System.out.println("�ֹι�ȣ �Է��ϼ���.\n�Է� ��)990909-293314"); //���������� '1'�� ���� ��ġ. 0���ͽ����ؼ� 7��°.
		regNo  = scanner.nextLine();
		
		/* ��ȿ�� ���� */
		if (regNo.length()!=13){ //�Է°��� ���̰� 13�� �ƴ� ����.
			System.out.println("�ֹι�ȣ ����");
			return;
		}
		gender = regNo.charAt(7); // gender�� 7��° ���� �Է�.
		System.out.println(regNo+" => "+gender); //1,2,3,4
		
		//if����
		
		//swich����
		switch (gender){
			case '1': //1,3�� ��쿡 "����" ��� �� break.
			case '3':
				System.out.println("����");
				break;
			case '2': //2,4�� ��쿡 "����" ��� �� break.
			case '4':
				System.out.println("����");
				break;
			default:
				System.out.println("�ֹι�ȣ ����");
		}		
	}
}