package day10;

public class Dog extends Animal{		// 상속받을 Dog 클래스. 클래스 이름 뒤에 "extends +부모 클래스네임"
	String name;						// 속성
	String kind = "강아지 종류";
	
	public void bike(){					// 기능
		System.out.println("bike~~~");
	}
	
	/* Animal 외에 부모가 많다는 걸 확인 가능 */
	public void display(){
		System.out.printf("Dog [%s, %s, %s]%n",super.kind,this.kind,this.name); //this.는 생략가능. super.은 부모단(Animal)의 kind가 호출. main(=static)에선 super.불가능.
	}

}
