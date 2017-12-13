package day12;

public class Fish extends Animal {
	
	String name;
	
	/* 4. 이미 오버라이딩 */
	@Override
	public void breath(){
		System.out.println("아가미로 숨쉬기 ~~~~");
	}

	
	public Fish() {
		super();
	}

	public Fish(String name) {
		super();
		this.name = name;
	}
	public Fish(String kind, String name) {
		super(kind);
		this.name = name;
	}

	
	public void display(){
		System.out.printf("Fish[%s]%n",super.getKind(),name);
	}
}
