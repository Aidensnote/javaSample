package day9;

public class P303 {
	public static void main(String[] args) {
		System.out.println("start");
		Product b1 = new Product();
		Product b2 = new Product();
		Product b3 = new Product();
		
		System.out.println(b1.serialNum);
		System.out.println(b2.serialNum);
		System.out.println(b3.serialNum);
		System.out.println("end");
		
		System.out.println(b1.count);
		System.out.println(b2.count);
		System.out.println(b3.count);
		
		System.out.println(Product.count);
	}
}

class Product{ //P306
	static int count = 0;
	int serialNum;
	
	
	/* �������Լ����� ���� ���*/
	static{ //static ��� 1ȸ��, �ν��Ͻ� �ڿ� ���ٺҰ�.
		//System.out.println("static {   }"); //static �ʱ�ȭ ���
		// serialNum = 0; err
		count = 0; //static �ڿ� �ڵ鸵.
	}
	
	/* ��ä ���� Ƚ����ŭ ������ �Լ� ������ ������ �Լ����� ���� = "�ʱ�ȭ ��" */
	{
		//System.out.println("{ }"); //�����ں��� ����. �ν��Ͻ��� �ʱ�ȭ�ϴ� ���
		++count;			// Ŭ���� �������
		serialNum = count;	// �ν��Ͻ� �������
	}
		
	public Product(){
		//System.out.println("BlockTest() �⺻������");
		
	}
}