package day17;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularEx1 {

	public static void main(String[] args) {
		String[] data = {											//1. 데이터 배열
							"bat", "baby", "bonus",
							"cA,", "ca", "co", "c.", "c0", "car", "combat", "count",
							"date","disc"
						};
		String pattern = "";										//2. 패턴 정의할 객체.
		
		Pattern p = Pattern.compile("c[a-z]*");						//3. 패턴 컴파일 과정.

		for (int i = 0; i < data.length; i++) {						//4. 매칭작업
			Matcher m = p.matcher(data[i]);
			if (m.matches())										//5. true면 출력. = 매칭됨
				System.out.println(data[i] + ",");

		}

	}
}
