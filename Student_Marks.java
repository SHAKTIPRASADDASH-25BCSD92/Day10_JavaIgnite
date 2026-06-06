/*
Student Marks System (Safe Input)

Create a program that:

Stores 5 student marks in an array
Takes index input from user
Displays mark
Add Exception Handling:
Handle invalid index
Handle invalid input (if user enters text instead of number)
*/
package java_internship_assignment;
import java.util.Scanner;

public class studentclass {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i;
		int []students=new int[5];
		try
		{
		for(i=0;i<5;i++)
		{	
			System.out.printf("Enter the mark of student %d\n",i+1);
			students[i]=sc.nextInt();
		}
		for(i=0;i<5;i++)
		{	
			System.out.printf("Mark student%d:",i+1,students[i]);
			System.out.printf("\n");
		}
		}
		catch(ArrayIndexOutOfBoundsException e)
		{	
			System.out.println("invalid index");
		}
		catch (Exception e)
		{	
			System.out.println("Invalid Input");
		}

	}

}

