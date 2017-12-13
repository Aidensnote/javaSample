package day19;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTest2 {
	public static void main(String[] args) {
		//HashMap ������ Student ��ü �־ ����
		Map<String,Student> map = new HashMap<>();				//5 �����̸Ӹ�Ű Ÿ��,������Ÿ��=student
		
		Student[]s={											//7 �迭�� �ڵ鸵. num ���� �������� ���� get�� �������̵�.
			new Student("2017009","��",90,88),					//6 Ű������ ���� ����. = num���� ������ ȣ��.
			new Student("2017001","��",90,98),					
			new Student("2017011","��",90,88),					
			new Student("2017039","ȫ",91,88),					
			new Student("2017089","��",97,88),					//12 �����̸Ӹ�Ű�� �ߺ��Ǽ� �������� ������ "��"�� �������̵�.
			new Student("2017089","��",99,99),					
		};
		
		
		for(int i=0;i<s.length;i++){							//8 Map ������ �ֱ�.
			map.put(s[i].getNum(), s[i]);
		}
		
		System.out.println(map);				//9 num�� �������� ���� Ȯ��.
		System.out.println("==================================");
		
		Set<String> keys = map.keySet();		//10 �л����� �й����� = �����̸Ӹ�Ű ����.
		Iterator<String> it = keys.iterator(); 	//11 Ű���� ������ ��ȸ.
		while (it.hasNext()) {				
			String num = (String) it.next();
			System.out.println(map.get(num));
		}
		
		
		
		
		
	}
}


class Student{				//1
	String num;				//3 �����̸Ӹ�Ű
	String name;			//2 �����̸Ӹ�Ű ���� �Ұ�. = �ߺ� �ȵǴ� null�� ������ �ʴ� ��
	int ko, math, avg;
	
	public Student() {	}	//4 ����Ʈ, ������, toString
	public Student(String num, String name, int ko, int math) {

		this.num = num;
		this.name = name;
		this.ko = ko;
		this.math = math;
	}
	@Override
	public String toString() {
		return "Student [num=" + num + ", name=" + name + ", ko=" + ko + ", math=" + math + ", avg=" + avg + "]";
	}
	public String getNum() {	//7 �������� �޼ҵ� = get �޼ҵ�
		return num;
	}
	
}