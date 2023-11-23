package com.bike.rental;

public class Account {

	String Customername;
	long Phonenumber;
	String Emailid;
	String Address;
	String Password;
	double WalletBal;
	
	public Account(String Customername, long Phonenumber, String Emailid, String Address, String Password)
	{
		super();
		this.Customername=Customername;
		this.Phonenumber=Phonenumber;
		this.Emailid=Emailid;
		this.Address=Address;
		this.Password=Password;
	}
	
	public Account(String Customername, long Phonenumber, String Address, String Password)
	{
		super();
		this.Customername=Customername;
		this.Phonenumber=Phonenumber;
		this.Address=Address;
		this.Password=Password;
	}
}
