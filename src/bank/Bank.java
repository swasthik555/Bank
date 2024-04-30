package bank;

import java.util.Scanner;

public class Bank {
	
	public static void main(String[] args) {

		Bank b = new Bank();
		b.atm();

	}

	final int pincode = 54321;
	private int balance = 50000;
	int amt;
	int withdrawamount;  

	public void atm() {
		System.out.println("Welcome to the ATM of ABCD Bank");
		System.out.println("-------------------------------");
		System.out.println("Deposit money Press 1");
		System.out.println("Withdraw money Press 2");
		System.out.println("Check Balance Press 3");
		Scanner scr = new Scanner(System.in);
		System.out.print("Enter your choice = ");
		int choice = scr.nextInt();
		
		System.out.println("-----------------------");

		switch (choice) {
		case 1:
			System.out.println("Daily deposit limit is 10,000 rupees.");
			while(true) {
			System.out.print("Enter amount to be deposited = ");
			amt = scr.nextInt();
			System.out.println("---------------------------------");
			if (amt <= 10000) {
				System.out.print("Enter your pincode = ");
				while (true) {
				int pinCode = scr.nextInt();
				if (pinCode == pincode) {
					System.out.println("-------------------------------");
					System.out.println("Your money has been deposited");
					System.out.println("Your available Balance is " + (balance + amt));
					System.out.println("Thank you for using ABCD ATM.");
					break;
				} else {
					System.out.println("Pincode is incorrect");
					System.out.print("Re-Enter your pincode = ");
				}
			}
				break;
			
		
			} else if (amt > 10000) {			
				System.out.println("You cannot deposit " + amt + " to your Bank account");
				System.out.println("Daily Deposit limit is 10,000 rupees.");
			}
			}
			break;
		case 2:
			System.out.println("Daily limit for withdrawal of money is 15,000 rupees.");
			System.out.println("Available balance is "+balance);
			while(true) {
			System.out.print("Enter the amount to be withdrawn = ");
			withdrawamount = scr.nextInt();
			System.out.println("---------------------------------------");
			if (withdrawamount <= 15000) {
				System.out.print("Enter your pincode = ");
				while (true) {
					int pinCode = scr.nextInt();
					if (pinCode == pincode) {
						System.out.println("--------------------------------------------");
						System.out.println("Collect your Money");
						System.out.println("Your available balance is "+(balance -withdrawamount));
						System.out.println("Thank you for using ABCD ATM.");
						break;
						
					}
					else {
						System.out.println("Pincode is incorrect");
						System.out.print("Re-Enter your pincode = ");
					}
				}
				break;
			}else if (withdrawamount > 15000) {	
				System.out.println("You cannot withdrawn " + withdrawamount + " Rupees");
				System.out.println("Daily limit for withdrawal of money is 15,000 rupees");
					}
				}
			break;
			
		case 3:
			System.out.print("Enter your pincode = ");
			while (true) {
				int pinCode = scr.nextInt();
				if (pinCode == pincode) {
					System.out.println("-----------------------------------------");
					System.out.println("Available balance is "+balance+ " rupees");
					break;
					
				}
				else {
					System.out.println("Pincode is incorrect");
					System.out.print("Re-Enter your pincode = ");
				}
			}
			
		}
		
			
		scr.close();
	}
	}


