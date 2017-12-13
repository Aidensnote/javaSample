package day7;

public class Prob1_최기원2 {

	public static void main(String[] args) {
		Prob1_최기원2 prob1 = new Prob1_최기원2();

		System.out.println(prob1.leftPad("SDS", 6, '#'));
		System.out.println(prob1.leftPad("SDS", 5, '$'));
		System.out.println(prob1.leftPad("SDS", 2, '&'));
	}

	public String leftPad(String str, int size, char padChar) {
		if (str.length() > size) {
			return str;
		}
		String result = "";
		for (int i = 0; i < size - str.length(); i++) {
			result = result + padChar;
		}
		return result = result + str;
	}
}