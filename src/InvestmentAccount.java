//package myWallet;

public class InvestmentAccount extends CheckingAccount {
	private String InvestmentAccountNumber;
	protected double totalInvestments;
	
	public InvestmentAccount(String name, String socialsecNum, String checkingAccountNumber, String InvestmentAccountNumber) {
		//super(name, socialsecNum);
		super(name, socialsecNum, checkingAccountNumber);//Added third parameter
		this.InvestmentAccountNumber = InvestmentAccountNumber;
	}
	
	public void transferMoney(double amount) {
		if(super.successfulTransfer(amount)) {//removed not operator
			System.out.println("Successful transfer!");
			totalInvestments +=amount;
		}
		else {
			System.out.println("Insufficient funds in Checking account!");
		}
	}

	public double getTotalInvestments() {
		return totalInvestments;
	}

	public String toString() {
		//return "\n\nInvestment Account#: " + InvestmentAccountNumber +"\nInvestments: $"+totalInvestments+"\n";
		return super.toString() +"\n\nInvestment Account#: " + InvestmentAccountNumber +"\nInvestments: $"+String.format("%,.2f", totalInvestments)+"\n";
    }
}
