package day6;

public class Employee { //�ɹ� �������,�ɹ� �żҵ常 ���� ����.
	String name;
	String dept;
	String number; //�ߺ������ʰ�(=�����̸Ӹ�Ű)
	
	/* �ɹ� �޼ҵ� */
	public void display(){ //static�� �����Ƿ� �ݵ�� new�� �Ἥ �޸𸮻� ����߸� ��� �� �� �ִ�.
		System.out.printf("Employee[���:%s �����:%s �ٹ��μ�:%s] %n",number,name,dept); //�ڸ� ���� Ȯ��.
	} 
}
