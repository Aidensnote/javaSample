package day7; //package�� �ٸ��� �����̸��� class name ������ ����.

public class Employee {
	String num; //��� <�ɹ��������,�ɹ��ʵ�>
	String name; //�̸�
	String dept; //�ٹ����
	
	/* instance method & instance �ڿ� = new�� �ؾ����� �޸𸮿� �� = �׷��� ��밡�� */
	public void display(){ //���. "�Լ��� �����" �޼ҵ��̸�,�Ķ���� �ʿ俩��,��������翩��,�ܺΰ��� ������ ������ �ִ�.
		System.out.printf("Employee[%5s,%5s,%5s]%n",num,name,dept); //���. (this.)num/(this.)name/(this.)dept�� ������ ����.
	}//�Լ�����="�Լ��� �ٵ��/������"
}    /* instance = new�ؾ� �� �� ����. // static = new���ص� �� �� ����. */