package day20;

import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class P659 {
	public static void main(String[] args) {
		Properties p= new Properties();	//1 객채생성, String 타입 밖에 없음
		System.out.println(p);
		
		p.setProperty("java01", "1234");	//2 값 입력
		p.setProperty("java02", "5678");	
		p.setProperty("java05", "91011");	
		System.out.println(p);				//3 순서가 다 다름
		
		System.out.println(p.getProperty("java05")); //4 key값 기준으로 벨류값 호출
		
//		p.setProperty(key, value)	
		Set key = p.keySet();				//5 이터레이터 없음. keyset으로 바로 호출가능. object타입.
		Iterator it = key.iterator();		//6 순회
		while (it.hasNext()) {
			String data = (String) it.next();
			System.out.println(data+":"+p.getProperty(data)); 		//7 정렬된 값에 key값 붙여주기
		}
		
	}
}