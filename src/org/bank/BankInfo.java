package org.bank;

public class BankInfo extends AxisBank {
	private void savings() {
		System.out.println("Savings Account No: 123456789");

	}
	private void fixed() {
		System.out.println("Fixed Account No: 987456321");

	}
	
	public static void main(String[] args) {
		BankInfo a= new BankInfo();
		a.savings();
		a.fixed();
		a.deposit();
	}

}
