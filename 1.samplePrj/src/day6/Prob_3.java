package day6;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Prob_3 {

	public static void main(String[] args) {
		String size = JOptionPane.showInputDialog("1~45 ���̿� ������ �Է����ּ���!!"); //jdk 1.2 ���� , �����Ͱ� �Է������� ��.
		// System.out.println(size); gui�� �Է�â ���� -> �Է��� �����͸� msg�� StringŸ������ ����ȴ�.
		
		int[] num = new int[Integer.parseInt(size)]; // ���� �迭 5�� ���� ����. size�� String���� int�� ��ȯ(ĳ����)�ؾ��ϹǷ� integer.paseint�� Ȱ��.

		num[0] = (int) (Math.random() * 45) + 1; // 0��°�� �����θ� �ߺ� ���� �ʿ� ����

		for (int i = 1; i < num.length; i++) {
			num[i] = (int) (Math.random() * 45) + 1; // 0�����ϰ� 45���� ������ ���� (�ߺ� ����)
														
			for (int j = 0; j < i; j++) {
				if (num[i] == num[j]) {
					i--;
					break; // �ߺ��� ��� ������, i--�� break; Ȥ�� �󺧸����� continue;

				}

			}
		}
		System.out.println(Arrays.toString(num)); // num�� �迭 �� ���. , �ݺ�ó���� Ƚ�� �����ִ� ��Ʈ ��ġ�� ���.
	}
}
