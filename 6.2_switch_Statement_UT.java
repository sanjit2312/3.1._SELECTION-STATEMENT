package selectionStatement;

import java.util.Scanner;

public class switch_Statement_UT 
{

	public static void main(String[] args) 
	{
		
		String month;
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter a month name: ");
		month=obj.nextLine();
		
        switch(month)
        {

           case "january":
           case "febrary":
           case "december":
        	     System.out.println("Winter");
        	     break;
        	     
           case "march":
           case "april":
           case "may":
        	     System.out.println("Summer");
        	     break;
        	     
           case "jun":
           case "july":
           case "august":
           case "september":
        	     System.out.println("Monsoon");
        	     break;
        	     
           case "octuber":
           case "number":
        	     System.out.println("Winter");
        	     break;	     		   
          
        }
        obj.close();
		
        
	}

}
