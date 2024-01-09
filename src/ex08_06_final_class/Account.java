package ex08_06_final_class;
final class Account {	
	// 하위 항목에서 상속 불가
	String accountNo;	// 계좌번호
	String ownerName;	// 예금주 이름
	int balance;		// 잔액
	Account(String accountNo, String ownerName, int balance){
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}
	
	void deposit(int input) { 		// 예금한다.
		balance += input;
	}
	
	int withdraw(int output) throws Exception {	// 인출한다.
		if (balance < output) {
			throw new Exception("잔액이 부족합니다.");
		}
		balance -= output;
		return output;
	}
}