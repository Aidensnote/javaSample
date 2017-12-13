/* 제너릭 = jdk1.5부터 제공 = 타입 결정이 어려움 = 아직 결정 못한걸 의미 = 런타임에서 결정.*/
package day17;

public class EmployeeTest2 {
	public static void main(String[] args) {
		Employee2<Integer> e1 = new Employee2<Integer>();			// 3 object타입. <T>의 타입 미설정.	앞뒤가 동일한 타입. 
		e1.number = 2017;
//		e1.number.charAt((e1.number.length()-1));		//4. indexof를 사용 불가. 타입선언x= object타입 = 사용가능한 api가 한정적 = 다운캐스팅 or 타입선언.
//		System.out.println(e1.number.charAt((e1.number.length()-1)));		//4. indexof를 사용 불가. 타입선언x= object타입 = 사용가능한 api가 한정적 = 다운캐스팅 or 타입선언.
		
		Employee2 e2 = new Employee2();					//7 object타입.
		
		
		
	}
}


class Employee2 <T> implements Comparable <Employee2<T>>{	//2 런타임에서 타입결정 가능, 설정 안하면 object타입.
	String name;								//5 integer 메인에서 설정
	T number;			//1						//6 String 메인에서 설정
	
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


	
	
	// 과제.
	@Override
	public int compareTo(Employee2<T> o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
	
	
}