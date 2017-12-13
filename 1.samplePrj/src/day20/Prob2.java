package day20;

import java.util.Iterator;
import java.util.Vector;
import day12.Student;

public class Prob2 extends Object {		//1 클래스 생성: 변수와 기능으로 구성. -선언부 결정: 상속여부, 인터페이스구형여부.
	Student s1;							//2 데이터 타입 결정+변수명. 퍼블릭하기 때문에 import로 사용.
	Vector<Integer> nums;
	
	


	public Prob2() {
		super();
	}
	
	public Prob2(Vector<Integer> nums) {
		super();
		this.nums = nums;
	}

	public Prob2(Student s1, Vector<Integer> nums) {
		super();
		this.s1 = s1;
		this.nums = nums;
	}

	public void print(){	//3 메서드=기능. void = 리턴뒤에 데이터 x. 
//		System.out.println("~~~~1");	// 위에서 아래로 처리된다.
//		System.out.println("~~~~2");	// 반복= 반복처리문 for()
//		System.out.println("~~~~3");	// 스킵 = 제어문 if()
		
		if(s1 !=null){					// 8 조건
			System.out.println("s1");	//
		}
		if(nums != null){ 				// 8 조건
			System.out.println("nums");	 
		}
		return;
	}
	
	
	/** 문서화를 위한 주석
	 * 
	 */
	public int sum (){	//4 리턴값 있음 = return뒤에 선언부인 int값 필요
		int sum=0;		//6 오류 잡기위해서 우선 생성.
		
		Iterator<Integer> it = nums.iterator();	//제너릭에선 정렬=iterator
		while (it.hasNext()) {					//순회=while
			Integer d = (Integer) it.next();	//integer인데 int와 연산하는데 영향x = 오토박싱
			sum +=d;
		}
		return sum;		//5 리턴값을 우선 생성
	}

	@Override
	public String toString() {
		return "Prob2 [s1=" + s1 + ", nums=" + nums + "]";
	}
}