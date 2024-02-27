package JavaProject;

import java.util.Scanner;

class bank_E
{
	private double Bal=5000;
	private int pwd;
	
	public void Deposite(double money) {
		System.out.println("Enter the Password : ");
		Scanner s=new Scanner(System.in);
		pwd=s.nextInt();
		if(pwd==123)
		{
			System.out.println("Your current amount" +Bal);
			Bal=Bal+money;
			System.out.println("The deposite amount :" +money);
			System.out.println("The total amount : " +Bal);
		}
		else
		{
			System.out.println("Incorrect Password....");
		}
		s.close();
	}
	public void Withdraw(double money) {
		System.out.println("Enter the Password :");
		Scanner s=new Scanner(System.in);
		pwd=s.nextInt();
		if(pwd==123)
		{
			System.out.println("Your current balance :" +Bal);
			Bal=Bal-money;
			System.out.println("The withdraw amount : " +money);
			System.out.println("The total amount : " +Bal);
		}
		else
		{
			System.out.println("Incorrect Password...");
		}
		s.close();
	}
	public void CheckBal() {
		System.out.println("Enter the Password : ");
		Scanner s=new Scanner(System.in);
		pwd=s.nextInt();
		if(pwd==123)
		{
			System.out.println("Your current balance : " +Bal);
		}
		else
		{
			System.out.println("Incorrect Password...");
		}
		s.close();
	}
	
}


public class Encapsulation_Customer_ex {

	public static void main(String[] args) {
		bank_E b=new bank_E();
		
		int ch;
		String Name="New Bank";
		System.out.println("The bank Name :" +Name);
		System.out.println("1 - Deposite : ");
		System.out.println("2 - Withdraw : ");
		System.out.println("3 - CheckBal : ");
		System.out.println("Choice the following options : ");
		Scanner s=new Scanner(System.in);
		ch=s.nextInt();
			
		switch(ch)
		{
		case 1: b.Deposite(3000);
		break;
		
		case 2: b.Withdraw(1000);
			break;
			
		case 3: b.CheckBal();
			break;
		
		default : System.out.println("Enter the above option");
		
		}
		s.close();
	}

}
