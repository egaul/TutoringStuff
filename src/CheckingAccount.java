//package myWallet;

public class CheckingAccount extends MyWallet{
	private String checkingAccountNumber;
	//final double MAX_DAILY_WITHDRAWAL = 2000.00; //Not needed
	protected double dollars;
	
	public void setDollars(double dollars) {
		this.dollars = dollars;
	}

	public CheckingAccount(String name, String socialsecNum, String checkingAccountNumber) {
		super(name, socialsecNum);
		this.checkingAccountNumber = checkingAccountNumber;
	}

	public void withdrawMoney(double amount) {//return value is never used so changed return value to void error 1#
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
			//System.out.println("Warning: you are overdrafting your account. Insufficient funds!"); Not Needed
			return false;
		}
		dollars -= amount; 
		//return false;
		return true;//changed return boolean from false to true error 2#
	}
	
	public boolean isOverDraft(double amount) {
		if(dollars - amount < 0) {
			//return false;
			return true; //changed return boolean from false to true error 3#
		}
		//return true;
		return false;//changed return boolean from true to false error 4#
	}
	
	//public void depositMoney(double amount) {balance += amount;}
	public void depositMoney(double amount) {
		balance += amount;
		dollars += amount;//added dollars incrementation logic error 5#
	}
	
	public String toString() {
		return super.toString() +"\n\nChecking Account #: "+checkingAccountNumber +"\nBalance: $"+String.format("%,.2f", dollars);
	}
}
