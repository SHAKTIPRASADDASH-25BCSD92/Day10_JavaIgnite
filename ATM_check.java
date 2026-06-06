/*
ATM Multi-Level Exception System

Create a program that simulates ATM withdrawal.

Requirements:
Take balance and withdrawal amount
If withdrawal > balance → handle exception
If withdrawal amount is negative → handle exception
If input is invalid (text instead of number) → handle exception
Expected Output:
Transaction Successful / Insufficient Balance / Invalid Input
*/
public class atmcheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
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
			System.out.printf("Amount cannot be negative");

		}
		if(withdrawl>balance)
		{	
			System.out.printf("withdrawl amount is greater than bankbalance ");

		}
		}
		catch(Exception e)
		{	
			System.out.println("Transaction failed");
		}
		
}

}

