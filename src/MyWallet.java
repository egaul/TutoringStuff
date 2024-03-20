//package myWallet;

public class MyWallet{

	private String name;
	private String socialsecNum;
	protected double balance;
	
	public MyWallet(String name, String socialsecNum) {
		this.name = name;
		this.socialsecNum = socialsecNum;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void setSocialsecNum(String socialsecNum) {
		this.socialsecNum = socialsecNum;
	}

	public String toString() {
		return "Name: "+name +"\nSocial Security number: "+socialsecNum +"\nBalance: $"+String.format("%,.2f", balance);//added pretty string format
	}
}
