package day9;

public class EmployeeTest {

	public static void main(String[] args) {
		/*5. ��ü ���� */
		Employee emp1 = new Employee();
		
		/*6. �����Ͱ� �Է� */
		emp1.setName("ȫ�浿");
		emp1.setSalary(50000);
		emp1.setSsn("111-111");
		emp1.display();

		System.out.println(emp1.getSalary()*0.01);	//���ݰ��� ����.
	}
}
