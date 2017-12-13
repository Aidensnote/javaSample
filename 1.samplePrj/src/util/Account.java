// 계좌번호  , 잔고  , 입금 , 출금, 계좌이체, 통장정보출력
package util;

public class Account {
	//클래스 구성 = 데이터, 메소드
	//1. 데이터: 계좌번호-number / 잔고-money
	//2. 메소드: 입금 / 출금 / 계좌이체
	//3. 핸들링할 데이터와 메소드에 따라서 분류&모아서 관리한다.  
	
	String name;	//이름
	String num;		//계좌번호
	int money;		//잔고
	
	/*생성자 함수*/
	public Account(){}
	public Account(String name,String num, int money){
		/* 초기화 작업 */
		this.name = name;
		this.num = num;
		this.money = money;
	}
	
	/* 입금 기능 메소드 */
	public void deposit(int money){
		this.money += money;
		System.out.println("입금: "+money+" 잔고: "+this.money); //this.money와 일반 money의 차이
	}
	
	/* 출금 기능 메소드 */
	public void withDraw(int money){
		if(money>this.money){ //출금금액이 잔액보다 큰값 유효성 검사
			System.out.println("에러 코드 잔고부족");
			return; //실행 안하고 다시 돌려줌. 
		}
		this.money -= money;
		System.out.println("출금: "+money+" 잔고: "+this.money);
	}
	
	/* 잔고 조회 메소드 */
	public void display(){
		System.out.println("통장번호: "+num+","+name+" 잔고: "+this.money);
	}
	
	/* 계좌이체 메소드 */
	/* 메소드는 주소가 필요함=인스턴스 메소드 */
	public void transfer(Account to,int money){ //(Account 정보) 필요. (from,to,무엇을) 정보 필요.
		if(to == null){	//계좌이체할 계좌번호가 유효한지 확인
			System.out.println("계좌정보 확인하세요.");
			return;
		}
		if(this.money < money){ //잔액 부족시 리턴.
			System.out.println("잔고부족");
			System.out.println("계좌이체종료");
			return;
		}
		System.out.println("출금 계좌 정보");
		display();	//출금통장 정보
		System.out.println("입금 계좌 정보");
		to.display();	//입금통장 정보
		System.out.println("---- 계좌이체 수행중 ----");
		withDraw(money);	//withDraw=출금,this.withDraw,	from통장에서 출금
		to.deposit(money);		//deposit=입금,this.deposit,		to통장에 입금
		System.out.println("---- 계좌이체  완 료 ----");
	}
	/* 계좌이체 메소드 */
	/* 메소드는 주소가 필요함=인스턴스 메소드 */
	public void transfer(Account from, Account to,int money){ //(Account 정보) 필요. (from,to,무엇을) 정보 필요.
		if(from.money < money){
			System.out.println("잔고부족");
			System.out.println("계좌이체종료");
			return;
		}
		System.out.println("출금 계좌 정보");
		from.display();	//출금통장 정보
		System.out.println("입금 계좌 정보");
		to.display();	//입금통장 정보
		System.out.println("---- 계좌이체 수행중 ----");
		from.withDraw(money);	//withDraw=출금,this.withDraw,	from통장에서 출금
		to.deposit(money);		//deposit=입금,this.deposit,		to통장에 입금
		System.out.println("---- 계좌이체  완 료 ----");
	}
}
