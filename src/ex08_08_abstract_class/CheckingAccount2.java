package ex08_08_abstract_class;
class CheckingAccount2 extends Account {
	String cardNo;
	
	CheckingAccount2(String accountNo, String ownerName,
					int balance,		  String cardNo) {
		// 파라미터 3개의 슈퍼 클래스 생성자 호출문
		// 반드시 생성자의 첫번째 명령문이어야 합니다.
		super(accountNo,ownerName,balance);
		this.cardNo = cardNo;
	}
		
	int pay(String cardNo,int amount) throws Exception{
		if(!cardNo.equals(this.cardNo) || amount > balance ) {
			throw new Exception("지불이 불가능합니다.");
		}
		return super.withdraw(amount);
	}
}