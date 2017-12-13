package day5;

public class Prob1_최기원 {

	public static void main(String[] args) {
		String sourceString = 
				"everyday we have is one more than we deserve";
				String encodedString = "";
				
				
				// 프로그램을 구현부 시작.	
				// 참고 : 문자 'a'의 정수값은 97이며, 'z'는 122입니다. 
				for (int i = 0; i < sourceString.length(); i++) {
					if (sourceString.charAt(i) == 'x' || sourceString.charAt(i) == 'y' || sourceString.charAt(i) == 'z') {
						encodedString += (char) (sourceString.charAt(i) - 23);
					} else if (sourceString.charAt(i) == ' ') {
						encodedString += ' ';
					} else {
						encodedString += (char) (sourceString.charAt(i) + 3);
				}
				//프로그램 구현부 끝.
				
				System.out.println("암호화할 문자열 : " + sourceString);
				System.out.println("암호화된 문자열 : " + encodedString);
				}
			}
}