package day14.lab1;

public class TvTest01 {
	public static void main(String[] args) {
		
		/* 각각의 타입만 핸들링 가능 */
		LTV user = new LTV();	//5
		user.on();	//6
		user.off();
		
		STV user1 = new STV();	//7
		user1.powerOn();	//8
		user1.powerOff();
		// user = new STV();	타입불일치 err

	}
}

class LTV{	//1 클래스생성
	void on(){	//2 메소드
		System.out.println("LTV 전원 on");
	}
	void off(){	//2
		System.out.println("LTV 전원 off");
	}
}

class STV{	//3
	void powerOn(){		//4
		System.out.println("STV 전원 on");
	}
	void powerOff(){	//4
		System.out.println("STV 전원 off");
	}
}