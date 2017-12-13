/* ����ó�� ���� ������ ���� */
package day15.exception;

public class Test04 {
	public static void main(String[] args) {
		Account a = new Account();		//14
		// a.setMoney(900); 			// 15 throw �� ����.
		
		try {
			a.setMoney(-900); // 16. throw�� ����.
		} catch (Exception e) {
			//e.printStackTrace();	// 17 err�� ���� ��ü ����. �ʹ� ��� �����ϰ� L12ó�� �޼ҵ� ����.
			System.out.println(e.getMessage());	//18 ���� err������ ����.
		}	
		System.out.println("========================");
		
		try {
			Account b = new Account("OOO",-500); // 15 try&catch�� ����.  main�ܿ����� ���ϴ°� ����.
			System.out.println(b);				// 17 b�� ���.
		} catch (Exception e) {
			System.out.println(e.getMessage());	//16 �޼��� Ȯ��
		}	
		System.out.println("END"); //19
	}
}


class Account{	//1
	String name;	//2
	int money;
	
	public Account() {	//3 ����Ʈ
		super();
	}

	public Account(String name, int money) throws Exception {	//4 ������
		super();
		this.name = name;
		//this.setmoney = money;	//6 �������x ���ܸ� ������Ѽ� ���踦 �Ѵ� = ��Ȳ�� ���� ���ܸ� ������..
		setMoney(money);			// 14. ������������ money�� ����. ����-money�� �����϶�.
	}

	@Override		//5 toString
	public String toString() {
		return "Account [name=" + name + ", money=" + money + "]";
	}

	public void setMoney(int money) throws Exception {	//7. set�� money�� ����. 10. throws Exception �߰�.
		if(money<0){		//8 ��ȿ�� üũ. 0���� ���� ��. 11. ���ܹ߻�.
			//return;		//9 ����ڴ� err�� Ȯ�� �Ұ�.
			throw new Exception("money error"); //12 ���ܰ�ü ���� + �޼��� ���. = ���������� �߻��Ǹ� ���ܰ�ü�� �����ϰ� �޼����� ����Ѵ�.
		}
		this.money = money;	//13 ������ ��� ��ü ����.
	}
	

	
	
	
}