/* Employee ����� Ȯ���ϱ� ���� main */
package day8;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee emp1 = new Employee(); // �޸𸮿� ���� ��ɾ� new, Employee()����Ʈ �ʱ�ȭ �Լ� ����.
		/* �� �ʱ�ȭ */
		emp1.display(); //�ʱ�ȭ �۾��� �Ͼ�� ���̶� �Ʒ� �Էµ� ���� ���� ��.
		emp1.num="001";
		emp1.name="ȫ�浿";
		emp1.dept="��ȹ��";
		
		/* �����ڿ� �Ű������� �Ѱܹ޾Ƽ� public Employee (String num, String name, String dept){ �ʱⰪ ���� */
		Employee emp2 = new Employee("002","��浿","���ߺ�"); //�������Լ��� �Ķ���� 3���� �ڵ鸵 �����ϰ� ������.
		emp2.display();
		Employee emp3 = new Employee("003","�ֱ浿","��ȹ��"); //�̹� ������ �������Լ��� ���� �ڵ鸵�� ����. 
		emp3.display();
		
		
		
		
		
	}
}