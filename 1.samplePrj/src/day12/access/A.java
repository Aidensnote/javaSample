package day12.access;

public class A {
	/* 접근성 차이 확인 */
	public String name1 = "A";			//public	모든 영역
	protected String name2 = "A";		//protected 다른 패키지에 있더라도 상속이라면
	String name3 = "A";					//default	같은 패키지 영역
	private String name4 = "A";			//private
	

}

class B{
	A a;	//A타입에 a가능.
	void print(){
		System.out.println(a);	//same class영역 밖이라 name4가 안보임.
	}
}