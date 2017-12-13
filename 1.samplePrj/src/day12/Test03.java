package day12;

import day12.access.A;

public class Test03 {
	public static void main(String[] args) {
		A a = new A();	//import필요. A는 public 하기때문에 import면 충분.
		// a.name1		//public은 모두 접근, 나머지는 제약이 있다.
		// B b;
	}
}

class C extends A {	//A 클래스 상속
	void print(){
		//this.	//name1,2가 확인 가능. protected한 자원까지 확인 가능. 상속관계일때는 자식까지는 접근 가능.
	}
}