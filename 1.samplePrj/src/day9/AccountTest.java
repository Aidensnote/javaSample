package day9;

import util.Account;

public class AccountTest {
	public static void main(String[] args) {
		
		Account a1 = new Account("È«±æµ¿","001",3000);
		a1.deposit(5000);
		a1.withDraw(2000);
		
		Account a2 = new Account("±è±æµ¿","002",1000);
		a1.transfer(a1, a2, 3000);
		a1.transfer(a2, 3000);
		a2 = null;

	}
}