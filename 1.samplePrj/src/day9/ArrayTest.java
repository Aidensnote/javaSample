package day9;

import java.util.Arrays;

import util.Array; // 패키지 외에 메소드 불러오기 위해

public class ArrayTest {

	public static void main(String[] args) {
		int[] source = {77,99,33,79,44}; //데이터
	
		int[] result = Array.sort(source); //함수 호출문 = data 주소->result에 저장.
		System.out.println(Arrays.toString(source)); //source = a 가 똑같은 주소.
		System.out.println(Arrays.toString(result)); //sort메소드가 끝나야지 나오는 결과값. 디버깅 하면 확인 가능.
		
	}

}
