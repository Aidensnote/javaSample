/* ����� ���� ���� Ŭ���� ó�� */
package day16.exception;

public class Test02 {

	public static void main(String[] args) { //throws MoneyException{	//17 throws moneyexception�� ���.
		
		try{	//18 �������
		Account account = new Account("ȫ�浿",100); //7
		account.setMoney(-500);						//9 ��ȿ�� �ʿ�
		System.out.println(account);				//8 toString���� ��ȯ.

		}catch (MoneyException e){	//19 ���ܹ߻���
			System.out.println(e.getMessage());	//20 �����޼��� ���.
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
	public void setMoney(int money) throws MoneyException { 			//9 ����ó��. 13 throws exceptionó��=> ����ڰ� ���� �ʿ�. = ��������� Ŭ���� ����.
		if(money<0)	//10 ���ܽ� ����ʿ�
			throw new MoneyException("money�� �����");	//11���ܹ߻��ϰ� ������. checked �� trycatch�ʿ�. //15. ����ó���� ��� �޼���.=������ �ʿ�.
			//throw new RuntimeException();	12.��Ÿ���� �����Ϸ��� üũ ����.
			this.setMoney(money);		//17
	}
	
	@Override
	public String toString() {					//6
		return "Account [name=" + name + ", money=" + money + "]";
	}
	
	
	
}

class MoneyException extends Exception{ //14.����Ŭ���� ���� = ���ܴ� ����� �޾ƾ��Ѵ�.	//19runtime���� ����
	
	public MoneyException(){		//15
		super("Money error");	//20 ����Ʈ �����޼���
	}
	public MoneyException(String msg){	//16
		super(msg);
	}
}