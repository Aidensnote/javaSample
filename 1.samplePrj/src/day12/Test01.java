package day12;

// 2. 임포트 처리, Fullfath(경로지정) 처리 안해도 불러올 수 있음.
import day11.Dog;
import day11.Animal;
import day11.Fish;

public class Test01 {

	public static void main(String[] args) {
		day11.Dog d = new Dog();		// 1. 서로 다른 패키지인데도 Animal,Dog,Fish 불러올 수 있는건 public이기 때문에.
		d.display();					// 3. default는 같은 패키지 안에서만 활용가능하다. kind,name이 안보임
		
		Animal[] a = {d,new Fish(),new Dog()};		// 4. Dog, Fish객체 생성 가능.(부모 Animal)
		for(int i=0;i<a.length;i++){				// 5. a의 배열의 처음부터 끝까지 ++시키면서 반복 (0~3)
			a[i].breath();							// 6. Dog는 Animal의 breath를 수행, Fish는 오버라이딩 된 breath를 수행.
		}
	}
}
