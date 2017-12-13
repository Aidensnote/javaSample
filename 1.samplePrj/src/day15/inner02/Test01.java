/* 이너클래스의 활용 = 아우터 클래스의 자원을 쓰기위해서. 아우터 객체생성->이너클래스 에서 사용. */
package day15.inner02;

public class Test01 {
	public static void main(String[] args) {
		A.B b = new A().new B();	//5 아우터.이너 =아우터의주소필요.
		b.print();	//6
		
		new A().pp();	//9 아우터의 자원은 new 아우터주소.메소드
		
		A.S s = new A.S();	//14 스테틱한 자원은 아우터주소 필요 없음. 클레스 네임으로 접근. = 클레스 네임.변수 / 클래스네임.메소드.
		s.print();		//13 객체생성 필요.
	}
}

class A {	//1
	String name = "A";	//2
	
	void pp(){	//7
		new B().print();	//8 classB의 주소 필요. 이너클래스의 객채생성해서 활용가능.
	}
	
	class B {	//3밖에 있던걸 4 안으로 '이너클래스'화 시킨다.
		void print() {
			System.out.println(name);	//아우터의 인스턴스 자원 활용가능.
		}
	}
	static class S{	//10 스테틱 클래스 가능. 아우터의 자원 활용가능.
		void print() {
			//System.out.println(name);	11. 인스턴스 베리어블 활용 불가. A의주소,A의 객체 생성 불가.
			System.out.println("~~~~~~~~~~"); //12. 
		}
	}
}
