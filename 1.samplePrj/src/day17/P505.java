package day17;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P505 {

	public static void main(String[] args) {
		//P507에 패턴 생성 방법 설명
		
		String[] data = {											//1. 데이터 배열
							"javains","010-1234-9999","02-222-3434",
							"javains@naver.com","a","A","1234567","java test",
							"f"
						};
//		String pattern = "j.*";										//2. 패턴 정의할 객체. "유효성검증,체크"
		String pattern = "(02|010)-\\d{3,4}-\\d{4}";						//6. 패턴제작: 앞자리 02||010 - 두번째는 정수(d) 3~4자리{3,4} - 세번째는 정수(d) 4자리{4}	
		
		Pattern p = Pattern.compile(pattern);						//3. 패턴 컴파일 과정.

		for (int i = 0; i < data.length; i++) {						//4. 매칭작업
			Matcher m = p.matcher(data[i]);
			if (m.matches())										//5. true면 출력. = 매칭됨
				System.out.println(data[i]);

		}
		System.out.println("==main end==");
	}
}
