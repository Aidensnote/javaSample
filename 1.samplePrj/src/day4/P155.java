package day4;

import java.util.Scanner;

public class P155 {

	public static void main(String[] args) {
		char gender;
		String regNo; //주민번호
		Scanner scanner = new Scanner(System.in); //Scanner는 메모리에 올려야 가능, 키보드로 받아서 값 입력.
		
		System.out.println("주민번호 입력하세요.\n입력 예)990909-293314"); //성별정보는 '1'의 값의 위치. 0부터시작해서 7번째.
		regNo  = scanner.nextLine();
		
		/* 유효성 검증 */
		if (regNo.length()!=13){ //입력값의 길이가 13가 아닌 조건.
			System.out.println("주민번호 에러");
			return;
		}
		gender = regNo.charAt(7); // gender에 7번째 값을 입력.
		System.out.println(regNo+" => "+gender); //1,2,3,4
		
		//if구문
		
		//swich구문
		switch (gender){
			case '1': //1,3인 경우에 "남성" 출력 후 break.
			case '3':
				System.out.println("남성");
				break;
			case '2': //2,4인 경우에 "여성" 출력 후 break.
			case '4':
				System.out.println("여성");
				break;
			default:
				System.out.println("주민번호 오류");
		}		
	}
}