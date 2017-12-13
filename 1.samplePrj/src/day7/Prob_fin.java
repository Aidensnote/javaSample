package day7;

public class Prob_fin {
	public String leftPad(String str, int size, char padChar) {
		String result = "";

		/* 조건 str>size, str출력. */
		if (str.length() > size) { //str의 사이즈가 size보다 크면 str 그대로 출력.
			return str;
		}
		for (int i = 0; i < size - str.length(); i++) { // size보다 크기가 클때까지 padChar를 계속 더함.
			result += padChar;
		}
		return result + str; // void가 아니므로 return을 타입 일치시킨다 (=String)
	}
	public static void main(String args[]) {
		Prob_fin p = new Prob_fin();
		System.out.println(p.leftPad("SDS", 9, '@'));	// @@@@@@SDS
		System.out.println(p.leftPad("SDS", 9, '@').equals("@@@@@@SDS"));	// 예상값과 동일한 값이 나왔나 테스트&검증.
		
		System.out.println(p.leftPad("sds", 2, '$'));	// sds
		System.out.println(p.leftPad("sds", 2, '$').equals("sds"));	// 예상값과 동일한 값이 나왔나 테스트&검증.
		
	}
}