package com.sri;
class BankAccount{
	double blnc;
	void deposit(double amount) {
		blnc +=amount;
		System.out.println("Deposit: "+amount);
		System.out.println("Balance: "+blnc);
	}
	void withdraw(double amount) {
		if(blnc>=amount) {
			blnc-=amount;
			System.out.println("Withdraw: "+amount);
			System.out.println("Current balance: "+blnc);
		}
	}
}
class SavingsAccount extends BankAccount{
	void withdraw(double amount) {
		if(blnc-amount<100) {
			System.out.println("Cannot withdraw");
		}
		else {
			super.withdraw(amount);
		}
	}
}

public class Assignment5 {

	public static void main(String[] args) {
		BankAccount b1 = new BankAccount();
		b1.deposit(8000);
		b1.withdraw(4000);
		SavingsAccount s1 = new SavingsAccount();
		s1.deposit(8000);
		s1.withdraw(7950);
		s1.withdraw(900);

		

	}

}
