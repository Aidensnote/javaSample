package day9;

public class Employee {
	/* 1. ���� */
	private String name;	//�̸�
	private int salary;		//�޿�
	private String ssn;		//�ֹι�ȣ
	
	/* 3. ������ �Լ� �ߺ����� */
	public Employee(){
		
	}
	/* 4. �����ε� */
	public Employee(String name, int sarary, String ssm){
		this.name = name;
		this.salary = sarary;
		this.ssn = ssn;
	}
	
	/* set&get P.245 */
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return this.name;
	}
	public void setSalary(int salary){
		this.salary = salary;		
	}
	public int getSalary(){
		return this.salary;
	}
	public void setSsn(String ssn){
		this.ssn = ssn;
	}
	public String getSsn(){
		return this.ssn;
	}
	
	
	/* 2. �޼ҵ� ���� */
	public void display(){
		System.out.printf("Employee[%s,%d,%s]",name,salary,ssn);
		
	}
}// Ÿ�� Ŭ���� ����
