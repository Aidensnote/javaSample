package day12;

public class P352 {

	public static void main(String[] args) {
		/* �������� private ó�� */
		//2. ������ �Լ� ���� = new�ϸ� ��ü ����.
		//new SingleTone();	//5. �ۿ��� �Ұ���.
		//new SingleTone();
		//new SingleTone();
		//new SingleTone();
		
		SingleTone.getInstance(); // 7. static�� �ø� SingTone�� getInstance�� ���.
		SingleTone.getInstance();
		SingleTone.getInstance();
		SingleTone.getInstance();
	}

}

//1. Ŭ���� ����.
class SingleTone{
	private static SingleTone s = new SingleTone();	// 4. �� �ȿ����� ��ü ���� ����. 7. privateó���ϰ� static �޼ҵ�� ����.
	private SingleTone(){							// 3. private �� class �ȿ����� ��ü ���� ����. �ۿ����� �Ұ���.
		System.out.println("SingleTone() ����");
	}
	public static SingleTone getInstance(){ //6. getInstance �޼ҵ带 ȣ���ϸ� SingleTone�� �ּҸ� ���. �̱��� ����� ��ü������.
		return s;
	}
		
	
}