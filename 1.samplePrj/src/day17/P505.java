package day17;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P505 {

	public static void main(String[] args) {
		//P507�� ���� ���� ��� ����
		
		String[] data = {											//1. ������ �迭
							"javains","010-1234-9999","02-222-3434",
							"javains@naver.com","a","A","1234567","java test",
							"f"
						};
//		String pattern = "j.*";										//2. ���� ������ ��ü. "��ȿ������,üũ"
		String pattern = "(02|010)-\\d{3,4}-\\d{4}";						//6. ��������: ���ڸ� 02||010 - �ι�°�� ����(d) 3~4�ڸ�{3,4} - ����°�� ����(d) 4�ڸ�{4}	
		
		Pattern p = Pattern.compile(pattern);						//3. ���� ������ ����.

		for (int i = 0; i < data.length; i++) {						//4. ��Ī�۾�
			Matcher m = p.matcher(data[i]);
			if (m.matches())										//5. true�� ���. = ��Ī��
				System.out.println(data[i]);

		}
		System.out.println("==main end==");
	}
}
