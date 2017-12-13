/* 변수가 저장 */
package day1;

public class Varex1 {

	public static void main(String[] args) {
		int year = 0;
		int age = 14;
		
		System.out.println(year); // 초기 설정된 변수값 year을 출력
		System.out.println(age); // 초기 설정된 변수값 age를 출력
		
		year = age + 2000; //변수 age에 저장된 값(14)에 수식+2000을 연산.
		age = age + 1; //변수 age에 저장된 값(14)에 수식+1을 연산.
		System.out.println(year);
		System.out.println(age);
		
		/* 처리된 진행된 과정
		1. age = age + 1;
		2. age = 14 + 1;
		result = age = 15
		*/
	}
}