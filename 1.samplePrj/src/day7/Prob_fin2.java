package day7;

public class Prob_fin2 {
	public String leftPad(String str, int size, char padChar) {
		String result = "";

		/* 조건 str>size, str출력. */
		if (str.length() > size) { //str의 사이즈가 size보다 크면 str 그대로 출력.
			return str;
		}
		int tmp = size-str.length();
		for (int i = 0; i <tmp; i++) { // size보다 크기가 클때까지 padChar를 계속 더함.
			str = padChar+str;
		}
		return str;
	}
	public static void main(String args[]) {
		Prob_fin2 p = new Prob_fin2();
		System.out.println(p.leftPad("SDS", 9, '@'));	// @@@@@@SDS
		System.out.println(p.leftPad("SDS", 9, '@').equals("@@@@@@SDS"));	// 예상값과 동일한 값이 나왔나 테스트&검증.
		
		System.out.println(p.leftPad("sds", 2, '$'));	// sds
		System.out.println(p.leftPad("sds", 2, '$').equals("sds"));	// 예상값과 동일한 값이 나왔나 테스트&검증.
		
	}
}