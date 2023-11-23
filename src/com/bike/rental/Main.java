package com.bike.rental;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("=====WelCome to PS Rental Bikes=====");
		System.out.println("=====Menu=====");
		System.out.println("1.Create Account.\n2.Exit.");
		System.out.println("==============");
		int s=sc.nextInt();
		switch(s) {
		case 1:
				System.out.println("=====Create an Account=====");
				System.out.println("Enter your Name:");
				String s1=sc.next();
				System.out.println("Enter your Phone Number:");
				long l=sc.nextLong();
				System.out.println("Enter your Email:");
				String s2=sc.next();
				System.out.println("Enter your Address:");
				String s3=sc.next();
				System.out.println("create Password:");
				String s4=sc.next();
				Account a1=new Account(s1,l,s2,s3,s4);
				System.out.println("Account has been Created Successfully...!!!");
				while(true) {
				System.out.println("=====Login=====");
				System.out.println("1.Login Through Phone Number.\n2.Login Through Email.\n3.Exit");
				System.out.println("=====choose the option=====");
				int op=sc.nextInt();
				switch(op) 
				{
				case 1:
					Login l1=new Login();
					System.out.println("Enter your Number");
					long a=sc.nextLong();
					System.out.println("Enter your Password");
					String password=sc.next();
					if(l1.loginpage(a,password,a1)) 
					{
						User u1=l1.chooseType("bike");
						System.out.println("Balance is: "+a1.WalletBal);
						System.out.println("Please deposite the Amount to the Wallet: ");
						System.out.println("Minimum You have to Deposite 1000rs");
						System.out.println("Enter the amount");
						int amt=sc.nextInt();
						System.out.println("Enter the type Through You Want to Deposit \n1.Paytm 2.Phone Pay 3.Google Pay");
						int upi=sc.nextInt();
						u1.transaction(amt, a1, upi);
						System.out.println("Now Choose The Bike To Ride...!!!");
						System.out.println("1=hondaActiva5G Rate:18rs/hr \n2=hondaDio Rate:19rs/hr \n3=hondaXBlade Rate:36rs/hr \n4=tvsApacheRTR180 Rate:41rs/hr \n5=bajajPulsar250N Rate:44rs/hr \n6=royalEnfieldClassic350 Rate:62rs/hr");
						int bike=sc.nextInt();
						u1.chooseBike(a1, bike);
					}
					break;
				case 2:
					Login l12=new Login();
					System.out.println("Enter your Email");
					String a11=sc.next();
					System.out.println("Enter your Password");
					String password1=sc.next();
					if(l12.loginpage(a11,password1,a1)) 
					{
						User u2=l12.chooseType("bike");
						System.out.println("Balance is: "+a1.WalletBal);
						System.out.println("Please deposite the Amount to the Wallet: ");
						System.out.println("Minimum You have to Deposite 1000rs");
						System.out.println("Enter the amount");
						int amt1=sc.nextInt();
						System.out.println("Enter the type Through You Want to Deposit \n1.Paytm 2.Phone Pay 3.Google Pay");
						int upi1=sc.nextInt();
						u2.transaction(amt1, a1, upi1);
						System.out.println("Now Choose The Bike To Ride...!!!");
						System.out.println("1=hondaActiva5G, 2=hondaDio, 3=hondaXBlade, 4=tvsApacheRTR180, 5=bajajPulsar250N, 6=royalEnfieldClassic350.");
						int bike1=sc.nextInt();
						u2.chooseBike(a1, bike1);
					}
					break;
				case 3:
					System.out.println("=====Thank You Visit Again=====");
					System.exit(0);
				default:
					System.out.println("Invalid Choice");
				}	
				}
		case 2:
			System.out.println("=====Thank You Visit Again=====");
			System.exit(0);
		default:
			System.out.println("Invalid Choice");
		}
		
	}

}
