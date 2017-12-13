package day5;

import java.util.Arrays;

public class P192 {

	public static void main(String[] args) {
		int[] src = {66,77,88,99,56,79,78}; // 배열 선언, 생성, 초기화 동시에 진행
		System.out.println(Arrays.toString(src)); //확인. 배열은 리사이징 불가능.
	
		int[] dest = new int[src.length*2]; // 2배의 크기의 확장 생성.
		System.out.println(Arrays.toString(dest)); //확인. 배열은 리사이징 불가능.
		
		/* 배열복사 api활용 */
		System.arraycopy(src, 0, dest, 7, src.length); //인풋파라미터: arraycopy(원본(소스), 시작점, 복사할곳(목적지), 복사할곳의 시작점, 크기);
		System.out.println(Arrays.toString(dest));
	}
}