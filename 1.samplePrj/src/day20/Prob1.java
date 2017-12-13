package day20;

import java.util.Vector;

public class Prob1 {
	public static void main(String[] args) {
		String[] strData = { "1", "2", "3", "4", "5" };
		Vector<String> vdata = moveToVector(strData);
		System.out.println(vdata.toString());

	}

	public static Vector<String> moveToVector(String datas[]) {
		Vector<String> tmp = new Vector<>();

		for (int i = 0; i < datas.length; i++) {
			tmp.add(datas[datas.length -i - 1]);
		}

		return tmp;

	}
}