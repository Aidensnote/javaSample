package day19;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetTest2 {
	public static void main(String[] args) {
		Employee emp1 = new Employee("김","001");			//4
		Employee emp2 = emp1;								//5 주소 동일
		
		Set<Employee> set = new TreeSet<>();				//13 정렬하고 싶어서 TreeSet으로 변경 = comparable해야만 정렬 가능.

		//Set<Employee> set = new HashSet<>();				//6
		System.out.println(set);							//7 빈공간 출력.
		set.add(emp1);
		set.add(emp2);
		System.out.println(set);							//7 중복 체크해서 1개만 출력.

		set.add(new Employee("고","002"));					//8 중복 가능. new로 객채 생성시 가능.
		set.add(new Employee("고","002"));
		set.add(new Employee("고","002"));
		System.out.println(set);							//9 순서는 확인 불가지만 중복. equals메소드를 오버라이딩 하지않으면 주소가 같지않아서 중복허용. equals를 적용하면 중복 불허.

		set.add(new Employee("고","002"));					//10 모두 정확하게 일치하지않음. (성은 같아도 사번이 다름)
		set.add(new Employee("강","009"));
		set.add(new Employee("홍","005"));
		set.add(new Employee("박","011"));
		set.add(new Employee("고","022"));
		System.out.println(set);
		System.out.println("==================================");
		
		for(Employee data :set){							//11 순회해서 세로로 출력. (타입 변수명 :콜렉션)
			System.out.println(data);
			System.out.println("==================================");
		}
		
		Iterator<Employee> it = set.iterator();				//12 itorator로 순회 가능.
		while (it.hasNext()) {
			Employee employee = (Employee) it.next();
			System.out.println(employee);
		}
	}
}


class Employee implements Comparable<Employee>{		//14 implements comparable 마킹을 제너릭 Employee 해줌.
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
		return num.compareTo(o.num);		//15 비교 메소드. 내가 가지고 있는 num과 가지고 오는 o.num을 비교해서 정렬. 오름차순.
	}
	
	
	
	
}