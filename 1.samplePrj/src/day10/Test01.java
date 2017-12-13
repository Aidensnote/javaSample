package day10;

public class Test01 {

	public static void main(String[] args) {
		Animal a1 = new Animal();
		a1.breath();
		System.out.println(a1.kind);
		System.out.println("-------------------------");

		Dog d = new Dog();
		d.display();					
		
		
		d.breath();
		d.bike();
		System.out.println(d.name);
		System.out.println(d.kind);		// 자식영역 먼저 확인&호출
		System.out.println(((Animal)d).kind); // 부모영역으로 upcasting필요
		
		// is a 관계 - 모든 객체에 data type은 부모가 될 수 있다.
		new Dog().breath();					// Dog객체 생성. 시작점 자기주소. 템퍼러리(일시적인) 객체로 변형.
		Animal e = new Dog();					// Animal로 e 객체 생성. 자식영역에 엑서스 불가능.
		//e.bike err 호출불가
		e.breath();
		((Dog)e).bike();						//다운캐스팅. 하지만 실용성 떨어짐.
		System.out.println(e.kind);
		System.out.println("-------------------------");
		
		
		
		
		
	}

}
