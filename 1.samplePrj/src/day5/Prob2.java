package day5;

public class Prob2 {

	public static void main(String[] args) {
		String sourceString = "everyday we have is one more than we deserve";
		String encodedString = "";
		
		for(int i = 0; i<=sourceString.length()-1;i++){
			char c = sourceString.charAt(i); //문장이 기니깐 간소화.
			
			if(c == 'x'||c=='y'||c=='z'){
				encodedString += (char)(c-23); //문장에서 x,y,z는 -23을 빼서 a,b,c로 연결. 
			}else if(c==' '){
				encodedString += c; // 공백일 경우 그대로 공백으로 처리
			}else{
				encodedString += (char)(c+3); // 그 외에 값은 +3해서 변화.
				
			}
		}
				
				
				
				System.out.println("암호화할 문자열 : " + sourceString);
				System.out.println("암호화된 문자열 : " + encodedString);
		
	}

}
