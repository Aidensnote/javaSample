package day9;

import util.Time;

public class TimeTest {
	public static void main(String[] args) {
		Time t1 = new Time(); //디폴트
		
		Time t2 = new Time(15,7,22); //값 설정.
		System.out.println(t2.getHour()+"시");

		t2.setHour(52); //조건범위 밖이지만 데이터 유효성을 잃음
		System.out.println(t2.getHour()+"시");

		t2.setSecond(-77); //조건범위 밖이지만 데이터 유효성을 잃음
		System.out.println(t2.getSecond()+"초");
		
		Time t3 = new Time(3,16,22,false); //am&pm
		
		Time t4 = new Time(15,-77,22); //유효성 검증이 적용안되고 있는 상태.
		System.out.println(t4); // toString메소드 = 객체의 정보를 출력
		t4.display();
		
	}
}
