package day6;

import java.util.Arrays;

public class Prob_2 {

	public static void main(String[] args) {

		int[] num = new int[5]; // ���� �迭 5�� ���� ����.

		num[0] = (int) (Math.random() * 5) + 1; // 0��°�� �����θ� �ߺ� ���� �ʿ� ����

		T : for (int i = 1; i < num.length; i++) { //������ ��ġ.
			num[i] = (int) (Math.random() * 5) + 1; // 0�����ϰ� 1~45���� ������ ���� (�ߺ� ����)
														
			for (int j = 0; j < i; j++) {
				if (num[i] == num[j]) {
					i--;
					continue T; //continue�� �� ��� ������ ��ġ ������. �󺧸��� �ʿ�.

				}

			}
			System.out.println(Arrays.toString(num)); // num�� �迭 �� ���. , �ݺ�ó���� Ƚ�� �����ִ� ��Ʈ ��ġ�� ���.
		}
	}
}
