package day12;

public abstract class Animal {	//2. abstract 클래스 (추상 클래스)로 변경. = 상속을 전제로 한 abstract 클래스 선언.
	
	private String kind = "동물의 종류";
	
	public Animal() {
		System.out.println("animal()수행");
	}
	
	public Animal(String kind) {
		super();
		this.kind = kind;
	}
	public String getKind() {
		return kind;
	}
	
	public void setKind(String kind) {
		this.kind = kind;
	}
	
	
	/* 1. 구현부 제거 abstract 메소드 */
	public abstract void breath();
	
}
