package com.bike.rental;

import java.util.Scanner;


public class Bike implements User
{
	static double hondaActiva5G;
	static double hondaDio;
	static double hondaXBlade;
	static double tvsApacheRTR180;
	static double bajajPulsar250N;
	static double royalEnfieldClassic350;
	Scanner scanner = new Scanner(System.in);

	@Override
	public void chooseBike(Account ref,int choice) 
	{
		if(choice == 1) 
		{
			hondaActiva5G(ref);
		}
		else if(choice == 2)
		{
			hondaDio(ref);
		}
		else if(choice == 3)
		{
			hondaXBlade(ref);
		}
		else if(choice == 4)
		{
			tvsApacheRTR180(ref);
		}
		else if(choice == 5)
		{
			bajajPulsar250N(ref);
		}
		else if(choice == 6)
		{
			royalEnfieldClassic350(ref);
		}
	}
	
	public void hondaActiva5G(Account ref)
	{
		double hourlyRate=18.00;
		System.out.println("How Many Hours do you need the Bike:");
		int perHours = scanner.nextInt();
		

		double d1=calculateBikeRent(hourlyRate, perHours);
		System.out.println("Total Booking Amount= "+d1);
		
		if(ref.WalletBal>d1) 
		{
			ref.WalletBal=ref.WalletBal-d1;
			System.out.println("Booking is Confirmed");
			System.out.println("Honda Activa 5G is Ready! You can RIDE NOW! Safe Drive!...");
			System.out.println("Your Updated Wallet Balance is= "+ref.WalletBal);
		}
		else
		{
			System.out.println("Insufficent Balance");
			System.out.println("Add amount to the tranction wallet");
			
			Bike b1=new Bike();
			System.out.println("Please deposite the Amount to the Wallet: ");
			System.out.println("Minimum Should be 1000rs");
			System.out.println("Enter the amount");
			int amt1=scanner.nextInt();
			System.out.println("Enter the type Through You Want to Deposit \n1.Paytm 2.Phone Pay 3.Google Pay");
			int upi1=scanner.nextInt();
			b1.transaction(amt1, ref, upi1);
		}
	}
	
	public void hondaDio(Account ref) 
	{	
		double hourlyRate=19.00;
		System.out.println("How Many Hours do you need the Bike:");
		int perHours = scanner.nextInt();
		

		double d1=calculateBikeRent(hourlyRate, perHours);
		System.out.println("Total Booking Amount= "+d1);
		
		if(ref.WalletBal>d1) 
		{
			ref.WalletBal=ref.WalletBal-d1;
			System.out.println("Booking is Confirmed");
			System.out.println("Honda Dio is Ready! You can RIDE NOW! Safe Drive!...");
			System.out.println("Your Updated Wallet Balance is= "+ref.WalletBal);
		}
		else
		{
			System.out.println("Insufficent Balance");
			System.out.println("Add amount to the tranction wallet");
			
			Bike b1=new Bike();
			System.out.println("Please deposite the Amount to the Wallet: ");
			System.out.println("Minimum Should be 1000rs");
			System.out.println("Enter the amount");
			int amt1=scanner.nextInt();
			System.out.println("Enter the type Through You Want to Deposit \n1.Paytm 2.Phone Pay 3.Google Pay");
			int upi1=scanner.nextInt();
			b1.transaction(amt1, ref, upi1);
		}
	}
	
	public void hondaXBlade(Account ref) 
	{
		double hourlyRate=36.00;
		System.out.println("How Many Hours do you need the Bike:");
		int perHours = scanner.nextInt();
		

		double d1=calculateBikeRent(hourlyRate, perHours);
		System.out.println("Total Booking Amount= "+d1);
	        
		if(ref.WalletBal>d1) 
		{
			ref.WalletBal=ref.WalletBal-d1;
			System.out.println("Booking is Confirmed");
			System.out.println("Honda X Blade is Ready! You can RIDE NOW! Safe Drive!...");
			System.out.println("Your Updated Wallet Balance is= "+ref.WalletBal);
		}
		else
		{
			System.out.println("Insufficent Balance");
			System.out.println("Add amount to the tranction wallet");
			
			Bike b1=new Bike();
			System.out.println("Please deposite the Amount to the Wallet: ");
			System.out.println("Minimum Should be 1000rs");
			System.out.println("Enter the amount");
			int amt1=scanner.nextInt();
			System.out.println("Enter the type Through You Want to Deposit \n1.Paytm 2.Phone Pay 3.Google Pay");
			int upi1=scanner.nextInt();
			b1.transaction(amt1, ref, upi1);
		}
		
	}
	
	public void tvsApacheRTR180(Account ref) 
	{
		double hourlyRate=41.00;
		System.out.println("How Many Hours do you need the Bike:");
		int perHours = scanner.nextInt();
		

		double d1=calculateBikeRent(hourlyRate, perHours);
	    System.out.println("Total Booking Amount= "+d1);
	    
		if(ref.WalletBal>d1) 
		{
			ref.WalletBal=ref.WalletBal-d1;
			System.out.println("Booking is Confirmed");
			System.out.println("TVS Apache RTR 180 is Ready! You can RIDE NOW! Safe Drive!...");
			System.out.println("Your Updated Wallet Balance is= "+ref.WalletBal);
		}
		else
		{
			System.out.println("Insufficent Balance");
			System.out.println("Add amount to the tranction wallet");
			
			Bike b1=new Bike();
			System.out.println("Please deposite the Amount to the Wallet: ");
			System.out.println("Minimum Should be 1000rs");
			System.out.println("Enter the amount");
			int amt1=scanner.nextInt();
			System.out.println("Enter the type Through You Want to Deposit \n1.Paytm 2.Phone Pay 3.Google Pay");
			int upi1=scanner.nextInt();
			b1.transaction(amt1, ref, upi1);
		}
	}
	
	public void bajajPulsar250N(Account ref) 
	{
		double hourlyRate=44.00;
		System.out.println("How Many Hours do you need the Bike:");
		int perHours = scanner.nextInt();
		

		double d1=calculateBikeRent(hourlyRate, perHours);
		System.out.println("Total Booking Amount= "+d1);
	        
		if(ref.WalletBal>d1) 
		{
			ref.WalletBal=ref.WalletBal-d1;
			System.out.println("Booking is Confirmed");
			System.out.println("Bajaj Pulsar 250N is Ready! You can RIDE NOW! Safe Drive!...");
			System.out.println("Your Updated Wallet Balance is= "+ref.WalletBal);
		}
		else
		{
			System.out.println("Insufficent Balance");
			System.out.println("Add amount to the tranction wallet");
			
			Bike b1=new Bike();
			System.out.println("Please deposite the Amount to the Wallet: ");
			System.out.println("Minimum Should be 1000rs");
			System.out.println("Enter the amount");
			int amt1=scanner.nextInt();
			System.out.println("Enter the type Through You Want to Deposit \n1.Paytm 2.Phone Pay 3.Google Pay");
			int upi1=scanner.nextInt();
			b1.transaction(amt1, ref, upi1);
			
		}
		
	}
	
	public void royalEnfieldClassic350(Account ref) 
	{
		double hourlyRate=62.00;
		System.out.println("How Many Hours do you need the Bike:");
		int perHours = scanner.nextInt();
		

		double d1=calculateBikeRent(hourlyRate, perHours);
		System.out.println("Total Booking Amount= "+d1);
	        
		if(ref.WalletBal>d1) 
		{
			ref.WalletBal=ref.WalletBal-d1;
			System.out.println("Booking is Confirmed");
			System.out.println("Royal Enfield Classic 350 is Ready! You can RIDE NOW! Safe Drive!...");
			System.out.println("Your Updated Wallet Balance is= "+ref.WalletBal);
		}
		else
		{
			System.out.println("Insufficent Balance");
			System.out.println("Add amount to the tranction wallet");
			
			Bike b1=new Bike();
			System.out.println("Please deposite the Amount to the Wallet: ");
			System.out.println("Minimum Should be 1000rs");
			System.out.println("Enter the amount");
			int amt1=scanner.nextInt();
			System.out.println("Enter the type Through You Want to Deposit \n1.Paytm 2.Phone Pay 3.Google Pay");
			int upi1=scanner.nextInt();
			b1.transaction(amt1, ref, upi1);
		}
		
	}
	public double calculateBikeRent(double hourlyRate, int perHours)
	{
	    double rent = hourlyRate * perHours;
	    return rent;
	}


	@Override
	public void transaction(double amount, Account ref, int type)
	{
		if(type==1)
		{
			paytm(amount,ref);
		}
		else if(type==2)
		{
			phonepay(amount,ref);
		}
		else if(type==3)
		{
			googlepay(amount,ref);
		}
		else
		{
			System.out.println("Invalid Type");
		}
		
	}
	public void paytm(double amount,Account ref)
	{
		ref.WalletBal=ref.WalletBal+amount;
		System.out.println("Your Amount has been Successfully Deposited ");
		System.out.println(ref.WalletBal);
	}
	public void phonepay(double amount,Account ref)
	{
		ref.WalletBal=ref.WalletBal+amount;
		System.out.println("Your Amount has been Successfully Deposited ");
		System.out.println("Account Balance="+ref.WalletBal);
	}
	public void googlepay(double amount,Account ref)
	{
		ref.WalletBal=ref.WalletBal+amount;
		System.out.println("Your Amount has been Successfully Deposited");
		System.out.println("Account Balance="+ref.WalletBal);
	}
		
}
