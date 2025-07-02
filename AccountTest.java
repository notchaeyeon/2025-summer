package ch08;

public class AccountTest {

	public static void main(String[] args) {
		Account acc = new Account();
		
		acc.setBalance(1000);
		System.out.printf("잔액: %d원", acc.getBalance());
	}

}

class Account {
	private int balance;
	
	public int getBalance() {
		return balance;
	}
	
	public void setBalance(int b) {
		balance = b;
	}
}
