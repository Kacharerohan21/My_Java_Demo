package JavaProject;

import java.util.Scanner;

abstract class Bank
{
	public String Name="New Back";
	public String IFSC="NEW123";
	
	public void bankdetails()
	{
		System.out.println("Bank name :" + Name + "\nBank IFSC" +IFSC);
	}
	abstract void Deposite();
	abstract void Withdraw();
	abstract void CheckBal();
}

class bankserive extends Bank
{
	
	private double Bal=5000;
	private int pwd;
	public double money;
	
	@Override
	void Deposite() {
		System.out.println("Enter the Password : ");
		Scanner s=new Scanner(System.in);
		pwd=s.nextInt();
		
		if(pwd==123)
		{
			System.out.println("User Current Balence : " +Bal);
			System.out.println("Enter the Deposite amount : ");
			money=s.nextDouble();
			Bal=Bal+money;
			System.out.println("The Deposite amount : " +money );
			System.out.println("After Deposite amount : " +Bal);
		}
		else
		{
			System.out.println("Enter the Correct Password");
		}
	}

	@Override
	void Withdraw() {
		System.out.println("Enter the Password : ");
		Scanner s=new Scanner(System.in);
		pwd=s.nextInt();
		if(pwd==123)
		{
			System.out.println("The Currect Balenace :" + Bal);
			System.out.println("Enter the withdraw amount : ");
			money=s.nextDouble();
			Bal=Bal-money;
			System.out.println("The Currect Withdraw amount :" +money);
			System.out.println("After withdraw amount :" +Bal);
		}
		else
		{
			System.out.println("Enter the Correct Password......");
		}
	}

	@Override
	void CheckBal() {
		System.out.println("Enter the Password : " );
		Scanner s=new Scanner(System.in);
		pwd=s.nextInt();
		if(pwd==123)
		{
			System.out.println("The Currect amount :" +Bal);
		}
		else
		{
			System.out.println("Enter the correct Password.....");
		}
		}
		
}
	

public class Abstraction_Customer {
	
	

	public static void main(String[] args) {
		
		bankserive b=new bankserive();
		b.bankdetails();
		
		System.out.println("1 : Deposite");
		System.out.println("2 : Withdraw");
		System.out.println("3 : CheckBal");
		
		int ch;
		
		System.out.println("Choice the Option :");
		Scanner s2=new Scanner(System.in);
		ch=s2.nextInt();
		
		switch(ch)
		{
		case 1:b.Deposite();
			break;
			
		case 2:b.Withdraw();
			break;
			
		case 3:b.CheckBal();
			break;
			
		default : System.out.println("Enter the correct option.... ");		
		}
		
	}

}
