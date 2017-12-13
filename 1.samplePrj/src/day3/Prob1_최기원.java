/* Q1에서 lowerCase가 아닌경우 errmsg를 출력할 경우 확인 필요 */

package day3;

public class Prob1_최기원 {

	public static void main(String[] args) {
		
        /*
          다음은 대문자를 소문자로 변경하는 코드입니다.
          변수 ch에 저장된 문자가 대문자 인 경우에만 소문자로 변경하는 코드를 완성 합니다.
        
        1. 대문자/소문자의 규칙(알고리즘) 확인
        2. 
        */
		
		
		char ch = 'P';
		char lowerCase = ch >= 'A' && ch <= 'Z'	? (char)(ch+32) : ch;
		//char upperCase = ch >= 'a' && ch <= 'z' ? (char)(ch-32) : ch;
		System.out.print("ch:"+ch);
		System.out.println(" to lowerCase :"+lowerCase);


		/*
		 아래는 변수 num의 값에따라  양수 음수 0을 출력하는 코드입니다.
		삼항 연산자를 이용해서 에 알맞은 코드를 완성하세요. 
		*/
		
		int num = -90;
		System.out.println(num > 0 ? "양수" : (num==0 ? "0" : "음수"));
	}
}