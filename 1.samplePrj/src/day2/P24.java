/* ������ �� ������ */
package day2;

public class P24 {

	public static void main(String[] args) {
		int x = 600;
		int y = 700;
		int tmp = 0;
		
		/* ���� ��ȯ�� �Ұ����ϹǷ� �ӽ�(temp)�� �д�*/
		tmp = x; // �ӽð��� x�� �ְ�
		x = y; // y���� x�� �ְ�
		y = tmp; // temp���� y�� �־ ��ȯ��Ų��.
		System.out.printf("x= %d , y = %d %n ",x,y);

	}

}
