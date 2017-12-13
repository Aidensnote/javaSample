package day9;

public class Employee {
	/* 1. 선언 */
	private String name;	//이름
	private int salary;		//급여
	private String ssn;		//주민번호
	
	/* 3. 생성자 함수 중복생성 */
	public Employee(){
		
	}
	/* 4. 오버로드 */
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
	
	
	/* 2. 메소드 생성 */
	public void display(){
		System.out.printf("Employee[%s,%d,%s]",name,salary,ssn);
		
	}
}// 타임 클래스 영역
