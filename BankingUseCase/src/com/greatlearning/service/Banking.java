package com.greatlearning.service;
import java.util.Scanner;

public class Banking {
	
	private int balance = 1000;
	Scanner sc = new Scanner(System.in);
	
	public void deposit() {
		System.out.println("Please enter the amount to be deposited-");
		int amount = sc.nextInt();
		if(amount > 0) {
			balance += amount;
			System.out.println("New balance is " + balance);
		}
		else {
			System.out.println("Amount " + amount + " cannot be deposited.");
		}
		
		
	}
	
	public void withdraw() {
		System.out.println("Enter the amount to withdraw-");
		int amount = sc.nextInt();
		if(amount > 0 && (balance-amount) > 0) {
			balance -= amount;
			System.out.println("Withdrawl Successful.");
			System.out.println("Remaining Balance - " + balance);
		}
		else {
			System.out.println("Please enter a valid value for withdrawl");
		}
		
		
	}
	
	public void transfer() {
		
		int amount, otp, otpGenerated, bankAccountNo;
		OTPGenerator og = new OTPGenerator();
		otp = og.generateOTP();
		System.out.println("OTP: " + otp);
		
		int i =3;
		int otpg;
		do {
			System.out.println("Please enter the otp you got on your mobile-");
			otpg = sc.nextInt();
			if(otpg == otp) {
				System.out.println("OTP accepted!");
				System.out.println("Please enter the amount to be transferred- ");
				amount = sc.nextInt();
				if(amount > 0 && (balance-amount) > 0) {
					balance -= amount;
					System.out.println("Transfer Successful.");
					System.out.println("Remaining Balance - " + balance);
				}
				else {
					System.out.println("Please enter a valid value for the amount Transfer");
				}
			}
			else {
				System.out.println("Incorrect OTP, " + i + " chances left");
			}
			//System.out.println(i);
			
		} while((otpg != otp) && i-- > 0);
		if(i == 0) {
			System.out.println("Amount ransfer could not be done.\n Choose another option-");
		}
		
		
		
	}

}
