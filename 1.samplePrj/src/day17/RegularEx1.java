package day17;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularEx1 {

	public static void main(String[] args) {
		String[] data = {											//1. ������ �迭
							"bat", "baby", "bonus",
							"cA,", "ca", "co", "c.", "c0", "car", "combat", "count",
							"date","disc"
						};
		String pattern = "";										//2. ���� ������ ��ü.
		
		Pattern p = Pattern.compile("c[a-z]*");						//3. ���� ������ ����.

		for (int i = 0; i < data.length; i++) {						//4. ��Ī�۾�
			Matcher m = p.matcher(data[i]);
			if (m.matches())										//5. true�� ���. = ��Ī��
				System.out.println(data[i] + ",");

		}

	}
}
