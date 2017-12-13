package day17;

import java.util.Arrays;
import java.util.StringTokenizer;

public class P514 {

	public static void main(String[] args) {
		String msg = "홍길동: 90/100/80 "; 	//1	/로 자르면 3개, :로 자르면 2개 split은 두번 작업해야함.
		String[] data = msg.split(":");		//2 자르는 기준에 따라 횟수가 증가함.
		System.out.println(Arrays.toString(data));
		String[] jumsu = data[1].split("/");
		System.out.println(Arrays.toString(jumsu)); //3 반복처리하면서 구별 가능.
		
		
		System.out.println("==============================");
		
		StringTokenizer st = new StringTokenizer(msg, ":/",true);	//4 :/두개 구분자로 나눔. 여러개 핸들링 가능. 8. 자른것을 기준으로 제배열. 
		System.out.println(st.countTokens());					//5 쪼개진 수 확인
		while(st.hasMoreTokens()){								//6. 반복으로 출력
			String s = st.nextToken().trim();					//7 s에 저장+공백제거
			System.out.print(s);
		}

	}

}
