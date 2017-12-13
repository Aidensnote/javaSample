/* ���ʸ� = jdk1.5���� ���� = Ÿ�� ������ ����� = ���� ���� ���Ѱ� �ǹ� = ��Ÿ�ӿ��� ����.*/
package day17;

public class EmployeeTest2 {
	public static void main(String[] args) {
		Employee2<Integer> e1 = new Employee2<Integer>();			// 3 objectŸ��. <T>�� Ÿ�� �̼���.	�յڰ� ������ Ÿ��. 
		e1.number = 2017;
//		e1.number.charAt((e1.number.length()-1));		//4. indexof�� ��� �Ұ�. Ÿ�Լ���x= objectŸ�� = ��밡���� api�� ������ = �ٿ�ĳ���� or Ÿ�Լ���.
//		System.out.println(e1.number.charAt((e1.number.length()-1)));		//4. indexof�� ��� �Ұ�. Ÿ�Լ���x= objectŸ�� = ��밡���� api�� ������ = �ٿ�ĳ���� or Ÿ�Լ���.
		
		Employee2 e2 = new Employee2();					//7 objectŸ��.
		
		
		
	}
}


class Employee2 <T> implements Comparable <Employee2<T>>{	//2 ��Ÿ�ӿ��� Ÿ�԰��� ����, ���� ���ϸ� objectŸ��.
	String name;								//5 integer ���ο��� ����
	T number;			//1						//6 String ���ο��� ����
	
	public Employee2() {
		super();
	}
	
	public Employee2(String name, T number) {
		super();
		this.name = name;
		this.number = number;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public T getNumber() {
		return number;
	}
	public void setNumber(T number) {
		this.number = number;
	}
	@Override
	public String toString() {
		return "Employee2 [name=" + name + ", number=" + number + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((number == null) ? 0 : number.hashCode());
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
		Employee2 other = (Employee2) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (number == null) {
			if (other.number != null)
				return false;
		} else if (!number.equals(other.number))
			return false;
		return true;
	}


	
	
	// ����.
	@Override
	public int compareTo(Employee2<T> o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
	
	
}