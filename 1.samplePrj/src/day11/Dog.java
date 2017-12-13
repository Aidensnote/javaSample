package day11;

public class Dog extends Animal { // 6. 상속 처리
	
	/* 7. 변수선언 */
	String kind = "강아지 종류";
	String name;
	
	// 8. 디폴트 초기화
	public Dog(String kind, String name) {
		//super();	//지워도 animal의 defalut 생성자를 다녀온다.
		this.kind = kind;
		this.name = name;
	}
	
	public Dog(String superk,String kind, String name) {
		//super(); 퍼스트 스테이트먼트. 하나만 가능.
		super(superk);	//지워도 animal의 defalut 생성자를 다녀온다.
		this.kind = kind;
		this.name = name;
	}
	
	// 9. 생성자 함수
	public Dog() {
		super();
	}
	// 10. 출력 메소드
	public void display(){
		System.out.printf("Dog[%s %s %s]%n",super.getKind(),kind,name);
	}

}
