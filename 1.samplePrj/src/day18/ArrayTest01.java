package day18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class ArrayTest01 {

	public static void main(String[] args) {
//		Student s = null; 학생 객체 한개					//6

//		Student[] s = new Student[100]; 학생 객체 100개		//7
//		s[0] = new Student();			배열일 경우 index로 핸들링. 하지만 내부적으로 count를 강제되고 빈 공간은 null로 들어가게된다. 배열의 사이즈로 핸들링시 문제 발생 가능성 높음(널포인트익셉션), 배열일 경우 빈공간, 추가 데이터 삽입이 어려움 = api 만들어서 써야함.


		
		
		List<Student> list = new ArrayList<Student>();			//29 모든 객체는 부모의 타입 가능.
//		List<Student> list = new Vector<Student>();				//30 vector로도 가능하다. 싱크로나이즈드가 걸려있다.
//		ArrayList<Student> list = new ArrayList<Student>();		//8 제너릭. object는 되도록 피한다. 내부적으로 Student객체 모아서 핸들링. 빼면 object. collection은 타입을 핸들링.
		list.add(new Student("길동이",90,99)); 					//9 등록, Student타입만 가능. 중복허용함. 
		list.add(new Student("김씨",80,99)); 					  
		list.add(new Student("고씨",70,99)); 					 
		list.add(new Student("박씨",99,99));
		System.out.println(list);
		System.out.println("===================================");
		
		list.remove(0);											//10 삭제(위치인덱스) 0번째 배열이 삭제되고 나머지가 당겨져서 배열의 크기가 변형된다.
		System.out.println(list);
		System.out.println("===================================");
		
		list.remove(new Student("길동이",90,99));					//11 삭제(object=주소가 필요함) = 불편함.
		System.out.println(list);
		System.out.println("===================================");
		
//		list.remove(list.get(2));								//12 삭제(get메소드를 써서 주소를 제공), index를 모두 파악하기 힘들기에 index로 핸들링하기엔 제약이 많다.
//		System.out.println(list);								// 중복되지 않는 값 = [프라이머리키] 역할이 필요하다.
		System.out.println("===================================");
		
		//평균처리 = 순회 = for(){}. set = 위치index없음= for(){}불가.
		
		
//		int delindex = -1;					//17
//		for(int i=0;i<list.size();i++){
//			Student data = list.get(i);		//13. data 변수에 avg메소드 포함되어있음.
//			data.avg();						//14. 모든 주소(data[i])에 값을 동일한 메소드(avg)를 수행해서 저장.
//			list.remove(i);					  15. remove를 하는 순간 size가 줄어들고, 제대로 된 핸들링이 어려움 = for(){}로 삭제 작업은 무리. 
//			System.out.println(list.size());
//			
//			if(data.name.equals("길동이")){	//16 삭제할 데이터
//				delindex = i;
//			}
//		}
//		list.remove(delindex);				//18 데이터 하나 삭제.
		System.out.println(list);
		System.out.println("===================================");
		
		
		
		//위치 index가 없는애들 = 순회하기 어려움.
//		for(Student data :list){			// 19 list 대신 배열,콜렉션 모두 가능. 내부적으로 작동. 순회용,출력용으로만 사용한다. 데이터가 바뀌지 않는다. = set구조를 순회하기 만들어진 for(){}.
//			System.out.println(data);
//			data.avg();
//			list.remove(data);				   20 삭제는 다른 방식으로 사용해야한다. 예외발생.
//		}
//		System.out.println(list);
//		System.out.println("===================================");
//		
//		
		Iterator<Student> it = list.iterator();	// 21 객체들을 줄을 세운다.
		while(it.hasNext()){					// 22 특정 요소가 있다면 = 데이터가 있는지 확인
			Student data =it.next(); 			// 23 데이터가 들어오고. data에 저장.
			data.avg();
			if(data.name.equals("길동이")){		// 25 지울조건 ("길동이")
				it.remove();					// 26 삭제.
			}
//			it.remove();						// 24 모두 지워짐
		}
		System.out.println(list);
		
//		System.out.println(list.contains(new Student("고씨",90,99)));		//25. contain = 있는지 없는지 비교. 존재하나 true가 출력되지 않음.
//		System.out.println(list.contains(new Student("길동이",90,99)));	//26. 있으나 없으나 false가 출력. = 문제점 파악. = Student객체는 equals메소드가 오버라이딩 안했으므로 비교능력 없음.
		
		
//		Arrays.sort(list.toArray());				//32 모두 배열만 처리 가능. 배열로 변경. err 발생.
		Object[] temp = list.toArray();				//33 제너릭을 지원하지않으므로 object로 핸들링.

		
//		Student[] temp = (Student[]) list.toArray();	// -1 배열로 핸들링
		Arrays.sort(temp);								// -2

		Student[] temp2 = new Student[list.size()];		// -3 아웃풋 파라미터.
		list.toArray(temp2);							// -4 temp2는 인풋아웃풋을 다함.						

		
		
		Collections.sort(list);						//36 collections는 유틸하게 사용할 수 있음.
		
		
		for(Student data : list){					//31 sort = 타입, 데이터 담을 변수명 : 콜렉션 
			System.out.println(data);
			System.out.println("------------------");
		}
		
		
		
		
		
	}
}

class Student implements Comparable<Student>{		//5 선언부를 보고서 클래스의 특징 확인 가능.	//33 implement comparable<student>을 추가.
	String name;	//1
	int ko;
	int math;
	int avg;
	
	public Student() {	//3 디폴트
		super();
	}
		
	public Student(String name, int ko, int math) {	//3 avg는 생성되는 값에 의해서 만들어져야 하는 데이터이므로 제외  
		super();
		this.name = name;
		this.ko = ko;
		this.math = math;
	}
	
	

//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		long temp;
//		temp = Double.doubleToLongBits(avg);
//		result = prime * result + (int) (temp ^ (temp >>> 32));
//		result = prime * result + ko;
//		result = prime * result + math;
//		result = prime * result + ((name == null) ? 0 : name.hashCode());
//		return result;
//	}

//	@Override										// 27 equals를 모든 객체 오버라이딩. = 문제가 반복 false출력.
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Student other = (Student) obj;
//		if (Double.doubleToLongBits(avg) != Double.doubleToLongBits(other.avg))
//			return false;
//		if (ko != other.ko)
//			return false;
//		if (math != other.math)
//			return false;
//		if (name == null) {
//			if (other.name != null)
//				return false;
//		} else if (!name.equals(other.name))
//			return false;
//		return true;
//	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ko;
		result = prime * result + math;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	
	@Override									// 28 avg는 연산된 객체이므로 제외하고 생성해야한다.
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (ko != other.ko)
			return false;
		if (math != other.math)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
	@Override
	public String toString() {					//4 표현하고자 하는 부분만 체크.
		return "Student [name=" + name + ", avg=" + avg + "]";
	}
	

	public void avg(){							//2 평균 계산 메소드
		avg = (int) ((ko+math)/2.);
	}

	@Override
	public int compareTo(Student o) {		//34 비교할 메소드를 완성.
		return name.compareTo(o.name);				//35 이름으로 비교.
//		return avg - o.avg;							//35 평균으로 비교.
	}

}