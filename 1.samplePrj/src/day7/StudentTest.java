package day7;

public class StudentTest {

	public static void main(String[] args) {
		Student s1 = new Student(); // ��ä����

		s1.name = "ȫ�浿"; // ������ �Է�
		s1.score = new int[] { 88, 99, 50 }; // ������ �Է�

		s1.process(); // �޼ҵ带 ȣ���ؾ��� ó���� �ȴ�.
		s1.process(); // sum=0;���� �����ؼ� �ݺ��ص� ��ȿ�� ���� ��µȴ�.
		s1.display(); // �޼ҵ带 ȣ���ؾ��� ó���� �ȴ�.

	}

}
