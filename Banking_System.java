/*
Banking System (Real-world Simulation)

Create a program that:

Takes account balance
Takes withdrawal amount
Rules:
If withdrawal > balance → throw and handle exception
If invalid input → handle exception
Output:
Withdrawal successful OR Insufficient balance
*/
package java_internship_assignment;

import java.util.Scanner;

public class banking_system {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your balance");
		double balance=sc.nextInt();
		System.out.println("Enter your withdrawl amount");
		double withdrawl=sc.nextInt();
		if(withdrawl<=balance)
		{	
			balance=balance-withdrawl;
			System.out.printf("Amount %f withdrawed:\n",withdrawl);
			System.out.println("Balance:"+balance);
		}

		try
		{
		if(withdrawl<0)
		{	
			throw new Exception();

		}
		if(withdrawl>balance)
		{	
			throw new Exception();

		}
		}
		catch(Exception e)
		{	
			if(withdrawl<0)
			{	
				System.out.println("Transaction failed check withdrawl amount cannot be -ve");


			}
			if(withdrawl>balance)
			{	
				System.out.println("Transaction failed check withdrawl amount cannot exceed balance");


			}

		
		}
				
		}

}

