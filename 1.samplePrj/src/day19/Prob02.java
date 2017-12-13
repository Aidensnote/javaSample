package day19;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Prob02 {

	public static void main(String[] args) {
		String str = "PROD-001#X-note#Samsung#3#6000000";
		Set<String> strs = stringSplit(str, "#");
		System.out.println("=== 문자열 처리 결과 ===");
		Iterator<String> itr = strs.iterator();
                 //strs 를 아래와같이 출력되도록 코드를 완성하세요
		while(itr.hasNext()){
			String data = itr.next();
			System.out.println(data);
		}
	}
	private static Set<String> stringSplit(String str1, String str2) {
		// 구현하시오.
		Set<String> st = new TreeSet<String>();
		String str="";
		boolean flag = false;
		for(int i=0;i<str1.length();i++){
			if(str1.length()-i<str2.length()){
				break;
			}
			if(str1.substring(i,i+str2.length()).equals(str2)){
				st.add(str);
				i+=str2.length()-1;
				str = new String();
				flag = true;
			}
			else
				str+=str1.charAt(i);
		}
		if(flag){
			st.add(str);
		}
		return st;
	}	
}
