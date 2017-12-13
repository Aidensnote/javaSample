package day7;

public class Prob_fin3 {
	public static String leftPad(String str, int size, char padChar) { //static method는 주소가 필요없이 클래스 이름만 알면 불러오기 가능.
		String result = "";

		/* 조건 str>size, str출력. */
		if (str.length() > size) { //3>7 for구문으로 내려감
			return str;
		}
		int tmp = size-str.length(); //4=7-3
		for (int i = 0; i <tmp; i++) { // 0~4까지 총 4번 반복
			str = padChar+str;			// !sds->!!sds->!!!sds->!!!!sds까지 반복
		}
		return str;
	} /* rigthPad 추가 */
	
	public static void main(String[] args){ //테스트하기 위해선 main이 필요하다. J unit test로는 해당 부분 없이 테스트가능.
		String s = Prob_fin3.leftPad("SDS", 7, '!'); //주소필요x, 클래스네임으로 불러온다 = 이미 메모리에 떠있음=static ->"매개변수/메소드의 선언부를 알아야한다. // s안에 문자열이 저장.
		System.out.println(s);	// 들어온 !!!!SDS가 S에 주소가 저장됨.
		System.out.println(s.equals("!!!!SDS"));
	}
	
}