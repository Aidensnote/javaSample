package day7;

public class StudentTest2_P242 {
	public static void main(String[] args) {

		 /* �ߺ� �߻� = ���� Ÿ���� ������ = "�迭"
		 Student s1 = new Student();
		 Student s2 = new Student();
		 Student s3 = new Student();
		 Student s4 = new Student();
		 Student s5 = new Student();
		 */

		// Student[] s = new Student[5]; //�迭 Ÿ������ [x]���� ��ä ����

		Student s1 = new Student(); // ��ä����
		s1.name = "ȫ�浿"; // ������ �Է�
		s1.score = new int[] { 88, 99, 50 }; // ������ �Է�

		/* �迭�� ����,����,�ʱ�ȭ �ѹ��� ���� */
		Student[] s = { s1, // �ٷ� �ּҸ� �־ �����ϰ�, �����ؼ� ���� ����.
				new Student(), new Student(), new Student(), new Student(), };

		// �л��� ���� s.length��ŭ �����Ѵ�.
		s[4].name = "�־�"; // name ����
		s[4].score = new int[] { 99, 99, 99 }; // �����Ͱ� ����

		for (int i = 0; i < s.length; i++) {
			s[i].process(); // ����ó��.
			s[i].display(); // �л����� ���.
		}
	}
}