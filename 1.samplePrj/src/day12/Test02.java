package day12;

public class Test02 {

	public static void main(String[] args) {
		/* 5. is a ���� = ��� ��ü�� �θ� Ÿ���� �� �� �ִ� = ��ü������ �Ұ�, Ÿ������ ���,Ȱ�� ����.*/
		Animal a = new Dog();
		Animal f = new Fish();
		
		// 6. new Animal(); Animal ��ü ���� �Ұ�.
		// 7. Animal[] animal = new Animal[5]; Animal Ÿ������ �迭 ���� ���� = Ÿ�Լ���, !=��ü����.
		Animal[] animals = {a,f}; 				// 8. for()������� �ڵ鸵 ����.
		for(int i=0;i<animals.length;i++){
			animals[i].breath();				// 9. animal�� ����� breath��� ����. ������ �ڽ�(Ưȭ��) ����� ����. �������̵� ����� �̿��� ������.
		}
		//������Ʈ �޼ҵ� = ��ü�� �޸𸮿� �� = �޼ҵ�.	equals�޼ҵ�, toString�޼ҵ�� �������̵� �����ϳ� �������� ����.
		
	}

}
