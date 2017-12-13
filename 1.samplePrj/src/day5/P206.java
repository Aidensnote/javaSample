package day5;

import java.util.Arrays;

public class P206 {
	public static void main(String[] args){
		int[] scors = {99,88,78,97,100};
		String[] names = {"홍길동","고길동","박길동","최길동","이길동"};
		System.out.println(Arrays.toString(scors)); // 위치를 이용할수 없다. (기본형)
		System.out.println(Arrays.toString(names)); // 위치를 이용할 수 있다. (레퍼런스형) .을 이용해서 디렉토리 가능.
		
		/* 찍을 방식 예시: (홍**  점수) */
		// System.out.println(names[0].charAt(0)+"**    "+scors[0]); 중복 발생
		// System.out.println(names[0].charAt(0)+"**    "+scors[0]);
		// System.out.println(names[0].charAt(0)+"**    "+scors[0]);

		for(int i = 0; i<names.length;i++){
			System.out.println(names[i].charAt(0)+"**    "+scors[i]);
		}
		
		
		
		System.out.println("==========================");
		
		/* 데이터를 꺼내서 핸들링 할때 쓰는 for */
		for(int data : scors){ // for(값형태 변수 : 콜렉션프레임워크(집합체=배열)) 형태
			System.out.println(data);
		}
		for(String data : names){
			System.out.println(data);
		}
	}
}