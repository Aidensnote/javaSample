package day15.inner01;	//8 이름변경.

public class Test01 {	//1

	public static void main(String[] args) {
		B b1 = new B();
		b1.setA(new A()); // 7. 넘겨주는 통로. 주소 전달.
		b1.print();	//6. err. B가 동작하려면 A가 필요.

	}

}

class A{	//2
	String name = "A";	//3
	
}



class B{	//2
	A a;	//4	A클래스의 name이 필요함.
	void print(){
		System.out.println(a.name);	//3 주소필요. 예외발생. 메시지 교환 필요.
		
	}
	public A getA() {	//5. 셋겟으로 생성.
		return a;
	}
	public void setA(A a) {
		this.a = a;
	}
}