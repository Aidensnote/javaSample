/* scanner Ȱ��� */
package day2;

import java.util.Scanner;

public class P40 {

	public static void main(String[] args) {
		Scanner input; //Ÿ�Լ���. (import �ɾ���Ѵ�.)
		input = null; // �ʱ�ȭ ����.
		// input = new scanner(); err �߻�.
		
		input = new Scanner(System.in); //����� ���� �Է�.
		
		System.out.print("�л� �̸��� �Է��ϼ���:_");
		// String name; // string Ÿ�Կ� name�̶�� ����.
		// String name = "ȫ�浿"; // �����Ϸ� ���� �о�帱 ���
		// String name = new String ("ȫ�浿");�� ��°� ����.
		// char c = 'a'; �� ���� string�� �⺻��ó�� ��� �����ϴ�.
		
		String name = input.nextLine(); // return type�� string�̶�� �ǹ�.
		
		System.out.print("������ �Է��ϼ���ex)90:_");

		// int score = input.nextLine(); �¿� Ÿ�� ����ġ err (int/string)
		// Integer.parseInt(input.nextLine())�� Ȱ���ϸ�
		
		
		int score = Integer.parseInt(input.nextLine()); //integer.parseint�� string�� int�� ��ȯ.
		/* ������ ǥ�� int score = input.nextInt();
		   int.nextLine();�� ���͸� ������Ų��. */
		System.out.printf("�̸�: %s, ����: %d %n" ,name, score);
		
		// Ŭ��¡ �޼ҵ�.
		input.close();
		input = null; 
		}
}