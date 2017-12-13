package day3;

public class Prob1_result {
	public static void main (String[] args){
		
		/*char c = 'a', d = 'A';
		System.out.println(c+" "+(int)c+" , "+d+"  "+(int)d); //아스키 코드값 출력법
		System.out.println((c)+" "+(int)(c++)+" , "+(d)+"  "+(int)(d++));  소문자-대문자 규칙 확인 (아스키 코드 값의 차이 확인)
		System.out.println((c)+" "+(int)(c++)+" , "+(d)+"  "+(int)(d++));  대문자->소문자 +32
		System.out.println((c)+" "+(int)(c++)+" , "+(d)+"  "+(int)(d++));  소문자->대문자 -32
		System.out.println((c)+" "+(int)(c++)+" , "+(d)+"  "+(int)(d++));  for & while로 반복을 제거한다.
		System.out.println((c)+" "+(int)(c++)+" , "+(d)+"  "+(int)(d++));
		System.out.println((c)+" "+(int)(c++)+" , "+(d)+"  "+(int)(d++));
		System.out.println((c)+" "+(int)(c++)+" , "+(d)+"  "+(int)(d++));
		System.out.println((c)+" "+(int)(c++)+" , "+(d)+"  "+(int)(d++));
		System.out.println((c)+" "+(int)(c++)+" , "+(d)+"  "+(int)(d++));
		System.out.println((c)+" "+(int)(c++)+" , "+(d)+"  "+(int)(d++));
		System.out.println((c)+" "+(int)(c++)+" , "+(d)+"  "+(int)(d++));
		System.out.println((c)+" "+(int)(c++)+" , "+(d)+"  "+(int)(d++));
		System.out.println((c)+" "+(int)(c++)+" , "+(d)+"  "+(int)(d++)); */
		
		char ch = 'P';
		// char lowerCase = (ch+32); add casting필요
		// char lowerCase = (char)(ch+32); 모든 규칙에 적용되기 때문에 대문자인 경우인 조건식을 적용시켜야 한다.
		char lowerCase = ('A'<=ch&&ch<='Z') ? (char)(ch+32) : ch; // ('A'<=ch&&ch<='Z') 대문자를 확인하는 조건식, 프로모션이 자동적으로 작동. char<->int
		System.out.print("ch:"+ch);
		System.out.println(" to lowerCase :"+lowerCase);
		System.out.println(" ========================= ");
		
		int num = -90; // int = 음수/0/양수, 조건이 최소 2개 필요. 조건식 ? 조건의참값 : (조건의 거짓값)
		String result = null; // 판별한 결과식이 들어갈 로컬 변수 초기화 선언. 주소형-null, 공백처리도 가능.
		// result = () ? : ; 기본식 형태
		// result = (num>0) ? "양수" : ; 1차 조건 생성
		// result = (num>0) ? "양수" :() ? : ; 2차 조건 생성
		result = (num>0) ? "양수" : ((num<0) ? "음수" : "0") ; //2차 조건 완성
		System.out.println(num+" : "+result);
		
		
		
	}
}
