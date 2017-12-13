package day10;

public class Test02 {

	public static void main(String[] args) {
		Fish f = new Fish();
		f.breath();						//오버라이딩 강제성 없음 확인 후 오버라이딩 진행하면 변경됨.
		
		Animal ff = new Fish();			//부모타입으로 생성.
		ff.breath();					//보모 메서드를 호출해도 자식 메서드가 호출됨.
	
		Animal a;						// 변수 하나에 animal,dog,fish 모든 객체가 들어올 수 있다.
	}
}