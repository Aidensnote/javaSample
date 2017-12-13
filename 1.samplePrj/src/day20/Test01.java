package day20;

import java.util.List;
import java.util.Map;

public class Test01 {
	public static void main(String[] args) {
		Student<String,Double> s1 = new Student("",6);			//5 객채만 가능	. <String,String>만 들어간다.		//10 <String,Double> 레퍼클래스로 써준다. = 오토박싱
		Student<String,Integer> s2 = new Student("",3);			//6 int는 integer로 변경 <String,integer(=int)> 
		
		List<String> l;					//7
		List<String> l2;
		
		
		Map<String, Student> m;			//8
		
		
		
		
		
		
		
	}
}


class Student<T,V extends Number> {				//1.클래스 생성	//3 제너릭 적용		//9 타입제한 = 그 외 불허.
	T name;
	V avg;						//2 변수 타입 결정이 어려움. double & int => 제너릭. 런타임에서 결정. Object타입은 모두 허용됨.
	
	public Student() {	}		//4 디폴트+생성자+toString
	public Student(T name, V avg) {
		this.name = name;
		this.avg = avg;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", avg=" + avg + "]";
	}
	
	
	
	
	
	
}