package day8;

/**
 * ����� ���� �ּ��ٴ� ���. (/** + ����)
 * @author student 		�������������
 * @since 2017 11.08	�������������
 *
 */
public class Employee {	//public �ʼ� 
	
	/* �ν��Ͻ� �������*/
	String name;	//�̸�
	String dept;	//�μ�
	String num;		//���
	
	/* ������ �Լ� ���� ���� - �ڵ����� ȣ�� */
	public Employee (){
		
		/* �����ڿ��� �ٸ� ������ ȣ���ϱ�-���� �̸�- */
		//System.out.println("Employee ������ �Լ� ");
		this("000","�����","OO��"); // first statement(������)���� ���ȴ�.
		
		/* �⺻���� ������ �ʱ�ȭ, �ڵ��ߺ�
		this.num = "000";
		this.name = "�����";
		this.dept = "oo��";
		*/
		
	}
	
	
	/* �Ķ���� ����(name/num/dept)�� �ذ� �� �� �ִ� ������ �Լ� ���� */
	public Employee (String num, String name, String dept){
		this.num = num;		//num = num;�� ���ú������� �ν�. this.num�� �ɹ� �������.
		this.name = name; 
		this.dept = dept; 
	}
	
	
	/**
	 * Employee ���� ��¿� ~~~~ �Ű�����(�Ķ����)�� �뵵�� ����
	 */
	
	/* �ν��Ͻ� �޼ҵ� */
	public void display(){ //��� �޼ҵ�, public �ʼ�
		System.out.printf("Employee[%s,%s,%s] %n",num,name,dept);
	}
	
	// �̱۶��� �ּ�
	/*	��Ƽ���� �ּ�	*/ 
}