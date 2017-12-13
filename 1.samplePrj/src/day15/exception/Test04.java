/* 예외처리 적용 범위별 차이 */
package day15.exception;

public class Test04 {
	public static void main(String[] args) {
		Account a = new Account();		//14
		// a.setMoney(900); 			// 15 throw 블럭 설계.
		
		try {
			a.setMoney(-900); // 16. throw블럭 설계.
		} catch (Exception e) {
			//e.printStackTrace();	// 17 err의 내용 전체 설명. 너무 길면 생략하게 L12처럼 메소드 변경.
			System.out.println(e.getMessage());	//18 무슨 err인지만 설명.
		}	
		System.out.println("========================");
		
		try {
			Account b = new Account("OOO",-500); // 15 try&catch를 강제.  main단에서는 안하는게 좋다.
			System.out.println(b);				// 17 b값 출력.
		} catch (Exception e) {
			System.out.println(e.getMessage());	//16 메세지 확인
		}	
		System.out.println("END"); //19
	}
}


class Account{	//1
	String name;	//2
	int money;
	
	public Account() {	//3 디폴트
		super();
	}

	public Account(String name, int money) throws Exception {	//4 생성자
		super();
		this.name = name;
		//this.setmoney = money;	//6 음수허용x 예외를 적용시켜서 설계를 한다 = 상황에 따라 예외를 던진다..
		setMoney(money);			// 14. 예외적용으로 money를 변경. 예외-money가 음수일때.
	}

	@Override		//5 toString
	public String toString() {
		return "Account [name=" + name + ", money=" + money + "]";
	}

	public void setMoney(int money) throws Exception {	//7. set만 money에 적용. 10. throws Exception 추가.
		if(money<0){		//8 유효성 체크. 0보다 적은 돈. 11. 예외발생.
			//return;		//9 사용자는 err를 확인 불가.
			throw new Exception("money error"); //12 예외객체 생성 + 메세지 출력. = 예외조건이 발생되면 예외객체를 생성하고 메세지를 출력한다.
		}
		this.money = money;	//13 정상일 경우 객체 생성.
	}
	

	
	
	
}