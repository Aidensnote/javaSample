package day6;

import java.util.Arrays;

public class Prob_4 {

	public static void main(String[] args) {

		int[] num = new int[5]; // 정수 배열 5개 변수 생성.

		num[0] = (int) (Math.random() * 45) + 1; // 0번째는 스스로를 중복 비교할 필요 없음

		for (int i = 1; i < num.length; i++) {
			num[i] = (int) (Math.random() * 45) + 1; // 0제외하고 45까지 난수값 생성 (중복 가능)
														
			for (int j = 0; j < i; j++) {
				if (num[i] == num[j]) {
					i--;
					break; // 중복된 결과 생성시, i--로 break; 혹은 라벨링으로 continue;

				}

			}
			System.out.println(Arrays.toString(num)); // num의 배열 값 출력. , 반복처리된 횟수 보여주는 루트 위치에 출력.
		}
	}
}
