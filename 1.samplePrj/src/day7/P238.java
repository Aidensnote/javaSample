package day7;

public class P238 {
	public static void main(String[] args) {
		TV tv1 = new TV(); //��ü����
		tv1.display();
		tv1.power();
		tv1.channelUp();
		tv1.channelDown();
		
		
		TV tv2 = new TV();
		System.out.println("tv1�� channel���� "+tv1.channel + "�Դϴ�.");
		System.out.println("tv2�� channel���� "+tv2.channel + "�Դϴ�.");
		
		/*
		tv2 = tv1;
		tv1.channel = 7;
		System.out.println("tv1�� channel ���� "+ tv1.channel + "�Դϴ�");
		System.out.println("tv2�� channel ���� "+ tv2.channel + "�Դϴ�");
		*/
	}

}

/*
 * main Ŭ���� �ܿ��� �����ϸ� ��������. public�� �Ұ����ϹǷ� ������(���� ��Ű���ȿ������) ������ �޴´�. �ϳ��� �ڹټҽ��ȿ�
 * �������� class�� ���� �����ϴ�. �� �ϳ��� �ڹٿ� �� �ϳ��� public�� �����ϴ�. public�� class�̸����� ����.
 * public�� ������ ���θ޼ҵ带 �������� �����ϴ� ���� ����.
 */

class TV { //�ɹ� �ʵ�

	/* �ɹ� ������� */
	String color;
	boolean power;
	int channel;

	void power() {
		this.power = !this.power; //this. ����
	}

	void channelUp() { //�޼ҵ�� ()�� �Ἥ ǥ���ϹǷ� ������ �����ϴ�.
		++this.channel; //this. ����
	}

	void channelDown() { //�޼ҵ�
		--this.channel; //this. ����
	}
	void display(){ //�޼ҵ�
		System.out.printf("TV[%s channel: %d ����(%b)]%n",this.color,this.channel,this.power);
	}
}