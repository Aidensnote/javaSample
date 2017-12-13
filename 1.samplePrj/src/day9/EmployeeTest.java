package day9;

public class EmployeeTest {

	public static void main(String[] args) {
		/*5. 객체 생성 */
		Employee emp1 = new Employee();
		
		/*6. 데이터값 입력 */
		emp1.setName("홍길동");
		emp1.setSalary(50000);
		emp1.setSsn("111-111");
		emp1.display();

		System.out.println(emp1.getSalary()*0.01);	//세금같은 연산.
	}
}
