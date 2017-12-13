package day7; //package만 다르면 같은이름의 class name 생성이 가능.

public class Employee {
	String num; //사번 <맴버베리어블,맴버필드>
	String name; //이름
	String dept; //근무장소
	
	/* instance method & instance 자원 = new를 해야지만 메모리에 뜸 = 그래야 사용가능 */
	public void display(){ //기능. "함수의 선언부" 메소드이름,파라미터 필요여부,결과값존재여부,외부공개 정보를 가지고 있다.
		System.out.printf("Employee[%5s,%5s,%5s]%n",num,name,dept); //기능. (this.)num/(this.)name/(this.)dept가 생략된 상태.
	}//함수영역="함수의 바디부/구현부"
}    /* instance = new해야 쓸 수 있음. // static = new안해도 쓸 수 있음. */