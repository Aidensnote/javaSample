package day11.prob1;

public class Test {
	public static void main(String[] args) {
		
		/* ��ä����, ����, �Ķ���� �� �Է�(String & int�� Ŭ������ Ÿ�� ��ġ) */
		Student S = new Student("ȫ�浿",20,200201);
		Teacher T = new Teacher("�̼���",30,"JAVA");
		Employee E = new Employee("������",40,"������");
		
		/* ����ϴ� display �޼ҵ� */
		S.display();
		T.display();
		E.display();
		
	}
}
