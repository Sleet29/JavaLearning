package ex08_02_constructor;
class CheckingAccount extends Account {
	String cardNo;
	
	// 생성자의 첫 줄에서 조상 클래스의 생성자를 호출하는데 자손 클래스의 멤버가
	// 부모 클래스의 멤버를 사용할 수 있으므로 부모의 멤버들이 먼저 초기화되어 있어야 합니다.
	CheckingAccount(String accountNo, String ownerName,
					int balace,		  String cardNo) {
		// 생성자 첫 줄에서 부모 생성자를 호출하지 않았기 때문에 컴파일러가 부모의 생성자를
		// 호출하는 문장인 super(); 을 여기에 삽입합니다.
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