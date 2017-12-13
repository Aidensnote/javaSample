/* scanner 활용법 */
package day2;

import java.util.Scanner;

public class P40 {

	public static void main(String[] args) {
		Scanner input; //타입선언. (import 걸어야한다.)
		input = null; // 초기화 선언.
		// input = new scanner(); err 발생.
		
		input = new Scanner(System.in); //출력할 내용 입력.
		
		System.out.print("학생 이름을 입력하세요:_");
		// String name; // string 타입에 name이라는 변수.
		// String name = "홍길동"; // 컴파일로 인해 읽어드릴 경우
		// String name = new String ("홍길동");과 출력값 동일.
		// char c = 'a'; 와 같이 string은 기본형처럼 사용 가능하다.
		
		String name = input.nextLine(); // return type이 string이라는 의미.
		
		System.out.print("점수를 입력하세요ex)90:_");

		// int score = input.nextLine(); 좌우 타입 불일치 err (int/string)
		// Integer.parseInt(input.nextLine())을 활용하면
		
		
		int score = Integer.parseInt(input.nextLine()); //integer.parseint로 string을 int로 변환.
		/* 동일한 표현 int score = input.nextInt();
		   int.nextLine();로 엔터를 소진시킨다. */
		System.out.printf("이름: %s, 점수: %d %n" ,name, score);
		
		// 클로징 메소드.
		input.close();
		input = null; 
		}
}