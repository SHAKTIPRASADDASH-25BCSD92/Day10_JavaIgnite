/*
String Processor with Exception Safety

Create a program that:

Takes a string input

Performs:

substring operation
charAt operation
Requirements:

Handle:

StringIndexOutOfBoundsException
Example:
Invalid index handled safely
*/
package java_internship_assignment;

import java.util.Scanner;

public class stringprocessor {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try
		{System.out.println("Enter the string");
		String str=sc.nextLine();
		System.out.println(str);
		int len=str.length();
		System.out.println("Enter the index where you want to substring start/end");
		int start=sc.nextInt();
		int end=sc.nextInt();
		System.out.println("String after substring:"+(str.substring(start,end)));
		System.out.println("Enter the index where you want to acess the character");
		int charindex=sc.nextInt();
		System.out.println(str.charAt(charindex));
		}

		catch (StringIndexOutOfBoundsException e)
		{	
			System.out.println("Invalid index input");
		}
			
	
		
		

	}

