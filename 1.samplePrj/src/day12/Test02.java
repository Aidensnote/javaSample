package day12;

public class Test02 {

	public static void main(String[] args) {
		/* 5. is a 관계 = 모든 객체는 부모 타입이 될 수 있다 = 객체생성만 불가, 타입으로 사용,활용 가능.*/
		Animal a = new Dog();
		Animal f = new Fish();
		
		// 6. new Animal(); Animal 객체 생성 불가.
		// 7. Animal[] animal = new Animal[5]; Animal 타입으로 배열 생성 가능 = 타입선언, !=객체생성.
		Animal[] animals = {a,f}; 				// 8. for()기반으로 핸들링 가능.
		for(int i=0;i<animals.length;i++){
			animals[i].breath();				// 9. animal의 기능은 breath기능 없음. 하지만 자식(특화된) 기능이 동작. 오버라이딩 기술을 이용한 다형성.
		}
		//오브젝트 메소드 = 객체가 메모리에 뜸 = 메소드.	equals메소드, toString메소드는 오버라이딩 권장하나 강제성이 없다.
		
	}

}
