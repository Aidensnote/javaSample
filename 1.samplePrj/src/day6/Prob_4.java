package day6;

import java.util.Arrays;

public class Prob_4 {

	public static void main(String[] args) {

		int[] num = new int[5]; // ���� �迭 5�� ���� ����.

		num[0] = (int) (Math.random() * 45) + 1; // 0��°�� �����θ� �ߺ� ���� �ʿ� ����

		for (int i = 1; i < num.length; i++) {
			num[i] = (int) (Math.random() * 45) + 1; // 0�����ϰ� 45���� ������ ���� (�ߺ� ����)
														
			for (int j = 0; j < i; j++) {
				if (num[i] == num[j]) {
					i--;
					break; // �ߺ��� ��� ������, i--�� break; Ȥ�� �󺧸����� continue;

				}

			}
			System.out.println(Arrays.toString(num)); // num�� �迭 �� ���. , �ݺ�ó���� Ƚ�� �����ִ� ��Ʈ ��ġ�� ���.
		}
	}
}
