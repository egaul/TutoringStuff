//package myWallet;

public class CheckingAccount extends MyWallet{
	private String checkingAccountNumber;
	final double MAX_DAILY_WITHDRAWAL = 2000.00; //Where should we use this?
	protected double dollars;
	
	public void setDollars(double dollars) {
		this.dollars = dollars;
	}

	public double getDollars() {
		return dollars;
	}

	public CheckingAccount(String name, String socialsecNum, String checkingAccountNumber) {
		super(name, socialsecNum);
		this.checkingAccountNumber = checkingAccountNumber;
	}

	public void withdrawMoney(double amount) {//return value is never used so changed return value to void
		if(isOverDraft(amount)) {
			System.out.println("Warning: you are overdrafting your account. Insufficient funds!");
		}
		else {//added else branch
			dollars -= amount;
			balance -= amount;
		}
	}
	
	public boolean successfulTransfer(double amount) {
		if(isOverDraft(amount)) {
			//System.out.println("Warning: you are overdrafting your account. Insufficient funds!");
			return false;
		}
		dollars -= amount; 
		//return false;
		return true;
	}
	
	public boolean isOverDraft(double amount) {
		if(dollars - amount < 0) {
			//return false;
			return true;
		}
		//return true;
		return false;
	}
	
	//public void depositMoney(double amount) {balance += amount;}
	public void depositMoney(double amount) {
		balance += amount;
		dollars += amount;
	}
	
	public String toString() {
		return super.toString() +"\n\nChecking Account #: "+checkingAccountNumber +"\nBalance: $"+String.format("%,.2f", dollars);
	}
}
