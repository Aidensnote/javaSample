package day20;

import java.util.Vector;

import day12.Student;

public class Prob2Test {
	public static void main(String[] args) {
		Student s = new Student("ȫ",24,001);	//4 ������ ��ä����
		Vector<Integer> i =new Vector<>();		//5
		i.add(55);
		i.add(155);
		i.add(455);
		Prob2 p = new Prob2(s,i);		//1 �ν��Ͻ� = �޸𸮿� �÷����Ѵ� = ��ä����
		
		p.print();					//2	�������.
		System.out.println(p);		//3 ������ �������. ����Ʈ �ʱ�ȭ�� ���ؼ� null. = ������ �ʿ�
		
	}
}