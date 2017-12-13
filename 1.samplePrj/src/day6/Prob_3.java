package day6;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Prob_3 {

	public static void main(String[] args) {
		String size = JOptionPane.showInputDialog("1~45 사이에 정수를 입력해주세요!!"); //jdk 1.2 이후 , 데이터가 입력전까지 블럭.
		// System.out.println(size); gui로 입력창 생성 -> 입력한 데이터를 msg에 String타입으로 저장된다.
		
		int[] num = new int[Integer.parseInt(size)]; // 정수 배열 5개 변수 생성. size는 String에서 int로 변환(캐스팅)해야하므로 integer.paseint를 활용.

		num[0] = (int) (Math.random() * 45) + 1; // 0번째는 스스로를 중복 비교할 필요 없음

		for (int i = 1; i < num.length; i++) {
			num[i] = (int) (Math.random() * 45) + 1; // 0제외하고 45까지 난수값 생성 (중복 가능)
														
			for (int j = 0; j < i; j++) {
				if (num[i] == num[j]) {
					i--;
					break; // 중복된 결과 생성시, i--로 break; 혹은 라벨링으로 continue;

				}

			}
		}
		System.out.println(Arrays.toString(num)); // num의 배열 값 출력. , 반복처리된 횟수 보여주는 루트 위치에 출력.
	}
}
