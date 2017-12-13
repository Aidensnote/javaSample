/* switch 구문으로 점수처리 */
package day3;

import java.util.Scanner;

public class P154 {
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

		
		
		
		//등급처리	 (switch)
		
		System.out.println("이제부터 switch구문 점수처리 ~~~~~ ");
		/*
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
		*/
		
		
		// 알고리즘을 통해 경우(case)를 간략화 시켜야 한다.
		switch(jumsu/10){ // 점수/100을 하게되면 0~10까지의 경우의 수를 간략화.
			case 10:
			case 9: // 100,99점은 동일한 A등급으로 출력.
				grade = 'A';
				break;
			case 8:
				grade = 'B';
				break;
			case 7:
				grade = 'C';
				break;
			case 6:
				grade = 'D';
				break;
			default:
				grade = 'F';
				//default 밑에는 break가 생략되어 있다.
		}
		
		System.out.println(jumsu+"점의 등급은 "+grade+"입니다.");
	}
}