package day7;

public class P237 {
	public static void main(String[] args) {
		int[] score; //�ּ�,������
		String name; //�ּ�
		// Employee emp; Ŭ������ ã�ƿü� ��� ���� �߻�. Employee�� ������ type�̴�. ���ο� ������ Ÿ���� Employee�� ���������� ���� �߻� ���Ѵ�.
		// Employee emp = null; �ּҰ� ����Ű�� ���� ��� ���� ����. "�ּ� = object/instance"
		
		Employee emp1 = new Employee(); // ��ü���� new = �޸𸮿� �� �ּ� = object/instance
		emp1.display(); //�ʱ�ȭ�� �ȵǼ� ���� ����.
		emp1.num = "001";
		emp1.name = "ȫ�浿";
		emp1.dept = "��ȹ��";
				
		Employee emp2 = new Employee(); // ���ο� ��ü �ݺ� ����. = EmployeeŸ�Կ� �迭 ���� ����.
		emp2.display();
		emp2.num = "002";
		emp2.name = "��浿";
		emp2.dept = "���ߺ�";
		
		emp1.display();
		emp2.display();
	}
}