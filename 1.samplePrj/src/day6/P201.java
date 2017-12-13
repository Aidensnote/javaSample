package day6;

import java.util.Arrays;

public class P201 {

	public static void main(String[] args) { //실행 파라미터.

		/* 데이터 유효성 검사 */
		if(args.length == 0){ //입력받을 값이 없을때 종료되는 것을 방지.
			System.out.println("배열의 사이즈를 실행 파라미터로 입력해 주세요~~");
			return; // 다시 리턴해서 입력받기 전으로 출력. 비정상 종료 방지.
		}
		
		
		int[] num = new int [Integer.parseInt(args[0])];
		// 1~45사이 난수 생성.
		
		for(int i = 0; i<=num.length-1; i++){
			num[i] = (int)(Math.random()*45)+1; //0~44 이므로 +1 = 1~45까지 생성.
		} //중복값을 확인하기 위한 알고리즘을 추가할 위치.
		
		/* 정렬 전에 원본 데이터를 보존하는 방법 */
		int[] target = new int [num.length]; //똑같은 사이즈의 배열 생성, 복사를 진행.
		System.arraycopy(num, 0, target, 0, target.length); //오브젝트-주소(레퍼런스); num을 0부터 target을 0부터 얼마나(target.length=전부)
		
		
		System.out.println(Arrays.toString(num));

		// 정렬 진행
		// num의 길이는 num.lengh-1까지.
		// 연산의 범위는 num[i]+1
		for(int i = 0; i< num.length-1;i++){ //길이
			for(int j = i+1; j < num.length;j++){ //범위
				if(num[i]>num[j]){ //크기 비교.
					int tmp = num[i];
					num[i] = num[j];
					num[j] = tmp;
				}
				System.out.println(i+" "+j);
			}
			System.out.println("==============");
		}
		System.out.println("원본 : ");
		System.out.println(Arrays.toString(target));
		System.out.println("정렬후 : ");
		System.out.println(Arrays.toString(num));
	}
}