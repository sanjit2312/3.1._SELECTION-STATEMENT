package selectionStatement;

import java.util.Scanner;

public class else_if_statement_UT
{

	public static void main(String[] args)
	{
	
		int month;
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter a month number: ");
		month=obj.nextInt();
		
		if(month == 1 || month == 2 || month ==3 )
		{
			System.out.println("Winter");
		}
		else if(month == 4 || month == 5 || month==6)
		{
			System.out.println("Spring");
		}
		else if(month == 7 || month == 8 || month ==9 )
		{
			System.out.println("Summer");
		}
		else if(month == 10 || month == 11 || month==12)
		{
			System.out.println("Autumn");
		}
		obj.close();
		

	}

}
