package day5;

public class Prob_finN {

	public static void main(String[] args) {
		String msg = "hello Java";
		char[] s = msg.toCharArray(); //char�� �迭�� �������.
		char[] t = new char [s.length];
		
		for(int i = 0; i<s.length; i++){ //����
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
		
		// String msg2 = t; Ÿ�Ժ���ġ char[] != String
		String name = new String("ȫ�浿");
		String msg2 = new String(t);
	}
	
}
