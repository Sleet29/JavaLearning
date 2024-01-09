package ex07_11_method_EXCEPTION;

public class Account2 {
	String accountNo;
	String ownerName;
	int balance;
	
	public Account2(String accountNo, String ownerName,int balance) {
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}
	
	void deposit(int input) {
		balance += input;
		System.out.println("예금한다.");
	}
	
	int withdraw(int output) throws Exception {
		// Exception 클래스를 이용해서 예외를 발생시킵니다.
		
		if (output>balance) 
			throw new Exception("잔액이 부족합니다.");
		
		balance -= output;
		System.out.println("인출한다.");
		return output;
		
	}
}