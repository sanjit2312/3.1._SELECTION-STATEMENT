package selectionStatement;

import java.util.Scanner;

public class else_if_Statement2_UT 
{

	public static void main(String[] args)
	{
      
		int number;
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter your markes to check your grade: ");
		number=obj.nextInt();
		
        if(number >= 90)
        {
        	System.out.println("Grade A++");
        }
        else if(number >= 80 && number < 90)
        {
        	System.out.println("Grade A+");
        }
        else if(number >= 70 && number < 80)
        {
        	System.out.println("Grade B+");
        }
        else if(number >=60 && number < 70)
        {
        	System.out.println("Grade B");
        }
        else if(number >= 50 && number < 60)
        {
        	System.out.println("Grade C+");
        }
        else if(number >= 40 && number < 50)
        {
        	System.out.println("Grade C");
        }
        else if(number >=30 && number < 40)
        {
        	System.out.println("Grade D");
        }
        else
        {
        	System.out.println("Fail");
        }
        obj.close();
        
	}

}
