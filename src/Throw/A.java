package Throw;

import java.util.Scanner;

import customexceptions.CardBlockedException;

public class A {

	private static final int pin = 1234;
	
	private float balance = 67000f;

	
	public void withdraw(int pin) {

		int failedAttempts = 1;

		Scanner sc = new Scanner(System.in);

		while (pin != this.pin) {
			
			failedAttempts++;
			
			if (failedAttempts > 3) {
				
				throw new CardBlockedException();
				
			} else {
				
				System.err.println("Invalid Pin. Please enter a pin again");
				pin = sc.nextInt();
			}
		}
		System.out.println("Enter a amount to withdraw : ");

		float amount = sc.nextFloat();

		balance = balance - amount;

		System.out.println("Remaining balance is: " + balance);
	}
}
