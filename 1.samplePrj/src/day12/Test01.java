package day12;

// 2. ����Ʈ ó��, Fullfath(�������) ó�� ���ص� �ҷ��� �� ����.
import day11.Dog;
import day11.Animal;
import day11.Fish;

public class Test01 {

	public static void main(String[] args) {
		day11.Dog d = new Dog();		// 1. ���� �ٸ� ��Ű���ε��� Animal,Dog,Fish �ҷ��� �� �ִ°� public�̱� ������.
		d.display();					// 3. default�� ���� ��Ű�� �ȿ����� Ȱ�밡���ϴ�. kind,name�� �Ⱥ���
		
		Animal[] a = {d,new Fish(),new Dog()};		// 4. Dog, Fish��ü ���� ����.(�θ� Animal)
		for(int i=0;i<a.length;i++){				// 5. a�� �迭�� ó������ ������ ++��Ű�鼭 �ݺ� (0~3)
			a[i].breath();							// 6. Dog�� Animal�� breath�� ����, Fish�� �������̵� �� breath�� ����.
		}
	}
}
