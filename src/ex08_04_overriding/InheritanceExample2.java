// 직불 계좌 클래스의 생성자를 사용하는 프로그램
package ex08_04_overriding;
public class InheritanceExample2 {
	public static void main(String args[]) {
		CreditLineAccount obj = 
				new CreditLineAccount("000-11-111111", "김선달", 100 , 20000);
		//obj.deposit(100000);
		try {
			int amount = obj.withdraw(500);
			// int amount = obj.withdraw(50000);
			System.out.println("인출액:"+amount);
			System.out.println("잔액:"+obj.balance);
			System.out.println("마이너스 한도:"+obj.creditLine);
		} catch (Exception e) {
			String msg = e.getMessage();
			System.out.println(msg);
		}
	}
}