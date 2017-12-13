/* 키보드를 통해서 점수를 입력받고
    그 점수가 유효하다면 등급처리 (A~D/F) */
package day3;

import java.util.Scanner;

public class P142 {
	public static void main(String[] args) {
		
		//조건값들 초기설정
		int jumsu;
		char grade = ' ';
		
		//점수 입력받기
		Scanner scanner = new Scanner(System.in);
		System.out.print("점수를 입력하세요! \n입력예시) 0~100 ");
		jumsu = Integer.parseInt(scanner.nextLine()); // jumsu = int타입, 들어오는건 string타입, 그러므로 변환하기위해 integer활용.
				
		//조건 범주 밖일 오류값일 경우 진행차단.
		if(!(0<=jumsu&&jumsu<=100)){
			System.out.println("점수가 유효하지 않아 종료됩니다....");
			return; //오류일 경우 진행 종료. 함수의 시작점으로 돌아가는가서 함수수행을 종료.
		}
				
		//등급처리	 (중첩 if else)
		
		System.out.println("이제부터 점수처리 ~~~~~ ");
		
		if(jumsu>=90){
			grade = 'A';
		}else if (jumsu>=80){
			grade = 'B';
		}else if (jumsu>=70){
			grade = 'C';
		}else if (jumsu>=60){
			grade = 'D';
		}else{
			grade = 'F';
		}
		
		System.out.println(jumsu+"점의 등급은 "+grade+"입니다.");
	}
}