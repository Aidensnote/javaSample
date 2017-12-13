package day19;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {

	public static void main(String[] args) {
//		Set<String> set = new HashSet<>();			//1
		Set<String> set = new TreeSet<>();			//8 treeset�� ����. �ο�Ŀ�ø�. treeset�� ���䷯��(��)�� �����ϴ�.
//		set.add("java 01");							//2 �߰�. �ߺ� üũ = �ߺ� ����. ���� �� �ڷ� ��������Ʈ.
//		set.add("java 01");
//		set.add("java 01");
//		set.add("java 01");
		set.add("java 09");							//3 �Է°� ��� ������ �ٸ���.
		set.add("java 07");
		set.add("java 01");
		set.add("java 04");
		System.out.println(set);
		
		set.remove("java 07");						//4 ����.
		System.out.println(set);
		
		Iterator<String> it = set.iterator();		//5 iterator�� ��ȸ.
		while (it.hasNext()) {
			String data = (String) it.next();
			System.out.println(data.substring(data.length()-2));
		}
		Iterator itt = set.iterator();				//6 set�� object�� ����
		while (itt.hasNext()) {
			Object data = itt.next();
			System.out.println(data);				//7 substring�� �� �� ����. toString���� ���.
		}
			
		set.add("java 99");							//3 �Է°� ��� ������ �ٸ���.
		set.add("java 59");
		set.add("java 49");
		set.add("java 19");
		System.out.println(set);
		
		
	}
}
