/* 사용자 정의 예외 클래스 처리 */
package day16.exception;

public class Test02 {

	public static void main(String[] args) { //throws MoneyException{	//17 throws moneyexception만 잡게.
		
		try{	//18 예외잡기
		Account account = new Account("홍길동",100); //7
		account.setMoney(-500);						//9 유효성 필요
		System.out.println(account);				//8 toString으로 변환.

		}catch (MoneyException e){	//19 예외발생시
			System.out.println(e.getMessage());	//20 에러메세지 출력.
		}
		
		System.out.println("main END"); //18
	}

}

class Account{	//1
	private String name;	//2
	private int money;		//2

	public Account() {		//3
		super();
	}
	public Account(String name, int money)throws MoneyException {	//4		//18
		super();
		this.name = name;
		this.money = money;
	}
	
	public int getMoney() {						//5
		return money;
	}
	public void setMoney(int money) throws MoneyException { 			//9 예외처리. 13 throws exception처리=> 사용자가 정의 필요. = 사용자정의 클레스 생성.
		if(money<0)	//10 예외시 언급필요
			throw new MoneyException("money는 양수만");	//11예외발생하고 던지기. checked 라서 trycatch필요. //15. 예외처리시 출력 메세지.=생성자 필요.
			//throw new RuntimeException();	12.런타임은 컴파일러가 체크 못함.
			this.setMoney(money);		//17
	}
	
	@Override
	public String toString() {					//6
		return "Account [name=" + name + ", money=" + money + "]";
	}
	
	
	
}

class MoneyException extends Exception{ //14.예외클래스 정의 = 예외는 상속을 받아야한다.	//19runtime으로 변경
	
	public MoneyException(){		//15
		super("Money error");	//20 디폴트 에러메세지
	}
	public MoneyException(String msg){	//16
		super(msg);
	}
}