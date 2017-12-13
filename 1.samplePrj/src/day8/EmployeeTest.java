/* Employee 출력을 확인하기 위한 main */
package day8;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee emp1 = new Employee(); // 메모리에 띄우는 명령어 new, Employee()디폴트 초기화 함수 실행.
		/* 값 초기화 */
		emp1.display(); //초기화 작업이 일어나기 전이라 아래 입력된 값이 들어가기 전.
		emp1.num="001";
		emp1.name="홍길동";
		emp1.dept="기획부";
		
		/* 생성자에 매개변수로 넘겨받아서 public Employee (String num, String name, String dept){ 초기값 설정 */
		Employee emp2 = new Employee("002","고길동","개발부"); //생성자함수에 파라미터 3개를 핸들링 가능하게 생성함.
		emp2.display();
		Employee emp3 = new Employee("003","최길동","기획부"); //이미 생성된 생성자함수로 인해 핸들링이 가능. 
		emp3.display();
		
		
		
		
		
	}
}