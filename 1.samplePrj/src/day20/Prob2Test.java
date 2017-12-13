package day20;

import java.util.Vector;

import day12.Student;

public class Prob2Test {
	public static void main(String[] args) {
		Student s = new Student("홍",24,001);	//4 관리할 객채생성
		Vector<Integer> i =new Vector<>();		//5
		i.add(55);
		i.add(155);
		i.add(455);
		Prob2 p = new Prob2(s,i);		//1 인스턴스 = 메모리에 올려야한다 = 객채생성
		
		p.print();					//2	비어있음.
		System.out.println(p);		//3 데이터 비어있음. 디폴트 초기화에 의해서 null. = 생성자 필요
		
	}
}