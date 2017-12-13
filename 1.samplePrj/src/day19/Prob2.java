package day19;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Prob2 {

	public static void main(String[] args) {
		String str = "PROD-001#X-note#Samsung#3#6000000";
		Set<String> strs = stringSplit(str, "#");
		System.out.println("=== ���ڿ� ó�� ��� ===");
		
		Iterator<String> it = strs.iterator();
		while (it.hasNext()) {
			String data = (String) it.next();
			System.out.println(data);
		}

		// strs �� �Ʒ��Ͱ��� ��µǵ��� �ڵ带 �ϼ��ϼ���
		// <<ó�� ���>>
		//
		// === ���ڿ� ó�� ��� ===
		// PROD-001
		// X-note
		// Samsung
		// 3
		// 600000

	}

	private static Set<String> stringSplit(String str1, String str2) {
		Set<String> SetResult=new TreeSet<String>();
		boolean flag=true;
		while(flag){
			int index = 0;
			index = str1.indexOf(str2);
			if(index==-1){
				SetResult.add(str1.substring(0, str1.length()));
				flag=false;
				break;
			};
			SetResult.add(str1.substring(0, index));
			str1 = str1.substring(index+1, str1.length());
		}
		
		return SetResult;
		
	}
}
