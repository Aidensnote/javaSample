/* �̳�Ŭ������ Ȱ�� = �ƿ��� Ŭ������ �ڿ��� �������ؼ�. �ƿ��� ��ü����->�̳�Ŭ���� ���� ���. */
package day15.inner02;

public class Test01 {
	public static void main(String[] args) {
		A.B b = new A().new B();	//5 �ƿ���.�̳� =�ƿ������ּ��ʿ�.
		b.print();	//6
		
		new A().pp();	//9 �ƿ����� �ڿ��� new �ƿ����ּ�.�޼ҵ�
		
		A.S s = new A.S();	//14 ����ƽ�� �ڿ��� �ƿ����ּ� �ʿ� ����. Ŭ���� �������� ����. = Ŭ���� ����.���� / Ŭ��������.�޼ҵ�.
		s.print();		//13 ��ü���� �ʿ�.
	}
}

class A {	//1
	String name = "A";	//2
	
	void pp(){	//7
		new B().print();	//8 classB�� �ּ� �ʿ�. �̳�Ŭ������ ��ä�����ؼ� Ȱ�밡��.
	}
	
	class B {	//3�ۿ� �ִ��� 4 ������ '�̳�Ŭ����'ȭ ��Ų��.
		void print() {
			System.out.println(name);	//�ƿ����� �ν��Ͻ� �ڿ� Ȱ�밡��.
		}
	}
	static class S{	//10 ����ƽ Ŭ���� ����. �ƿ����� �ڿ� Ȱ�밡��.
		void print() {
			//System.out.println(name);	11. �ν��Ͻ� ������� Ȱ�� �Ұ�. A���ּ�,A�� ��ü ���� �Ұ�.
			System.out.println("~~~~~~~~~~"); //12. 
		}
	}
}
