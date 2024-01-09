package ex08_01_inheritance;
class CheckingAccount extends Account {
	String cardNo;
	
	/*  	(생략가능) >> 기본 생성자 만들어줌
	CheckingAccount(){
		super();	// 부모 생성자 호출 (생성자 없음)
	}*/
	
	CheckingAccount(){
		super();	// 부모 생성자 호출 (생성자 없음)
	}
	/*
	 * 메서드 이름 : pay
	 * 매개변수 : 카드 번호(cardNo - 문자열), 인출액(amount - 정수형)
	 * 반환형 : int
	 * 반환되는 값 : 부모 클래스의 인출메서드 호출
	 * 
	 * balance 필드와 withdraw
	 */
	
	int pay(String cardNo,int amount) throws Exception{
		if(!cardNo.equals(this.cardNo) || amount > balance ) {
			throw new Exception("지불이 불가능합니다.");
		}
		return withdraw(amount);
	}
}