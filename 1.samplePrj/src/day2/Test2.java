package day2;

import java.util.Date;
//import java.sql.Date; 이름이 같으므로 두개 다 걸수 없다. 한가지는 full path를 걸어줘야한다.

public class Test2 {
	public static void main(String[] args) {

		Date now = new Date(); //java.lang엔 Date가 없음. java.util에 있고, Date는 레퍼런스.
		System.out.println(now);
		
		/* 레퍼런스 객채생성 (.디렉토리 지정) */
		System.out.println(now.getYear()); // 대체된게 있어서 삭제 '디프리케이티더api'
		
		//Date today;
		//초기화 필요 System.out.println(today);, null로 초기화 시킨다.
		java.sql.Date today = null; // 서로 다른 full path 적용.
		System.out.println(today); // null은 디렉토리가 없으므로 .를 사용하지 않는다. null type exception.
		
		now = null; //이거로 띄워진 메모리를 가비지로 변경해서 자른다.
	}
}