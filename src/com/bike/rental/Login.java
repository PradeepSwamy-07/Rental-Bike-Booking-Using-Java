package com.bike.rental;


public class Login {
	
	public User chooseType(String choice) 
	{
		if(choice=="bike") 
		{
			Bike b1=new Bike();
			User u=b1;
			return u;
		}
		else
		{
			System.out.println("Choose the bike type only");
			return null;
		}
	}
	public boolean loginpage(String Emailid1,String Password1,Account ref)
	  {
		  if(ref.Emailid==Emailid1 && ref.Password==Password1)
		  {
			  System.out.println("login successfull");
			  return true;
		  }
		  else
		  {
			  System.out.println("Invalid credentials");
			  return false;
		  }
	  }
	public boolean loginpage(long Phonenumber1,String Password1,Account ref)
	{
		  if(ref.Phonenumber==Phonenumber1 && ref.Password==Password1)
		  {
			  System.out.println("login successfull");
			  return true;
		  }
		  else
		  {
			  System.out.println("invalid credentials");
			  return false;
		  }
	  }
}
