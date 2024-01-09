package ex07_11_method_EXCEPTION;

public class Account {
	String accountNo;
	String ownerName;
	int balance;
	
	public Account(String accountNo, String ownerName,int balance) {
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}
	
	void deposit(int input) {
		balance += input;
		System.out.println("예금한다.");
	}
	
	int withdraw(int output) {
		if (output>balance) {
			return 0;
		}
		
		balance -= output;
		System.out.println("인출한다.");
		return output;
		
	}
}