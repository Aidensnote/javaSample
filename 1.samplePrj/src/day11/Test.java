package day11;

public class Test {

	public static void main(String[] args) {
		/* 1. 디폴트 생성자 활용해서 초기화 작업. */
		Dog d = new Dog();
		d.display();
		
		Dog d1 = new Dog("진돗개","백구");
		d1.display();

		Dog d2 = new Dog("강아지과","진돗개","백구");
		d1.display();
		
		
		
		

	}
}