package JavaProject;

import java.util.Scanner;

class banks
{	
	private double Bal=5000;
	private double pwd;
	public double money;
	
	public void Deposite() {
		System.out.println("Enter the Password : ");
		Scanner s=new Scanner(System.in);
		pwd=s.nextInt();
			
		if(pwd==123)
		{
		System.out.println("Your Currect bank balance : "+Bal);
		System.out.println("Enter the deposite amount : ");
		money=s.nextDouble();
		Bal=Bal+money;
		System.out.println("The deposite amount :" +money);
		System.out.println("Total balance : " +Bal);
		}
		else
		{
			System.out.println("Enter the correct password.....");
		}
	}
	
	public void Withdraw() {

		System.out.println("Enter the Password : ");
		Scanner s=new Scanner(System.in);
		pwd=s.nextInt();
		
		if(pwd==123)
		{
			System.out.println("Your Current bank balance : " +Bal);
			System.out.println("Enter the withdraw amount : ");
			money=s.nextDouble();
			Bal=Bal-money;
			System.out.println("The withdraw amount : " +money);
			System.out.println("Total balance : " +Bal);
		}
		else
		{
			System.out.println("Enter the correct password....");
		}
		
	}
	
	public void CheckBal() {

		System.out.println("Enter the password : ");
		Scanner s=new Scanner(System.in);
		pwd=s.nextInt();
		if(pwd==123)
		{
			System.out.println("Your currect balance : " +Bal);
		}
		else
		{
			System.out.println("Enter the correct password.......");
		}
	}
	
	
}

public class Encapsulation_Customer {

	public static void main(String[] args) {
	int ch;
	
	banks b=new banks();
	String Name="New Bank";
	System.out.println("The Bank Name : " +Name);
	System.out.println(" 1 : Deposite : ");
	System.out.println(" 2 : Withdraw : ");
	System.out.println(" 3 : CheckBal : ");
	System.out.println("Choice the following options : ");
	Scanner s=new Scanner(System.in);
	ch=s.nextInt();
	switch(ch)
	{
	case 1: b.Deposite();
		break;
	case 2: b.Withdraw();
		break;
	case 3: b.CheckBal();
		break;
	default : System.out.println("Enter the above options"); 
		}
		
	}

}
