package day17;

import java.util.ArrayList;

public class ArrayListTest {
	public static void main(String[] args) {
		/* ������ ���� = �������� �Ұ� = ī��Ʈ������ �迭������ �ؾ��� = �Ϸ��� �޸𸮸� �Ҵ� �����Ƿ� ������ �ӵ��� ���� */ 
		int[] i;		//1 ������ ����
		String[] s;		//2 ���ڿ� ����
		Student[] ss;	//3 ��ü �迭 ����
		Object[] ob;	//4 ��� ��Ƽ� ����. ������ Object�迭 �ȿ��� �迭 �ּҵ� ����.
		
		
		
		/* �迭�� ������ ����. �ݷ��� �����ӿ�ũ ArrayList = ������¡ ���� = ī���� ������ �ڵ� */ 
		ArrayList list1 = new ArrayList(); // 5 ���ʸ����� Ÿ���� �������������� Object�� ��Ƽ� ����.
		list1.add(new Student("ȫ��",23));
		list1.add("hello java");
		System.out.println(list1.size());
		System.out.println(list1.get(0));
		System.out.println(list1.get(1));
		((String)list1.get(1)).toUpperCase();	// 6. �ٿ�ĳ������ �ؾ����� uppercase�� �����ϴ�. = ĳ����.
		
		
		
		
		ArrayList<String> list2 = new ArrayList<String>(); // 5 ���ʸ�. <>�ȿ��� ��� ������ Ÿ�� ���. �迭�� ���.
		for(int j=0;j<200;j++){			//6 �迭�� ��� ������¡.
			list2.add("test "+j);
		}
		list2.add(3, "~~~~~~");			// 9 ������ ��ġ�� �迭 ���ϱ�
		list2.remove(1);				// 10 ������ ��ġ ����
		list2.remove("test 0");			// 11 Ư���� ���� ����.

		System.out.println(list2);
		System.out.println(list2.size());	//12 �迭 ��ü ũ��.
		
		for(int j=0;j<list2.size();j++){	//7 size-ī����
//			list2.get(j).substring(list2.get(j).length()-2);
//			System.out.println(list2.get(j).substring(list2.get(j).length()-3));
			System.out.println(list2.get(j).toUpperCase());	//8 �빮�ڷκ���
			
		}
		
		
		
		
		
		
		
	}
}
