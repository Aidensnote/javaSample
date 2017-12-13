package day11;

public class Fish extends Animal { //11. 상속
	
	/* 12. 변수선언 */
	String name;
	
	@Override //오버라이드 에노테이션 주석.
	public void breath(){						// 13. 부모의 선언부 그대로.
		System.out.println("아가미로 숨쉬기 ~~~~");	//14. 구현부만 변경하면 오버라이딩. 강제성이 없음.
	}

	/* 15. 디폴트 , 생성자함수 */
	public Fish() {
		super();
	}

	public Fish(String name) {
		super();
		this.name = name;
	}
	public Fish(String kind, String name) {
		super(kind);	// 슈퍼에 파라미터 부분을 부모의 kind를 이어받아서 활용.
		//super(); 위에 1문장이 아래에 2문장을 합친 결과.
		//super.setKind(kind);
		this.name = name;
	}

	
	// 16. 출력
	public void display(){
		System.out.printf("Fish[%s]%n",super.getKind(),name); //부모에게서 kind도 물려받음. private라서 get메소드를 써야함.
	}
}
