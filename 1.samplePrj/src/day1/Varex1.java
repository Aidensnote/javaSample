/* ������ ���� */
package day1;

public class Varex1 {

	public static void main(String[] args) {
		int year = 0;
		int age = 14;
		
		System.out.println(year); // �ʱ� ������ ������ year�� ���
		System.out.println(age); // �ʱ� ������ ������ age�� ���
		
		year = age + 2000; //���� age�� ����� ��(14)�� ����+2000�� ����.
		age = age + 1; //���� age�� ����� ��(14)�� ����+1�� ����.
		System.out.println(year);
		System.out.println(age);
		
		/* ó���� ����� ����
		1. age = age + 1;
		2. age = 14 + 1;
		result = age = 15
		*/
	}
}