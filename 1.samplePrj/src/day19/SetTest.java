package day19;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {

	public static void main(String[] args) {
//		Set<String> set = new HashSet<>();			//1
		Set<String> set = new TreeSet<>();			//8 treeset도 가능. 로우커플링. treeset은 컴페러블(비교)가 가능하다.
//		set.add("java 01");							//2 추가. 중복 체크 = 중복 불허. 쟤일 맨 뒤로 오버라이트.
//		set.add("java 01");
//		set.add("java 01");
//		set.add("java 01");
		set.add("java 09");							//3 입력과 출력 순서가 다르다.
		set.add("java 07");
		set.add("java 01");
		set.add("java 04");
		System.out.println(set);
		
		set.remove("java 07");						//4 삭제.
		System.out.println(set);
		
		Iterator<String> it = set.iterator();		//5 iterator로 순회.
		while (it.hasNext()) {
			String data = (String) it.next();
			System.out.println(data.substring(data.length()-2));
		}
		Iterator itt = set.iterator();				//6 set을 object로 접근
		while (itt.hasNext()) {
			Object data = itt.next();
			System.out.println(data);				//7 substring을 쓸 수 없음. toString으로 출력.
		}
			
		set.add("java 99");							//3 입력과 출력 순서가 다르다.
		set.add("java 59");
		set.add("java 49");
		set.add("java 19");
		System.out.println(set);
		
		
	}
}
