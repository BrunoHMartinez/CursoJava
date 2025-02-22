package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Account;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account account;
		
		System.out.print("Enter account number:");
		int number = sc.nextInt();
		System.out.print("Enter account holder:");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Is there a initial deposit (y/n) ?");
		char response = sc.next().charAt(0);
		if (response == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			account = new Account(holder, number, initialDeposit);
		}
		else {
			account = new Account(holder, number);
			}
		
		 System.out.println("\nAccount data: ");
		 System.out.println(account);
		
		 System.out.print("\nEnter a deposit value: ");
		 double depositValue = sc.nextDouble();
		 account.deposit(depositValue);
		 System.out.println("\nUpdate account value: ");
		 System.out.println(account);
		
		 System.out.print("\nEnter a withdraw value: ");
		 double withdrawValue = sc.nextDouble();
		 account.withdraw(withdrawValue);
		 System.out.println("\nUpdate account value: ");
		 System.out.println(account);
		
		
		
		
		
		
		
		sc.close();
	}

}
