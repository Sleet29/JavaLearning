// 직불 계좌 클래스의 생성자를 사용하는 프로그램
package ex08_07_final_method;
public class InheritanceExample {
	public static void main(String args[]) {
		BonusPointAccount obj = 
				new BonusPointAccount("333-33-333333", "김미영", 0 , 0);
		obj.deposit(1000);
			System.out.println("잔액:"+obj.balance);
			System.out.println("보너스 적립량:"+obj.bonusPoint);
	}
}