package ex08_08_abstract_class;
// 인스턴스화(객체 생성)를 금지하는 abstract 키워드
// abstract 키워드가 붙은 클래스를 추상 클래스라고 한다.
abstract class Account {			
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
	
	// **Overriding 불가**
	//final int withdraw(int output) throws Exception {	// 인출한다.
		int withdraw(int output) throws Exception {	// 인출한다.
		if (balance < output) {
			throw new Exception("잔액이 부족합니다.");
		}
		balance -= output;
		return output;
	}
}