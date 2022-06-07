import java.util.HashMap;
import java.util.Scanner;

public class OptionMenu extends Account {

	Scanner menuInput = new Scanner(System.in);
	HashMap<Integer, Integer> loginData = new HashMap<>();

	public void getLogin() {

		int x = 1;

		do {
			try {
				loginData.put(1234, 4321);
				loginData.put(5678, 8765);

				System.out.println("Welcome to ATM!");
				System.out.println("Enter your ID number:");
				setCustomerNumber(menuInput.nextInt());
				System.out.println("Enter your PIN:");
				setPinNumber(menuInput.nextInt());
			}catch(Exception e) {
				System.out.println("Invalid characters. Only numbers"+"\n");
				x = 2;
			}

			int cn = getCustomerNumber();
			int pn = getPinNumber();

			if(loginData.containsKey(cn) && loginData.get(cn) == pn) {
				getAccountType();
			}else {
				System.out.println("\n"+"Wrong customer number or pin."+"\n");
			}


		}while(x==1);

	}

	public void getAccountType() {

		System.out.println("Select the account type:");
		System.out.println("1 - Chequing");
		System.out.println("2 - Saving");
		System.out.println("3 - Exit");
		int selected = menuInput.nextInt();

		switch(selected) {
		case 1:
			getChequing();
			break;
		case 2:
			getSaving();
			break;
		case 3:
			System.out.println("Thanks for using the service!");
			break;
		default:
			System.out.println("Wrong selection!");
			getAccountType();
		}

	}

	public void getChequing() {
		System.out.println("Chequing account:");
		System.out.println("1 - View balance");
		System.out.println("2 - Withdraw fund");
		System.out.println("3 - Deposit fund");
		System.out.println("4 - Exit");

		int option = menuInput.nextInt();

		switch(option) {
		case 1:
			System.out.println("Your chequing balance is: "+ getChequingBalance());
			getAccountType();
			break;
		case 2:
			getChequingWithdrawInput();
			getAccountType();
			break;
		case 3:
			getChequingDepositInput();
			getAccountType();
			break;
		case 4:
			System.out.println("Thanks for using ATM.");
		default:
			System.out.println("\n"+"Invalid choice!"+"\n");
			getChequing();	
		}

	}

	public void getSaving() {
		System.out.println("Saving account:");
		System.out.println("1 - View balance");
		System.out.println("2 - Withdraw fund");
		System.out.println("3 - Deposit fund");
		System.out.println("4 - Exit");

		int option = menuInput.nextInt();

		switch(option) {
		case 1:
			System.out.println("Your Saving balance is: "+ getSavingBalance());
			getAccountType();
			break;
		case 2:
			getSavingWithdrawInput();
			getAccountType();
			break;
		case 3:
			getSavingDepositInput();
			getAccountType();
			break;
		case 4:
			System.out.println("Thanks for using ATM.");
		default:
			System.out.println("\n"+"Invalid choice!"+"\n");
			getSaving();	
		}

	}

}








