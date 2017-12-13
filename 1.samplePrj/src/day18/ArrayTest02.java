package day18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayTest02 {
	public static void main(String[] args) {
		Employee[] emp = new Employee[100];	//7 배열로 100개 선언. 일련의 연속적인 공간에 할당받음. = 배열의 특징 = 엑서스 속도 빠름. , 카운팅 필요 (인설트,델리트 하기 위해) 빈칸null.
//		emp[0] = new Employee();			//8 등록작업.
//		emp[2] = new Employee();
//		for(int i=0;i<emp.length;i++){								//9.배열 뺑뺑이. = 부가적인 처리할 일이 많음. = 그래서 arraylist를 활용.
//			System.out.println(emp[i].toString());
//		}
		
		List<Employee> list = new ArrayList<Employee>();			//10 arraylist가 관리가 편리함.
		
		//등록
		list.add(new Employee("007","홍길동","기술부"));				//11 객채생성.
		list.add(new Employee("003","고길동","기술부"));				
		list.add(new Employee("006","홍","기술부"));				
		list.add(new Employee("001","홍동","기술부"));				
		list.add(new Employee("009","홍길","기술부"));				
		
		//정렬 후 출력
		Collections.sort(list);									//13 정렬을 먼저하고 출력해야지 정렬된 값이 출력된다.	

		for(int i=0;i<list.size();i++){							//12 배열 데이터 출력
			System.out.println(list.get(i));
		}
		
		System.out.println("---------------------------------");
		
		//삭제 작업
		Iterator<Employee> it = list.iterator();				//13 인덱스 기반으로 제거는 무리. [iterator]
		while(it.hasNext()){									//14. 요소가 있는동안.
			Employee data = it.next();							//15 내용 추출.
			if(data.getNum().equals("006")){					//16 006이 일치하면 삭제 아니면 밖으로.
				System.out.println(data+" : 사원정보 제거 합니다. ");
				it.remove();
			}
		}
		System.out.println("===========현재 사원 목록 =============");
		
		for(Employee data : list){								//17 새로 나온 for(){}
			System.out.println(data);
		}
		System.out.println("-----------------------------------");
		
		//검색
		System.out.println("이름이 홍씨인 사원 목록 검색");	//18 검색 조건키 메세지 출력.
		for(Employee data:list){					//19 새로나온 for(){}
			if(data.getName().charAt(0) == '홍'){	//20조건 기본형이기 때문에 equals를 사용 불가. 기본형 == 만 가능.
				System.out.println(data);
			}
		}
		System.out.println("-----------------------------------");
		
		//배열로 변환
		Employee[] data = new Employee[list.size()];	//1. 리스트 사이즈 = 총량 = 배열생성.
		System.out.println(Arrays.toString(data));
		
		list.toArray(data);								//2. ArrayList를 배열(data)로 복사
		System.out.println(Arrays.toString(data));
	}
}

class Employee extends Object implements Comparable<Employee>{	//4	extends	//6 implement, comparable로 캐스팅해서 sort 동작가능.
	String num; //1 사번 = 중복되지 x
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
	public int compareTo(Employee o) {			//7 비교 규칙. name을 기준.
//		return name.compareTo(o.name);			//8. 내가 가져온 이름과 o에서 가져오는 이름을 비교. 오름차순 내가앞 오름, 내가 뒤 내림.
		return num.compareTo(o.num);
	}
}