package day6;

public class Employee { //맴버 베리어블,맴버 매소드만 포함 가능.
	String name;
	String dept;
	String number; //중복되지않게(=프라이머리키)
	
	/* 맴버 메소드 */
	public void display(){ //static이 없으므로 반드시 new를 써서 메모리상에 띄워야만 사용 할 수 있다.
		System.out.printf("Employee[사번:%s 사원명:%s 근무부서:%s] %n",number,name,dept); //자리 구성 확보.
	} 
}
