package day6;

public class Test1 {

	public static void main(String[] args) {
		int num; // 타입선언.
		String name; //레퍼런스 데이터 타입-주소.\
		// Employee emp1; Employee 클래스없기 때문에 클래스 생성해야함.
		// Employee emp1; //새로운 데이터 타입(레퍼런트) 하나를 생성함.
		Employee emp1 = new Employee(); // 객채 생성, employee가 인스턴스화(-메모리에 떠있는 것) 시작주소가 emp1로 저장.
		emp1.display(); //주소가 있으므로 emp1의 기능을 작동시키고 .~형태로 구현. Employee 클래스 안에 display 메소드가 출력됨.
	}
}