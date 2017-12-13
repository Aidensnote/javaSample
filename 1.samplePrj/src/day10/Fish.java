package day10;

public class Fish extends Animal {
	String name;
	
	public void breath(){
		System.out.println("아가미로 숨쉬기");	// 오버라이딩. 부모의 선언부를 바꾸지말고 그대로 유지.
	}
}
