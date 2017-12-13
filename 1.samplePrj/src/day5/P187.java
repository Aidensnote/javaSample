package day5;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class P187 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자를 입력하세요_");
		int[] num;
		num = new int[Integer.parseInt(scanner.nextLine())];
		for(int i = 0; i<num.length; i++){
			num[i] = (int)(Math.random()*45)+1;
		}
		
		
		
		/* 로또번호
		int[] num;
		num = new int[5];
		for(int i = 0; i<num.length;i++){
			num[i] = (int)(Math.random()*45)+1
		}
		
		
		/* 10의 배수 입력
		int[] num;
		num = new int[5];
		for(int i = 0; i<num.length;i++){
			num[i] = i*10+10;
		}
		*/
		
		/* 내가 원하는 값 초기화
		num[0] = 10;
		num[1] = 20;
		num[2] = 30;
		num[3] = 40;
		num[4] = 50;
		
		
		
		for(int i=0; i<num.length; i++){
			System.out.print(num[i]+"  ");
		}
		System.out.println("\n==================");
		
		for(int i = 0; i<num.length;i++){
			num[i] = i*10+10;
			System.out.print(num[i]+"  ");
		}
		
		System.out.println();
		System.out.println(num); // 주소값
		System.out.println(Arrays.toString(num)); // 배열의 값 출력 메소드.
		System.out.println(Math.random()); // double(0<사이범위<1) 형의 난수-임의값 생성 메소드. 매번 다른값이 발생.
		System.out.println((int)(Math.random()*45)+1); // *44 인경우 정수로 변경 0~44, +1할 경우 1~45사이의 임의값 생성.
		
		int[] lotto;
		lotto = new int[5];
			for(int j = 0; j<num.length;j++){
				num[j] = (int)(Math.random()*45)+1;
		*/
		
		
		}
	}
