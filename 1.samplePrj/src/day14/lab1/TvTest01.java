package day14.lab1;

public class TvTest01 {
	public static void main(String[] args) {
		
		/* ������ Ÿ�Ը� �ڵ鸵 ���� */
		LTV user = new LTV();	//5
		user.on();	//6
		user.off();
		
		STV user1 = new STV();	//7
		user1.powerOn();	//8
		user1.powerOff();
		// user = new STV();	Ÿ�Ժ���ġ err

	}
}

class LTV{	//1 Ŭ��������
	void on(){	//2 �޼ҵ�
		System.out.println("LTV ���� on");
	}
	void off(){	//2
		System.out.println("LTV ���� off");
	}
}

class STV{	//3
	void powerOn(){		//4
		System.out.println("STV ���� on");
	}
	void powerOff(){	//4
		System.out.println("STV ���� off");
	}
}