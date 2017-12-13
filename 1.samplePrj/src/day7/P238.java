package day7;

public class P238 {
	public static void main(String[] args) {
		TV tv1 = new TV(); //객체생성
		tv1.display();
		tv1.power();
		tv1.channelUp();
		tv1.channelDown();
		
		
		TV tv2 = new TV();
		System.out.println("tv1의 channel값은 "+tv1.channel + "입니다.");
		System.out.println("tv2의 channel값은 "+tv2.channel + "입니다.");
		
		/*
		tv2 = tv1;
		tv1.channel = 7;
		System.out.println("tv1의 channel 값은 "+ tv1.channel + "입니다");
		System.out.println("tv2의 channel 값은 "+ tv2.channel + "입니다");
		*/
	}

}

/*
 * main 클래스 외에서 선언하면 생성가능. public이 불가능하므로 스코프(같은 패키지안에서라는) 제약을 받는다. 하나의 자바소스안에
 * 여러가지 class를 생성 가능하다. 단 하나의 자바엔 단 하나의 public이 가능하다. public한 class이름으로 생성.
 * public을 포함한 메인메소드를 네임으로 설정하는 것을 권장.
 */

class TV { //맴버 필드

	/* 맴버 베리어블 */
	String color;
	boolean power;
	int channel;

	void power() {
		this.power = !this.power; //this. 생략
	}

	void channelUp() { //메소드는 ()를 써서 표현하므로 구별이 가능하다.
		++this.channel; //this. 생략
	}

	void channelDown() { //메소드
		--this.channel; //this. 생략
	}
	void display(){ //메소드
		System.out.printf("TV[%s channel: %d 전원(%b)]%n",this.color,this.channel,this.power);
	}
}