package day10;

public class Dog extends Animal{		// ��ӹ��� Dog Ŭ����. Ŭ���� �̸� �ڿ� "extends +�θ� Ŭ��������"
	String name;						// �Ӽ�
	String kind = "������ ����";
	
	public void bike(){					// ���
		System.out.println("bike~~~");
	}
	
	/* Animal �ܿ� �θ� ���ٴ� �� Ȯ�� ���� */
	public void display(){
		System.out.printf("Dog [%s, %s, %s]%n",super.kind,this.kind,this.name); //this.�� ��������. super.�� �θ��(Animal)�� kind�� ȣ��. main(=static)���� super.�Ұ���.
	}

}
