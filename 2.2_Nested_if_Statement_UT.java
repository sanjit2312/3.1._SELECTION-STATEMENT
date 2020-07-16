package selectionStatement;

import java.util.Scanner;

public class Nested_if_Statement_UT 
{

	public static void main(String[] args)
	{
		
		int num1,num2;
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		num1=obj.nextInt();
		num2=obj.nextInt();

		if(num1 > num2)
		{
			System.out.println("First input number is greater than second number:");
			if(num1 % 2 == 0)
			{
				System.out.println("First input number is even number. ");
			}
			else
			{
				System.out.println("First input number is odd number. ");
			}
		}
		else
		{
			System.out.println("Second input number is greater than first number. ");
			if(num2 % 2 == 0)
			{
				System.out.println("Second input number is even number. ");
			}
			else
			{
				System.out.println("Second input number is odd number. ");
			}

		}
		obj.close();
	}

}
