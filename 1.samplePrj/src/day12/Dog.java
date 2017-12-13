package day12;

public class Dog extends Animal { //객체생성 불가
	
	
	String kind = "강아지 종류";
	String name;
	
	
	public Dog(String kind, String name) {
		this.kind = kind;
		this.name = name;
	}
	
	public Dog(String superk,String kind, String name) {
		super(superk);
		this.kind = kind;
		this.name = name;
	}
	
	
	public Dog() {
		super();
	}
	
	public void display(){
		System.out.printf("Dog[%s %s %s]%n",super.getKind(),kind,name);
	}
	
	/* 3. 오버 라이딩 */
	@Override
	public void breath() {
		System.out.println("폐로 동작");
		
	}
}
