/* 통합된 핸들링을 구현 = 통일된 약속 (프로토콜) = 인터페이스  */
package day14.lab2;

public class TVTest02 {
	public static void main(String[] args) {
		
		/* 인터페이스로 타입을 일치화 시킨면 LTV, STV 모두 호출 가능하다 */
		// 사용자 = 구현체, 구현체에 따라서 구현이 된다.
		TV user = new LTV(); //5 TV타입 = 인터페이스
		user.poweron();
		user.poweroff();
		System.out.println("=======================");
		
		TV user1 = new STV(); //5 TV타입 = 인터페이스
		user1.poweron();
		user1.poweroff();
		System.out.println("=======================");
		
		
		/* 들어오는 key 값에 따라서 구현체가 변하는 로직 = 조건(상황)에 따라서 객체 생성 = SPRING에선 맵핑 */
		TV user2 = null;
		if(args[0].equals("p")){
			user2 = new PTV();
		}else if(args[0].equals("s")){
			user2 = new STV();
		}else{
			user2 = new LTV();
		}
		user2.poweron();
		user2.poweroff();
	}
}




interface TV{	//1. 추상메소드, 파이널 스테틱 베리어블만 가능. 인터페이스 생성.
	void poweron();		//2. 전원 켤때 일치된 메소드
	void poweroff();	//2. 전원 끌때 일치된 메소드
}




class LTV implements TV{	//3 정한 약속을 따르는 클래스

	@Override		//4 동일한 오버라이딩.
	public void poweron() {
		System.out.println(getClass().getSimpleName()+"poweron()");	//getClass.getName = 내이름
		
	}

	@Override		//4
	public void poweroff() {
		System.out.println(getClass().getSimpleName()+"poweroff()");	//getClass.getName = 내이름
	}		
}

class STV implements TV{	//3 정한 약속을 따르는 클래스

	@Override		//4
	public void poweron() {
		System.out.println(getClass().getSimpleName()+"poweron()");
	}

	@Override		//4
	public void poweroff() {
		System.out.println(getClass().getSimpleName()+"poweroff()");
	}		
}
class PTV implements TV {	//3 정한 약속을 따르는 클래스
	
	@Override		//4
	public void poweron() {
		System.out.println(getClass().getSimpleName()+"poweron()");
	}
	
	@Override		//4
	public void poweroff() {
		System.out.println(getClass().getSimpleName()+"poweroff()");
	}		
}


/* 정한 약속이 없는 TV = implement를 하지않은 경우
class PTV {	
	
	@Override		//4
	public void poweron() {
		System.out.println(getClass().getSimpleName()+"poweron()");
	}
	
	@Override		//4
	public void poweroff() {
		System.out.println(getClass().getSimpleName()+"poweroff()");
	}		
}
 */