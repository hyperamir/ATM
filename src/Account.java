import java.util.Scanner;

public class Account {

	private double chequingBalance = 0;
	private double savingBalance = 0;
	private int customerNumber;
	private int pinNumber;

	Scanner input = new Scanner(System.in);
	
	

	public double getChequingBalance() {
		return chequingBalance;
	}

	public double getSavingBalance() {
		return savingBalance;
	}

	public int setCustomerNumber(int customerNumber) {
		this.customerNumber = customerNumber;
		return customerNumber;
	}

	public int getCustomerNumber() {
		return customerNumber;
	}

	public int getPinNumber() {
		return pinNumber;
	}

	public int setPinNumber(int pinNumber) {
		this.pinNumber = pinNumber;
		return pinNumber;
	}

	public double calcCheqingWithdraw(double amount) {
		chequingBalance = chequingBalance - amount;
		return chequingBalance;
	}

	public double calcCheqingDeposit(double amount) {
		chequingBalance = chequingBalance + amount;
		return chequingBalance;
	}

	public double calcSavingWithdraw(double amount) {
		savingBalance = savingBalance - amount;
		return savingBalance;
	}

	public double calcSavingDeposit(double amount) {
		savingBalance = savingBalance + amount;
		return savingBalance;
	}

	public void getChequingWithdrawInput() {
		System.out.println("Chequing account balance: "+chequingBalance);
		System.out.println("Amount you want to withdraw:");
		double amount = input.nextDouble();

		if(chequingBalance-amount >= 0) {
			calcCheqingWithdraw(amount);
			System.out.println("Your new chequing account balance: "+chequingBalance);
		}else {
			System.out.println("Balance cannot be negative!");
		}
	}

	public void getSavingWithdrawInput() {
		System.out.println("Saving account balance: "+savingBalance);
		System.out.println("Amount you want to withdraw:");
		double amount = input.nextDouble();

		if(savingBalance-amount >= 0) {
			calcSavingWithdraw(amount);
			System.out.println("Your new saving account balance: "+savingBalance);
		}else {
			System.out.println("Balance cannot be negative!");
		}
	}

	public void getChequingDepositInput() {
		System.out.println("Chequing account balance: "+chequingBalance);
		System.out.println("Amount you want to deposit:");
		double amount = input.nextDouble();

		if(chequingBalance+amount >= 0) {
			calcCheqingDeposit(amount);
			System.out.println("Your new chequing account balance: "+chequingBalance);
		}else {
			System.out.println("Balance cannot be negative!");
		}
	}

	public void getSavingDepositInput() {
		System.out.println("Saving account balance: "+savingBalance);
		System.out.println("Amount you want to deposit:");
		double amount = input.nextDouble();

		if(savingBalance+amount >= 0) {
			calcSavingDeposit(amount);
			System.out.println("Your new saving account balance: "+savingBalance);
		}else {
			System.out.println("Balance cannot be negative!");
		}
	}	

}
