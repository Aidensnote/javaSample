package day12;

import day12.access.A;

public class Test03 {
	public static void main(String[] args) {
		A a = new A();	//import�ʿ�. A�� public �ϱ⶧���� import�� ���.
		// a.name1		//public�� ��� ����, �������� ������ �ִ�.
		// B b;
	}
}

class C extends A {	//A Ŭ���� ���
	void print(){
		//this.	//name1,2�� Ȯ�� ����. protected�� �ڿ����� Ȯ�� ����. ��Ӱ����϶��� �ڽı����� ���� ����.
	}
}