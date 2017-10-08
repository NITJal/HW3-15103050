import java.util.*;

public class atm {
	private int password;
	private int balance = 0;
import java.util.*;

public class atm {
	private int password;
	private int balance = 0;
	atm(int p, int b)
	{
		password = p;
		balance = b;
	}
	
	void check_balance()
	{
		System.out.println("Your Available Balance is : "+balance);
	}
	
	public void deposit(int deposit)
	{


		balance=balance+deposit;
	}
	
	public void withdrawal(int withdraw) throws Exception 
	{

		
		if(withdraw %100 != 0)
		{
			throw new Exception("Withdrawal amount must be a multiple of 100. Please try again");
		}
		if(withdraw < 100)
		{
			throw new Exception("Minimum withdrawl is Rs. 100. Please try again.");
		}
		if(withdraw>20000)
		{
			throw new Exception("Maximum withdrawl is Rs. 20000. Please try again.");
		}
		if(balance >withdraw)
		{
			balance=balance-withdraw;
			System.out.println("Your available balance is :"+balance);
		}
		else 
			throw new Exception("Insufficient Balance.Please try again");
	}
	
	public static void main(String args[]) throws Exception
	{
	    atm a = new atm(1234,20000);
	    int c,d,e,p,ch;
	    Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your PIN ");
		p = sc.nextInt();
		if(p != a.password)
		{
			throw new Exception("You have enterered an Incorrect PIN. Please try again ");
		}
		
		System.out.print("Enter your choice:\n1.Deposit\n2.Withdraw\n3.Check Balance\n");
		ch =sc.nextInt();
	
			switch(ch)
			{
			case 1:
			    System.out.println("Enter the amount ");
		        int deposita=sc.nextInt();
			    a.deposit(deposita);
				System.out.println("Transaction is Successsful.");

				
				break;
			case 2:
	        	System.out.println("Enter the amount you want to withdraw ");
		        int withdraw=sc.nextInt();
		        	System.out.println("ABC");
				a.withdrawal(withdraw);
				System.out.println("Transaction is Successsful.");
				break;
			case 3:
				a.check_balance();
				break;
			}
		 System.out.println("Your atm account has been logged off.");
	}
}

