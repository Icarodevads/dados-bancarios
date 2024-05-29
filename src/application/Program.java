package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {
		Account account;

		Locale.setDefault(Locale.US);

		Scanner Sc = new Scanner(System.in);

		System.out.print("Enter account number:");
		int number = Sc.nextInt();
		System.out.print("Enter account holder:");
		Sc.nextLine();
		String holder = Sc.nextLine();

		System.out.println("Is there na initial deposit (y/n)?");
		char response = Sc.next().charAt(0);
		if (response == 'y' || response == 'Y') {
			System.out.println("Enter a initial Value acount ");
			double initialDeposit = Sc.nextDouble();
			account = new Account(number, holder, initialDeposit);
		} else {
			account = new Account(number, holder);
		}

		
		System.out.println();
		System.out.println("Account data:");
		System.out.println(account);

		System.out.println();
		System.out.print("Enter a deposit value: ");
		double depositValue = Sc.nextDouble();
		account.deposit(depositValue);
		System.out.println("Updated account data:");
		System.out.println(account);

		System.out.println();
		System.out.print("Enter a withdraw value: ");
		double withdrawValue = Sc.nextDouble();
		account.withDraw (withdrawValue);
		System.out.println("Updated account data:");
		System.out.println(account);

		Sc.close();
	}

}
