package day19;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetTest2 {
	public static void main(String[] args) {
		Employee emp1 = new Employee("��","001");			//4
		Employee emp2 = emp1;								//5 �ּ� ����
		
		Set<Employee> set = new TreeSet<>();				//13 �����ϰ� �; TreeSet���� ���� = comparable�ؾ߸� ���� ����.

		//Set<Employee> set = new HashSet<>();				//6
		System.out.println(set);							//7 ����� ���.
		set.add(emp1);
		set.add(emp2);
		System.out.println(set);							//7 �ߺ� üũ�ؼ� 1���� ���.

		set.add(new Employee("��","002"));					//8 �ߺ� ����. new�� ��ä ������ ����.
		set.add(new Employee("��","002"));
		set.add(new Employee("��","002"));
		System.out.println(set);							//9 ������ Ȯ�� �Ұ����� �ߺ�. equals�޼ҵ带 �������̵� ���������� �ּҰ� �����ʾƼ� �ߺ����. equals�� �����ϸ� �ߺ� ����.

		set.add(new Employee("��","002"));					//10 ��� ��Ȯ�ϰ� ��ġ��������. (���� ���Ƶ� ����� �ٸ�)
		set.add(new Employee("��","009"));
		set.add(new Employee("ȫ","005"));
		set.add(new Employee("��","011"));
		set.add(new Employee("��","022"));
		System.out.println(set);
		System.out.println("==================================");
		
		for(Employee data :set){							//11 ��ȸ�ؼ� ���η� ���. (Ÿ�� ������ :�ݷ���)
			System.out.println(data);
			System.out.println("==================================");
		}
		
		Iterator<Employee> it = set.iterator();				//12 itorator�� ��ȸ ����.
		while (it.hasNext()) {
			Employee employee = (Employee) it.next();
			System.out.println(employee);
		}
	}
}


class Employee implements Comparable<Employee>{		//14 implements comparable ��ŷ�� ���ʸ� Employee ����.
//class Employee{		//1
	String name;		//2
	String num;
	
	public Employee() {	}						//3

	public Employee(String name, String num) {	//3
		this.name = name;
		this.num = num;
	}

	@Override									//3
	public String toString() {
		return "Employee [name=" + name + ", num=" + num + "]";
	}

	@Override									//10
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((num == null) ? 0 : num.hashCode());
		return result;
	}

	@Override									//10
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (num == null) {
			if (other.num != null)
				return false;
		} else if (!num.equals(other.num))
			return false;
		return true;
	}

	@Override
	public int compareTo(Employee o) {
		return num.compareTo(o.num);		//15 �� �޼ҵ�. ���� ������ �ִ� num�� ������ ���� o.num�� ���ؼ� ����. ��������.
	}
	
	
	
	
}