package day10;

public class Test01 {

	public static void main(String[] args) {
		Animal a1 = new Animal();
		a1.breath();
		System.out.println(a1.kind);
		System.out.println("-------------------------");

		Dog d = new Dog();
		d.display();					
		
		
		d.breath();
		d.bike();
		System.out.println(d.name);
		System.out.println(d.kind);		// �ڽĿ��� ���� Ȯ��&ȣ��
		System.out.println(((Animal)d).kind); // �θ𿵿����� upcasting�ʿ�
		
		// is a ���� - ��� ��ü�� data type�� �θ� �� �� �ִ�.
		new Dog().breath();					// Dog��ü ����. ������ �ڱ��ּ�. ���۷���(�Ͻ�����) ��ü�� ����.
		Animal e = new Dog();					// Animal�� e ��ü ����. �ڽĿ����� ������ �Ұ���.
		//e.bike err ȣ��Ұ�
		e.breath();
		((Dog)e).bike();						//�ٿ�ĳ����. ������ �ǿ뼺 ������.
		System.out.println(e.kind);
		System.out.println("-------------------------");
		
		
		
		
		
	}

}