package ex08_07_final_method;

public class BonusPointAccount extends Account{
	int bonusPoint;
	
	BonusPointAccount(String accountNo,String ownerName, int balance, int bonusPoint){
		super(accountNo,ownerName,balance);
		this.bonusPoint = bonusPoint;
	}
	
	void deposit(int amount) {
		//	balance +=amount;	// super.balance += amount;
		super.deposit(amount);
		bonusPoint += (int)(amount*0.001);
		// bonusPoint += amount*(1/1000);
		bonusPoint += amount*(1.0/1000);
		// 몫이 0이되므로 그값에 0을 곱하게 되므로 무조건 0이된다. 
	}
}
