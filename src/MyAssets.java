//package myWallet;

import java.util.Scanner;

public class MyAssets {

	public static void menuprompt() {
		System.out.println("----------Welcome to MY Bank----------");
		System.out.println("1) Transfer Money to Investment account");
		System.out.println("2) Deposit to Checking account");
		System.out.println("3) Withdraw from checking account");
		System.out.println("4) Checking account balance");
		System.out.println("5) Investment account balance");
		System.out.println("6) Total Assets");
		System.out.println("7) Exit");
		System.out.println("----------------------------------------");
		System.out.print("Choice: ");

	}
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int choice = -1;

		MyWallet paulWallet = new InvestmentAccount("Paul", "112-12-1111", "104", "813");//Fixed parameter type error 1#
		//MyWallet paulWallet = new InvestmentAccount("Paul", "112-12-1111", "104", 813);

		do {
			menuprompt();
			choice = scan.nextInt();
			while(choice < 1 || choice > 7) {//changed if branch to while loop error 2#
				System.out.print("Error: re-enter choice (1-7): ");
				choice = scan.nextInt();
			}
			switch (choice) {
			case 1:
				System.out.print("Enter transfer amount: ");
				((InvestmentAccount) paulWallet).transferMoney(scan.nextDouble());
				break;//added a break error 3#
			case 2:
				System.out.print("Enter deposit amount: ");
				//paulWallet).depositMoney(scan.nextDouble()); error 4#
				((CheckingAccount) paulWallet).depositMoney(scan.nextDouble());//Fixed object casting
				break;
			case 3:
				System.out.print("Enter withdrawal amount: ");
				((CheckingAccount) paulWallet).withdrawMoney(scan.nextDouble());
				break;
			case 4: 
				System.out.println("Checking account balance: $"+String.format("%,.2f", ((CheckingAccount) paulWallet).dollars));//added pretty string formatting
				break;
			case 5:
				System.out.println("Investment account balance: $"+String.format("%,.2f", ((InvestmentAccount) paulWallet).totalInvestments));//added pretty string formatting
				break;
			case 6:
				System.out.println("\n"+ paulWallet);
				break;
			case 7:
				System.out.println("Goodbye");
				break;
			}
		} while (choice != 7);//changed 8 to 7 error 5#
		scan.close();
	}

}
