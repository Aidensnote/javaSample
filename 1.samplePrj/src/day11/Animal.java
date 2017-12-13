package day11;	//부모 클래스

public class Animal {
	
	/* 1. 변수선언 */
	private String kind = "동물의 종류";
	
	/* 5. 생성자 함수 */
	public Animal() {
		System.out.println("animal()수행");		// 부모 함수에 디폴트는 항상 우선 실행된다.
	}
	
	/* 4. 디폴트초기화 */
	public Animal(String kind) {
		super();
		this.kind = kind;
	}
	/* 3 set&get 생성 */
	public String getKind() {
		return kind;
	}
	
	public void setKind(String kind) {
		this.kind = kind;
	}
	
	
	/* 2. 메소드 */
	public void breath(){	//선언부
		System.out.println("폐로 숨쉬기 ~~~~");	//구현부
	}

	

}
