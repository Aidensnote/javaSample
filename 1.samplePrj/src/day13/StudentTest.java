/* �⺻���� ���-toString�� ��-equals �������̵��� ���� �޼ҵ� ����. */
package day13;

public class StudentTest {
	public static void main(String[] args) {
		//7.��ü����
		Student s = new Student("A",9);		//10. ��ü�� ����.
		System.out.println(s);
		System.out.println(s.getClass());	// 8. Ÿ�� ��.
		
		Student s1 = s;
		System.out.println(s.equals(s1)); 	// 9. ��. null ������ ���� = false.
		System.out.println(s1==s); 			// 11. �ּ� ��.
		
		Student[] student = {s,new Student("B",1),new Student()};	// 13. �迭,������ ��ü(�ּ� ����)
		for(int i=0;i<student.length;i++){							// 14. �迭=for(){}
			System.out.println(student[i]);							// 15. ���������� .toString �޼ҵ尡 �ڵ� ���. 
			
		}
		//12. .toString�� �ּҳ����� �������̵� �ȵȰ��
	}

}
