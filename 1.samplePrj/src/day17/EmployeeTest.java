/* ���ʸ� = Ŭ������ ��ü Ÿ���� ��Ÿ�ӿ��� �����ϴ� ��. jdk1.5���� ����*/
package day17;

public class EmployeeTest {
	public static void main(String[] args) {
		Employee<String,String> e2 = new Employee();	//3 StringŸ��		//12 p�� Ÿ�Լ���
//		System.out.println(e2);
		e2.number = "2017";
//		Employee<int>							 4 objectŸ�Ը� �����ϴ�. �⺻���� �Ұ����ϴ�.
		
		Employee<Integer,Integer> e1 = new Employee(); //5 ��Ƽ���� �����Ƿ� intŸ������ ��ȯ.	//13 p�� Ÿ�Լ���
//		e1.number = "2015";						 6 �Ұ���
//		System.out.println(e1);
		e1.number = 2015;						// 7 intŸ�Ը� ����.
		
		Employee e3 = new Employee();			//8 T�� ���� ���x
//		System.out.println(e3);
		e3.number = 2222;						//9 int / String �Ѵ� ���ȴ�.
		e3.number = "444";						//10 obj-integer / obj-String �Ѵ� objŸ���̶� ����.	// 14 ��δ� objŸ��.
		
		
		
		
		
	}
}


class Employee <T,P> {	//2 ��Ÿ�ӿ� �����Ѵٴ� �ǹ�. <������ Ÿ��> ����.		//11 �߰��� ���ʸ� ����. 
	String name;
	T number;	//1 T��� Ŭ������ ������ Ÿ���� ���Ƿ� ����. 
	P age;
	
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", number=" + number + ", age=" + age + "]";
	}
	
}