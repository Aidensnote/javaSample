package day15.inner01;	//8 �̸�����.

public class Test01 {	//1

	public static void main(String[] args) {
		B b1 = new B();
		b1.setA(new A()); // 7. �Ѱ��ִ� ���. �ּ� ����.
		b1.print();	//6. err. B�� �����Ϸ��� A�� �ʿ�.

	}

}

class A{	//2
	String name = "A";	//3
	
}



class B{	//2
	A a;	//4	AŬ������ name�� �ʿ���.
	void print(){
		System.out.println(a.name);	//3 �ּ��ʿ�. ���ܹ߻�. �޽��� ��ȯ �ʿ�.
		
	}
	public A getA() {	//5. �°����� ����.
		return a;
	}
	public void setA(A a) {
		this.a = a;
	}
}