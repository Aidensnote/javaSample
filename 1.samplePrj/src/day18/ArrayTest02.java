package day18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayTest02 {
	public static void main(String[] args) {
		Employee[] emp = new Employee[100];	//7 �迭�� 100�� ����. �Ϸ��� �������� ������ �Ҵ����. = �迭�� Ư¡ = ������ �ӵ� ����. , ī���� �ʿ� (�μ�Ʈ,����Ʈ �ϱ� ����) ��ĭnull.
//		emp[0] = new Employee();			//8 ����۾�.
//		emp[2] = new Employee();
//		for(int i=0;i<emp.length;i++){								//9.�迭 ������. = �ΰ����� ó���� ���� ����. = �׷��� arraylist�� Ȱ��.
//			System.out.println(emp[i].toString());
//		}
		
		List<Employee> list = new ArrayList<Employee>();			//10 arraylist�� ������ ����.
		
		//���
		list.add(new Employee("007","ȫ�浿","�����"));				//11 ��ä����.
		list.add(new Employee("003","��浿","�����"));				
		list.add(new Employee("006","ȫ","�����"));				
		list.add(new Employee("001","ȫ��","�����"));				
		list.add(new Employee("009","ȫ��","�����"));				
		
		//���� �� ���
		Collections.sort(list);									//13 ������ �����ϰ� ����ؾ��� ���ĵ� ���� ��µȴ�.	

		for(int i=0;i<list.size();i++){							//12 �迭 ������ ���
			System.out.println(list.get(i));
		}
		
		System.out.println("---------------------------------");
		
		//���� �۾�
		Iterator<Employee> it = list.iterator();				//13 �ε��� ������� ���Ŵ� ����. [iterator]
		while(it.hasNext()){									//14. ��Ұ� �ִµ���.
			Employee data = it.next();							//15 ���� ����.
			if(data.getNum().equals("006")){					//16 006�� ��ġ�ϸ� ���� �ƴϸ� ������.
				System.out.println(data+" : ������� ���� �մϴ�. ");
				it.remove();
			}
		}
		System.out.println("===========���� ��� ��� =============");
		
		for(Employee data : list){								//17 ���� ���� for(){}
			System.out.println(data);
		}
		System.out.println("-----------------------------------");
		
		//�˻�
		System.out.println("�̸��� ȫ���� ��� ��� �˻�");	//18 �˻� ����Ű �޼��� ���.
		for(Employee data:list){					//19 ���γ��� for(){}
			if(data.getName().charAt(0) == 'ȫ'){	//20���� �⺻���̱� ������ equals�� ��� �Ұ�. �⺻�� == �� ����.
				System.out.println(data);
			}
		}
		System.out.println("-----------------------------------");
		
		//�迭�� ��ȯ
		Employee[] data = new Employee[list.size()];	//1. ����Ʈ ������ = �ѷ� = �迭����.
		System.out.println(Arrays.toString(data));
		
		list.toArray(data);								//2. ArrayList�� �迭(data)�� ����
		System.out.println(Arrays.toString(data));
	}
}

class Employee extends Object implements Comparable<Employee>{	//4	extends	//6 implement, comparable�� ĳ�����ؼ� sort ���۰���.
	String num; //1 ��� = �ߺ����� x
	String name;
	String dept;
	
	public Employee() {	}	//2
	public Employee(String num, String name, String dept) {	//3
		this.num = num;
		this.name = name;
		this.dept = dept;
	}
	@Override				//4
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dept == null) ? 0 : dept.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((num == null) ? 0 : num.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (dept == null) {
			if (other.dept != null)
				return false;
		} else if (!dept.equals(other.dept))
			return false;
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
	public String getNum() {					//9 setget.
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	@Override				//5
	public String toString() {
		return "Employee [num=" + num + ", name=" + name + ", dept=" + dept + "]";
	}
	@Override
	public int compareTo(Employee o) {			//7 �� ��Ģ. name�� ����.
//		return name.compareTo(o.name);			//8. ���� ������ �̸��� o���� �������� �̸��� ��. �������� ������ ����, ���� �� ����.
		return num.compareTo(o.num);
	}
}