package day5;

public class P186 {

	public static void main(String[] args) {
		// int score ;  기본형
		// char chars;
		// String[] names;
		
		/* 배열선언
		int[] score;
		char[] chars;
		String[] names;
		*/
		
		/* 배열생성 */
		String[] names = new String[3]; 
		char[] chars = new char[names.length];

		/* 중복된 코드
		int[] score;
		score = new int[5];
		System.out.print(score[0]+", "); // 배열은 default 초기화.
		System.out.print(score[1]+", ");
		System.out.print(score[2]+", ");
		System.out.print(score[3]+", ");
		System.out.print(score[4]+", ");
		System.out.print(score[5]+", "); // err. 위치 확인 불가.
		*/
		
		
		/* 중복 제거 */
		int[] score;
		score = new int[5];
		for(int i = 0; i < score.length; i++){ // 5=score.length
			System.out.print(score[i]+", ");
		}
		System.out.println("\n====================");
		
		
		/* 새로나온 for{}-데이터(값)를 꺼내서 활용 */
		for(int data : score){
			System.out.print(data+"  ");
		}
		System.out.println("\n====================");
		
		/* default 값 확인 (초기화 값) */
		System.out.println(names[0]+names[1]+names[2]); // 초기값 null
		System.out.println(chars[0]+","+chars[1]+","+chars[2]); // 초기값 ''(블랭크)
		
		
		
	}

}
