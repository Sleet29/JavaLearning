package ex08_07_final_method;
class CheckingAccount extends Account {
	String cardNo;
	
	CheckingAccount(String accountNo, String ownerName,
					int balance,		  String cardNo) {
		super(cardNo, cardNo, balance); // Account() {}
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
		this.cardNo = cardNo;
	}
		
	int pay(String cardNo,int amount) throws Exception{
		if(!cardNo.equals(this.cardNo) || amount > balance ) {
			throw new Exception("지불이 불가능합니다.");
		}
		return withdraw(amount);
	}
}