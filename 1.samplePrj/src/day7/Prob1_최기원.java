package day7;

public class Prob1_최기원 {

	public static void main(String[] args) {
		Prob1_최기원 prob1 = new Prob1_최기원();

		System.out.println(prob1.leftPad("SDS", 6, '#'));
		System.out.println(prob1.leftPad("SDS", 5, '$'));
		System.out.println(prob1.leftPad("SDS", 2, '&'));
	}
	public String leftPad(String str, int size, char padChar) {
		String result = "";
		for (int i = 0; i < size - str.length(); i++) {
			result += padChar;
		}
		result += str;
		return result;
	}
}