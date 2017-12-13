package day16.lang;

public class P464 {
	//String = 원본유지 , StringBuffer = 원본 변경.
	public static void main(String[] args) {
		String msg = "Hello java test ~~~~";		//1 코드표에 올라감. new하면 heap영역에 올라감.
		System.out.println(msg);
		
		msg.replace('~', '!');	//2 String은 읽기전용이므로 변경x. 원래값은 변경되지 않는다.
		System.out.println(msg);
		System.out.println(msg.replace('~', '!'));	//3 변경된 주소로만 호출됨.
		// System.out.println(msg=msg.replace('~', '!'));	//4 변경된 값을 넣어줘야만 원본이 변경.
		
		msg.concat("sample");	//5 문자열 더하기
		System.out.println(msg);	//6 원본은 바뀌지 않는다.
		
		StringBuffer sb = new StringBuffer("StringBuffer test");		//8
		System.out.println(sb);	//9
		sb.reverse();			//10 앞뒤로 순서 바꿈
		System.out.println(sb);	//11 원본이 바뀜
		sb.reverse();	
		
		sb.append(" Sample");	//12 뒤에 붙이기.
		System.out.println(sb);	//13
		
		String s = sb.toString();	//14. 문자열로 변환.
		System.out.println(s);
		
		
		
	}
}
