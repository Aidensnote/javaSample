package day9;

import util.Time;

public class TimeTest {
	public static void main(String[] args) {
		Time t1 = new Time(); //����Ʈ
		
		Time t2 = new Time(15,7,22); //�� ����.
		System.out.println(t2.getHour()+"��");

		t2.setHour(52); //���ǹ��� �������� ������ ��ȿ���� ����
		System.out.println(t2.getHour()+"��");

		t2.setSecond(-77); //���ǹ��� �������� ������ ��ȿ���� ����
		System.out.println(t2.getSecond()+"��");
		
		Time t3 = new Time(3,16,22,false); //am&pm
		
		Time t4 = new Time(15,-77,22); //��ȿ�� ������ ����ȵǰ� �ִ� ����.
		System.out.println(t4); // toString�޼ҵ� = ��ü�� ������ ���
		t4.display();
		
	}
}
