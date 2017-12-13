package day5;

public class Prob_finN {

	public static void main(String[] args) {
		String msg = "hello Java";
		char[] s = msg.toCharArray(); //char의 배열로 만들어줌.
		char[] t = new char [s.length];
		
		for(int i = 0; i<s.length; i++){ //길이
			if(s[i]>='A' && s[i]<='Z'){
				t[i] = (char)(s[i]+32);
			}else if(s[i]==' '){
				t[i] = s[i];
			}else{
				t[i] = (char)(s[i]-32);
			}
		}
		System.out.println(s);
		System.out.println(t);
		
		// String msg2 = t; 타입불일치 char[] != String
		String name = new String("홍길동");
		String msg2 = new String(t);
	}
	
}
