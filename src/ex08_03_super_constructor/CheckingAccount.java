package ex08_03_super_constructor;
class CheckingAccount extends Account {
	String cardNo;
	
	CheckingAccount(String accountNo, String ownerName,
					int balace,		  String cardNo) {
		super(cardNo, cardNo, balace); // Account() {}
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