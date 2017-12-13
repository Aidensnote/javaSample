package day19;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTest2 {
	public static void main(String[] args) {
		//HashMap 구조에 Student 객체 넣어서 관리
		Map<String,Student> map = new HashMap<>();				//5 프라이머리키 타입,관리할타입=student
		
		Student[]s={											//7 배열로 핸들링. num 값을 가져오기 위해 get을 오버라이딩.
			new Student("2017009","고",90,88),					//6 키정보가 가장 먼저. = num정보 가지고 호출.
			new Student("2017001","김",90,98),					
			new Student("2017011","강",90,88),					
			new Student("2017039","홍",91,88),					
			new Student("2017089","박",97,88),					//12 프라이머리키가 중복되서 마지막에 리딩된 "서"로 오버라이딩.
			new Student("2017089","서",99,99),					
		};
		
		
		for(int i=0;i<s.length;i++){							//8 Map 구조에 넣기.
			map.put(s[i].getNum(), s[i]);
		}
		
		System.out.println(map);				//9 num을 기준으로 생성 확인.
		System.out.println("==================================");
		
		Set<String> keys = map.keySet();		//10 학생들의 학번정보 = 프라이머리키 정보.
		Iterator<String> it = keys.iterator(); 	//11 키값을 가지고 순회.
		while (it.hasNext()) {				
			String num = (String) it.next();
			System.out.println(map.get(num));
		}
		
		
		
		
		
	}
}


class Student{				//1
	String num;				//3 프라이머리키
	String name;			//2 프라이머리키 설정 불가. = 중복 안되는 null이 허용되지 않는 값
	int ko, math, avg;
	
	public Student() {	}	//4 디폴트, 생성자, toString
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
	public String getNum() {	//7 가져오는 메소드 = get 메소드
		return num;
	}
	
}