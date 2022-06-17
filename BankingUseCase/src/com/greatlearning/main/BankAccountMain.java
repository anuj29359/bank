package com.greatlearning.main;

import com.greatlearning.model.Customer;
import java.util.Scanner;
import com.greatlearning.service.Banking;
import com.greatlearning.service.OTPGenerator;

public class BankAccountMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the account number-");
		String bankAccountNum = sc.nextLine();
		
		System.out.println("Please enter the password-");
		String password = sc.nextLine();
		
		Customer cust1 = new Customer(bankAccountNum, password);
		System.out.println(cust1.toString());
		
		Banking bank = new Banking();
		
		if(cust1.getBankAccountNo().equals(bankAccountNum) && cust1.getPassword().equals(password)) {
			System.out.println("Login Successful!");
			System.out.println("Please select the Banking options- \n");
			String options = " (1) Deposit \n (2) Withdraw\n (3) Transfer\n (4) Logout";
			int option;
			
			do {
				System.out.println(options);
				option = sc.nextInt();
				
				switch (option) {
				case 1: {
					System.out.println("You have choosen - Deposit");
					bank.deposit();
					break;
				}
				case 2: {
					System.out.println("You have choosen - Withdraw");
					//perform withdraw
					bank.withdraw();
					break;
				}
				case 3: {
					System.out.println("You have choosen - Transfer");
					//perform Transfer and OTP validation
					
					bank.transfer();
					
					break;
				}
				case 4: {
					System.out.println("\n *** Successfully logged out! ***");
					
					break;
				}
				default:
					//throw new IllegalArgumentException("Unexpected value: " + option);
					System.out.println("Please check your input. It must be 1-4");
				}
				
			}while(option != 4);
			
			
		}
		else {
			System.out.println("Incorrect credentials! Please try with a valid credential.");
		}
		
	}

}
